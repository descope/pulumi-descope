// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
    public sealed class ProjectAttributes
    {
        /// <summary>
        /// Custom attributes to store additional details about your tenants.
        /// </summary>
        public readonly ImmutableArray<Outputs.ProjectAttributesTenant> Tenants;
        /// <summary>
        /// Custom attributes to store additional details about your users.
        /// </summary>
        public readonly ImmutableArray<Outputs.ProjectAttributesUser> Users;

        [OutputConstructor]
        private ProjectAttributes(
            ImmutableArray<Outputs.ProjectAttributesTenant> tenants,

            ImmutableArray<Outputs.ProjectAttributesUser> users)
        {
            Tenants = tenants;
            Users = users;
        }
    }
}
