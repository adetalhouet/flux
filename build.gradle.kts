import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.plugins
import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc

val kotlinVersion: String by project
val logbackVersion: String by project
val protobufVersion: String = "3.6.1"
val krotoPlusVersion: String = "0.6.1"

plugins {
    application
    idea
    kotlin("jvm") version "1.3.61"
    id("com.google.cloud.tools.jib") version "1.6.1"
    id("com.google.protobuf") version "0.8.11"
    id("com.github.marcoferrer.kroto-plus") version "0.6.1"
}

group = "io.adetalhouet.flux"
version = "1.0.0"

application {
    mainClassName = "io.adetalhouet.flux.AppKt"
}

idea {
    module {
        inheritOutputDirs = false
        outputDir = file("$buildDir/generated-sources")
        testOutputDir = file("$buildDir/classes/kotlin/test")
    }
}

repositories {
    mavenLocal()
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3")

    implementation("com.github.marcoferrer.krotoplus:kroto-plus-coroutines:0.6.1")

    implementation("com.google.protobuf:protobuf-java:3.6.1")
    implementation("io.grpc:grpc-stub:1.15.1")
    implementation("io.grpc:grpc-protobuf:1.15.1")

    implementation("ch.qos.logback:logback-classic:$logbackVersion")
}

protobuf {
    protoc { artifact = "com.google.protobuf:protoc:$protobufVersion" }
    generatedFilesBaseDir = "$buildDir/generated-sources"

    plugins {
        id("grpc") { artifact = "io.grpc:protoc-gen-grpc-java:1.15.1" }
        id("kroto") { artifact = "com.github.marcoferrer.krotoplus:protoc-gen-kroto-plus:0.6.1" }
    }

    generateProtoTasks {
        val krotoConfig = file("krotoPlusConfig.asciipb") // Or .json

        all().forEach { task ->
            // Adding the config file to the task inputs lets UP-TO-DATE checks
            // include changes to configuration
            task.inputs.files(krotoConfig)

            task.plugins {
                id("grpc") { outputSubDir = "java" }
                id("kroto") {
                    outputSubDir = "kotlin"
                    option("ConfigPath=$krotoConfig")
                }
            }
        }
    }
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.freeCompilerArgs += "-Xuse-experimental=kotlin.Experimental"
}

jib {
    from {
        image = "openjdk:8-jre-alpine"
    }
    to {
        val tagVersion = version.toString().substringBefore('-')
        image = "adetalhouet/${project.name}:$tagVersion"
    }
    container {
        mainClass = application.mainClassName
    }
}

tasks.jibDockerBuild {
    dependsOn(tasks.build)
}