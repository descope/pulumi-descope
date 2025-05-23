// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.descope.pulumi.descope.outputs.ProjectApplicationsSamlApplicationAttributeMapping;
import com.descope.pulumi.descope.outputs.ProjectApplicationsSamlApplicationDynamicConfiguration;
import com.descope.pulumi.descope.outputs.ProjectApplicationsSamlApplicationManualConfiguration;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectApplicationsSamlApplication {
    /**
     * @return A list of allowed ACS callback URLS. This configuration is used when the default ACS URL value is unreachable. Supports wildcards.
     * 
     */
    private @Nullable List<String> acsAllowedCallbackUrls;
    /**
     * @return The `AttributeMapping` object. Read the description below.
     * 
     */
    private @Nullable List<ProjectApplicationsSamlApplicationAttributeMapping> attributeMappings;
    /**
     * @return The default relay state. When using IdP-initiated authentication, this value may be used as a URL to a resource in the Service Provider.
     * 
     */
    private @Nullable String defaultRelayState;
    /**
     * @return A description for the SAML application.
     * 
     */
    private @Nullable String description;
    /**
     * @return Whether the application should be enabled or disabled.
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return The `DynamicConfiguration` object. Read the description below.
     * 
     */
    private @Nullable ProjectApplicationsSamlApplicationDynamicConfiguration dynamicConfiguration;
    /**
     * @return This configuration overrides the default behavior of the SSO application and forces the user to authenticate via the Descope flow, regardless of the SP&#39;s request.
     * 
     */
    private @Nullable Boolean forceAuthentication;
    /**
     * @return An optional identifier for the SAML application.
     * 
     */
    private @Nullable String id;
    /**
     * @return The Flow Hosting URL. Read more about using this parameter with custom domain [here](https://docs.descope.com/sso-integrations/applications/saml-apps).
     * 
     */
    private @Nullable String loginPageUrl;
    /**
     * @return A logo for the SAML application. Should be a hosted image URL.
     * 
     */
    private @Nullable String logo;
    /**
     * @return The `ManualConfiguration` object. Read the description below.
     * 
     */
    private @Nullable ProjectApplicationsSamlApplicationManualConfiguration manualConfiguration;
    /**
     * @return A name for the SAML application.
     * 
     */
    private String name;
    /**
     * @return The subject name id format. Choose one of &#34;&#34;, &#34;urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified&#34;, &#34;urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress&#34;, &#34;urn:oasis:names:tc:SAML:2.0:nameid-format:persistent&#34;, &#34;urn:oasis:names:tc:SAML:2.0:nameid-format:transient&#34;. Read more about this configuration [here](https://docs.descope.com/sso-integrations/applications/saml-apps).
     * 
     */
    private @Nullable String subjectNameIdFormat;
    /**
     * @return The subject name id type. Choose one of &#34;&#34;, &#34;email&#34;, &#34;phone&#34;. Read more about this configuration [here](https://docs.descope.com/sso-integrations/applications/saml-apps).
     * 
     */
    private @Nullable String subjectNameIdType;

    private ProjectApplicationsSamlApplication() {}
    /**
     * @return A list of allowed ACS callback URLS. This configuration is used when the default ACS URL value is unreachable. Supports wildcards.
     * 
     */
    public List<String> acsAllowedCallbackUrls() {
        return this.acsAllowedCallbackUrls == null ? List.of() : this.acsAllowedCallbackUrls;
    }
    /**
     * @return The `AttributeMapping` object. Read the description below.
     * 
     */
    public List<ProjectApplicationsSamlApplicationAttributeMapping> attributeMappings() {
        return this.attributeMappings == null ? List.of() : this.attributeMappings;
    }
    /**
     * @return The default relay state. When using IdP-initiated authentication, this value may be used as a URL to a resource in the Service Provider.
     * 
     */
    public Optional<String> defaultRelayState() {
        return Optional.ofNullable(this.defaultRelayState);
    }
    /**
     * @return A description for the SAML application.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Whether the application should be enabled or disabled.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return The `DynamicConfiguration` object. Read the description below.
     * 
     */
    public Optional<ProjectApplicationsSamlApplicationDynamicConfiguration> dynamicConfiguration() {
        return Optional.ofNullable(this.dynamicConfiguration);
    }
    /**
     * @return This configuration overrides the default behavior of the SSO application and forces the user to authenticate via the Descope flow, regardless of the SP&#39;s request.
     * 
     */
    public Optional<Boolean> forceAuthentication() {
        return Optional.ofNullable(this.forceAuthentication);
    }
    /**
     * @return An optional identifier for the SAML application.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The Flow Hosting URL. Read more about using this parameter with custom domain [here](https://docs.descope.com/sso-integrations/applications/saml-apps).
     * 
     */
    public Optional<String> loginPageUrl() {
        return Optional.ofNullable(this.loginPageUrl);
    }
    /**
     * @return A logo for the SAML application. Should be a hosted image URL.
     * 
     */
    public Optional<String> logo() {
        return Optional.ofNullable(this.logo);
    }
    /**
     * @return The `ManualConfiguration` object. Read the description below.
     * 
     */
    public Optional<ProjectApplicationsSamlApplicationManualConfiguration> manualConfiguration() {
        return Optional.ofNullable(this.manualConfiguration);
    }
    /**
     * @return A name for the SAML application.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The subject name id format. Choose one of &#34;&#34;, &#34;urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified&#34;, &#34;urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress&#34;, &#34;urn:oasis:names:tc:SAML:2.0:nameid-format:persistent&#34;, &#34;urn:oasis:names:tc:SAML:2.0:nameid-format:transient&#34;. Read more about this configuration [here](https://docs.descope.com/sso-integrations/applications/saml-apps).
     * 
     */
    public Optional<String> subjectNameIdFormat() {
        return Optional.ofNullable(this.subjectNameIdFormat);
    }
    /**
     * @return The subject name id type. Choose one of &#34;&#34;, &#34;email&#34;, &#34;phone&#34;. Read more about this configuration [here](https://docs.descope.com/sso-integrations/applications/saml-apps).
     * 
     */
    public Optional<String> subjectNameIdType() {
        return Optional.ofNullable(this.subjectNameIdType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectApplicationsSamlApplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> acsAllowedCallbackUrls;
        private @Nullable List<ProjectApplicationsSamlApplicationAttributeMapping> attributeMappings;
        private @Nullable String defaultRelayState;
        private @Nullable String description;
        private @Nullable Boolean disabled;
        private @Nullable ProjectApplicationsSamlApplicationDynamicConfiguration dynamicConfiguration;
        private @Nullable Boolean forceAuthentication;
        private @Nullable String id;
        private @Nullable String loginPageUrl;
        private @Nullable String logo;
        private @Nullable ProjectApplicationsSamlApplicationManualConfiguration manualConfiguration;
        private String name;
        private @Nullable String subjectNameIdFormat;
        private @Nullable String subjectNameIdType;
        public Builder() {}
        public Builder(ProjectApplicationsSamlApplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acsAllowedCallbackUrls = defaults.acsAllowedCallbackUrls;
    	      this.attributeMappings = defaults.attributeMappings;
    	      this.defaultRelayState = defaults.defaultRelayState;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.dynamicConfiguration = defaults.dynamicConfiguration;
    	      this.forceAuthentication = defaults.forceAuthentication;
    	      this.id = defaults.id;
    	      this.loginPageUrl = defaults.loginPageUrl;
    	      this.logo = defaults.logo;
    	      this.manualConfiguration = defaults.manualConfiguration;
    	      this.name = defaults.name;
    	      this.subjectNameIdFormat = defaults.subjectNameIdFormat;
    	      this.subjectNameIdType = defaults.subjectNameIdType;
        }

        @CustomType.Setter
        public Builder acsAllowedCallbackUrls(@Nullable List<String> acsAllowedCallbackUrls) {

            this.acsAllowedCallbackUrls = acsAllowedCallbackUrls;
            return this;
        }
        public Builder acsAllowedCallbackUrls(String... acsAllowedCallbackUrls) {
            return acsAllowedCallbackUrls(List.of(acsAllowedCallbackUrls));
        }
        @CustomType.Setter
        public Builder attributeMappings(@Nullable List<ProjectApplicationsSamlApplicationAttributeMapping> attributeMappings) {

            this.attributeMappings = attributeMappings;
            return this;
        }
        public Builder attributeMappings(ProjectApplicationsSamlApplicationAttributeMapping... attributeMappings) {
            return attributeMappings(List.of(attributeMappings));
        }
        @CustomType.Setter
        public Builder defaultRelayState(@Nullable String defaultRelayState) {

            this.defaultRelayState = defaultRelayState;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {

            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder dynamicConfiguration(@Nullable ProjectApplicationsSamlApplicationDynamicConfiguration dynamicConfiguration) {

            this.dynamicConfiguration = dynamicConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder forceAuthentication(@Nullable Boolean forceAuthentication) {

            this.forceAuthentication = forceAuthentication;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder loginPageUrl(@Nullable String loginPageUrl) {

            this.loginPageUrl = loginPageUrl;
            return this;
        }
        @CustomType.Setter
        public Builder logo(@Nullable String logo) {

            this.logo = logo;
            return this;
        }
        @CustomType.Setter
        public Builder manualConfiguration(@Nullable ProjectApplicationsSamlApplicationManualConfiguration manualConfiguration) {

            this.manualConfiguration = manualConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ProjectApplicationsSamlApplication", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder subjectNameIdFormat(@Nullable String subjectNameIdFormat) {

            this.subjectNameIdFormat = subjectNameIdFormat;
            return this;
        }
        @CustomType.Setter
        public Builder subjectNameIdType(@Nullable String subjectNameIdType) {

            this.subjectNameIdType = subjectNameIdType;
            return this;
        }
        public ProjectApplicationsSamlApplication build() {
            final var _resultValue = new ProjectApplicationsSamlApplication();
            _resultValue.acsAllowedCallbackUrls = acsAllowedCallbackUrls;
            _resultValue.attributeMappings = attributeMappings;
            _resultValue.defaultRelayState = defaultRelayState;
            _resultValue.description = description;
            _resultValue.disabled = disabled;
            _resultValue.dynamicConfiguration = dynamicConfiguration;
            _resultValue.forceAuthentication = forceAuthentication;
            _resultValue.id = id;
            _resultValue.loginPageUrl = loginPageUrl;
            _resultValue.logo = logo;
            _resultValue.manualConfiguration = manualConfiguration;
            _resultValue.name = name;
            _resultValue.subjectNameIdFormat = subjectNameIdFormat;
            _resultValue.subjectNameIdType = subjectNameIdType;
            return _resultValue;
        }
    }
}
