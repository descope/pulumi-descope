// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Descope.Pulumi.Descope.Inputs
{

    public sealed class ProjectAuthenticationPasskeysGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Setting this to `true` will disallow using this authentication method directly via API and SDK calls. Note that this does not affect authentication flows that are configured to use this authentication method.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Passkeys will be usable in the following domain and all its subdomains.
        /// </summary>
        [Input("topLevelDomain")]
        public Input<string>? TopLevelDomain { get; set; }

        public ProjectAuthenticationPasskeysGetArgs()
        {
        }
        public static new ProjectAuthenticationPasskeysGetArgs Empty => new ProjectAuthenticationPasskeysGetArgs();
    }
}
