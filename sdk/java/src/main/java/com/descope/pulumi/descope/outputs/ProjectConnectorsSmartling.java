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
public final class ProjectConnectorsSmartling {
    /**
     * @return The account UID for the Smartling account.
     * 
     */
    private String accountUid;
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
     * @return The user identifier for the Smartling account.
     * 
     */
    private String userIdentifier;
    /**
     * @return The user secret for the Smartling account.
     * 
     */
    private String userSecret;

    private ProjectConnectorsSmartling() {}
    /**
     * @return The account UID for the Smartling account.
     * 
     */
    public String accountUid() {
        return this.accountUid;
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
     * @return The user identifier for the Smartling account.
     * 
     */
    public String userIdentifier() {
        return this.userIdentifier;
    }
    /**
     * @return The user secret for the Smartling account.
     * 
     */
    public String userSecret() {
        return this.userSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectConnectorsSmartling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountUid;
        private @Nullable String description;
        private @Nullable String id;
        private String name;
        private String userIdentifier;
        private String userSecret;
        public Builder() {}
        public Builder(ProjectConnectorsSmartling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountUid = defaults.accountUid;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.userIdentifier = defaults.userIdentifier;
    	      this.userSecret = defaults.userSecret;
        }

        @CustomType.Setter
        public Builder accountUid(String accountUid) {
            if (accountUid == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSmartling", "accountUid");
            }
            this.accountUid = accountUid;
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
              throw new MissingRequiredPropertyException("ProjectConnectorsSmartling", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentifier(String userIdentifier) {
            if (userIdentifier == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSmartling", "userIdentifier");
            }
            this.userIdentifier = userIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder userSecret(String userSecret) {
            if (userSecret == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSmartling", "userSecret");
            }
            this.userSecret = userSecret;
            return this;
        }
        public ProjectConnectorsSmartling build() {
            final var _resultValue = new ProjectConnectorsSmartling();
            _resultValue.accountUid = accountUid;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.userIdentifier = userIdentifier;
            _resultValue.userSecret = userSecret;
            return _resultValue;
        }
    }
}
