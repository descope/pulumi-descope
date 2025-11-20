import * as descope from "@descope/pulumi-descope";

export const project = new descope.Project("pulumi-ts-test", {
  jwtTemplates: {
    userTemplates: [
      {
        name: "userjwt",
        description: "JWT token",
        template: "{}", // must be json
      },
    ],
    accessKeyTemplates: [
      {
        name: "accesskeyjwt",
        description: "JWT token",
        template: "{}", // must be json
      },
    ],
  },
  attributes: {
    tenants: [{ name: "my_attribute", type: "string" }],
    users: [{ name: "my_attribute", type: "string" }],
  },
  authentication: {
    otp: {
      disabled: false,
    },
  },
  connectors: {
    https: [{ name: "my_https", baseUrl: "https://example.com" }],
  },
  environment: "production",
});
