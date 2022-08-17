// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/options/field-options.proto

package trinsic.services.protobuf.options;

/** Protobuf type {@code services.options.SdkTemplateOption} */
public final class SdkTemplateOption extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.options.SdkTemplateOption)
    SdkTemplateOptionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SdkTemplateOption.newBuilder() to construct.
  private SdkTemplateOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SdkTemplateOption() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SdkTemplateOption();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SdkTemplateOption(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8:
            {
              bitField0_ |= 0x00000001;
              anonymous_ = input.readBool();
              break;
            }
          case 16:
            {
              bitField0_ |= 0x00000002;
              ignore_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.protobuf.options.FieldOptions
        .internal_static_services_options_SdkTemplateOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.protobuf.options.FieldOptions
        .internal_static_services_options_SdkTemplateOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.protobuf.options.SdkTemplateOption.class,
            trinsic.services.protobuf.options.SdkTemplateOption.Builder.class);
  }

  private int bitField0_;
  public static final int ANONYMOUS_FIELD_NUMBER = 1;
  private boolean anonymous_;
  /**
   *
   *
   * <pre>
   * Whether the service endpoint allows anonymous (no auth token necessary) authentication
   * This is used by the `protoc-gen-trinsic-sdk` plugin for metadata.
   * </pre>
   *
   * <code>optional bool anonymous = 1;</code>
   *
   * @return Whether the anonymous field is set.
   */
  @java.lang.Override
  public boolean hasAnonymous() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Whether the service endpoint allows anonymous (no auth token necessary) authentication
   * This is used by the `protoc-gen-trinsic-sdk` plugin for metadata.
   * </pre>
   *
   * <code>optional bool anonymous = 1;</code>
   *
   * @return The anonymous.
   */
  @java.lang.Override
  public boolean getAnonymous() {
    return anonymous_;
  }

  public static final int IGNORE_FIELD_NUMBER = 2;
  private boolean ignore_;
  /**
   *
   *
   * <pre>
   * Whether the SDK template generator should ignore this method. This method will
   * be wrapped manually.
   * </pre>
   *
   * <code>optional bool ignore = 2;</code>
   *
   * @return Whether the ignore field is set.
   */
  @java.lang.Override
  public boolean hasIgnore() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Whether the SDK template generator should ignore this method. This method will
   * be wrapped manually.
   * </pre>
   *
   * <code>optional bool ignore = 2;</code>
   *
   * @return The ignore.
   */
  @java.lang.Override
  public boolean getIgnore() {
    return ignore_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(1, anonymous_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, ignore_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, anonymous_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, ignore_);
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
    if (!(obj instanceof trinsic.services.protobuf.options.SdkTemplateOption)) {
      return super.equals(obj);
    }
    trinsic.services.protobuf.options.SdkTemplateOption other =
        (trinsic.services.protobuf.options.SdkTemplateOption) obj;

    if (hasAnonymous() != other.hasAnonymous()) return false;
    if (hasAnonymous()) {
      if (getAnonymous() != other.getAnonymous()) return false;
    }
    if (hasIgnore() != other.hasIgnore()) return false;
    if (hasIgnore()) {
      if (getIgnore() != other.getIgnore()) return false;
    }
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
    if (hasAnonymous()) {
      hash = (37 * hash) + ANONYMOUS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAnonymous());
    }
    if (hasIgnore()) {
      hash = (37 * hash) + IGNORE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIgnore());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption parseFrom(
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

  public static Builder newBuilder(trinsic.services.protobuf.options.SdkTemplateOption prototype) {
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
  /** Protobuf type {@code services.options.SdkTemplateOption} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.options.SdkTemplateOption)
      trinsic.services.protobuf.options.SdkTemplateOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.protobuf.options.FieldOptions
          .internal_static_services_options_SdkTemplateOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.protobuf.options.FieldOptions
          .internal_static_services_options_SdkTemplateOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.protobuf.options.SdkTemplateOption.class,
              trinsic.services.protobuf.options.SdkTemplateOption.Builder.class);
    }

    // Construct using trinsic.services.protobuf.options.SdkTemplateOption.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      anonymous_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      ignore_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.protobuf.options.FieldOptions
          .internal_static_services_options_SdkTemplateOption_descriptor;
    }

    @java.lang.Override
    public trinsic.services.protobuf.options.SdkTemplateOption getDefaultInstanceForType() {
      return trinsic.services.protobuf.options.SdkTemplateOption.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.protobuf.options.SdkTemplateOption build() {
      trinsic.services.protobuf.options.SdkTemplateOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.protobuf.options.SdkTemplateOption buildPartial() {
      trinsic.services.protobuf.options.SdkTemplateOption result =
          new trinsic.services.protobuf.options.SdkTemplateOption(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.anonymous_ = anonymous_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ignore_ = ignore_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof trinsic.services.protobuf.options.SdkTemplateOption) {
        return mergeFrom((trinsic.services.protobuf.options.SdkTemplateOption) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.protobuf.options.SdkTemplateOption other) {
      if (other == trinsic.services.protobuf.options.SdkTemplateOption.getDefaultInstance())
        return this;
      if (other.hasAnonymous()) {
        setAnonymous(other.getAnonymous());
      }
      if (other.hasIgnore()) {
        setIgnore(other.getIgnore());
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
      trinsic.services.protobuf.options.SdkTemplateOption parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (trinsic.services.protobuf.options.SdkTemplateOption) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private boolean anonymous_;
    /**
     *
     *
     * <pre>
     * Whether the service endpoint allows anonymous (no auth token necessary) authentication
     * This is used by the `protoc-gen-trinsic-sdk` plugin for metadata.
     * </pre>
     *
     * <code>optional bool anonymous = 1;</code>
     *
     * @return Whether the anonymous field is set.
     */
    @java.lang.Override
    public boolean hasAnonymous() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Whether the service endpoint allows anonymous (no auth token necessary) authentication
     * This is used by the `protoc-gen-trinsic-sdk` plugin for metadata.
     * </pre>
     *
     * <code>optional bool anonymous = 1;</code>
     *
     * @return The anonymous.
     */
    @java.lang.Override
    public boolean getAnonymous() {
      return anonymous_;
    }
    /**
     *
     *
     * <pre>
     * Whether the service endpoint allows anonymous (no auth token necessary) authentication
     * This is used by the `protoc-gen-trinsic-sdk` plugin for metadata.
     * </pre>
     *
     * <code>optional bool anonymous = 1;</code>
     *
     * @param value The anonymous to set.
     * @return This builder for chaining.
     */
    public Builder setAnonymous(boolean value) {
      bitField0_ |= 0x00000001;
      anonymous_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether the service endpoint allows anonymous (no auth token necessary) authentication
     * This is used by the `protoc-gen-trinsic-sdk` plugin for metadata.
     * </pre>
     *
     * <code>optional bool anonymous = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAnonymous() {
      bitField0_ = (bitField0_ & ~0x00000001);
      anonymous_ = false;
      onChanged();
      return this;
    }

    private boolean ignore_;
    /**
     *
     *
     * <pre>
     * Whether the SDK template generator should ignore this method. This method will
     * be wrapped manually.
     * </pre>
     *
     * <code>optional bool ignore = 2;</code>
     *
     * @return Whether the ignore field is set.
     */
    @java.lang.Override
    public boolean hasIgnore() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Whether the SDK template generator should ignore this method. This method will
     * be wrapped manually.
     * </pre>
     *
     * <code>optional bool ignore = 2;</code>
     *
     * @return The ignore.
     */
    @java.lang.Override
    public boolean getIgnore() {
      return ignore_;
    }
    /**
     *
     *
     * <pre>
     * Whether the SDK template generator should ignore this method. This method will
     * be wrapped manually.
     * </pre>
     *
     * <code>optional bool ignore = 2;</code>
     *
     * @param value The ignore to set.
     * @return This builder for chaining.
     */
    public Builder setIgnore(boolean value) {
      bitField0_ |= 0x00000002;
      ignore_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether the SDK template generator should ignore this method. This method will
     * be wrapped manually.
     * </pre>
     *
     * <code>optional bool ignore = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIgnore() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ignore_ = false;
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

    // @@protoc_insertion_point(builder_scope:services.options.SdkTemplateOption)
  }

  // @@protoc_insertion_point(class_scope:services.options.SdkTemplateOption)
  private static final trinsic.services.protobuf.options.SdkTemplateOption DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.protobuf.options.SdkTemplateOption();
  }

  public static trinsic.services.protobuf.options.SdkTemplateOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SdkTemplateOption> PARSER =
      new com.google.protobuf.AbstractParser<SdkTemplateOption>() {
        @java.lang.Override
        public SdkTemplateOption parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SdkTemplateOption(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SdkTemplateOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SdkTemplateOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.protobuf.options.SdkTemplateOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}