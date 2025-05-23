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
public final class ProjectConnectorsRekognition {
    /**
     * @return The AWS access key ID
     * 
     */
    private String accessKeyId;
    /**
     * @return The collection to store registered users in. Should match `[a-zA-Z0-9_.-]+` pattern. Changing this will cause losing existing users.
     * 
     */
    private String collectionId;
    /**
     * @return A description of what your connector is used for.
     * 
     */
    private @Nullable String description;
    private @Nullable String id;
    /**
     * @return A custom name for your connector.
     * 
     */
    private String name;
    /**
     * @return The AWS secret access key
     * 
     */
    private String secretAccessKey;

    private ProjectConnectorsRekognition() {}
    /**
     * @return The AWS access key ID
     * 
     */
    public String accessKeyId() {
        return this.accessKeyId;
    }
    /**
     * @return The collection to store registered users in. Should match `[a-zA-Z0-9_.-]+` pattern. Changing this will cause losing existing users.
     * 
     */
    public String collectionId() {
        return this.collectionId;
    }
    /**
     * @return A description of what your connector is used for.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
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
     * @return The AWS secret access key
     * 
     */
    public String secretAccessKey() {
        return this.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectConnectorsRekognition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKeyId;
        private String collectionId;
        private @Nullable String description;
        private @Nullable String id;
        private String name;
        private String secretAccessKey;
        public Builder() {}
        public Builder(ProjectConnectorsRekognition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.collectionId = defaults.collectionId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.secretAccessKey = defaults.secretAccessKey;
        }

        @CustomType.Setter
        public Builder accessKeyId(String accessKeyId) {
            if (accessKeyId == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsRekognition", "accessKeyId");
            }
            this.accessKeyId = accessKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder collectionId(String collectionId) {
            if (collectionId == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsRekognition", "collectionId");
            }
            this.collectionId = collectionId;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
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
              throw new MissingRequiredPropertyException("ProjectConnectorsRekognition", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder secretAccessKey(String secretAccessKey) {
            if (secretAccessKey == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsRekognition", "secretAccessKey");
            }
            this.secretAccessKey = secretAccessKey;
            return this;
        }
        public ProjectConnectorsRekognition build() {
            final var _resultValue = new ProjectConnectorsRekognition();
            _resultValue.accessKeyId = accessKeyId;
            _resultValue.collectionId = collectionId;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.secretAccessKey = secretAccessKey;
            return _resultValue;
        }
    }
}
