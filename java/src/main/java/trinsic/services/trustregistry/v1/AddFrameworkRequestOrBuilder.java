// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/trust-registry/v1/trust-registry.proto

package trinsic.services.trustregistry.v1;

public interface AddFrameworkRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.trustregistry.v1.AddFrameworkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URI of governance framework organization
   * </pre>
   *
   * <code>string governance_framework_uri = 1;</code>
   *
   * @return The governanceFrameworkUri.
   */
  java.lang.String getGovernanceFrameworkUri();
  /**
   *
   *
   * <pre>
   * URI of governance framework organization
   * </pre>
   *
   * <code>string governance_framework_uri = 1;</code>
   *
   * @return The bytes for governanceFrameworkUri.
   */
  com.google.protobuf.ByteString getGovernanceFrameworkUriBytes();

  /**
   *
   *
   * <pre>
   * Name of governance framework organization
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of governance framework organization
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Description of governance framework
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of governance framework
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}