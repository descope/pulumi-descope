// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectConnectorsSalesforceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectConnectorsSalesforceArgs Empty = new ProjectConnectorsSalesforceArgs();

    /**
     * The Salesforce API base URL.
     * 
     */
    @Import(name="baseUrl", required=true)
    private Output<String> baseUrl;

    /**
     * @return The Salesforce API base URL.
     * 
     */
    public Output<String> baseUrl() {
        return this.baseUrl;
    }

    /**
     * The consumer key of the connected app.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The consumer key of the connected app.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The consumer secret of the connected app.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The consumer secret of the connected app.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
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

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
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
     * REST API Version.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return REST API Version.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private ProjectConnectorsSalesforceArgs() {}

    private ProjectConnectorsSalesforceArgs(ProjectConnectorsSalesforceArgs $) {
        this.baseUrl = $.baseUrl;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectConnectorsSalesforceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectConnectorsSalesforceArgs $;

        public Builder() {
            $ = new ProjectConnectorsSalesforceArgs();
        }

        public Builder(ProjectConnectorsSalesforceArgs defaults) {
            $ = new ProjectConnectorsSalesforceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseUrl The Salesforce API base URL.
         * 
         * @return builder
         * 
         */
        public Builder baseUrl(Output<String> baseUrl) {
            $.baseUrl = baseUrl;
            return this;
        }

        /**
         * @param baseUrl The Salesforce API base URL.
         * 
         * @return builder
         * 
         */
        public Builder baseUrl(String baseUrl) {
            return baseUrl(Output.of(baseUrl));
        }

        /**
         * @param clientId The consumer key of the connected app.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The consumer key of the connected app.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The consumer secret of the connected app.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The consumer secret of the connected app.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
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

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
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
         * @param version REST API Version.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version REST API Version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ProjectConnectorsSalesforceArgs build() {
            if ($.baseUrl == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsSalesforceArgs", "baseUrl");
            }
            if ($.clientId == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsSalesforceArgs", "clientId");
            }
            if ($.clientSecret == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsSalesforceArgs", "clientSecret");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsSalesforceArgs", "name");
            }
            if ($.version == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsSalesforceArgs", "version");
            }
            return $;
        }
    }

}
