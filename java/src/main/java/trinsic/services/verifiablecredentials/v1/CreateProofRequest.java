// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/verifiable-credentials/v1/verifiable-credentials.proto

package trinsic.services.verifiablecredentials.v1;

/**
 *
 *
 * <pre>
 * Request to create a proof for a Verifiable Credential using public key tied to caller.
 * Either `item_id` or `document_json` may be provided, not both.
 * </pre>
 *
 * Protobuf type {@code services.verifiablecredentials.v1.CreateProofRequest}
 */
public final class CreateProofRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.verifiablecredentials.v1.CreateProofRequest)
    CreateProofRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateProofRequest.newBuilder() to construct.
  private CreateProofRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateProofRequest() {
    revealDocumentJson_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateProofRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
        .internal_static_services_verifiablecredentials_v1_CreateProofRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
        .internal_static_services_verifiablecredentials_v1_CreateProofRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.verifiablecredentials.v1.CreateProofRequest.class,
            trinsic.services.verifiablecredentials.v1.CreateProofRequest.Builder.class);
  }

  private int proofCase_ = 0;
  private java.lang.Object proof_;

  public enum ProofCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ITEM_ID(2),
    DOCUMENT_JSON(3),
    PROOF_NOT_SET(0);
    private final int value;

    private ProofCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ProofCase valueOf(int value) {
      return forNumber(value);
    }

    public static ProofCase forNumber(int value) {
      switch (value) {
        case 2:
          return ITEM_ID;
        case 3:
          return DOCUMENT_JSON;
        case 0:
          return PROOF_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ProofCase getProofCase() {
    return ProofCase.forNumber(proofCase_);
  }

  public static final int REVEAL_DOCUMENT_JSON_FIELD_NUMBER = 1;
  private volatile java.lang.Object revealDocumentJson_;
  /**
   *
   *
   * <pre>
   * A valid JSON-LD frame describing which fields should be
   * revealed in the generated proof.
   * If unspecified, all fields in the document will be revealed
   * </pre>
   *
   * <code>string reveal_document_json = 1;</code>
   *
   * @return The revealDocumentJson.
   */
  @java.lang.Override
  public java.lang.String getRevealDocumentJson() {
    java.lang.Object ref = revealDocumentJson_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      revealDocumentJson_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A valid JSON-LD frame describing which fields should be
   * revealed in the generated proof.
   * If unspecified, all fields in the document will be revealed
   * </pre>
   *
   * <code>string reveal_document_json = 1;</code>
   *
   * @return The bytes for revealDocumentJson.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRevealDocumentJsonBytes() {
    java.lang.Object ref = revealDocumentJson_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      revealDocumentJson_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEM_ID_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * ID of wallet item stored in a Trinsic cloud wallet
   * </pre>
   *
   * <code>string item_id = 2;</code>
   *
   * @return Whether the itemId field is set.
   */
  public boolean hasItemId() {
    return proofCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * ID of wallet item stored in a Trinsic cloud wallet
   * </pre>
   *
   * <code>string item_id = 2;</code>
   *
   * @return The itemId.
   */
  public java.lang.String getItemId() {
    java.lang.Object ref = "";
    if (proofCase_ == 2) {
      ref = proof_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (proofCase_ == 2) {
        proof_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * ID of wallet item stored in a Trinsic cloud wallet
   * </pre>
   *
   * <code>string item_id = 2;</code>
   *
   * @return The bytes for itemId.
   */
  public com.google.protobuf.ByteString getItemIdBytes() {
    java.lang.Object ref = "";
    if (proofCase_ == 2) {
      ref = proof_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (proofCase_ == 2) {
        proof_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOCUMENT_JSON_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * A valid JSON-LD Verifiable Credential document string
   * with an unbound signature. The proof will be derived from this
   * document directly. The document will not be stored in the wallet.
   * </pre>
   *
   * <code>string document_json = 3;</code>
   *
   * @return Whether the documentJson field is set.
   */
  public boolean hasDocumentJson() {
    return proofCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * A valid JSON-LD Verifiable Credential document string
   * with an unbound signature. The proof will be derived from this
   * document directly. The document will not be stored in the wallet.
   * </pre>
   *
   * <code>string document_json = 3;</code>
   *
   * @return The documentJson.
   */
  public java.lang.String getDocumentJson() {
    java.lang.Object ref = "";
    if (proofCase_ == 3) {
      ref = proof_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (proofCase_ == 3) {
        proof_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A valid JSON-LD Verifiable Credential document string
   * with an unbound signature. The proof will be derived from this
   * document directly. The document will not be stored in the wallet.
   * </pre>
   *
   * <code>string document_json = 3;</code>
   *
   * @return The bytes for documentJson.
   */
  public com.google.protobuf.ByteString getDocumentJsonBytes() {
    java.lang.Object ref = "";
    if (proofCase_ == 3) {
      ref = proof_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (proofCase_ == 3) {
        proof_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revealDocumentJson_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, revealDocumentJson_);
    }
    if (proofCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, proof_);
    }
    if (proofCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, proof_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revealDocumentJson_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, revealDocumentJson_);
    }
    if (proofCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, proof_);
    }
    if (proofCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, proof_);
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
    if (!(obj instanceof trinsic.services.verifiablecredentials.v1.CreateProofRequest)) {
      return super.equals(obj);
    }
    trinsic.services.verifiablecredentials.v1.CreateProofRequest other =
        (trinsic.services.verifiablecredentials.v1.CreateProofRequest) obj;

    if (!getRevealDocumentJson().equals(other.getRevealDocumentJson())) return false;
    if (!getProofCase().equals(other.getProofCase())) return false;
    switch (proofCase_) {
      case 2:
        if (!getItemId().equals(other.getItemId())) return false;
        break;
      case 3:
        if (!getDocumentJson().equals(other.getDocumentJson())) return false;
        break;
      case 0:
      default:
    }
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
    hash = (37 * hash) + REVEAL_DOCUMENT_JSON_FIELD_NUMBER;
    hash = (53 * hash) + getRevealDocumentJson().hashCode();
    switch (proofCase_) {
      case 2:
        hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
        hash = (53 * hash) + getItemId().hashCode();
        break;
      case 3:
        hash = (37 * hash) + DOCUMENT_JSON_FIELD_NUMBER;
        hash = (53 * hash) + getDocumentJson().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest parseFrom(
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
      trinsic.services.verifiablecredentials.v1.CreateProofRequest prototype) {
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
   * Request to create a proof for a Verifiable Credential using public key tied to caller.
   * Either `item_id` or `document_json` may be provided, not both.
   * </pre>
   *
   * Protobuf type {@code services.verifiablecredentials.v1.CreateProofRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.verifiablecredentials.v1.CreateProofRequest)
      trinsic.services.verifiablecredentials.v1.CreateProofRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_CreateProofRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_CreateProofRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.verifiablecredentials.v1.CreateProofRequest.class,
              trinsic.services.verifiablecredentials.v1.CreateProofRequest.Builder.class);
    }

    // Construct using trinsic.services.verifiablecredentials.v1.CreateProofRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      revealDocumentJson_ = "";

      proofCase_ = 0;
      proof_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_CreateProofRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.CreateProofRequest
        getDefaultInstanceForType() {
      return trinsic.services.verifiablecredentials.v1.CreateProofRequest.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.CreateProofRequest build() {
      trinsic.services.verifiablecredentials.v1.CreateProofRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.CreateProofRequest buildPartial() {
      trinsic.services.verifiablecredentials.v1.CreateProofRequest result =
          new trinsic.services.verifiablecredentials.v1.CreateProofRequest(this);
      result.revealDocumentJson_ = revealDocumentJson_;
      if (proofCase_ == 2) {
        result.proof_ = proof_;
      }
      if (proofCase_ == 3) {
        result.proof_ = proof_;
      }
      result.proofCase_ = proofCase_;
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
      if (other instanceof trinsic.services.verifiablecredentials.v1.CreateProofRequest) {
        return mergeFrom((trinsic.services.verifiablecredentials.v1.CreateProofRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.verifiablecredentials.v1.CreateProofRequest other) {
      if (other
          == trinsic.services.verifiablecredentials.v1.CreateProofRequest.getDefaultInstance())
        return this;
      if (!other.getRevealDocumentJson().isEmpty()) {
        revealDocumentJson_ = other.revealDocumentJson_;
        onChanged();
      }
      switch (other.getProofCase()) {
        case ITEM_ID:
          {
            proofCase_ = 2;
            proof_ = other.proof_;
            onChanged();
            break;
          }
        case DOCUMENT_JSON:
          {
            proofCase_ = 3;
            proof_ = other.proof_;
            onChanged();
            break;
          }
        case PROOF_NOT_SET:
          {
            break;
          }
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
            case 10:
              {
                revealDocumentJson_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                proofCase_ = 2;
                proof_ = s;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                proofCase_ = 3;
                proof_ = s;
                break;
              } // case 26
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

    private int proofCase_ = 0;
    private java.lang.Object proof_;

    public ProofCase getProofCase() {
      return ProofCase.forNumber(proofCase_);
    }

    public Builder clearProof() {
      proofCase_ = 0;
      proof_ = null;
      onChanged();
      return this;
    }

    private java.lang.Object revealDocumentJson_ = "";
    /**
     *
     *
     * <pre>
     * A valid JSON-LD frame describing which fields should be
     * revealed in the generated proof.
     * If unspecified, all fields in the document will be revealed
     * </pre>
     *
     * <code>string reveal_document_json = 1;</code>
     *
     * @return The revealDocumentJson.
     */
    public java.lang.String getRevealDocumentJson() {
      java.lang.Object ref = revealDocumentJson_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revealDocumentJson_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A valid JSON-LD frame describing which fields should be
     * revealed in the generated proof.
     * If unspecified, all fields in the document will be revealed
     * </pre>
     *
     * <code>string reveal_document_json = 1;</code>
     *
     * @return The bytes for revealDocumentJson.
     */
    public com.google.protobuf.ByteString getRevealDocumentJsonBytes() {
      java.lang.Object ref = revealDocumentJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        revealDocumentJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A valid JSON-LD frame describing which fields should be
     * revealed in the generated proof.
     * If unspecified, all fields in the document will be revealed
     * </pre>
     *
     * <code>string reveal_document_json = 1;</code>
     *
     * @param value The revealDocumentJson to set.
     * @return This builder for chaining.
     */
    public Builder setRevealDocumentJson(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      revealDocumentJson_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A valid JSON-LD frame describing which fields should be
     * revealed in the generated proof.
     * If unspecified, all fields in the document will be revealed
     * </pre>
     *
     * <code>string reveal_document_json = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRevealDocumentJson() {

      revealDocumentJson_ = getDefaultInstance().getRevealDocumentJson();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A valid JSON-LD frame describing which fields should be
     * revealed in the generated proof.
     * If unspecified, all fields in the document will be revealed
     * </pre>
     *
     * <code>string reveal_document_json = 1;</code>
     *
     * @param value The bytes for revealDocumentJson to set.
     * @return This builder for chaining.
     */
    public Builder setRevealDocumentJsonBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      revealDocumentJson_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * ID of wallet item stored in a Trinsic cloud wallet
     * </pre>
     *
     * <code>string item_id = 2;</code>
     *
     * @return Whether the itemId field is set.
     */
    @java.lang.Override
    public boolean hasItemId() {
      return proofCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * ID of wallet item stored in a Trinsic cloud wallet
     * </pre>
     *
     * <code>string item_id = 2;</code>
     *
     * @return The itemId.
     */
    @java.lang.Override
    public java.lang.String getItemId() {
      java.lang.Object ref = "";
      if (proofCase_ == 2) {
        ref = proof_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (proofCase_ == 2) {
          proof_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of wallet item stored in a Trinsic cloud wallet
     * </pre>
     *
     * <code>string item_id = 2;</code>
     *
     * @return The bytes for itemId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getItemIdBytes() {
      java.lang.Object ref = "";
      if (proofCase_ == 2) {
        ref = proof_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (proofCase_ == 2) {
          proof_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of wallet item stored in a Trinsic cloud wallet
     * </pre>
     *
     * <code>string item_id = 2;</code>
     *
     * @param value The itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      proofCase_ = 2;
      proof_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of wallet item stored in a Trinsic cloud wallet
     * </pre>
     *
     * <code>string item_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearItemId() {
      if (proofCase_ == 2) {
        proofCase_ = 0;
        proof_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of wallet item stored in a Trinsic cloud wallet
     * </pre>
     *
     * <code>string item_id = 2;</code>
     *
     * @param value The bytes for itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      proofCase_ = 2;
      proof_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A valid JSON-LD Verifiable Credential document string
     * with an unbound signature. The proof will be derived from this
     * document directly. The document will not be stored in the wallet.
     * </pre>
     *
     * <code>string document_json = 3;</code>
     *
     * @return Whether the documentJson field is set.
     */
    @java.lang.Override
    public boolean hasDocumentJson() {
      return proofCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * A valid JSON-LD Verifiable Credential document string
     * with an unbound signature. The proof will be derived from this
     * document directly. The document will not be stored in the wallet.
     * </pre>
     *
     * <code>string document_json = 3;</code>
     *
     * @return The documentJson.
     */
    @java.lang.Override
    public java.lang.String getDocumentJson() {
      java.lang.Object ref = "";
      if (proofCase_ == 3) {
        ref = proof_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (proofCase_ == 3) {
          proof_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A valid JSON-LD Verifiable Credential document string
     * with an unbound signature. The proof will be derived from this
     * document directly. The document will not be stored in the wallet.
     * </pre>
     *
     * <code>string document_json = 3;</code>
     *
     * @return The bytes for documentJson.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDocumentJsonBytes() {
      java.lang.Object ref = "";
      if (proofCase_ == 3) {
        ref = proof_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (proofCase_ == 3) {
          proof_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A valid JSON-LD Verifiable Credential document string
     * with an unbound signature. The proof will be derived from this
     * document directly. The document will not be stored in the wallet.
     * </pre>
     *
     * <code>string document_json = 3;</code>
     *
     * @param value The documentJson to set.
     * @return This builder for chaining.
     */
    public Builder setDocumentJson(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      proofCase_ = 3;
      proof_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A valid JSON-LD Verifiable Credential document string
     * with an unbound signature. The proof will be derived from this
     * document directly. The document will not be stored in the wallet.
     * </pre>
     *
     * <code>string document_json = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDocumentJson() {
      if (proofCase_ == 3) {
        proofCase_ = 0;
        proof_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A valid JSON-LD Verifiable Credential document string
     * with an unbound signature. The proof will be derived from this
     * document directly. The document will not be stored in the wallet.
     * </pre>
     *
     * <code>string document_json = 3;</code>
     *
     * @param value The bytes for documentJson to set.
     * @return This builder for chaining.
     */
    public Builder setDocumentJsonBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      proofCase_ = 3;
      proof_ = value;
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

    // @@protoc_insertion_point(builder_scope:services.verifiablecredentials.v1.CreateProofRequest)
  }

  // @@protoc_insertion_point(class_scope:services.verifiablecredentials.v1.CreateProofRequest)
  private static final trinsic.services.verifiablecredentials.v1.CreateProofRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.verifiablecredentials.v1.CreateProofRequest();
  }

  public static trinsic.services.verifiablecredentials.v1.CreateProofRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateProofRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateProofRequest>() {
        @java.lang.Override
        public CreateProofRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateProofRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateProofRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.verifiablecredentials.v1.CreateProofRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
