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

    public sealed class ProjectAuthenticationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Make the authentication experience smoother for the user by generating their initial token in a way that does not require the end user to initiate the process, requiring only verification.
        /// </summary>
        [Input("embeddedLink")]
        public Input<Inputs.ProjectAuthenticationEmbeddedLinkArgs>? EmbeddedLink { get; set; }

        /// <summary>
        /// An enhanced and more secure version of Magic Link, enabling users to start the authentication process on one device and execute the verification on another.
        /// </summary>
        [Input("enchantedLink")]
        public Input<Inputs.ProjectAuthenticationEnchantedLinkArgs>? EnchantedLink { get; set; }

        /// <summary>
        /// An authentication method where a user receives a unique link via email to log in.
        /// </summary>
        [Input("magicLink")]
        public Input<Inputs.ProjectAuthenticationMagicLinkArgs>? MagicLink { get; set; }

        /// <summary>
        /// Authentication using Open Authorization, which allows users to authenticate with various external services.
        /// </summary>
        [Input("oauth")]
        public Input<Inputs.ProjectAuthenticationOauthArgs>? Oauth { get; set; }

        /// <summary>
        /// A dynamically generated set of numbers, granting the user one-time access.
        /// </summary>
        [Input("otp")]
        public Input<Inputs.ProjectAuthenticationOtpArgs>? Otp { get; set; }

        /// <summary>
        /// Device-based passwordless authentication, using fingerprint, face scan, and more.
        /// </summary>
        [Input("passkeys")]
        public Input<Inputs.ProjectAuthenticationPasskeysArgs>? Passkeys { get; set; }

        /// <summary>
        /// The classic username and password combination used for authentication.
        /// </summary>
        [Input("password")]
        public Input<Inputs.ProjectAuthenticationPasswordArgs>? Password { get; set; }

        /// <summary>
        /// Single Sign-On (SSO) authentication method that enables users to access multiple applications with a single set of credentials.
        /// </summary>
        [Input("sso")]
        public Input<Inputs.ProjectAuthenticationSsoArgs>? Sso { get; set; }

        /// <summary>
        /// A one-time code generated for the user using a shared secret and time.
        /// </summary>
        [Input("totp")]
        public Input<Inputs.ProjectAuthenticationTotpArgs>? Totp { get; set; }

        public ProjectAuthenticationArgs()
        {
        }
        public static new ProjectAuthenticationArgs Empty => new ProjectAuthenticationArgs();
    }
}
