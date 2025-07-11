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

    public sealed class ProjectConnectorsHttpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authentication Information
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.ProjectConnectorsHttpAuthenticationArgs>? Authentication { get; set; }

        /// <summary>
        /// The base URL to fetch
        /// </summary>
        [Input("baseUrl", required: true)]
        public Input<string> BaseUrl { get; set; } = null!;

        /// <summary>
        /// A description of what your connector is used for.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;

        /// <summary>
        /// The headers to send with the request
        /// </summary>
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set => _headers = value;
        }

        [Input("hmacSecret")]
        private Input<string>? _hmacSecret;

        /// <summary>
        /// HMAC is a method for message signing with a symmetrical key. This secret will be used to sign the base64 encoded payload, and the resulting signature will be sent in the `x-descope-webhook-s256` header. The receiving service should use this secret to verify the integrity and authenticity of the payload by checking the provided signature
        /// </summary>
        public Input<string>? HmacSecret
        {
            get => _hmacSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _hmacSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The connector response context will also include the headers. The context will have a "body" attribute and a "headers" attribute. See more details in the help guide
        /// </summary>
        [Input("includeHeadersInContext")]
        public Input<bool>? IncludeHeadersInContext { get; set; }

        /// <summary>
        /// Will ignore certificate errors raised by the client
        /// </summary>
        [Input("insecure")]
        public Input<bool>? Insecure { get; set; }

        /// <summary>
        /// A custom name for your connector.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Whether the connector should send all requests from specific static IPs.
        /// </summary>
        [Input("useStaticIps")]
        public Input<bool>? UseStaticIps { get; set; }

        public ProjectConnectorsHttpArgs()
        {
        }
        public static new ProjectConnectorsHttpArgs Empty => new ProjectConnectorsHttpArgs();
    }
}
