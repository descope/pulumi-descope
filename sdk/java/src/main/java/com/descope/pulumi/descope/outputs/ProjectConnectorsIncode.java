// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectConnectorsIncode {
    /**
     * @return Your InCode API key.
     * 
     */
    private String apiKey;
    /**
     * @return The base URL of the Incode API
     * 
     */
    private String apiUrl;
    /**
     * @return A description of what your connector is used for.
     * 
     */
    private @Nullable String description;
    /**
     * @return Your wanted InCode&#39;s flow ID.
     * 
     */
    private String flowId;
    private @Nullable String id;
    /**
     * @return A custom name for your connector.
     * 
     */
    private String name;

    private ProjectConnectorsIncode() {}
    /**
     * @return Your InCode API key.
     * 
     */
    public String apiKey() {
        return this.apiKey;
    }
    /**
     * @return The base URL of the Incode API
     * 
     */
    public String apiUrl() {
        return this.apiUrl;
    }
    /**
     * @return A description of what your connector is used for.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Your wanted InCode&#39;s flow ID.
     * 
     */
    public String flowId() {
        return this.flowId;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return A custom name for your connector.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectConnectorsIncode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiKey;
        private String apiUrl;
        private @Nullable String description;
        private String flowId;
        private @Nullable String id;
        private String name;
        public Builder() {}
        public Builder(ProjectConnectorsIncode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.apiUrl = defaults.apiUrl;
    	      this.description = defaults.description;
    	      this.flowId = defaults.flowId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder apiKey(String apiKey) {
            if (apiKey == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsIncode", "apiKey");
            }
            this.apiKey = apiKey;
            return this;
        }
        @CustomType.Setter
        public Builder apiUrl(String apiUrl) {
            if (apiUrl == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsIncode", "apiUrl");
            }
            this.apiUrl = apiUrl;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder flowId(String flowId) {
            if (flowId == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsIncode", "flowId");
            }
            this.flowId = flowId;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsIncode", "name");
            }
            this.name = name;
            return this;
        }
        public ProjectConnectorsIncode build() {
            final var _resultValue = new ProjectConnectorsIncode();
            _resultValue.apiKey = apiKey;
            _resultValue.apiUrl = apiUrl;
            _resultValue.description = description;
            _resultValue.flowId = flowId;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
