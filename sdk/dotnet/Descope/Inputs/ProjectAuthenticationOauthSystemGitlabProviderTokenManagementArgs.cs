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

    public sealed class ProjectAuthenticationOauthSystemGitlabProviderTokenManagementArgs : global::Pulumi.ResourceArgs
    {
        [Input("callbackDomain")]
        public Input<string>? CallbackDomain { get; set; }

        [Input("redirectUrl")]
        public Input<string>? RedirectUrl { get; set; }

        public ProjectAuthenticationOauthSystemGitlabProviderTokenManagementArgs()
        {
        }
        public static new ProjectAuthenticationOauthSystemGitlabProviderTokenManagementArgs Empty => new ProjectAuthenticationOauthSystemGitlabProviderTokenManagementArgs();
    }
}
