// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/verifiable-credentials/v1/verifiable-credentials.proto

package trinsic.services.verifiablecredentials.v1;

/**
 *
 *
 * <pre>
 * Result of a validation check on a proof
 * </pre>
 *
 * Protobuf type {@code services.verifiablecredentials.v1.ValidationMessage}
 */
public final class ValidationMessage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.verifiablecredentials.v1.ValidationMessage)
    ValidationMessageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ValidationMessage.newBuilder() to construct.
  private ValidationMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ValidationMessage() {
    messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ValidationMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
        .internal_static_services_verifiablecredentials_v1_ValidationMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
        .internal_static_services_verifiablecredentials_v1_ValidationMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.verifiablecredentials.v1.ValidationMessage.class,
            trinsic.services.verifiablecredentials.v1.ValidationMessage.Builder.class);
  }

  public static final int IS_VALID_FIELD_NUMBER = 1;
  private boolean isValid_;
  /**
   *
   *
   * <pre>
   * Whether this validation check passed
   * </pre>
   *
   * <code>bool is_valid = 1;</code>
   *
   * @return The isValid.
   */
  @java.lang.Override
  public boolean getIsValid() {
    return isValid_;
  }

  public static final int MESSAGES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList messages_;
  /**
   *
   *
   * <pre>
   * If validation failed, contains messages explaining why
   * </pre>
   *
   * <code>repeated string messages = 2;</code>
   *
   * @return A list containing the messages.
   */
  public com.google.protobuf.ProtocolStringList getMessagesList() {
    return messages_;
  }
  /**
   *
   *
   * <pre>
   * If validation failed, contains messages explaining why
   * </pre>
   *
   * <code>repeated string messages = 2;</code>
   *
   * @return The count of messages.
   */
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   *
   *
   * <pre>
   * If validation failed, contains messages explaining why
   * </pre>
   *
   * <code>repeated string messages = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The messages at the given index.
   */
  public java.lang.String getMessages(int index) {
    return messages_.get(index);
  }
  /**
   *
   *
   * <pre>
   * If validation failed, contains messages explaining why
   * </pre>
   *
   * <code>repeated string messages = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the messages at the given index.
   */
  public com.google.protobuf.ByteString getMessagesBytes(int index) {
    return messages_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (isValid_ != false) {
      output.writeBool(1, isValid_);
    }
    for (int i = 0; i < messages_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, messages_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isValid_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, isValid_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < messages_.size(); i++) {
        dataSize += computeStringSizeNoTag(messages_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMessagesList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof trinsic.services.verifiablecredentials.v1.ValidationMessage)) {
      return super.equals(obj);
    }
    trinsic.services.verifiablecredentials.v1.ValidationMessage other =
        (trinsic.services.verifiablecredentials.v1.ValidationMessage) obj;

    if (getIsValid() != other.getIsValid()) return false;
    if (!getMessagesList().equals(other.getMessagesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IS_VALID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsValid());
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      trinsic.services.verifiablecredentials.v1.ValidationMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Result of a validation check on a proof
   * </pre>
   *
   * Protobuf type {@code services.verifiablecredentials.v1.ValidationMessage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.verifiablecredentials.v1.ValidationMessage)
      trinsic.services.verifiablecredentials.v1.ValidationMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_ValidationMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_ValidationMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.verifiablecredentials.v1.ValidationMessage.class,
              trinsic.services.verifiablecredentials.v1.ValidationMessage.Builder.class);
    }

    // Construct using trinsic.services.verifiablecredentials.v1.ValidationMessage.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      isValid_ = false;

      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_ValidationMessage_descriptor;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.ValidationMessage getDefaultInstanceForType() {
      return trinsic.services.verifiablecredentials.v1.ValidationMessage.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.ValidationMessage build() {
      trinsic.services.verifiablecredentials.v1.ValidationMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.ValidationMessage buildPartial() {
      trinsic.services.verifiablecredentials.v1.ValidationMessage result =
          new trinsic.services.verifiablecredentials.v1.ValidationMessage(this);
      int from_bitField0_ = bitField0_;
      result.isValid_ = isValid_;
      if (((bitField0_ & 0x00000001) != 0)) {
        messages_ = messages_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.messages_ = messages_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof trinsic.services.verifiablecredentials.v1.ValidationMessage) {
        return mergeFrom((trinsic.services.verifiablecredentials.v1.ValidationMessage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.verifiablecredentials.v1.ValidationMessage other) {
      if (other == trinsic.services.verifiablecredentials.v1.ValidationMessage.getDefaultInstance())
        return this;
      if (other.getIsValid() != false) {
        setIsValid(other.getIsValid());
      }
      if (!other.messages_.isEmpty()) {
        if (messages_.isEmpty()) {
          messages_ = other.messages_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMessagesIsMutable();
          messages_.addAll(other.messages_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                isValid_ = input.readBool();

                break;
              } // case 8
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureMessagesIsMutable();
                messages_.add(s);
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private boolean isValid_;
    /**
     *
     *
     * <pre>
     * Whether this validation check passed
     * </pre>
     *
     * <code>bool is_valid = 1;</code>
     *
     * @return The isValid.
     */
    @java.lang.Override
    public boolean getIsValid() {
      return isValid_;
    }
    /**
     *
     *
     * <pre>
     * Whether this validation check passed
     * </pre>
     *
     * <code>bool is_valid = 1;</code>
     *
     * @param value The isValid to set.
     * @return This builder for chaining.
     */
    public Builder setIsValid(boolean value) {

      isValid_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether this validation check passed
     * </pre>
     *
     * <code>bool is_valid = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIsValid() {

      isValid_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList messages_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        messages_ = new com.google.protobuf.LazyStringArrayList(messages_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * If validation failed, contains messages explaining why
     * </pre>
     *
     * <code>repeated string messages = 2;</code>
     *
     * @return A list containing the messages.
     */
    public com.google.protobuf.ProtocolStringList getMessagesList() {
      return messages_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * If validation failed, contains messages explaining why
     * </pre>
     *
     * <code>repeated string messages = 2;</code>
     *
     * @return The count of messages.
     */
    public int getMessagesCount() {
      return messages_.size();
    }
    /**
     *
     *
     * <pre>
     * If validation failed, contains messages explaining why
     * </pre>
     *
     * <code>repeated string messages = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The messages at the given index.
     */
    public java.lang.String getMessages(int index) {
      return messages_.get(index);
    }
    /**
     *
     *
     * <pre>
     * If validation failed, contains messages explaining why
     * </pre>
     *
     * <code>repeated string messages = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the messages at the given index.
     */
    public com.google.protobuf.ByteString getMessagesBytes(int index) {
      return messages_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * If validation failed, contains messages explaining why
     * </pre>
     *
     * <code>repeated string messages = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The messages to set.
     * @return This builder for chaining.
     */
    public Builder setMessages(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMessagesIsMutable();
      messages_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If validation failed, contains messages explaining why
     * </pre>
     *
     * <code>repeated string messages = 2;</code>
     *
     * @param value The messages to add.
     * @return This builder for chaining.
     */
    public Builder addMessages(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMessagesIsMutable();
      messages_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If validation failed, contains messages explaining why
     * </pre>
     *
     * <code>repeated string messages = 2;</code>
     *
     * @param values The messages to add.
     * @return This builder for chaining.
     */
    public Builder addAllMessages(java.lang.Iterable<java.lang.String> values) {
      ensureMessagesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, messages_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If validation failed, contains messages explaining why
     * </pre>
     *
     * <code>repeated string messages = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMessages() {
      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If validation failed, contains messages explaining why
     * </pre>
     *
     * <code>repeated string messages = 2;</code>
     *
     * @param value The bytes of the messages to add.
     * @return This builder for chaining.
     */
    public Builder addMessagesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureMessagesIsMutable();
      messages_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:services.verifiablecredentials.v1.ValidationMessage)
  }

  // @@protoc_insertion_point(class_scope:services.verifiablecredentials.v1.ValidationMessage)
  private static final trinsic.services.verifiablecredentials.v1.ValidationMessage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.verifiablecredentials.v1.ValidationMessage();
  }

  public static trinsic.services.verifiablecredentials.v1.ValidationMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidationMessage> PARSER =
      new com.google.protobuf.AbstractParser<ValidationMessage>() {
        @java.lang.Override
        public ValidationMessage parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ValidationMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidationMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.verifiablecredentials.v1.ValidationMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
