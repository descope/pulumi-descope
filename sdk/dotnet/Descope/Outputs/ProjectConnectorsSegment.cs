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
    public sealed class ProjectConnectorsSegment
    {
        public readonly string? Description;
        public readonly string? Host;
        public readonly string? Id;
        public readonly string Name;
        public readonly string WriteKey;

        [OutputConstructor]
        private ProjectConnectorsSegment(
            string? description,

            string? host,

            string? id,

            string name,

            string writeKey)
        {
            Description = description;
            Host = host;
            Id = id;
            Name = name;
            WriteKey = writeKey;
        }
    }
}