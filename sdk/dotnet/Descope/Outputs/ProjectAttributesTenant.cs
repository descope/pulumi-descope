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
    public sealed class ProjectAttributesTenant
    {
        public readonly string Name;
        public readonly ImmutableArray<string> SelectOptions;
        public readonly string Type;

        [OutputConstructor]
        private ProjectAttributesTenant(
            string name,

            ImmutableArray<string> selectOptions,

            string type)
        {
            Name = name;
            SelectOptions = selectOptions;
            Type = type;
        }
    }
}