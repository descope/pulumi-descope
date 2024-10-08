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

    public sealed class ProjectAuthorizationRoleArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("permissions")]
        private InputList<string>? _permissions;
        public InputList<string> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<string>());
            set => _permissions = value;
        }

        public ProjectAuthorizationRoleArgs()
        {
        }
        public static new ProjectAuthorizationRoleArgs Empty => new ProjectAuthorizationRoleArgs();
    }
}
