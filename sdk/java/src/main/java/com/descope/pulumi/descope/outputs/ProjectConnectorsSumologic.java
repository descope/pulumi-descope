// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.descope.pulumi.descope.outputs.ProjectConnectorsSumologicAuditFilter;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectConnectorsSumologic {
    /**
     * @return Whether to enable streaming of audit events.
     * 
     */
    private @Nullable Boolean auditEnabled;
    /**
     * @return Specify which events will be sent to the external audit service (including tenant selection).
     * 
     */
    private @Nullable List<ProjectConnectorsSumologicAuditFilter> auditFilters;
    /**
     * @return A description of what your connector is used for.
     * 
     */
    private @Nullable String description;
    /**
     * @return The URL associated with an HTTP Hosted collector
     * 
     */
    private String httpSourceUrl;
    private @Nullable String id;
    /**
     * @return A custom name for your connector.
     * 
     */
    private String name;
    /**
     * @return Whether to send troubleshooting events.
     * 
     */
    private @Nullable Boolean troubleshootLogEnabled;

    private ProjectConnectorsSumologic() {}
    /**
     * @return Whether to enable streaming of audit events.
     * 
     */
    public Optional<Boolean> auditEnabled() {
        return Optional.ofNullable(this.auditEnabled);
    }
    /**
     * @return Specify which events will be sent to the external audit service (including tenant selection).
     * 
     */
    public List<ProjectConnectorsSumologicAuditFilter> auditFilters() {
        return this.auditFilters == null ? List.of() : this.auditFilters;
    }
    /**
     * @return A description of what your connector is used for.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The URL associated with an HTTP Hosted collector
     * 
     */
    public String httpSourceUrl() {
        return this.httpSourceUrl;
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
     * @return Whether to send troubleshooting events.
     * 
     */
    public Optional<Boolean> troubleshootLogEnabled() {
        return Optional.ofNullable(this.troubleshootLogEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectConnectorsSumologic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean auditEnabled;
        private @Nullable List<ProjectConnectorsSumologicAuditFilter> auditFilters;
        private @Nullable String description;
        private String httpSourceUrl;
        private @Nullable String id;
        private String name;
        private @Nullable Boolean troubleshootLogEnabled;
        public Builder() {}
        public Builder(ProjectConnectorsSumologic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditEnabled = defaults.auditEnabled;
    	      this.auditFilters = defaults.auditFilters;
    	      this.description = defaults.description;
    	      this.httpSourceUrl = defaults.httpSourceUrl;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.troubleshootLogEnabled = defaults.troubleshootLogEnabled;
        }

        @CustomType.Setter
        public Builder auditEnabled(@Nullable Boolean auditEnabled) {

            this.auditEnabled = auditEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder auditFilters(@Nullable List<ProjectConnectorsSumologicAuditFilter> auditFilters) {

            this.auditFilters = auditFilters;
            return this;
        }
        public Builder auditFilters(ProjectConnectorsSumologicAuditFilter... auditFilters) {
            return auditFilters(List.of(auditFilters));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder httpSourceUrl(String httpSourceUrl) {
            if (httpSourceUrl == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSumologic", "httpSourceUrl");
            }
            this.httpSourceUrl = httpSourceUrl;
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
              throw new MissingRequiredPropertyException("ProjectConnectorsSumologic", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder troubleshootLogEnabled(@Nullable Boolean troubleshootLogEnabled) {

            this.troubleshootLogEnabled = troubleshootLogEnabled;
            return this;
        }
        public ProjectConnectorsSumologic build() {
            final var _resultValue = new ProjectConnectorsSumologic();
            _resultValue.auditEnabled = auditEnabled;
            _resultValue.auditFilters = auditFilters;
            _resultValue.description = description;
            _resultValue.httpSourceUrl = httpSourceUrl;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.troubleshootLogEnabled = troubleshootLogEnabled;
            return _resultValue;
        }
    }
}
