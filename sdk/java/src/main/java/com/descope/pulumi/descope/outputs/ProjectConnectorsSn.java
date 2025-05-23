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
public final class ProjectConnectorsSn {
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
    /**
     * @return The entity ID or principal entity (PE) ID for sending text messages to recipients in India.
     * 
     */
    private @Nullable String entityId;
    private @Nullable String id;
    /**
     * @return A custom name for your connector.
     * 
     */
    private String name;
    /**
     * @return An optional phone number from which the text messages are going to be sent. Make sure it is registered properly in your server.
     * 
     */
    private @Nullable String organizationNumber;
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
     * @return The name of the sender from which the text message is going to be sent (see SNS documentation regarding acceptable IDs and supported regions/countries).
     * 
     */
    private @Nullable String senderId;
    /**
     * @return The template for sending text messages to recipients in India. The template ID must be associated with the sender ID.
     * 
     */
    private @Nullable String templateId;

    private ProjectConnectorsSn() {}
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
    /**
     * @return The entity ID or principal entity (PE) ID for sending text messages to recipients in India.
     * 
     */
    public Optional<String> entityId() {
        return Optional.ofNullable(this.entityId);
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
     * @return An optional phone number from which the text messages are going to be sent. Make sure it is registered properly in your server.
     * 
     */
    public Optional<String> organizationNumber() {
        return Optional.ofNullable(this.organizationNumber);
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
     * @return The name of the sender from which the text message is going to be sent (see SNS documentation regarding acceptable IDs and supported regions/countries).
     * 
     */
    public Optional<String> senderId() {
        return Optional.ofNullable(this.senderId);
    }
    /**
     * @return The template for sending text messages to recipients in India. The template ID must be associated with the sender ID.
     * 
     */
    public Optional<String> templateId() {
        return Optional.ofNullable(this.templateId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectConnectorsSn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKeyId;
        private @Nullable String description;
        private @Nullable String endpoint;
        private @Nullable String entityId;
        private @Nullable String id;
        private String name;
        private @Nullable String organizationNumber;
        private String region;
        private String secret;
        private @Nullable String senderId;
        private @Nullable String templateId;
        public Builder() {}
        public Builder(ProjectConnectorsSn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.entityId = defaults.entityId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.organizationNumber = defaults.organizationNumber;
    	      this.region = defaults.region;
    	      this.secret = defaults.secret;
    	      this.senderId = defaults.senderId;
    	      this.templateId = defaults.templateId;
        }

        @CustomType.Setter
        public Builder accessKeyId(String accessKeyId) {
            if (accessKeyId == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSn", "accessKeyId");
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
        public Builder entityId(@Nullable String entityId) {

            this.entityId = entityId;
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
              throw new MissingRequiredPropertyException("ProjectConnectorsSn", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder organizationNumber(@Nullable String organizationNumber) {

            this.organizationNumber = organizationNumber;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSn", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSn", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder senderId(@Nullable String senderId) {

            this.senderId = senderId;
            return this;
        }
        @CustomType.Setter
        public Builder templateId(@Nullable String templateId) {

            this.templateId = templateId;
            return this;
        }
        public ProjectConnectorsSn build() {
            final var _resultValue = new ProjectConnectorsSn();
            _resultValue.accessKeyId = accessKeyId;
            _resultValue.description = description;
            _resultValue.endpoint = endpoint;
            _resultValue.entityId = entityId;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.organizationNumber = organizationNumber;
            _resultValue.region = region;
            _resultValue.secret = secret;
            _resultValue.senderId = senderId;
            _resultValue.templateId = templateId;
            return _resultValue;
        }
    }
}
