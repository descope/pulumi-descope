// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.descope.pulumi.descope.inputs.ProjectConnectorsDatadogAuditFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectConnectorsDatadogArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectConnectorsDatadogArgs Empty = new ProjectConnectorsDatadogArgs();

    /**
     * The unique Datadog organization key.
     * 
     */
    @Import(name="apiKey", required=true)
    private Output<String> apiKey;

    /**
     * @return The unique Datadog organization key.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }

    /**
     * Whether to enable streaming of audit events.
     * 
     */
    @Import(name="auditEnabled")
    private @Nullable Output<Boolean> auditEnabled;

    /**
     * @return Whether to enable streaming of audit events.
     * 
     */
    public Optional<Output<Boolean>> auditEnabled() {
        return Optional.ofNullable(this.auditEnabled);
    }

    /**
     * Specify which events will be sent to the external audit service (including tenant selection).
     * 
     */
    @Import(name="auditFilters")
    private @Nullable Output<List<ProjectConnectorsDatadogAuditFilterArgs>> auditFilters;

    /**
     * @return Specify which events will be sent to the external audit service (including tenant selection).
     * 
     */
    public Optional<Output<List<ProjectConnectorsDatadogAuditFilterArgs>>> auditFilters() {
        return Optional.ofNullable(this.auditFilters);
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
     * The Datadog site to send logs to. Default is `datadoghq.com`. European, free tier and other customers should set their site accordingly.
     * 
     */
    @Import(name="site")
    private @Nullable Output<String> site;

    /**
     * @return The Datadog site to send logs to. Default is `datadoghq.com`. European, free tier and other customers should set their site accordingly.
     * 
     */
    public Optional<Output<String>> site() {
        return Optional.ofNullable(this.site);
    }

    /**
     * Whether to send troubleshooting events.
     * 
     */
    @Import(name="troubleshootLogEnabled")
    private @Nullable Output<Boolean> troubleshootLogEnabled;

    /**
     * @return Whether to send troubleshooting events.
     * 
     */
    public Optional<Output<Boolean>> troubleshootLogEnabled() {
        return Optional.ofNullable(this.troubleshootLogEnabled);
    }

    private ProjectConnectorsDatadogArgs() {}

    private ProjectConnectorsDatadogArgs(ProjectConnectorsDatadogArgs $) {
        this.apiKey = $.apiKey;
        this.auditEnabled = $.auditEnabled;
        this.auditFilters = $.auditFilters;
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.site = $.site;
        this.troubleshootLogEnabled = $.troubleshootLogEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectConnectorsDatadogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectConnectorsDatadogArgs $;

        public Builder() {
            $ = new ProjectConnectorsDatadogArgs();
        }

        public Builder(ProjectConnectorsDatadogArgs defaults) {
            $ = new ProjectConnectorsDatadogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey The unique Datadog organization key.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey The unique Datadog organization key.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param auditEnabled Whether to enable streaming of audit events.
         * 
         * @return builder
         * 
         */
        public Builder auditEnabled(@Nullable Output<Boolean> auditEnabled) {
            $.auditEnabled = auditEnabled;
            return this;
        }

        /**
         * @param auditEnabled Whether to enable streaming of audit events.
         * 
         * @return builder
         * 
         */
        public Builder auditEnabled(Boolean auditEnabled) {
            return auditEnabled(Output.of(auditEnabled));
        }

        /**
         * @param auditFilters Specify which events will be sent to the external audit service (including tenant selection).
         * 
         * @return builder
         * 
         */
        public Builder auditFilters(@Nullable Output<List<ProjectConnectorsDatadogAuditFilterArgs>> auditFilters) {
            $.auditFilters = auditFilters;
            return this;
        }

        /**
         * @param auditFilters Specify which events will be sent to the external audit service (including tenant selection).
         * 
         * @return builder
         * 
         */
        public Builder auditFilters(List<ProjectConnectorsDatadogAuditFilterArgs> auditFilters) {
            return auditFilters(Output.of(auditFilters));
        }

        /**
         * @param auditFilters Specify which events will be sent to the external audit service (including tenant selection).
         * 
         * @return builder
         * 
         */
        public Builder auditFilters(ProjectConnectorsDatadogAuditFilterArgs... auditFilters) {
            return auditFilters(List.of(auditFilters));
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
         * @param site The Datadog site to send logs to. Default is `datadoghq.com`. European, free tier and other customers should set their site accordingly.
         * 
         * @return builder
         * 
         */
        public Builder site(@Nullable Output<String> site) {
            $.site = site;
            return this;
        }

        /**
         * @param site The Datadog site to send logs to. Default is `datadoghq.com`. European, free tier and other customers should set their site accordingly.
         * 
         * @return builder
         * 
         */
        public Builder site(String site) {
            return site(Output.of(site));
        }

        /**
         * @param troubleshootLogEnabled Whether to send troubleshooting events.
         * 
         * @return builder
         * 
         */
        public Builder troubleshootLogEnabled(@Nullable Output<Boolean> troubleshootLogEnabled) {
            $.troubleshootLogEnabled = troubleshootLogEnabled;
            return this;
        }

        /**
         * @param troubleshootLogEnabled Whether to send troubleshooting events.
         * 
         * @return builder
         * 
         */
        public Builder troubleshootLogEnabled(Boolean troubleshootLogEnabled) {
            return troubleshootLogEnabled(Output.of(troubleshootLogEnabled));
        }

        public ProjectConnectorsDatadogArgs build() {
            if ($.apiKey == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsDatadogArgs", "apiKey");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsDatadogArgs", "name");
            }
            return $;
        }
    }

}
