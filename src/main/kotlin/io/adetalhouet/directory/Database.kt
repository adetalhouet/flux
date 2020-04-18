package io.adetalhouet.directory

import com.google.common.io.ByteSource
import com.google.common.io.Resources
import com.google.protobuf.util.JsonFormat
import io.adetalhouet.directory.grpc.Person
import io.adetalhouet.directory.grpc.PersonDatabase

internal fun defaultContactSource(): ByteSource =
    Resources.asByteSource(Resources.getResource("contact_db.json"))

internal fun ByteSource.parseJsonContacts(): List<Person> =
    asCharSource(Charsets.UTF_8)
        .openBufferedStream()
        .use { reader ->
            PersonDatabase.newBuilder().apply {
                JsonFormat.parser().merge(reader, this)
            }.build().personList
        }