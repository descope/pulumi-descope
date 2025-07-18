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
    public sealed class ProjectConnectorsHibp
    {
        /// <summary>
        /// A description of what your connector is used for.
        /// </summary>
        public readonly string? Description;
        public readonly string? Id;
        /// <summary>
        /// A custom name for your connector.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private ProjectConnectorsHibp(
            string? description,

            string? id,

            string name)
        {
            Description = description;
            Id = id;
            Name = name;
        }
    }
}
