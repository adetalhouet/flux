// Code generated by protoc-gen-go. DO NOT EDIT.
// source: src/main/proto/contacts.proto

package io_adetalhouet_directory

import (
	context "context"
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	empty "github.com/golang/protobuf/ptypes/empty"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type PersonData struct {
	Survived                string   `protobuf:"bytes,1,opt,name=survived,proto3" json:"survived,omitempty"`
	PassengerClass          int32    `protobuf:"varint,2,opt,name=passengerClass,proto3" json:"passengerClass,omitempty"`
	Name                    string   `protobuf:"bytes,3,opt,name=name,proto3" json:"name,omitempty"`
	Sex                     string   `protobuf:"bytes,4,opt,name=sex,proto3" json:"sex,omitempty"`
	Age                     int32    `protobuf:"varint,5,opt,name=age,proto3" json:"age,omitempty"`
	SiblingsOrSpousesAboard int32    `protobuf:"varint,6,opt,name=siblingsOrSpousesAboard,proto3" json:"siblingsOrSpousesAboard,omitempty"`
	ParentsOrChildrenAboard int32    `protobuf:"varint,7,opt,name=parentsOrChildrenAboard,proto3" json:"parentsOrChildrenAboard,omitempty"`
	Fare                    float64  `protobuf:"fixed64,8,opt,name=fare,proto3" json:"fare,omitempty"`
	XXX_NoUnkeyedLiteral    struct{} `json:"-"`
	XXX_unrecognized        []byte   `json:"-"`
	XXX_sizecache           int32    `json:"-"`
}

func (m *PersonData) Reset()         { *m = PersonData{} }
func (m *PersonData) String() string { return proto.CompactTextString(m) }
func (*PersonData) ProtoMessage()    {}
func (*PersonData) Descriptor() ([]byte, []int) {
	return fileDescriptor_8e925e5c4b9e6652, []int{0}
}

func (m *PersonData) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PersonData.Unmarshal(m, b)
}
func (m *PersonData) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PersonData.Marshal(b, m, deterministic)
}
func (m *PersonData) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PersonData.Merge(m, src)
}
func (m *PersonData) XXX_Size() int {
	return xxx_messageInfo_PersonData.Size(m)
}
func (m *PersonData) XXX_DiscardUnknown() {
	xxx_messageInfo_PersonData.DiscardUnknown(m)
}

var xxx_messageInfo_PersonData proto.InternalMessageInfo

func (m *PersonData) GetSurvived() string {
	if m != nil {
		return m.Survived
	}
	return ""
}

func (m *PersonData) GetPassengerClass() int32 {
	if m != nil {
		return m.PassengerClass
	}
	return 0
}

func (m *PersonData) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *PersonData) GetSex() string {
	if m != nil {
		return m.Sex
	}
	return ""
}

func (m *PersonData) GetAge() int32 {
	if m != nil {
		return m.Age
	}
	return 0
}

func (m *PersonData) GetSiblingsOrSpousesAboard() int32 {
	if m != nil {
		return m.SiblingsOrSpousesAboard
	}
	return 0
}

func (m *PersonData) GetParentsOrChildrenAboard() int32 {
	if m != nil {
		return m.ParentsOrChildrenAboard
	}
	return 0
}

func (m *PersonData) GetFare() float64 {
	if m != nil {
		return m.Fare
	}
	return 0
}

type Identifier struct {
	Uuid                 string   `protobuf:"bytes,1,opt,name=uuid,proto3" json:"uuid,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Identifier) Reset()         { *m = Identifier{} }
func (m *Identifier) String() string { return proto.CompactTextString(m) }
func (*Identifier) ProtoMessage()    {}
func (*Identifier) Descriptor() ([]byte, []int) {
	return fileDescriptor_8e925e5c4b9e6652, []int{1}
}

func (m *Identifier) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Identifier.Unmarshal(m, b)
}
func (m *Identifier) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Identifier.Marshal(b, m, deterministic)
}
func (m *Identifier) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Identifier.Merge(m, src)
}
func (m *Identifier) XXX_Size() int {
	return xxx_messageInfo_Identifier.Size(m)
}
func (m *Identifier) XXX_DiscardUnknown() {
	xxx_messageInfo_Identifier.DiscardUnknown(m)
}

var xxx_messageInfo_Identifier proto.InternalMessageInfo

func (m *Identifier) GetUuid() string {
	if m != nil {
		return m.Uuid
	}
	return ""
}

type Person struct {
	Uuid                 string      `protobuf:"bytes,1,opt,name=uuid,proto3" json:"uuid,omitempty"`
	PersonData           *PersonData `protobuf:"bytes,2,opt,name=personData,proto3" json:"personData,omitempty"`
	XXX_NoUnkeyedLiteral struct{}    `json:"-"`
	XXX_unrecognized     []byte      `json:"-"`
	XXX_sizecache        int32       `json:"-"`
}

func (m *Person) Reset()         { *m = Person{} }
func (m *Person) String() string { return proto.CompactTextString(m) }
func (*Person) ProtoMessage()    {}
func (*Person) Descriptor() ([]byte, []int) {
	return fileDescriptor_8e925e5c4b9e6652, []int{2}
}

func (m *Person) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Person.Unmarshal(m, b)
}
func (m *Person) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Person.Marshal(b, m, deterministic)
}
func (m *Person) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Person.Merge(m, src)
}
func (m *Person) XXX_Size() int {
	return xxx_messageInfo_Person.Size(m)
}
func (m *Person) XXX_DiscardUnknown() {
	xxx_messageInfo_Person.DiscardUnknown(m)
}

var xxx_messageInfo_Person proto.InternalMessageInfo

func (m *Person) GetUuid() string {
	if m != nil {
		return m.Uuid
	}
	return ""
}

func (m *Person) GetPersonData() *PersonData {
	if m != nil {
		return m.PersonData
	}
	return nil
}

// Not used in the RPC.  Instead, this is here for the form serialized to disk.
type PersonDatabase struct {
	Person               []*Person `protobuf:"bytes,1,rep,name=person,proto3" json:"person,omitempty"`
	XXX_NoUnkeyedLiteral struct{}  `json:"-"`
	XXX_unrecognized     []byte    `json:"-"`
	XXX_sizecache        int32     `json:"-"`
}

func (m *PersonDatabase) Reset()         { *m = PersonDatabase{} }
func (m *PersonDatabase) String() string { return proto.CompactTextString(m) }
func (*PersonDatabase) ProtoMessage()    {}
func (*PersonDatabase) Descriptor() ([]byte, []int) {
	return fileDescriptor_8e925e5c4b9e6652, []int{3}
}

func (m *PersonDatabase) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PersonDatabase.Unmarshal(m, b)
}
func (m *PersonDatabase) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PersonDatabase.Marshal(b, m, deterministic)
}
func (m *PersonDatabase) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PersonDatabase.Merge(m, src)
}
func (m *PersonDatabase) XXX_Size() int {
	return xxx_messageInfo_PersonDatabase.Size(m)
}
func (m *PersonDatabase) XXX_DiscardUnknown() {
	xxx_messageInfo_PersonDatabase.DiscardUnknown(m)
}

var xxx_messageInfo_PersonDatabase proto.InternalMessageInfo

func (m *PersonDatabase) GetPerson() []*Person {
	if m != nil {
		return m.Person
	}
	return nil
}

func init() {
	proto.RegisterType((*PersonData)(nil), "io.adetalhouet.directory.PersonData")
	proto.RegisterType((*Identifier)(nil), "io.adetalhouet.directory.Identifier")
	proto.RegisterType((*Person)(nil), "io.adetalhouet.directory.Person")
	proto.RegisterType((*PersonDatabase)(nil), "io.adetalhouet.directory.PersonDatabase")
}

func init() {
	proto.RegisterFile("src/main/proto/contacts.proto", fileDescriptor_8e925e5c4b9e6652)
}

var fileDescriptor_8e925e5c4b9e6652 = []byte{
	// 472 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x8c, 0x52, 0xcd, 0x6e, 0xd3, 0x40,
	0x10, 0x96, 0x93, 0xc6, 0x94, 0x29, 0x8a, 0x60, 0xf9, 0xa9, 0xe5, 0x52, 0xc9, 0x58, 0x08, 0x45,
	0x1c, 0x6c, 0x08, 0x17, 0xc4, 0x0d, 0x52, 0x84, 0x40, 0x48, 0xad, 0xdc, 0x13, 0xe2, 0x34, 0xb6,
	0x27, 0xee, 0x22, 0x67, 0xd7, 0xda, 0x5d, 0x47, 0x54, 0x88, 0x0b, 0x4f, 0x80, 0xc4, 0xab, 0xf0,
	0x26, 0xbc, 0x02, 0x0f, 0x82, 0x76, 0x9d, 0x26, 0x05, 0x61, 0xc2, 0x6d, 0x76, 0xbe, 0xf9, 0xbe,
	0xb1, 0xbf, 0xf9, 0xe0, 0x50, 0xab, 0x22, 0x5d, 0x20, 0x17, 0x69, 0xa3, 0xa4, 0x91, 0x69, 0x21,
	0x85, 0xc1, 0xc2, 0xe8, 0xc4, 0x3d, 0x59, 0xc0, 0x65, 0x82, 0x25, 0x19, 0xac, 0xcf, 0x64, 0x4b,
	0x26, 0x29, 0xb9, 0xa2, 0xc2, 0x48, 0x75, 0x1e, 0xde, 0xad, 0xa4, 0xac, 0x6a, 0x4a, 0xb1, 0xe1,
	0x29, 0x0a, 0x21, 0x0d, 0x1a, 0x2e, 0xc5, 0x8a, 0x17, 0x1e, 0xac, 0x50, 0xf7, 0xca, 0xdb, 0x79,
	0x4a, 0x8b, 0xc6, 0x9c, 0x77, 0x60, 0xfc, 0x75, 0x00, 0x70, 0x42, 0x4a, 0x4b, 0x71, 0x84, 0x06,
	0x59, 0x08, 0xbb, 0xba, 0x55, 0x4b, 0xbe, 0xa4, 0x32, 0xf0, 0x22, 0x6f, 0x72, 0x35, 0x5b, 0xbf,
	0xd9, 0x03, 0x18, 0x37, 0xa8, 0x35, 0x89, 0x8a, 0xd4, 0xac, 0x46, 0xad, 0x83, 0x41, 0xe4, 0x4d,
	0x46, 0xd9, 0x1f, 0x5d, 0xc6, 0x60, 0x47, 0xe0, 0x82, 0x82, 0xa1, 0xe3, 0xbb, 0x9a, 0x5d, 0x87,
	0xa1, 0xa6, 0x8f, 0xc1, 0x8e, 0x6b, 0xd9, 0xd2, 0x76, 0xb0, 0xa2, 0x60, 0xe4, 0x24, 0x6c, 0xc9,
	0x9e, 0xc2, 0xbe, 0xe6, 0x79, 0xcd, 0x45, 0xa5, 0x8f, 0xd5, 0x69, 0x23, 0x5b, 0x4d, 0xfa, 0x79,
	0x2e, 0x51, 0x95, 0x81, 0xef, 0xa6, 0xfa, 0x60, 0xcb, 0x6c, 0x50, 0x91, 0x30, 0xfa, 0x58, 0xcd,
	0xce, 0x78, 0x5d, 0x2a, 0x12, 0x2b, 0xe6, 0x95, 0x8e, 0xd9, 0x03, 0xdb, 0x6f, 0x9d, 0xa3, 0xa2,
	0x60, 0x37, 0xf2, 0x26, 0x5e, 0xe6, 0xea, 0x38, 0x02, 0x78, 0x5d, 0x92, 0x30, 0x7c, 0xce, 0x49,
	0xd9, 0x89, 0xb6, 0xe5, 0x17, 0x6e, 0xb8, 0x3a, 0xce, 0xc1, 0xef, 0x3c, 0xfb, 0x1b, 0xca, 0x8e,
	0x00, 0x9a, 0xb5, 0xa3, 0xce, 0xa3, 0xbd, 0xe9, 0xfd, 0xa4, 0xef, 0x78, 0xc9, 0xc6, 0xfd, 0xec,
	0x12, 0x2f, 0x7e, 0x03, 0xe3, 0x0d, 0x92, 0xa3, 0xb6, 0xfe, 0xf8, 0x1d, 0x1e, 0x78, 0xd1, 0x70,
	0xb2, 0x37, 0x8d, 0xb6, 0x69, 0x66, 0xab, 0xf9, 0xe9, 0xf7, 0x01, 0x8c, 0x67, 0x5d, 0x98, 0x4e,
	0x49, 0x2d, 0x79, 0x41, 0xec, 0x3d, 0xf8, 0x33, 0x45, 0x68, 0x88, 0x6d, 0x95, 0x09, 0xef, 0x24,
	0x5d, 0x82, 0x92, 0x8b, 0x04, 0x25, 0x2f, 0x6d, 0x82, 0xe2, 0xfd, 0x2f, 0x3f, 0x7e, 0x7e, 0x1b,
	0xdc, 0x88, 0xaf, 0xa5, 0xcb, 0xc7, 0xeb, 0xb0, 0x3e, 0xf3, 0x1e, 0xb2, 0x77, 0x30, 0x7a, 0xcb,
	0xb5, 0xd1, 0xac, 0x87, 0x19, 0x6e, 0xdd, 0x19, 0xdf, 0x72, 0xda, 0x63, 0xf6, 0x9b, 0xf6, 0x23,
	0x8f, 0x7d, 0x80, 0xe1, 0x2b, 0x32, 0xec, 0x1f, 0x7e, 0x6e, 0x6e, 0xf7, 0x1f, 0x6b, 0x0e, 0xdc,
	0x9a, 0xdb, 0xec, 0xe6, 0xe5, 0x35, 0xe9, 0x27, 0x7b, 0xc7, 0xcf, 0x2f, 0xee, 0xc1, 0x61, 0x2f,
	0xbf, 0x52, 0x4d, 0x71, 0xe2, 0xe5, 0xbe, 0xfb, 0xb1, 0x27, 0xbf, 0x02, 0x00, 0x00, 0xff, 0xff,
	0xb6, 0x3b, 0xbe, 0x77, 0xbb, 0x03, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConnInterface

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion6

// ContactServiceClient is the client API for ContactService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type ContactServiceClient interface {
	Create(ctx context.Context, in *Person, opts ...grpc.CallOption) (*empty.Empty, error)
	Lists(ctx context.Context, in *empty.Empty, opts ...grpc.CallOption) (ContactService_ListsClient, error)
	Get(ctx context.Context, in *Identifier, opts ...grpc.CallOption) (*Person, error)
}

type contactServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewContactServiceClient(cc grpc.ClientConnInterface) ContactServiceClient {
	return &contactServiceClient{cc}
}

func (c *contactServiceClient) Create(ctx context.Context, in *Person, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/io.adetalhouet.directory.ContactService/Create", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *contactServiceClient) Lists(ctx context.Context, in *empty.Empty, opts ...grpc.CallOption) (ContactService_ListsClient, error) {
	stream, err := c.cc.NewStream(ctx, &_ContactService_serviceDesc.Streams[0], "/io.adetalhouet.directory.ContactService/Lists", opts...)
	if err != nil {
		return nil, err
	}
	x := &contactServiceListsClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type ContactService_ListsClient interface {
	Recv() (*Person, error)
	grpc.ClientStream
}

type contactServiceListsClient struct {
	grpc.ClientStream
}

func (x *contactServiceListsClient) Recv() (*Person, error) {
	m := new(Person)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *contactServiceClient) Get(ctx context.Context, in *Identifier, opts ...grpc.CallOption) (*Person, error) {
	out := new(Person)
	err := c.cc.Invoke(ctx, "/io.adetalhouet.directory.ContactService/Get", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ContactServiceServer is the server API for ContactService service.
type ContactServiceServer interface {
	Create(context.Context, *Person) (*empty.Empty, error)
	Lists(*empty.Empty, ContactService_ListsServer) error
	Get(context.Context, *Identifier) (*Person, error)
}

// UnimplementedContactServiceServer can be embedded to have forward compatible implementations.
type UnimplementedContactServiceServer struct {
}

func (*UnimplementedContactServiceServer) Create(ctx context.Context, req *Person) (*empty.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Create not implemented")
}
func (*UnimplementedContactServiceServer) Lists(req *empty.Empty, srv ContactService_ListsServer) error {
	return status.Errorf(codes.Unimplemented, "method Lists not implemented")
}
func (*UnimplementedContactServiceServer) Get(ctx context.Context, req *Identifier) (*Person, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Get not implemented")
}

func RegisterContactServiceServer(s *grpc.Server, srv ContactServiceServer) {
	s.RegisterService(&_ContactService_serviceDesc, srv)
}

func _ContactService_Create_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Person)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ContactServiceServer).Create(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/io.adetalhouet.directory.ContactService/Create",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ContactServiceServer).Create(ctx, req.(*Person))
	}
	return interceptor(ctx, in, info, handler)
}

func _ContactService_Lists_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(empty.Empty)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(ContactServiceServer).Lists(m, &contactServiceListsServer{stream})
}

type ContactService_ListsServer interface {
	Send(*Person) error
	grpc.ServerStream
}

type contactServiceListsServer struct {
	grpc.ServerStream
}

func (x *contactServiceListsServer) Send(m *Person) error {
	return x.ServerStream.SendMsg(m)
}

func _ContactService_Get_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Identifier)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ContactServiceServer).Get(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/io.adetalhouet.directory.ContactService/Get",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ContactServiceServer).Get(ctx, req.(*Identifier))
	}
	return interceptor(ctx, in, info, handler)
}

var _ContactService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "io.adetalhouet.directory.ContactService",
	HandlerType: (*ContactServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Create",
			Handler:    _ContactService_Create_Handler,
		},
		{
			MethodName: "Get",
			Handler:    _ContactService_Get_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "Lists",
			Handler:       _ContactService_Lists_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "src/main/proto/contacts.proto",
}
