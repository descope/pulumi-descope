// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Descope.Pulumi.Descope.Inputs
{

    public sealed class ProjectConnectorsSegmentArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("writeKey", required: true)]
        private Input<string>? _writeKey;
        public Input<string>? WriteKey
        {
            get => _writeKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _writeKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ProjectConnectorsSegmentArgs()
        {
        }
        public static new ProjectConnectorsSegmentArgs Empty => new ProjectConnectorsSegmentArgs();
    }
}