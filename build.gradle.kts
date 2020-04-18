import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.plugins
import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc

plugins {
    application
    idea
    kotlin("jvm") version "1.3.61"
    id("com.google.cloud.tools.jib") version "1.6.1"
    id("com.google.protobuf") version "0.8.11"
}

group = "io.adetalhouet.flux"
version = "1.0.0"

application {
    mainClassName = "io.adetalhouet.directory.ContactServerKt"
}

repositories {
    mavenLocal()
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3")

    compile("com.google.api.grpc:proto-google-common-protos:1.16.0")
    compile("com.google.api.grpc:grpc-google-common-protos:1.16.0")

    implementation("com.google.protobuf:protobuf-java:3.11.1")
    implementation("com.google.protobuf:protobuf-java-util:3.11.1")
    implementation("io.grpc:grpc-netty-shaded:1.28.0")
    implementation("io.grpc:grpc-stub:1.28.0")
    implementation("io.grpc:grpc-protobuf:1.28.0")
    implementation("io.grpc:grpc-kotlin-stub:0.1.1")

    implementation("ch.qos.logback:logback-classic:1.2.1")
}

protobuf {
    protoc { artifact = "com.google.protobuf:protoc:3.11.1" }
    generatedFilesBaseDir = "src/"

    plugins {
        id("grpc") { artifact = "io.grpc:protoc-gen-grpc-java:1.28.0" }
        id("grpckt") { artifact = "io.grpc:protoc-gen-grpc-kotlin:0.1.1" }
    }

    generateProtoTasks {
        all().forEach { task ->
            task.plugins {
                id("grpc") { outputSubDir = "java" }
                id("grpckt") { outputSubDir = "kotlin" }
            }
        }
    }
}

tasks {
    "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.freeCompilerArgs += "-Xuse-experimental=kotlin.Experimental"
    }

    "jibDockerBuild"(com.google.cloud.tools.jib.gradle.BuildDockerTask::class) {
        dependsOn("build")
    }
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
