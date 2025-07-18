// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Descope.Pulumi.Descope.Outputs
{

    [OutputType]
    public sealed class ProjectAuthorization
    {
        /// <summary>
        /// A list of `Permission` objects.
        /// </summary>
        public readonly ImmutableArray<Outputs.ProjectAuthorizationPermission> Permissions;
        /// <summary>
        /// A list of `Role` objects.
        /// </summary>
        public readonly ImmutableArray<Outputs.ProjectAuthorizationRole> Roles;

        [OutputConstructor]
        private ProjectAuthorization(
            ImmutableArray<Outputs.ProjectAuthorizationPermission> permissions,

            ImmutableArray<Outputs.ProjectAuthorizationRole> roles)
        {
            Permissions = permissions;
            Roles = roles;
        }
    }
}
