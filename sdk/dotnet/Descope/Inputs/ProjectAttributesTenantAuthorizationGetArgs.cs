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

    public sealed class ProjectAttributesTenantAuthorizationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("viewPermissions")]
        private InputList<string>? _viewPermissions;
        public InputList<string> ViewPermissions
        {
            get => _viewPermissions ?? (_viewPermissions = new InputList<string>());
            set => _viewPermissions = value;
        }

        public ProjectAttributesTenantAuthorizationGetArgs()
        {
        }
        public static new ProjectAttributesTenantAuthorizationGetArgs Empty => new ProjectAttributesTenantAuthorizationGetArgs();
    }
}
