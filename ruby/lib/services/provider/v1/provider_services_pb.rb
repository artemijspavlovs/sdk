# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: services/provider/v1/provider.proto for package 'services.provider.v1'

require 'grpc'
require 'services/provider/v1/provider_pb'

module Services
  module Provider
    module V1
      module Provider
        class Service

          include ::GRPC::GenericService

          self.marshal_class_method = :encode
          self.unmarshal_class_method = :decode
          self.service_name = 'services.provider.v1.Provider'

          #   rpc CreateOrganization(CreateOrganizationRequest) returns (CreateOrganizationResponse);
          rpc :Invite, ::Services::Provider::V1::InviteRequest, ::Services::Provider::V1::InviteResponse
          rpc :InviteWithWorkflow, ::Services::Provider::V1::InviteRequest, ::Services::Provider::V1::InviteResponse
          rpc :InvitationStatus, ::Services::Provider::V1::InvitationStatusRequest, ::Services::Provider::V1::InvitationStatusResponse
          #   rpc CreateCredentialTemplate(CreateCredentialTemplateRequest) returns (CreateCredentialTemplateResponse);
          #   rpc ListCredentialTemplates(ListCredentialTemplatesRequest) returns (ListCredentialTemplatesResponse);
        end

        Stub = Service.rpc_stub_class
      end
    end
  end
end
