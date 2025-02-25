import ServiceBase from "./ServiceBase";
import * as proto from "./proto";

import type { Client as BrowserClient } from "nice-grpc-web";
import { Base64 } from "js-base64";

export class ProviderService extends ServiceBase {
    client: BrowserClient<typeof proto.ProviderDefinition>;

    constructor(options?: proto.ServiceOptions) {
        super(options);

        this.client = this.createClient(proto.ProviderDefinition);
    }

    public async createEcosystem(
        request: proto.CreateEcosystemRequest
    ): Promise<proto.CreateEcosystemResponse> {
        const response =
            request.name?.trim() || request.details?.email?.trim()
                ? await this.client.createEcosystem(request, {
                      metadata: await this.buildMetadata(
                          proto.CreateEcosystemRequest.encode(request).finish()
                      ),
                  })
                : await this.client.createEcosystem(request);

        const authToken = Base64.fromUint8Array(
            proto.AccountProfile.encode(response.profile!).finish(),
            true
        );
        this.options.authToken = authToken;
        return response;
    }
    // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    // target: /home/runner/work/sdk/sdk/web/src/ProviderService.ts

    /** Update an existing ecosystem */
    public async updateEcosystem(
        request: proto.UpdateEcosystemRequest
    ): Promise<proto.UpdateEcosystemResponse> {
        return this.client.updateEcosystem(request, {
            metadata: await this.buildMetadata(
                proto.UpdateEcosystemRequest.encode(request).finish()
            ),
        });
    }
    /** Grant user authorization to ecosystem resources */
    public async grantAuthorization(
        request: proto.GrantAuthorizationRequest
    ): Promise<proto.GrantAuthorizationResponse> {
        return this.client.grantAuthorization(request, {
            metadata: await this.buildMetadata(
                proto.GrantAuthorizationRequest.encode(request).finish()
            ),
        });
    }
    /** Revoke user authorization to ecosystem resources */
    public async revokeAuthorization(
        request: proto.RevokeAuthorizationRequest
    ): Promise<proto.RevokeAuthorizationResponse> {
        return this.client.revokeAuthorization(request, {
            metadata: await this.buildMetadata(
                proto.RevokeAuthorizationRequest.encode(request).finish()
            ),
        });
    }
    /** Retrieve the list of permissions for this particular account/ecosystem */
    public async getAuthorizations(
        request: proto.GetAuthorizationsRequest
    ): Promise<proto.GetAuthorizationsResponse> {
        return this.client.getAuthorizations(request, {
            metadata: await this.buildMetadata(
                proto.GetAuthorizationsRequest.encode(request).finish()
            ),
        });
    }
    /** Add a webhook endpoint to the ecosystem */
    public async addWebhook(
        request: proto.AddWebhookRequest
    ): Promise<proto.AddWebhookResponse> {
        return this.client.addWebhook(request, {
            metadata: await this.buildMetadata(
                proto.AddWebhookRequest.encode(request).finish()
            ),
        });
    }
    /** Delete a webhook endpoint from the ecosystem */
    public async deleteWebhook(
        request: proto.DeleteWebhookRequest
    ): Promise<proto.DeleteWebhookResponse> {
        return this.client.deleteWebhook(request, {
            metadata: await this.buildMetadata(
                proto.DeleteWebhookRequest.encode(request).finish()
            ),
        });
    }
    /** Get ecosystem information */
    public async ecosystemInfo(
        request: proto.EcosystemInfoRequest
    ): Promise<proto.EcosystemInfoResponse> {
        return this.client.ecosystemInfo(request, {
            metadata: await this.buildMetadata(
                proto.EcosystemInfoRequest.encode(request).finish()
            ),
        });
    }
    /** Get public ecosystem information about *any* ecosystem */
    public async getPublicEcosystemInfo(
        request: proto.GetPublicEcosystemInfoRequest
    ): Promise<proto.GetPublicEcosystemInfoResponse> {
        return this.client.getPublicEcosystemInfo(request, {
            metadata: await this.buildMetadata(),
        });
    }
    /** Generates an unprotected authentication token that can be used to
     * configure server side applications */
    public async generateToken(
        request: proto.GenerateTokenRequest
    ): Promise<proto.GenerateTokenResponse> {
        return this.client.generateToken(request, {
            metadata: await this.buildMetadata(
                proto.GenerateTokenRequest.encode(request).finish()
            ),
        });
    }
    /** Invite a user to the ecosystem */
    public async invite(
        request: proto.InviteRequest
    ): Promise<proto.InviteResponse> {
        return this.client.invite(request, {
            metadata: await this.buildMetadata(
                proto.InviteRequest.encode(request).finish()
            ),
        });
    }
    /** Check the status of an invitation */
    public async invitationStatus(
        request: proto.InvitationStatusRequest
    ): Promise<proto.InvitationStatusResponse> {
        return this.client.invitationStatus(request, {
            metadata: await this.buildMetadata(
                proto.InvitationStatusRequest.encode(request).finish()
            ),
        });
    }
    /** Returns the public key being used to create/verify oberon tokens */
    public async getOberonKey(
        request: proto.GetOberonKeyRequest
    ): Promise<proto.GetOberonKeyResponse> {
        return this.client.getOberonKey(request, {
            metadata: await this.buildMetadata(),
        });
    }
    /** Generate a signed token (JWT) that can be used to connect to the message bus */
    public async getEventToken(
        request: proto.GetEventTokenRequest
    ): Promise<proto.GetEventTokenResponse> {
        return this.client.getEventToken(request, {
            metadata: await this.buildMetadata(
                proto.GetEventTokenRequest.encode(request).finish()
            ),
        });
    }
    /** Upgrade a wallet's DID from `did:key` to another method */
    public async upgradeDID(
        request: proto.UpgradeDidRequest
    ): Promise<proto.UpgradeDidResponse> {
        return this.client.upgradeDID(request, {
            metadata: await this.buildMetadata(
                proto.UpgradeDidRequest.encode(request).finish()
            ),
        });
    }
    /** Retrieve a random hash TXT that can be used to verify domain ownership */
    public async retrieveDomainVerificationRecord(): Promise<proto.RetrieveDomainVerificationRecordResponse> {
        let request = proto.RetrieveDomainVerificationRecordRequest.fromPartial(
            {}
        );
        return this.client.retrieveDomainVerificationRecord(request, {
            metadata: await this.buildMetadata(
                proto.RetrieveDomainVerificationRecordRequest.encode(
                    request
                ).finish()
            ),
        });
    }
    /** Call to verify domain */
    public async refreshDomainVerificationStatus(
        request: proto.RefreshDomainVerificationStatusRequest
    ): Promise<proto.RefreshDomainVerificationStatusResponse> {
        return this.client.refreshDomainVerificationStatus(request, {
            metadata: await this.buildMetadata(
                proto.RefreshDomainVerificationStatusRequest.encode(
                    request
                ).finish()
            ),
        });
    }
    /** Search for issuers/providers/verifiers in the current ecosystem */
    public async searchWalletConfigurations(
        request: proto.SearchWalletConfigurationsRequest
    ): Promise<proto.SearchWalletConfigurationResponse> {
        return this.client.searchWalletConfigurations(request, {
            metadata: await this.buildMetadata(
                proto.SearchWalletConfigurationsRequest.encode(request).finish()
            ),
        });
    }
    // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
