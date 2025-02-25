import {getSchemaEndpoint} from "../utilities";

/**
 * Trinsic Ecosystem we are operating within
 */
export const TRINSIC_ECOSYSTEM = "clever-bassi-N4VYHjUg2Jk";
/**
 * Domain for the ecosystem (we should verify this)
 */
export const ECOSYSTEM_DOMAIN = "mewmba.dev";
/**
 * Name of the credential template to create
 */
export const TEMPLATE_NAME = "cool-kids-club";

// Don't modify anything below here if you don't know what you're doing.
/**
 * Trinsic deployment environment to run against (prod, staging, dev)
 */
export const TRINSIC_ENVIRONMENT = "dev";

/**
 * Schema to verify for login
 */
export const TRINSIC_SCHEMA = `https://${getSchemaEndpoint(TRINSIC_ENVIRONMENT)}/${TRINSIC_ECOSYSTEM}/${TEMPLATE_NAME}`;
