# Flux
[![Build Status](https://travis-ci.com/adetalhouet/flux.svg?branch=master)](https://travis-ci.com/adetalhouet/flux)

Gradle + gRPC Kotlin + gRPC Gateway

## Run the gRPC server
` ./gradlew run`

## Run the Go HTTP server
`go run gw/http_reverse_proxy.go`

## HTTP GW

### Generate Go bindings
```
$ protoc -I/usr/local/include -I. \
    -I$GOPATH/src \
    -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
    --go_out=plugins=grpc:. \
    src/main/proto/contacts.proto
```
### Generate Go HTTP GW
```
$  protoc -I/usr/local/include -I. \
     -I$GOPATH/src \
     -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
     --grpc-gateway_out=logtostderr=true:. \
     src/main/proto/contacts.proto
```