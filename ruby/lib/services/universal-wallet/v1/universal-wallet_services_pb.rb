# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: services/universal-wallet/v1/universal-wallet.proto for package 'services.universalwallet.v1'

require 'grpc'
require 'services/universal-wallet/v1/universal-wallet_pb'

module Services
  module Universalwallet
    module V1
      module Wallet
        class Service

          include ::GRPC::GenericService

          self.marshal_class_method = :encode
          self.unmarshal_class_method = :decode
          self.service_name = 'services.universalwallet.v1.Wallet'

          rpc :GetProviderConfiguration, ::Services::Universalwallet::V1::GetProviderConfigurationRequest, ::Services::Universalwallet::V1::GetProviderConfigurationResponse
          rpc :ConnectExternalIdentity, ::Services::Universalwallet::V1::ConnectRequest, ::Services::Universalwallet::V1::ConnectResponse
          rpc :CreateWallet, ::Services::Universalwallet::V1::CreateWalletRequest, ::Services::Universalwallet::V1::CreateWalletResponse
          rpc :CreateWalletWithWorkflow, ::Services::Universalwallet::V1::CreateWalletRequest, ::Services::Universalwallet::V1::CreateWalletResponse
          rpc :CreateWalletEncrypted, ::Pbmse::V1::EncryptedMessage, ::Pbmse::V1::EncryptedMessage
          rpc :Search, ::Services::Universalwallet::V1::SearchRequest, ::Services::Universalwallet::V1::SearchResponse
          rpc :InsertItem, ::Services::Universalwallet::V1::InsertItemRequest, ::Services::Universalwallet::V1::InsertItemResponse
          rpc :GrantAccess, ::Services::Universalwallet::V1::GrantAccessRequest, ::Services::Universalwallet::V1::GrantAccessResponse
          rpc :RevokeAccess, ::Services::Universalwallet::V1::RevokeAccessRequest, ::Services::Universalwallet::V1::RevokeAccessResponse
        end

        Stub = Service.rpc_stub_class
      end
    end
  end
end
