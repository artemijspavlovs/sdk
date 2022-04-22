# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: services/universal-wallet/v1/universal-wallet.proto

require 'google/protobuf'

require 'services/common/v1/common_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("services/universal-wallet/v1/universal-wallet.proto", :syntax => :proto3) do
    add_message "services.universalwallet.v1.SearchRequest" do
      optional :query, :string, 1
      optional :continuation_token, :string, 2
    end
    add_message "services.universalwallet.v1.SearchResponse" do
      repeated :items, :string, 1
      optional :has_more, :bool, 2
      optional :count, :int32, 3
      optional :continuation_token, :string, 4
    end
    add_message "services.universalwallet.v1.GetItemRequest" do
      optional :item_id, :string, 1
    end
    add_message "services.universalwallet.v1.GetItemResponse" do
      optional :item_json, :string, 1
      optional :item_type, :string, 2
    end
    add_message "services.universalwallet.v1.UpdateItemRequest" do
      optional :item_id, :string, 1
      optional :item_type, :string, 2
    end
    add_message "services.universalwallet.v1.UpdateItemResponse" do
      optional :status, :enum, 1, "services.common.v1.ResponseStatus"
    end
    add_message "services.universalwallet.v1.InsertItemRequest" do
      optional :item_json, :string, 1
      optional :item_type, :string, 2
    end
    add_message "services.universalwallet.v1.InsertItemResponse" do
      optional :status, :enum, 1, "services.common.v1.ResponseStatus"
      optional :item_id, :string, 2
    end
    add_message "services.universalwallet.v1.DeleteItemRequest" do
      optional :item_id, :string, 1
    end
    add_message "services.universalwallet.v1.DeleteItemResponse" do
      optional :status, :enum, 1, "services.common.v1.ResponseStatus"
    end
  end
end

module Services
  module Universalwallet
    module V1
      SearchRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.SearchRequest").msgclass
      SearchResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.SearchResponse").msgclass
      GetItemRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.GetItemRequest").msgclass
      GetItemResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.GetItemResponse").msgclass
      UpdateItemRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.UpdateItemRequest").msgclass
      UpdateItemResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.UpdateItemResponse").msgclass
      InsertItemRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.InsertItemRequest").msgclass
      InsertItemResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.InsertItemResponse").msgclass
      DeleteItemRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.DeleteItemRequest").msgclass
      DeleteItemResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.DeleteItemResponse").msgclass
    end
  end
end