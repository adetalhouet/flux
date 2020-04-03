/*
 * Copyright (C) 2020 Alexis de Talhouët.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adetalhouet.flux

import com.github.marcoferrer.krotoplus.coroutines.launchProducerJob
import com.github.marcoferrer.krotoplus.coroutines.withCoroutineContext
import io.grpc.Channel
import io.grpc.Server
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking

val server: Server = InProcessServerBuilder
    .forName("GreeterService")
    .addService(GreeterService())
    .directExecutor()
    .build()
    .start()

val channel: Channel = InProcessChannelBuilder
    .forName("GreeterService")
    .directExecutor()
    .build()


fun main() = runBlocking<Unit> {

    val stub = GreeterCoroutineGrpc
        .newStub(channel)
        .withCoroutineContext(CoroutineName("GreeterService"))

    performBidiCall(stub)

    server.shutdown()
}

@UseExperimental(ExperimentalCoroutinesApi::class)
suspend fun performBidiCall(stub: GreeterCoroutineGrpc.GreeterCoroutineStub) = coroutineScope {

    //Bi-Directional Streaming RPC
    val (requestChannel, responseChannel) = stub.sayHelloStreaming()

    launchProducerJob(requestChannel) {
        repeat(5) {
            send { name = "person #$it" }
        }
    }

    responseChannel.consumeEach {
        println("Response: ${it.message}")
    }
}

class GreeterService : GreeterCoroutineGrpc.GreeterImplBase() {

    @UseExperimental(ExperimentalCoroutinesApi::class)
    override suspend fun sayHelloStreaming(requestChannel: ReceiveChannel<HelloRequest>,
                                           responseChannel: SendChannel<HelloReply>) {
        requestChannel.consumeEach { request ->
            responseChannel
                .send { message = "Hello there, ${request.name}!" }
        }
    }
}

