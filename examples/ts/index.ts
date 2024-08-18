import * as descope from "@descope/pulumi-descope";

export const project = new descope.Project("pulumi-ts-test", {
  jwtTemplates: {
    templates: [
      {
        name: "jwt",
        type: "user",
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
      enabled: false,
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
        name: "role1",
        permissions: ["perm1"],
      },
    ],
  },
  connectors: {
    https: [{ name: "my_https", baseUrl: "https://example.com" }],
  },
  projectSettings: {
    domain: "example.com",
  },
  tag: "production",
});
