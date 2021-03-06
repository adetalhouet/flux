// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contacts.proto

package io.adetalhouet.directory.grpc;

/**
 * Protobuf type {@code io.adetalhouet.directory.PersonData}
 */
public  final class PersonData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.adetalhouet.directory.PersonData)
    PersonDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonData.newBuilder() to construct.
  private PersonData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonData() {
    survived_ = "";
    name_ = "";
    sex_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PersonData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PersonData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            survived_ = s;
            break;
          }
          case 16: {

            passengerClass_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            sex_ = s;
            break;
          }
          case 40: {

            age_ = input.readInt32();
            break;
          }
          case 48: {

            siblingsOrSpousesAboard_ = input.readInt32();
            break;
          }
          case 56: {

            parentsOrChildrenAboard_ = input.readInt32();
            break;
          }
          case 65: {

            fare_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.adetalhouet.directory.grpc.Contacts.internal_static_io_adetalhouet_directory_PersonData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.adetalhouet.directory.grpc.Contacts.internal_static_io_adetalhouet_directory_PersonData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.adetalhouet.directory.grpc.PersonData.class, io.adetalhouet.directory.grpc.PersonData.Builder.class);
  }

  public static final int SURVIVED_FIELD_NUMBER = 1;
  private volatile java.lang.Object survived_;
  /**
   * <code>string survived = 1;</code>
   * @return The survived.
   */
  public java.lang.String getSurvived() {
    java.lang.Object ref = survived_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      survived_ = s;
      return s;
    }
  }
  /**
   * <code>string survived = 1;</code>
   * @return The bytes for survived.
   */
  public com.google.protobuf.ByteString
      getSurvivedBytes() {
    java.lang.Object ref = survived_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      survived_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PASSENGERCLASS_FIELD_NUMBER = 2;
  private int passengerClass_;
  /**
   * <code>int32 passengerClass = 2;</code>
   * @return The passengerClass.
   */
  public int getPassengerClass() {
    return passengerClass_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEX_FIELD_NUMBER = 4;
  private volatile java.lang.Object sex_;
  /**
   * <code>string sex = 4;</code>
   * @return The sex.
   */
  public java.lang.String getSex() {
    java.lang.Object ref = sex_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sex_ = s;
      return s;
    }
  }
  /**
   * <code>string sex = 4;</code>
   * @return The bytes for sex.
   */
  public com.google.protobuf.ByteString
      getSexBytes() {
    java.lang.Object ref = sex_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sex_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGE_FIELD_NUMBER = 5;
  private int age_;
  /**
   * <code>int32 age = 5;</code>
   * @return The age.
   */
  public int getAge() {
    return age_;
  }

  public static final int SIBLINGSORSPOUSESABOARD_FIELD_NUMBER = 6;
  private int siblingsOrSpousesAboard_;
  /**
   * <code>int32 siblingsOrSpousesAboard = 6;</code>
   * @return The siblingsOrSpousesAboard.
   */
  public int getSiblingsOrSpousesAboard() {
    return siblingsOrSpousesAboard_;
  }

  public static final int PARENTSORCHILDRENABOARD_FIELD_NUMBER = 7;
  private int parentsOrChildrenAboard_;
  /**
   * <code>int32 parentsOrChildrenAboard = 7;</code>
   * @return The parentsOrChildrenAboard.
   */
  public int getParentsOrChildrenAboard() {
    return parentsOrChildrenAboard_;
  }

  public static final int FARE_FIELD_NUMBER = 8;
  private double fare_;
  /**
   * <code>double fare = 8;</code>
   * @return The fare.
   */
  public double getFare() {
    return fare_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSurvivedBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, survived_);
    }
    if (passengerClass_ != 0) {
      output.writeInt32(2, passengerClass_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (!getSexBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sex_);
    }
    if (age_ != 0) {
      output.writeInt32(5, age_);
    }
    if (siblingsOrSpousesAboard_ != 0) {
      output.writeInt32(6, siblingsOrSpousesAboard_);
    }
    if (parentsOrChildrenAboard_ != 0) {
      output.writeInt32(7, parentsOrChildrenAboard_);
    }
    if (fare_ != 0D) {
      output.writeDouble(8, fare_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSurvivedBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, survived_);
    }
    if (passengerClass_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, passengerClass_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (!getSexBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sex_);
    }
    if (age_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, age_);
    }
    if (siblingsOrSpousesAboard_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, siblingsOrSpousesAboard_);
    }
    if (parentsOrChildrenAboard_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, parentsOrChildrenAboard_);
    }
    if (fare_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(8, fare_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.adetalhouet.directory.grpc.PersonData)) {
      return super.equals(obj);
    }
    io.adetalhouet.directory.grpc.PersonData other = (io.adetalhouet.directory.grpc.PersonData) obj;

    if (!getSurvived()
        .equals(other.getSurvived())) return false;
    if (getPassengerClass()
        != other.getPassengerClass()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getSex()
        .equals(other.getSex())) return false;
    if (getAge()
        != other.getAge()) return false;
    if (getSiblingsOrSpousesAboard()
        != other.getSiblingsOrSpousesAboard()) return false;
    if (getParentsOrChildrenAboard()
        != other.getParentsOrChildrenAboard()) return false;
    if (java.lang.Double.doubleToLongBits(getFare())
        != java.lang.Double.doubleToLongBits(
            other.getFare())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SURVIVED_FIELD_NUMBER;
    hash = (53 * hash) + getSurvived().hashCode();
    hash = (37 * hash) + PASSENGERCLASS_FIELD_NUMBER;
    hash = (53 * hash) + getPassengerClass();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SEX_FIELD_NUMBER;
    hash = (53 * hash) + getSex().hashCode();
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + getAge();
    hash = (37 * hash) + SIBLINGSORSPOUSESABOARD_FIELD_NUMBER;
    hash = (53 * hash) + getSiblingsOrSpousesAboard();
    hash = (37 * hash) + PARENTSORCHILDRENABOARD_FIELD_NUMBER;
    hash = (53 * hash) + getParentsOrChildrenAboard();
    hash = (37 * hash) + FARE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFare()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.adetalhouet.directory.grpc.PersonData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.directory.grpc.PersonData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.directory.grpc.PersonData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.directory.grpc.PersonData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.directory.grpc.PersonData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.directory.grpc.PersonData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.directory.grpc.PersonData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.adetalhouet.directory.grpc.PersonData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.adetalhouet.directory.grpc.PersonData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.adetalhouet.directory.grpc.PersonData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.adetalhouet.directory.grpc.PersonData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.adetalhouet.directory.grpc.PersonData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.adetalhouet.directory.grpc.PersonData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code io.adetalhouet.directory.PersonData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.adetalhouet.directory.PersonData)
      io.adetalhouet.directory.grpc.PersonDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.adetalhouet.directory.grpc.Contacts.internal_static_io_adetalhouet_directory_PersonData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.adetalhouet.directory.grpc.Contacts.internal_static_io_adetalhouet_directory_PersonData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.adetalhouet.directory.grpc.PersonData.class, io.adetalhouet.directory.grpc.PersonData.Builder.class);
    }

    // Construct using io.adetalhouet.directory.grpc.PersonData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      survived_ = "";

      passengerClass_ = 0;

      name_ = "";

      sex_ = "";

      age_ = 0;

      siblingsOrSpousesAboard_ = 0;

      parentsOrChildrenAboard_ = 0;

      fare_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.adetalhouet.directory.grpc.Contacts.internal_static_io_adetalhouet_directory_PersonData_descriptor;
    }

    @java.lang.Override
    public io.adetalhouet.directory.grpc.PersonData getDefaultInstanceForType() {
      return io.adetalhouet.directory.grpc.PersonData.getDefaultInstance();
    }

    @java.lang.Override
    public io.adetalhouet.directory.grpc.PersonData build() {
      io.adetalhouet.directory.grpc.PersonData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.adetalhouet.directory.grpc.PersonData buildPartial() {
      io.adetalhouet.directory.grpc.PersonData result = new io.adetalhouet.directory.grpc.PersonData(this);
      result.survived_ = survived_;
      result.passengerClass_ = passengerClass_;
      result.name_ = name_;
      result.sex_ = sex_;
      result.age_ = age_;
      result.siblingsOrSpousesAboard_ = siblingsOrSpousesAboard_;
      result.parentsOrChildrenAboard_ = parentsOrChildrenAboard_;
      result.fare_ = fare_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.adetalhouet.directory.grpc.PersonData) {
        return mergeFrom((io.adetalhouet.directory.grpc.PersonData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.adetalhouet.directory.grpc.PersonData other) {
      if (other == io.adetalhouet.directory.grpc.PersonData.getDefaultInstance()) return this;
      if (!other.getSurvived().isEmpty()) {
        survived_ = other.survived_;
        onChanged();
      }
      if (other.getPassengerClass() != 0) {
        setPassengerClass(other.getPassengerClass());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getSex().isEmpty()) {
        sex_ = other.sex_;
        onChanged();
      }
      if (other.getAge() != 0) {
        setAge(other.getAge());
      }
      if (other.getSiblingsOrSpousesAboard() != 0) {
        setSiblingsOrSpousesAboard(other.getSiblingsOrSpousesAboard());
      }
      if (other.getParentsOrChildrenAboard() != 0) {
        setParentsOrChildrenAboard(other.getParentsOrChildrenAboard());
      }
      if (other.getFare() != 0D) {
        setFare(other.getFare());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.adetalhouet.directory.grpc.PersonData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.adetalhouet.directory.grpc.PersonData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object survived_ = "";
    /**
     * <code>string survived = 1;</code>
     * @return The survived.
     */
    public java.lang.String getSurvived() {
      java.lang.Object ref = survived_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        survived_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string survived = 1;</code>
     * @return The bytes for survived.
     */
    public com.google.protobuf.ByteString
        getSurvivedBytes() {
      java.lang.Object ref = survived_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        survived_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string survived = 1;</code>
     * @param value The survived to set.
     * @return This builder for chaining.
     */
    public Builder setSurvived(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      survived_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string survived = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSurvived() {
      
      survived_ = getDefaultInstance().getSurvived();
      onChanged();
      return this;
    }
    /**
     * <code>string survived = 1;</code>
     * @param value The bytes for survived to set.
     * @return This builder for chaining.
     */
    public Builder setSurvivedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      survived_ = value;
      onChanged();
      return this;
    }

    private int passengerClass_ ;
    /**
     * <code>int32 passengerClass = 2;</code>
     * @return The passengerClass.
     */
    public int getPassengerClass() {
      return passengerClass_;
    }
    /**
     * <code>int32 passengerClass = 2;</code>
     * @param value The passengerClass to set.
     * @return This builder for chaining.
     */
    public Builder setPassengerClass(int value) {
      
      passengerClass_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 passengerClass = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassengerClass() {
      
      passengerClass_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sex_ = "";
    /**
     * <code>string sex = 4;</code>
     * @return The sex.
     */
    public java.lang.String getSex() {
      java.lang.Object ref = sex_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sex_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sex = 4;</code>
     * @return The bytes for sex.
     */
    public com.google.protobuf.ByteString
        getSexBytes() {
      java.lang.Object ref = sex_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sex_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sex = 4;</code>
     * @param value The sex to set.
     * @return This builder for chaining.
     */
    public Builder setSex(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sex = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSex() {
      
      sex_ = getDefaultInstance().getSex();
      onChanged();
      return this;
    }
    /**
     * <code>string sex = 4;</code>
     * @param value The bytes for sex to set.
     * @return This builder for chaining.
     */
    public Builder setSexBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sex_ = value;
      onChanged();
      return this;
    }

    private int age_ ;
    /**
     * <code>int32 age = 5;</code>
     * @return The age.
     */
    public int getAge() {
      return age_;
    }
    /**
     * <code>int32 age = 5;</code>
     * @param value The age to set.
     * @return This builder for chaining.
     */
    public Builder setAge(int value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 age = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAge() {
      
      age_ = 0;
      onChanged();
      return this;
    }

    private int siblingsOrSpousesAboard_ ;
    /**
     * <code>int32 siblingsOrSpousesAboard = 6;</code>
     * @return The siblingsOrSpousesAboard.
     */
    public int getSiblingsOrSpousesAboard() {
      return siblingsOrSpousesAboard_;
    }
    /**
     * <code>int32 siblingsOrSpousesAboard = 6;</code>
     * @param value The siblingsOrSpousesAboard to set.
     * @return This builder for chaining.
     */
    public Builder setSiblingsOrSpousesAboard(int value) {
      
      siblingsOrSpousesAboard_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 siblingsOrSpousesAboard = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSiblingsOrSpousesAboard() {
      
      siblingsOrSpousesAboard_ = 0;
      onChanged();
      return this;
    }

    private int parentsOrChildrenAboard_ ;
    /**
     * <code>int32 parentsOrChildrenAboard = 7;</code>
     * @return The parentsOrChildrenAboard.
     */
    public int getParentsOrChildrenAboard() {
      return parentsOrChildrenAboard_;
    }
    /**
     * <code>int32 parentsOrChildrenAboard = 7;</code>
     * @param value The parentsOrChildrenAboard to set.
     * @return This builder for chaining.
     */
    public Builder setParentsOrChildrenAboard(int value) {
      
      parentsOrChildrenAboard_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 parentsOrChildrenAboard = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearParentsOrChildrenAboard() {
      
      parentsOrChildrenAboard_ = 0;
      onChanged();
      return this;
    }

    private double fare_ ;
    /**
     * <code>double fare = 8;</code>
     * @return The fare.
     */
    public double getFare() {
      return fare_;
    }
    /**
     * <code>double fare = 8;</code>
     * @param value The fare to set.
     * @return This builder for chaining.
     */
    public Builder setFare(double value) {
      
      fare_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double fare = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearFare() {
      
      fare_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.adetalhouet.directory.PersonData)
  }

  // @@protoc_insertion_point(class_scope:io.adetalhouet.directory.PersonData)
  private static final io.adetalhouet.directory.grpc.PersonData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.adetalhouet.directory.grpc.PersonData();
  }

  public static io.adetalhouet.directory.grpc.PersonData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonData>
      PARSER = new com.google.protobuf.AbstractParser<PersonData>() {
    @java.lang.Override
    public PersonData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PersonData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PersonData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.adetalhouet.directory.grpc.PersonData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

