import java.io.IOException
import java.util.*
import java.util.concurrent.ExecutionException
import org.junit.jupiter.api.Assertions
import trinsic.TrinsicUtilities
import trinsic.okapi.DidException
import trinsic.services.TrinsicServiceKt
import trinsic.services.trustregistry.v1.*

@Throws(
    IOException::class, DidException::class, ExecutionException::class, InterruptedException::class)
suspend fun main() {
  // Make sure you set the TEST_SERVER_ENDPOINT environment variable
  runTrustRegistryDemo()
}

@Throws(
    IOException::class, DidException::class, ExecutionException::class, InterruptedException::class)
suspend fun runTrustRegistryDemo() {
  val trinsic = TrinsicServiceKt(TrinsicUtilities.getTrinsicServiceOptions())
  val account = trinsic.account().signIn()
  trinsic.setAuthToken(account)

  val didUri = "did:example:test"
  val frameworkUri = "https://example.com/" + UUID.randomUUID()
  val typeUri = "https://schema.org/Card"

  // addFramework() {

  // addFramework() {
  val frameworkResponse =
      trinsic
          .trustRegistry()
          .addFramework(
              AddFrameworkRequest.newBuilder()
                  .setGovernanceFrameworkUri(frameworkUri)
                  .setName("Example Framework" + UUID.randomUUID())
                  .build())

  // }

  // registerIssuerSample() {
  // }

  // registerIssuerSample() {
  val memberResponse =
      trinsic
          .trustRegistry()
          .registerMember(
              RegisterMemberRequest.newBuilder()
                  .setDidUri(didUri)
                  .setFrameworkId(frameworkResponse.id)
                  .setSchemaUri(typeUri)
                  .build())

  // }
  // checkIssuerStatus() {
  // }
  // checkIssuerStatus() {
  val issuerStatus =
      trinsic
          .trustRegistry()
          .getMembershipStatus(
              GetMembershipStatusRequest.newBuilder()
                  .setDidUri(didUri)
                  .setGovernanceFrameworkUri(frameworkUri)
                  .setSchemaUri(typeUri)
                  .build())

  // }
  // }
  Assertions.assertEquals(RegistrationStatus.CURRENT, issuerStatus.status)

  // searchTrustRegistry() {

  // searchTrustRegistry() {
  val searchResult = trinsic.trustRegistry().search()
  // }
  // }
  Assertions.assertNotNull(searchResult)
  Assertions.assertNotNull(searchResult.itemsJson)
  Assertions.assertTrue(searchResult.itemsJson.isNotEmpty())

  // unregisterIssuer() {

  // unregisterIssuer() {
  trinsic
      .trustRegistry()
      .unregisterMember(
          UnregisterMemberRequest.newBuilder()
              .setFrameworkId(frameworkResponse.id)
              .setDidUri(didUri)
              .setSchemaUri(typeUri)
              .build())
  // }
}
