// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.descope.pulumi.descope.outputs.ProjectAuthenticationOauthSystemApple;
import com.descope.pulumi.descope.outputs.ProjectAuthenticationOauthSystemDiscord;
import com.descope.pulumi.descope.outputs.ProjectAuthenticationOauthSystemFacebook;
import com.descope.pulumi.descope.outputs.ProjectAuthenticationOauthSystemGithub;
import com.descope.pulumi.descope.outputs.ProjectAuthenticationOauthSystemGitlab;
import com.descope.pulumi.descope.outputs.ProjectAuthenticationOauthSystemGoogle;
import com.descope.pulumi.descope.outputs.ProjectAuthenticationOauthSystemLinkedin;
import com.descope.pulumi.descope.outputs.ProjectAuthenticationOauthSystemMicrosoft;
import com.descope.pulumi.descope.outputs.ProjectAuthenticationOauthSystemSlack;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectAuthenticationOauthSystem {
    /**
     * @return Apple&#39;s OAuth provider, allowing users to authenticate with their Apple Account.
     * 
     */
    private @Nullable ProjectAuthenticationOauthSystemApple apple;
    /**
     * @return Discord&#39;s OAuth provider, allowing users to authenticate with their Discord account.
     * 
     */
    private @Nullable ProjectAuthenticationOauthSystemDiscord discord;
    /**
     * @return Facebook&#39;s OAuth provider, allowing users to authenticate with their Facebook account.
     * 
     */
    private @Nullable ProjectAuthenticationOauthSystemFacebook facebook;
    /**
     * @return GitHub&#39;s OAuth provider, allowing users to authenticate with their GitHub account.
     * 
     */
    private @Nullable ProjectAuthenticationOauthSystemGithub github;
    /**
     * @return GitLab&#39;s OAuth provider, allowing users to authenticate with their GitLab account.
     * 
     */
    private @Nullable ProjectAuthenticationOauthSystemGitlab gitlab;
    /**
     * @return Google&#39;s OAuth provider, allowing users to authenticate with their Google account.
     * 
     */
    private @Nullable ProjectAuthenticationOauthSystemGoogle google;
    /**
     * @return LinkedIn&#39;s OAuth provider, allowing users to authenticate with their LinkedIn account.
     * 
     */
    private @Nullable ProjectAuthenticationOauthSystemLinkedin linkedin;
    /**
     * @return Microsoft&#39;s OAuth provider, allowing users to authenticate with their Microsoft account.
     * 
     */
    private @Nullable ProjectAuthenticationOauthSystemMicrosoft microsoft;
    /**
     * @return Slack&#39;s OAuth provider, allowing users to authenticate with their Slack account.
     * 
     */
    private @Nullable ProjectAuthenticationOauthSystemSlack slack;

    private ProjectAuthenticationOauthSystem() {}
    /**
     * @return Apple&#39;s OAuth provider, allowing users to authenticate with their Apple Account.
     * 
     */
    public Optional<ProjectAuthenticationOauthSystemApple> apple() {
        return Optional.ofNullable(this.apple);
    }
    /**
     * @return Discord&#39;s OAuth provider, allowing users to authenticate with their Discord account.
     * 
     */
    public Optional<ProjectAuthenticationOauthSystemDiscord> discord() {
        return Optional.ofNullable(this.discord);
    }
    /**
     * @return Facebook&#39;s OAuth provider, allowing users to authenticate with their Facebook account.
     * 
     */
    public Optional<ProjectAuthenticationOauthSystemFacebook> facebook() {
        return Optional.ofNullable(this.facebook);
    }
    /**
     * @return GitHub&#39;s OAuth provider, allowing users to authenticate with their GitHub account.
     * 
     */
    public Optional<ProjectAuthenticationOauthSystemGithub> github() {
        return Optional.ofNullable(this.github);
    }
    /**
     * @return GitLab&#39;s OAuth provider, allowing users to authenticate with their GitLab account.
     * 
     */
    public Optional<ProjectAuthenticationOauthSystemGitlab> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }
    /**
     * @return Google&#39;s OAuth provider, allowing users to authenticate with their Google account.
     * 
     */
    public Optional<ProjectAuthenticationOauthSystemGoogle> google() {
        return Optional.ofNullable(this.google);
    }
    /**
     * @return LinkedIn&#39;s OAuth provider, allowing users to authenticate with their LinkedIn account.
     * 
     */
    public Optional<ProjectAuthenticationOauthSystemLinkedin> linkedin() {
        return Optional.ofNullable(this.linkedin);
    }
    /**
     * @return Microsoft&#39;s OAuth provider, allowing users to authenticate with their Microsoft account.
     * 
     */
    public Optional<ProjectAuthenticationOauthSystemMicrosoft> microsoft() {
        return Optional.ofNullable(this.microsoft);
    }
    /**
     * @return Slack&#39;s OAuth provider, allowing users to authenticate with their Slack account.
     * 
     */
    public Optional<ProjectAuthenticationOauthSystemSlack> slack() {
        return Optional.ofNullable(this.slack);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectAuthenticationOauthSystem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ProjectAuthenticationOauthSystemApple apple;
        private @Nullable ProjectAuthenticationOauthSystemDiscord discord;
        private @Nullable ProjectAuthenticationOauthSystemFacebook facebook;
        private @Nullable ProjectAuthenticationOauthSystemGithub github;
        private @Nullable ProjectAuthenticationOauthSystemGitlab gitlab;
        private @Nullable ProjectAuthenticationOauthSystemGoogle google;
        private @Nullable ProjectAuthenticationOauthSystemLinkedin linkedin;
        private @Nullable ProjectAuthenticationOauthSystemMicrosoft microsoft;
        private @Nullable ProjectAuthenticationOauthSystemSlack slack;
        public Builder() {}
        public Builder(ProjectAuthenticationOauthSystem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apple = defaults.apple;
    	      this.discord = defaults.discord;
    	      this.facebook = defaults.facebook;
    	      this.github = defaults.github;
    	      this.gitlab = defaults.gitlab;
    	      this.google = defaults.google;
    	      this.linkedin = defaults.linkedin;
    	      this.microsoft = defaults.microsoft;
    	      this.slack = defaults.slack;
        }

        @CustomType.Setter
        public Builder apple(@Nullable ProjectAuthenticationOauthSystemApple apple) {

            this.apple = apple;
            return this;
        }
        @CustomType.Setter
        public Builder discord(@Nullable ProjectAuthenticationOauthSystemDiscord discord) {

            this.discord = discord;
            return this;
        }
        @CustomType.Setter
        public Builder facebook(@Nullable ProjectAuthenticationOauthSystemFacebook facebook) {

            this.facebook = facebook;
            return this;
        }
        @CustomType.Setter
        public Builder github(@Nullable ProjectAuthenticationOauthSystemGithub github) {

            this.github = github;
            return this;
        }
        @CustomType.Setter
        public Builder gitlab(@Nullable ProjectAuthenticationOauthSystemGitlab gitlab) {

            this.gitlab = gitlab;
            return this;
        }
        @CustomType.Setter
        public Builder google(@Nullable ProjectAuthenticationOauthSystemGoogle google) {

            this.google = google;
            return this;
        }
        @CustomType.Setter
        public Builder linkedin(@Nullable ProjectAuthenticationOauthSystemLinkedin linkedin) {

            this.linkedin = linkedin;
            return this;
        }
        @CustomType.Setter
        public Builder microsoft(@Nullable ProjectAuthenticationOauthSystemMicrosoft microsoft) {

            this.microsoft = microsoft;
            return this;
        }
        @CustomType.Setter
        public Builder slack(@Nullable ProjectAuthenticationOauthSystemSlack slack) {

            this.slack = slack;
            return this;
        }
        public ProjectAuthenticationOauthSystem build() {
            final var _resultValue = new ProjectAuthenticationOauthSystem();
            _resultValue.apple = apple;
            _resultValue.discord = discord;
            _resultValue.facebook = facebook;
            _resultValue.github = github;
            _resultValue.gitlab = gitlab;
            _resultValue.google = google;
            _resultValue.linkedin = linkedin;
            _resultValue.microsoft = microsoft;
            _resultValue.slack = slack;
            return _resultValue;
        }
    }
}
