package trinsic.services

import com.google.protobuf.InvalidProtocolBufferException
import trinsic.okapi.DidException
import trinsic.sdk.options.v1.Options
import trinsic.services.verifiablecredentials.v1.*
import trinsic.services.verifiablecredentials.v1.VerifiableCredentialGrpcKt

class CredentialServiceKt(options: Options.ServiceOptions.Builder?) : ServiceBase(options) {
  var stub = VerifiableCredentialGrpcKt.VerifiableCredentialCoroutineStub(this.channel)

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun issueCredential(request: IssueRequest): IssueResponse {
    require(!request.documentJson.isBlank()) { "document json must not be empty" }
    return withMetadata(stub, request).issue(request)
  }
  // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
  // target: /home/runner/work/sdk/sdk/java/src/main/java/trinsic/services/CredentialServiceKt.kt

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun issue(request: IssueRequest): IssueResponse {
    /**
     * Sign and issue a verifiable credential from a submitted document. The document must be a
     * valid JSON-LD document.
     */
    return withMetadata(stub, request).issue(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun issueFromTemplate(request: IssueFromTemplateRequest): IssueFromTemplateResponse {
    /**
     * Sign and issue a verifiable credential from a pre-defined template. This process will also
     * add schema validation and revocation registry values to the credential.
     */
    return withMetadata(stub, request).issueFromTemplate(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun checkStatus(request: CheckStatusRequest): CheckStatusResponse {
    /** Check credential status in the revocation registry */
    return withMetadata(stub, request).checkStatus(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun updateStatus(request: UpdateStatusRequest): UpdateStatusResponse {
    /** Update credential status by setting the revocation value */
    return withMetadata(stub, request).updateStatus(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun createProof(request: CreateProofRequest): CreateProofResponse {
    /**
     * Create a proof from a signed document that is a valid verifiable credential and contains a
     * signature from which a proof can be derived.
     */
    return withMetadata(stub, request).createProof(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun verifyProof(request: VerifyProofRequest): VerifyProofResponse {
    /**
     * Verifies a proof by checking the signature value, and if possible schema validation,
     * revocation status, and issuer status against a trust registry
     */
    return withMetadata(stub, request).verifyProof(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun send(request: SendRequest): SendResponse {
    /** Sends a document directly to a user's email within the given ecosystem */
    return withMetadata(stub, request).send(request)
  }
  // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
