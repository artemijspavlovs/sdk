import { ServiceOptions } from "../src";
import ServiceBase from "../src/ServiceBase";

function isNode(): boolean {
  // TODO - Refactor this into one location, utility class?
  let node = (typeof process !== 'undefined') && (typeof process.release !== 'undefined') && (process.release.name === 'node')
  return node
}

export function getTestServerOptions(): ServiceOptions {
  let defaults = ServiceOptions.fromPartial({
    serverEndpoint: "dev-internal.trinsic.cloud",
    serverPort: 443,
    serverUseTls: true,
  });
  if (!isNode())
    return defaults

  // Use environment variables for which node transport protocol we need
  const useNodeHttp = (process.env.TEST_SERVER_NODE_PROTOCOL || "false") == "true";
  ServiceBase.useNodeHttpTransport = useNodeHttp;

  const endpoint =
      process.env.TEST_SERVER_ENDPOINT || defaults.serverEndpoint;
  const port: number = +(process.env.TEST_SERVER_PORT || defaults.serverPort);
  const useTls = (process.env.TEST_SERVER_USE_TLS || defaults.serverUseTls) != "false";

  return ServiceOptions.fromPartial({
    serverEndpoint: endpoint,
    serverPort: port,
    serverUseTls: useTls,
  });
}