import * as descope from "@descope/pulumi-descope";

export const project = new descope.Project("pulumi-ts-test", {
  environment: "production",
  deletionProtection: false,
});

const permission = new descope.Permission("pulumi-ts-perm1", {
  projectId: project.id,
  name: "perm1",
  description: "Permission 1",
});

export const role = new descope.Role("pulumi-ts-role1", {
  projectId: project.id,
  name: "role1",
  permissions: [permission.name],
});
