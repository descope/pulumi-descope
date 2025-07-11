// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.descope.pulumi.descope.inputs.ProjectConnectorsGenericEmailGatewayAuthenticationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectConnectorsGenericEmailGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectConnectorsGenericEmailGatewayArgs Empty = new ProjectConnectorsGenericEmailGatewayArgs();

    /**
     * Authentication Information
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<ProjectConnectorsGenericEmailGatewayAuthenticationArgs> authentication;

    /**
     * @return Authentication Information
     * 
     */
    public Optional<Output<ProjectConnectorsGenericEmailGatewayAuthenticationArgs>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * A description of what your connector is used for.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of what your connector is used for.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The headers to send with the request
     * 
     */
    @Import(name="headers")
    private @Nullable Output<Map<String,String>> headers;

    /**
     * @return The headers to send with the request
     * 
     */
    public Optional<Output<Map<String,String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * HMAC is a method for message signing with a symmetrical key. This secret will be used to sign the base64 encoded payload, and the resulting signature will be sent in the `x-descope-webhook-s256` header. The receiving service should use this secret to verify the integrity and authenticity of the payload by checking the provided signature
     * 
     */
    @Import(name="hmacSecret")
    private @Nullable Output<String> hmacSecret;

    /**
     * @return HMAC is a method for message signing with a symmetrical key. This secret will be used to sign the base64 encoded payload, and the resulting signature will be sent in the `x-descope-webhook-s256` header. The receiving service should use this secret to verify the integrity and authenticity of the payload by checking the provided signature
     * 
     */
    public Optional<Output<String>> hmacSecret() {
        return Optional.ofNullable(this.hmacSecret);
    }

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Will ignore certificate errors raised by the client
     * 
     */
    @Import(name="insecure")
    private @Nullable Output<Boolean> insecure;

    /**
     * @return Will ignore certificate errors raised by the client
     * 
     */
    public Optional<Output<Boolean>> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    /**
     * A custom name for your connector.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A custom name for your connector.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The URL of the post email request
     * 
     */
    @Import(name="postUrl", required=true)
    private Output<String> postUrl;

    /**
     * @return The URL of the post email request
     * 
     */
    public Output<String> postUrl() {
        return this.postUrl;
    }

    /**
     * The sender address
     * 
     */
    @Import(name="sender")
    private @Nullable Output<String> sender;

    /**
     * @return The sender address
     * 
     */
    public Optional<Output<String>> sender() {
        return Optional.ofNullable(this.sender);
    }

    /**
     * Whether the connector should send all requests from specific static IPs.
     * 
     */
    @Import(name="useStaticIps")
    private @Nullable Output<Boolean> useStaticIps;

    /**
     * @return Whether the connector should send all requests from specific static IPs.
     * 
     */
    public Optional<Output<Boolean>> useStaticIps() {
        return Optional.ofNullable(this.useStaticIps);
    }

    private ProjectConnectorsGenericEmailGatewayArgs() {}

    private ProjectConnectorsGenericEmailGatewayArgs(ProjectConnectorsGenericEmailGatewayArgs $) {
        this.authentication = $.authentication;
        this.description = $.description;
        this.headers = $.headers;
        this.hmacSecret = $.hmacSecret;
        this.id = $.id;
        this.insecure = $.insecure;
        this.name = $.name;
        this.postUrl = $.postUrl;
        this.sender = $.sender;
        this.useStaticIps = $.useStaticIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectConnectorsGenericEmailGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectConnectorsGenericEmailGatewayArgs $;

        public Builder() {
            $ = new ProjectConnectorsGenericEmailGatewayArgs();
        }

        public Builder(ProjectConnectorsGenericEmailGatewayArgs defaults) {
            $ = new ProjectConnectorsGenericEmailGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentication Authentication Information
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<ProjectConnectorsGenericEmailGatewayAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication Authentication Information
         * 
         * @return builder
         * 
         */
        public Builder authentication(ProjectConnectorsGenericEmailGatewayAuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param description A description of what your connector is used for.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of what your connector is used for.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param headers The headers to send with the request
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers The headers to send with the request
         * 
         * @return builder
         * 
         */
        public Builder headers(Map<String,String> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param hmacSecret HMAC is a method for message signing with a symmetrical key. This secret will be used to sign the base64 encoded payload, and the resulting signature will be sent in the `x-descope-webhook-s256` header. The receiving service should use this secret to verify the integrity and authenticity of the payload by checking the provided signature
         * 
         * @return builder
         * 
         */
        public Builder hmacSecret(@Nullable Output<String> hmacSecret) {
            $.hmacSecret = hmacSecret;
            return this;
        }

        /**
         * @param hmacSecret HMAC is a method for message signing with a symmetrical key. This secret will be used to sign the base64 encoded payload, and the resulting signature will be sent in the `x-descope-webhook-s256` header. The receiving service should use this secret to verify the integrity and authenticity of the payload by checking the provided signature
         * 
         * @return builder
         * 
         */
        public Builder hmacSecret(String hmacSecret) {
            return hmacSecret(Output.of(hmacSecret));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param insecure Will ignore certificate errors raised by the client
         * 
         * @return builder
         * 
         */
        public Builder insecure(@Nullable Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        /**
         * @param insecure Will ignore certificate errors raised by the client
         * 
         * @return builder
         * 
         */
        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        /**
         * @param name A custom name for your connector.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A custom name for your connector.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param postUrl The URL of the post email request
         * 
         * @return builder
         * 
         */
        public Builder postUrl(Output<String> postUrl) {
            $.postUrl = postUrl;
            return this;
        }

        /**
         * @param postUrl The URL of the post email request
         * 
         * @return builder
         * 
         */
        public Builder postUrl(String postUrl) {
            return postUrl(Output.of(postUrl));
        }

        /**
         * @param sender The sender address
         * 
         * @return builder
         * 
         */
        public Builder sender(@Nullable Output<String> sender) {
            $.sender = sender;
            return this;
        }

        /**
         * @param sender The sender address
         * 
         * @return builder
         * 
         */
        public Builder sender(String sender) {
            return sender(Output.of(sender));
        }

        /**
         * @param useStaticIps Whether the connector should send all requests from specific static IPs.
         * 
         * @return builder
         * 
         */
        public Builder useStaticIps(@Nullable Output<Boolean> useStaticIps) {
            $.useStaticIps = useStaticIps;
            return this;
        }

        /**
         * @param useStaticIps Whether the connector should send all requests from specific static IPs.
         * 
         * @return builder
         * 
         */
        public Builder useStaticIps(Boolean useStaticIps) {
            return useStaticIps(Output.of(useStaticIps));
        }

        public ProjectConnectorsGenericEmailGatewayArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsGenericEmailGatewayArgs", "name");
            }
            if ($.postUrl == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsGenericEmailGatewayArgs", "postUrl");
            }
            return $;
        }
    }

}
