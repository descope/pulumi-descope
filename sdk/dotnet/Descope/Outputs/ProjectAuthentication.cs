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
    public sealed class ProjectAuthentication
    {
        public readonly Outputs.ProjectAuthenticationEmbeddedLink? EmbeddedLink;
        public readonly Outputs.ProjectAuthenticationEnchantedLink? EnchantedLink;
        public readonly Outputs.ProjectAuthenticationMagicLink? MagicLink;
        public readonly Outputs.ProjectAuthenticationOauth? Oauth;
        public readonly Outputs.ProjectAuthenticationOtp? Otp;
        public readonly Outputs.ProjectAuthenticationPassword? Password;
        public readonly Outputs.ProjectAuthenticationSso? Sso;
        public readonly Outputs.ProjectAuthenticationTotp? Totp;
        public readonly Outputs.ProjectAuthenticationWebauthn? Webauthn;

        [OutputConstructor]
        private ProjectAuthentication(
            Outputs.ProjectAuthenticationEmbeddedLink? embeddedLink,

            Outputs.ProjectAuthenticationEnchantedLink? enchantedLink,

            Outputs.ProjectAuthenticationMagicLink? magicLink,

            Outputs.ProjectAuthenticationOauth? oauth,

            Outputs.ProjectAuthenticationOtp? otp,

            Outputs.ProjectAuthenticationPassword? password,

            Outputs.ProjectAuthenticationSso? sso,

            Outputs.ProjectAuthenticationTotp? totp,

            Outputs.ProjectAuthenticationWebauthn? webauthn)
        {
            EmbeddedLink = embeddedLink;
            EnchantedLink = enchantedLink;
            MagicLink = magicLink;
            Oauth = oauth;
            Otp = otp;
            Password = password;
            Sso = sso;
            Totp = totp;
            Webauthn = webauthn;
        }
    }
}