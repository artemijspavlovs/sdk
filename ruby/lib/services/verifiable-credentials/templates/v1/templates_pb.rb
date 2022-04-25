# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: services/verifiable-credentials/templates/v1/templates.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("services/verifiable-credentials/templates/v1/templates.proto", :syntax => :proto3) do
    add_message "services.verifiablecredentials.templates.v1.GetCredentialTemplateRequest" do
      optional :id, :string, 1
    end
    add_message "services.verifiablecredentials.templates.v1.GetCredentialTemplateResponse" do
      optional :template, :message, 1, "services.verifiablecredentials.templates.v1.TemplateData"
    end
    add_message "services.verifiablecredentials.templates.v1.SearchCredentialTemplatesRequest" do
      optional :query, :string, 1
      optional :continuation_token, :string, 2
    end
    add_message "services.verifiablecredentials.templates.v1.SearchCredentialTemplatesResponse" do
      optional :items_json, :string, 1
      optional :has_more, :bool, 2
      optional :count, :int32, 3
      optional :continuation_token, :string, 4
    end
    add_message "services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest" do
      optional :query, :string, 1
      optional :continuation_token, :string, 2
    end
    add_message "services.verifiablecredentials.templates.v1.ListCredentialTemplatesResponse" do
      repeated :templates, :message, 1, "services.verifiablecredentials.templates.v1.TemplateData"
      optional :has_more_results, :bool, 2
      optional :continuation_token, :string, 3
    end
    add_message "services.verifiablecredentials.templates.v1.DeleteCredentialTemplateRequest" do
      optional :id, :string, 1
    end
    add_message "services.verifiablecredentials.templates.v1.DeleteCredentialTemplateResponse" do
    end
    add_message "services.verifiablecredentials.templates.v1.CreateCredentialTemplateRequest" do
      optional :name, :string, 1
      map :fields, :string, :message, 2, "services.verifiablecredentials.templates.v1.TemplateField"
      optional :allow_additional_fields, :bool, 3
    end
    add_message "services.verifiablecredentials.templates.v1.CreateCredentialTemplateResponse" do
      optional :data, :message, 1, "services.verifiablecredentials.templates.v1.TemplateData"
    end
    add_message "services.verifiablecredentials.templates.v1.TemplateField" do
      optional :description, :string, 2
      optional :optional, :bool, 3
      optional :type, :enum, 4, "services.verifiablecredentials.templates.v1.FieldType"
    end
    add_message "services.verifiablecredentials.templates.v1.GetTemplateRequest" do
      optional :id, :string, 1
    end
    add_message "services.verifiablecredentials.templates.v1.GetTemplateResponse" do
      optional :data, :message, 1, "services.verifiablecredentials.templates.v1.TemplateData"
    end
    add_message "services.verifiablecredentials.templates.v1.ListTemplatesRequest" do
    end
    add_message "services.verifiablecredentials.templates.v1.ListTemplatesResponse" do
      repeated :templates, :message, 1, "services.verifiablecredentials.templates.v1.TemplateData"
    end
    add_message "services.verifiablecredentials.templates.v1.TemplateData" do
      optional :id, :string, 1, json_name: "id"
      optional :name, :string, 2
      optional :version, :int32, 3
      map :fields, :string, :message, 4, "services.verifiablecredentials.templates.v1.TemplateField"
      optional :allow_additional_fields, :bool, 5
      optional :schema_uri, :string, 6
      optional :context_uri, :string, 7
      optional :ecosystem_id, :string, 8, json_name: "ecosystemId"
      optional :type, :string, 9, json_name: "type"
      optional :created_by, :string, 10, json_name: "createdBy"
    end
    add_enum "services.verifiablecredentials.templates.v1.FieldType" do
      value :STRING, 0
      value :NUMBER, 1
      value :BOOL, 2
      value :DATETIME, 4
    end
  end
end

module Services
  module Verifiablecredentials
    module Templates
      module V1
        GetCredentialTemplateRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.GetCredentialTemplateRequest").msgclass
        GetCredentialTemplateResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.GetCredentialTemplateResponse").msgclass
        SearchCredentialTemplatesRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.SearchCredentialTemplatesRequest").msgclass
        SearchCredentialTemplatesResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.SearchCredentialTemplatesResponse").msgclass
        ListCredentialTemplatesRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest").msgclass
        ListCredentialTemplatesResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.ListCredentialTemplatesResponse").msgclass
        DeleteCredentialTemplateRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.DeleteCredentialTemplateRequest").msgclass
        DeleteCredentialTemplateResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.DeleteCredentialTemplateResponse").msgclass
        CreateCredentialTemplateRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.CreateCredentialTemplateRequest").msgclass
        CreateCredentialTemplateResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.CreateCredentialTemplateResponse").msgclass
        TemplateField = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.TemplateField").msgclass
        GetTemplateRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.GetTemplateRequest").msgclass
        GetTemplateResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.GetTemplateResponse").msgclass
        ListTemplatesRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.ListTemplatesRequest").msgclass
        ListTemplatesResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.ListTemplatesResponse").msgclass
        TemplateData = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.TemplateData").msgclass
        FieldType = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.verifiablecredentials.templates.v1.FieldType").enummodule
      end
    end
  end
end
