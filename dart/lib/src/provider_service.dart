import 'dart:convert';

import 'package:trinsic_dart/src/proto/sdk/options/v1/options.pb.dart';
import 'package:trinsic_dart/src/proto/services/provider/v1/provider.pbgrpc.dart';
import 'package:trinsic_dart/src/service_base.dart';
import 'package:trinsic_dart/src/storage/token_provider.dart';

class ProviderService extends ServiceBase {
  late ProviderClient client;

  ProviderService(ServiceOptions? serverOptions, ITokenProvider? tokenProvider)
      : super(serverOptions, tokenProvider) {
    client = ProviderClient(super.channel);
  }

  Future<CreateEcosystemResponse> createEcosystem(
      {CreateEcosystemRequest? request}) async {
    request = request ?? CreateEcosystemRequest();
    var authenticate =
        (request.name.isNotEmpty || request.details.email.isNotEmpty);
    var metadata =
        authenticate ? buildMetadata(request: request) : buildMetadata();
    var response =
        await client.createEcosystem(request, options: await metadata);
    if (!response.profile.protection.enabled) {
      tokenProvider.Save(
          Base64Encoder.urlSafe().convert(response.profile.writeToBuffer()));
    }
    return response;
  }

// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/dart/lib/src/provider_service.dart

  Future<UpdateEcosystemResponse> updateEcosystem(
      UpdateEcosystemRequest request) async {
    ///  Update an existing ecosystem

    return client.updateEcosystem(request,
        options: await buildMetadata(request: request));
  }

  Future<GrantAuthorizationResponse> grantAuthorization(
      GrantAuthorizationRequest request) async {
    ///  Grant user authorization to ecosystem resources

    return client.grantAuthorization(request,
        options: await buildMetadata(request: request));
  }

  Future<RevokeAuthorizationResponse> revokeAuthorization(
      RevokeAuthorizationRequest request) async {
    ///  Revoke user authorization to ecosystem resources

    return client.revokeAuthorization(request,
        options: await buildMetadata(request: request));
  }

  Future<GetAuthorizationsResponse> getAuthorizations(
      GetAuthorizationsRequest request) async {
    ///  Retrieve the list of permissions for this particular account/ecosystem

    return client.getAuthorizations(request,
        options: await buildMetadata(request: request));
  }

  Future<AddWebhookResponse> addWebhook(AddWebhookRequest request) async {
    ///  Add a webhook endpoint to the ecosystem

    return client.addWebhook(request,
        options: await buildMetadata(request: request));
  }

  Future<DeleteWebhookResponse> deleteWebhook(
      DeleteWebhookRequest request) async {
    ///  Delete a webhook endpoint from the ecosystem

    return client.deleteWebhook(request,
        options: await buildMetadata(request: request));
  }

  Future<EcosystemInfoResponse> ecosystemInfo(
      EcosystemInfoRequest request) async {
    ///  Get ecosystem information

    return client.ecosystemInfo(request,
        options: await buildMetadata(request: request));
  }

  Future<GetPublicEcosystemInfoResponse> getPublicEcosystemInfo(
      GetPublicEcosystemInfoRequest request) async {
    ///  Get public ecosystem information about *any* ecosystem

    return client.getPublicEcosystemInfo(request,
        options: await buildMetadata());
  }

  Future<GenerateTokenResponse> generateToken(
      GenerateTokenRequest request) async {
    ///  Generates an unprotected authentication token that can be used to
    /// configure server side applications

    return client.generateToken(request,
        options: await buildMetadata(request: request));
  }

  Future<InviteResponse> invite(InviteRequest request) async {
    ///  Invite a user to the ecosystem

    return client.invite(request,
        options: await buildMetadata(request: request));
  }

  Future<InvitationStatusResponse> invitationStatus(
      InvitationStatusRequest request) async {
    ///  Check the status of an invitation

    return client.invitationStatus(request,
        options: await buildMetadata(request: request));
  }

  Future<GetOberonKeyResponse> getOberonKey(GetOberonKeyRequest request) async {
    ///  Returns the public key being used to create/verify oberon tokens

    return client.getOberonKey(request, options: await buildMetadata());
  }

  Future<GetEventTokenResponse> getEventToken(
      GetEventTokenRequest request) async {
    ///  Generate a signed token (JWT) that can be used to connect to the message bus

    return client.getEventToken(request,
        options: await buildMetadata(request: request));
  }

  Future<UpgradeDidResponse> upgradeDID(UpgradeDidRequest request) async {
    ///  Upgrade a wallet's DID from `did:key` to another method

    return client.upgradeDID(request,
        options: await buildMetadata(request: request));
  }

  Future<RetrieveDomainVerificationRecordResponse>
      retrieveDomainVerificationRecord() async {
    ///  Retrieve a random hash TXT that can be used to verify domain ownership
    var request = RetrieveDomainVerificationRecordRequest();
    return client.retrieveDomainVerificationRecord(request,
        options: await buildMetadata(request: request));
  }

  Future<RefreshDomainVerificationStatusResponse>
      refreshDomainVerificationStatus(
          RefreshDomainVerificationStatusRequest request) async {
    ///  Call to verify domain

    return client.refreshDomainVerificationStatus(request,
        options: await buildMetadata(request: request));
  }

  Future<SearchWalletConfigurationResponse> searchWalletConfigurations(
      SearchWalletConfigurationsRequest request) async {
    ///  Search for issuers/providers/verifiers in the current ecosystem

    return client.searchWalletConfigurations(request,
        options: await buildMetadata(request: request));
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
