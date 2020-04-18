package io.adetalhouet.directory.grpc

import com.google.protobuf.Empty
import io.adetalhouet.directory.grpc.ContactServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * io.adetalhouet.directory.ContactService.
 */
object ContactServiceGrpcKt {
  /**
   * A stub for issuing RPCs to a(n) io.adetalhouet.directory.ContactService service as suspending
   * coroutines.
   */
  @StubFor(ContactServiceGrpc::class)
  class ContactServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ContactServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ContactServiceCoroutineStub =
        ContactServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun create(request: Person): Empty = unaryRpc(
      channel,
      ContactServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    fun lists(request: Empty): Flow<Person> = serverStreamingRpc(
      channel,
      ContactServiceGrpc.getListsMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun get(request: Identifier): Person = unaryRpc(
      channel,
      ContactServiceGrpc.getGetMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the io.adetalhouet.directory.ContactService service based on Kotlin
   * coroutines.
   */
  abstract class ContactServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for io.adetalhouet.directory.ContactService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun create(request: Person): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.directory.ContactService.Create is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for io.adetalhouet.directory.ContactService.Lists.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open fun lists(request: Empty): Flow<Person> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.directory.ContactService.Lists is unimplemented"))

    /**
     * Returns the response to an RPC for io.adetalhouet.directory.ContactService.Get.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun get(request: Identifier): Person = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.directory.ContactService.Get is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ContactServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ContactServiceGrpc.getListsMethod(),
      implementation = ::lists
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ContactServiceGrpc.getGetMethod(),
      implementation = ::get
    )).build()
  }
}
