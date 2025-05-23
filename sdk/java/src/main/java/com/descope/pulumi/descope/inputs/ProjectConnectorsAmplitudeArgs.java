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


public final class ProjectConnectorsAmplitudeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectConnectorsAmplitudeArgs Empty = new ProjectConnectorsAmplitudeArgs();

    /**
     * The Amplitude API Key generated for the Descope service.
     * 
     */
    @Import(name="apiKey", required=true)
    private Output<String> apiKey;

    /**
     * @return The Amplitude API Key generated for the Descope service.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
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
     * The server URL of the Amplitude API, when using different api or a custom domain in Amplitude.
     * 
     */
    @Import(name="serverUrl")
    private @Nullable Output<String> serverUrl;

    /**
     * @return The server URL of the Amplitude API, when using different api or a custom domain in Amplitude.
     * 
     */
    public Optional<Output<String>> serverUrl() {
        return Optional.ofNullable(this.serverUrl);
    }

    /**
     * `EU` or `US`. Sets the Amplitude server zone. Set this to `EU` for Amplitude projects created in `EU` data center. Default is `US`.
     * 
     */
    @Import(name="serverZone")
    private @Nullable Output<String> serverZone;

    /**
     * @return `EU` or `US`. Sets the Amplitude server zone. Set this to `EU` for Amplitude projects created in `EU` data center. Default is `US`.
     * 
     */
    public Optional<Output<String>> serverZone() {
        return Optional.ofNullable(this.serverZone);
    }

    private ProjectConnectorsAmplitudeArgs() {}

    private ProjectConnectorsAmplitudeArgs(ProjectConnectorsAmplitudeArgs $) {
        this.apiKey = $.apiKey;
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.serverUrl = $.serverUrl;
        this.serverZone = $.serverZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectConnectorsAmplitudeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectConnectorsAmplitudeArgs $;

        public Builder() {
            $ = new ProjectConnectorsAmplitudeArgs();
        }

        public Builder(ProjectConnectorsAmplitudeArgs defaults) {
            $ = new ProjectConnectorsAmplitudeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey The Amplitude API Key generated for the Descope service.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey The Amplitude API Key generated for the Descope service.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
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
         * @param serverUrl The server URL of the Amplitude API, when using different api or a custom domain in Amplitude.
         * 
         * @return builder
         * 
         */
        public Builder serverUrl(@Nullable Output<String> serverUrl) {
            $.serverUrl = serverUrl;
            return this;
        }

        /**
         * @param serverUrl The server URL of the Amplitude API, when using different api or a custom domain in Amplitude.
         * 
         * @return builder
         * 
         */
        public Builder serverUrl(String serverUrl) {
            return serverUrl(Output.of(serverUrl));
        }

        /**
         * @param serverZone `EU` or `US`. Sets the Amplitude server zone. Set this to `EU` for Amplitude projects created in `EU` data center. Default is `US`.
         * 
         * @return builder
         * 
         */
        public Builder serverZone(@Nullable Output<String> serverZone) {
            $.serverZone = serverZone;
            return this;
        }

        /**
         * @param serverZone `EU` or `US`. Sets the Amplitude server zone. Set this to `EU` for Amplitude projects created in `EU` data center. Default is `US`.
         * 
         * @return builder
         * 
         */
        public Builder serverZone(String serverZone) {
            return serverZone(Output.of(serverZone));
        }

        public ProjectConnectorsAmplitudeArgs build() {
            if ($.apiKey == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsAmplitudeArgs", "apiKey");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsAmplitudeArgs", "name");
            }
            return $;
        }
    }

}
