package trinsic.services;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.InvalidProtocolBufferException;
import trinsic.okapi.DidException;
import trinsic.sdk.options.v1.Options;
import trinsic.services.trustregistry.v1.*;

public class TrustRegistryService extends ServiceBase {
  public TrustRegistryGrpc.TrustRegistryFutureStub stub;
  // We only use the blocking stub for server-side streaming call.
  public TrustRegistryGrpc.TrustRegistryBlockingStub stub2;

  public TrustRegistryService() {
    this(null);
  }

  public TrustRegistryService(Options.ServiceOptions.Builder options) {
    super(options);
    this.stub = TrustRegistryGrpc.newFutureStub(this.getChannel());
    this.stub2 = TrustRegistryGrpc.newBlockingStub(this.getChannel());
  }

  public ListenableFuture<SearchRegistryResponse> search()
      throws InvalidProtocolBufferException, DidException {
    return search(SearchRegistryRequest.getDefaultInstance());
  }

  public ListenableFuture<SearchRegistryResponse> search(SearchRegistryRequest request)
      throws InvalidProtocolBufferException, DidException {
    if (request.getQuery().isBlank())
      request =
          SearchRegistryRequest.newBuilder(request)
              .setQuery("SELECT * FROM c OFFSET 0 LIMIT 100")
              .build();
    return searchRegistry(request);
  }
  // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
  // target: /home/runner/work/sdk/sdk/java/src/main/java/trinsic/services/TrustRegistryService.java

  /** Add a governance framework to the ecosystem */
  public ListenableFuture<AddFrameworkResponse> addFramework(AddFrameworkRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).addFramework(request);
  }
  /** Remove a governance framework from the ecosystem */
  public ListenableFuture<RemoveFrameworkResponse> removeFramework(RemoveFrameworkRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).removeFramework(request);
  }
  /** Search the ecosystem's governance frameworks */
  public ListenableFuture<SearchRegistryResponse> searchRegistry(SearchRegistryRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).searchRegistry(request);
  }
  /** Register an authoritative issuer for a credential schema */
  public ListenableFuture<RegisterMemberResponse> registerMember(RegisterMemberRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).registerMember(request);
  }
  /** Removes an authoritative issuer for a credential schema from the trust registry */
  public ListenableFuture<UnregisterMemberResponse> unregisterMember(
      UnregisterMemberRequest request) throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).unregisterMember(request);
  }
  /** Fetch the membership status of an issuer for a given credential schema in a trust registry */
  public ListenableFuture<GetMembershipStatusResponse> getMembershipStatus(
      GetMembershipStatusRequest request) throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).getMembershipStatus(request);
  }
  // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
