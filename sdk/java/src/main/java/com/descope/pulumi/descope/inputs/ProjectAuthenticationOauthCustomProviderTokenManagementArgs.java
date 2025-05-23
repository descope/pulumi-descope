// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectAuthenticationOauthCustomProviderTokenManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectAuthenticationOauthCustomProviderTokenManagementArgs Empty = new ProjectAuthenticationOauthCustomProviderTokenManagementArgs();

    @Import(name="callbackDomain")
    private @Nullable Output<String> callbackDomain;

    public Optional<Output<String>> callbackDomain() {
        return Optional.ofNullable(this.callbackDomain);
    }

    @Import(name="redirectUrl")
    private @Nullable Output<String> redirectUrl;

    public Optional<Output<String>> redirectUrl() {
        return Optional.ofNullable(this.redirectUrl);
    }

    private ProjectAuthenticationOauthCustomProviderTokenManagementArgs() {}

    private ProjectAuthenticationOauthCustomProviderTokenManagementArgs(ProjectAuthenticationOauthCustomProviderTokenManagementArgs $) {
        this.callbackDomain = $.callbackDomain;
        this.redirectUrl = $.redirectUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectAuthenticationOauthCustomProviderTokenManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectAuthenticationOauthCustomProviderTokenManagementArgs $;

        public Builder() {
            $ = new ProjectAuthenticationOauthCustomProviderTokenManagementArgs();
        }

        public Builder(ProjectAuthenticationOauthCustomProviderTokenManagementArgs defaults) {
            $ = new ProjectAuthenticationOauthCustomProviderTokenManagementArgs(Objects.requireNonNull(defaults));
        }

        public Builder callbackDomain(@Nullable Output<String> callbackDomain) {
            $.callbackDomain = callbackDomain;
            return this;
        }

        public Builder callbackDomain(String callbackDomain) {
            return callbackDomain(Output.of(callbackDomain));
        }

        public Builder redirectUrl(@Nullable Output<String> redirectUrl) {
            $.redirectUrl = redirectUrl;
            return this;
        }

        public Builder redirectUrl(String redirectUrl) {
            return redirectUrl(Output.of(redirectUrl));
        }

        public ProjectAuthenticationOauthCustomProviderTokenManagementArgs build() {
            return $;
        }
    }

}
