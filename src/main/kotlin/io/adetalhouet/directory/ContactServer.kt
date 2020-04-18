package io.adetalhouet.directory

import com.google.common.io.ByteSource
import com.google.protobuf.Empty
import io.adetalhouet.directory.grpc.ContactServiceGrpcKt
import io.adetalhouet.directory.grpc.Identifier
import io.adetalhouet.directory.grpc.Person
import io.grpc.Server
import io.grpc.ServerBuilder
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow

class ContactServer(val port: Int, val server: Server) {
    constructor(port: Int) : this(port, defaultContactSource())

    constructor(port: Int, featureData: ByteSource) : this(
        serverBuilder = ServerBuilder.forPort(port),
        port = port,
        features = featureData.parseJsonContacts()
    )

    constructor(serverBuilder: ServerBuilder<*>, port: Int, features: Collection<Person>) : this(
        port = port,
        server = serverBuilder.addService(ContactService(features)).build()
    )

    fun start() {
        server.start()
        println("Server started, listening on $port")
        Runtime.getRuntime().addShutdownHook(
            Thread {
                println("*** shutting down gRPC server since JVM is shutting down")
                this@ContactServer.stop()
                println("*** server shut down")
            }
        )
    }

    fun stop() {
        server.shutdown()
    }

    fun blockUntilShutdown() {
        server.awaitTermination()
    }

    class ContactService(val persons: Collection<Person>) : ContactServiceGrpcKt.ContactServiceCoroutineImplBase() {

        override suspend fun create(request: Person): Empty {
            return super.create(request)
        }

        override suspend fun get(request: Identifier): Person =
            persons.find { it.uuid == request.uuid } ?: Person.newBuilder().apply { uuid = request.uuid }.build()

        override fun lists(request: Empty): Flow<Person> = persons.asFlow()
    }
}

fun main(args: Array<String>) {
    val port = 9090
    val server = ContactServer(port)
    server.start()
    server.blockUntilShutdown()
}