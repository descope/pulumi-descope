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
    public sealed class ProjectProjectSettings
    {
        public readonly string? AccessKeyJwtTemplate;
        public readonly int? CookiePolicy;
        public readonly string? Domain;
        public readonly bool? EnableInactivity;
        public readonly string? InactivityTime;
        public readonly string? RefreshTokenExpiration;
        public readonly string? UserJwtTemplate;

        [OutputConstructor]
        private ProjectProjectSettings(
            string? accessKeyJwtTemplate,

            int? cookiePolicy,

            string? domain,

            bool? enableInactivity,

            string? inactivityTime,

            string? refreshTokenExpiration,

            string? userJwtTemplate)
        {
            AccessKeyJwtTemplate = accessKeyJwtTemplate;
            CookiePolicy = cookiePolicy;
            Domain = domain;
            EnableInactivity = enableInactivity;
            InactivityTime = inactivityTime;
            RefreshTokenExpiration = refreshTokenExpiration;
            UserJwtTemplate = userJwtTemplate;
        }
    }
}