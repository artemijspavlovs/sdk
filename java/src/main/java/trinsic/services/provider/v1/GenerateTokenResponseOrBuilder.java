// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.provider.v1;

public interface GenerateTokenResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.provider.v1.GenerateTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Account authentication profile that contains unprotected token
   * </pre>
   *
   * <code>.services.account.v1.AccountProfile profile = 1;</code>
   *
   * @return Whether the profile field is set.
   */
  boolean hasProfile();
  /**
   *
   *
   * <pre>
   * Account authentication profile that contains unprotected token
   * </pre>
   *
   * <code>.services.account.v1.AccountProfile profile = 1;</code>
   *
   * @return The profile.
   */
  trinsic.services.account.v1.AccountProfile getProfile();
  /**
   *
   *
   * <pre>
   * Account authentication profile that contains unprotected token
   * </pre>
   *
   * <code>.services.account.v1.AccountProfile profile = 1;</code>
   */
  trinsic.services.account.v1.AccountProfileOrBuilder getProfileOrBuilder();
}