import ServiceBase from "./ServiceBase";
import { ServiceOptions, VerifiableCredentialDefinition } from "./proto";
import * as proto from "./proto";

import type { Client as BrowserClient } from "nice-grpc-web";

export class CredentialService extends ServiceBase {
    client: BrowserClient<typeof VerifiableCredentialDefinition>;

    constructor(options?: ServiceOptions) {
        super(options);

        this.client = this.createClient(VerifiableCredentialDefinition);
    }
    // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    // target: /home/runner/work/sdk/sdk/web/src/CredentialService.ts

    /** Sign and issue a verifiable credential from a submitted document.
     * The document must be a valid JSON-LD document. */
    public async issue(
        request: proto.IssueRequest
    ): Promise<proto.IssueResponse> {
        return this.client.issue(request, {
            metadata: await this.buildMetadata(
                proto.IssueRequest.encode(request).finish()
            ),
        });
    }
    /** Sign and issue a verifiable credential from a pre-defined template.
     * This process will also add schema validation and
     * revocation registry values to the credential. */
    public async issueFromTemplate(
        request: proto.IssueFromTemplateRequest
    ): Promise<proto.IssueFromTemplateResponse> {
        return this.client.issueFromTemplate(request, {
            metadata: await this.buildMetadata(
                proto.IssueFromTemplateRequest.encode(request).finish()
            ),
        });
    }
    /** Check credential status in the revocation registry */
    public async checkStatus(
        request: proto.CheckStatusRequest
    ): Promise<proto.CheckStatusResponse> {
        return this.client.checkStatus(request, {
            metadata: await this.buildMetadata(
                proto.CheckStatusRequest.encode(request).finish()
            ),
        });
    }
    /** Update credential status by setting the revocation value */
    public async updateStatus(
        request: proto.UpdateStatusRequest
    ): Promise<proto.UpdateStatusResponse> {
        return this.client.updateStatus(request, {
            metadata: await this.buildMetadata(
                proto.UpdateStatusRequest.encode(request).finish()
            ),
        });
    }
    /** Create a proof from a signed document that is a valid
     * verifiable credential and contains a signature from which a proof can be derived. */
    public async createProof(
        request: proto.CreateProofRequest
    ): Promise<proto.CreateProofResponse> {
        return this.client.createProof(request, {
            metadata: await this.buildMetadata(
                proto.CreateProofRequest.encode(request).finish()
            ),
        });
    }
    /** Verifies a proof by checking the signature value, and if possible schema validation,
     * revocation status, and issuer status against a trust registry */
    public async verifyProof(
        request: proto.VerifyProofRequest
    ): Promise<proto.VerifyProofResponse> {
        return this.client.verifyProof(request, {
            metadata: await this.buildMetadata(
                proto.VerifyProofRequest.encode(request).finish()
            ),
        });
    }
    /** Sends a document directly to a user's email within the given ecosystem */
    public async send(request: proto.SendRequest): Promise<proto.SendResponse> {
        return this.client.send(request, {
            metadata: await this.buildMetadata(
                proto.SendRequest.encode(request).finish()
            ),
        });
    }
    // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
