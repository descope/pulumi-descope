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
  authorization: {
    permissions: [
      {
        name: "perm1",
        description: "Permission 1",
      },
    ],
    roles: [
      {
        key: "role1",
        name: "role1",
        permissions: ["perm1"],
      },
    ],
  },
  connectors: {
    https: [{ name: "my_https", baseUrl: "https://example.com" }],
  },
  environment: "production",
});
