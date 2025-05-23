// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.descope.pulumi.descope.outputs.ProjectConnectorsSeSender;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectConnectorsSe {
    /**
     * @return AWS Access key ID.
     * 
     */
    private String accessKeyId;
    /**
     * @return A description of what your connector is used for.
     * 
     */
    private @Nullable String description;
    /**
     * @return An optional endpoint URL (hostname only or fully qualified URI).
     * 
     */
    private @Nullable String endpoint;
    private @Nullable String id;
    /**
     * @return A custom name for your connector.
     * 
     */
    private String name;
    /**
     * @return AWS region to send requests to (e.g. `us-west-2`).
     * 
     */
    private String region;
    /**
     * @return AWS Secret Access Key.
     * 
     */
    private String secret;
    /**
     * @return The sender details that should be displayed in the email message.
     * 
     */
    private ProjectConnectorsSeSender sender;

    private ProjectConnectorsSe() {}
    /**
     * @return AWS Access key ID.
     * 
     */
    public String accessKeyId() {
        return this.accessKeyId;
    }
    /**
     * @return A description of what your connector is used for.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return An optional endpoint URL (hostname only or fully qualified URI).
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
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
    /**
     * @return AWS region to send requests to (e.g. `us-west-2`).
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return AWS Secret Access Key.
     * 
     */
    public String secret() {
        return this.secret;
    }
    /**
     * @return The sender details that should be displayed in the email message.
     * 
     */
    public ProjectConnectorsSeSender sender() {
        return this.sender;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectConnectorsSe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKeyId;
        private @Nullable String description;
        private @Nullable String endpoint;
        private @Nullable String id;
        private String name;
        private String region;
        private String secret;
        private ProjectConnectorsSeSender sender;
        public Builder() {}
        public Builder(ProjectConnectorsSe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.secret = defaults.secret;
    	      this.sender = defaults.sender;
        }

        @CustomType.Setter
        public Builder accessKeyId(String accessKeyId) {
            if (accessKeyId == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSe", "accessKeyId");
            }
            this.accessKeyId = accessKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {

            this.endpoint = endpoint;
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
              throw new MissingRequiredPropertyException("ProjectConnectorsSe", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSe", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSe", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder sender(ProjectConnectorsSeSender sender) {
            if (sender == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSe", "sender");
            }
            this.sender = sender;
            return this;
        }
        public ProjectConnectorsSe build() {
            final var _resultValue = new ProjectConnectorsSe();
            _resultValue.accessKeyId = accessKeyId;
            _resultValue.description = description;
            _resultValue.endpoint = endpoint;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.region = region;
            _resultValue.secret = secret;
            _resultValue.sender = sender;
            return _resultValue;
        }
    }
}
