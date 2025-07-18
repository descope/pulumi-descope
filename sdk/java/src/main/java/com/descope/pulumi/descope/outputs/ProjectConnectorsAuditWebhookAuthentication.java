// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.descope.pulumi.descope.outputs.ProjectConnectorsAuditWebhookAuthenticationApiKey;
import com.descope.pulumi.descope.outputs.ProjectConnectorsAuditWebhookAuthenticationBasic;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectConnectorsAuditWebhookAuthentication {
    /**
     * @return API key authentication configuration.
     * 
     */
    private @Nullable ProjectConnectorsAuditWebhookAuthenticationApiKey apiKey;
    /**
     * @return Basic authentication credentials (username and password).
     * 
     */
    private @Nullable ProjectConnectorsAuditWebhookAuthenticationBasic basic;
    /**
     * @return Bearer token for HTTP authentication.
     * 
     */
    private @Nullable String bearerToken;

    private ProjectConnectorsAuditWebhookAuthentication() {}
    /**
     * @return API key authentication configuration.
     * 
     */
    public Optional<ProjectConnectorsAuditWebhookAuthenticationApiKey> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    /**
     * @return Basic authentication credentials (username and password).
     * 
     */
    public Optional<ProjectConnectorsAuditWebhookAuthenticationBasic> basic() {
        return Optional.ofNullable(this.basic);
    }
    /**
     * @return Bearer token for HTTP authentication.
     * 
     */
    public Optional<String> bearerToken() {
        return Optional.ofNullable(this.bearerToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectConnectorsAuditWebhookAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ProjectConnectorsAuditWebhookAuthenticationApiKey apiKey;
        private @Nullable ProjectConnectorsAuditWebhookAuthenticationBasic basic;
        private @Nullable String bearerToken;
        public Builder() {}
        public Builder(ProjectConnectorsAuditWebhookAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.basic = defaults.basic;
    	      this.bearerToken = defaults.bearerToken;
        }

        @CustomType.Setter
        public Builder apiKey(@Nullable ProjectConnectorsAuditWebhookAuthenticationApiKey apiKey) {

            this.apiKey = apiKey;
            return this;
        }
        @CustomType.Setter
        public Builder basic(@Nullable ProjectConnectorsAuditWebhookAuthenticationBasic basic) {

            this.basic = basic;
            return this;
        }
        @CustomType.Setter
        public Builder bearerToken(@Nullable String bearerToken) {

            this.bearerToken = bearerToken;
            return this;
        }
        public ProjectConnectorsAuditWebhookAuthentication build() {
            final var _resultValue = new ProjectConnectorsAuditWebhookAuthentication();
            _resultValue.apiKey = apiKey;
            _resultValue.basic = basic;
            _resultValue.bearerToken = bearerToken;
            return _resultValue;
        }
    }
}
