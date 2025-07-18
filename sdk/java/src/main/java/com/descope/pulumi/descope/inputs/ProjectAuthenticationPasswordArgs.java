// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.descope.pulumi.descope.inputs.ProjectAuthenticationPasswordEmailServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectAuthenticationPasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectAuthenticationPasswordArgs Empty = new ProjectAuthenticationPasswordArgs();

    /**
     * Setting this to `true` will disallow using this authentication method directly via API and SDK calls. Note that this does not affect authentication flows that are configured to use this authentication method.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Setting this to `true` will disallow using this authentication method directly via API and SDK calls. Note that this does not affect authentication flows that are configured to use this authentication method.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Settings related to sending password reset emails as part of the password feature.
     * 
     */
    @Import(name="emailService")
    private @Nullable Output<ProjectAuthenticationPasswordEmailServiceArgs> emailService;

    /**
     * @return Settings related to sending password reset emails as part of the password feature.
     * 
     */
    public Optional<Output<ProjectAuthenticationPasswordEmailServiceArgs>> emailService() {
        return Optional.ofNullable(this.emailService);
    }

    /**
     * Whether users are required to change their password periodically.
     * 
     */
    @Import(name="expiration")
    private @Nullable Output<Boolean> expiration;

    /**
     * @return Whether users are required to change their password periodically.
     * 
     */
    public Optional<Output<Boolean>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    /**
     * The number of weeks after which a user&#39;s password expires and they need to replace it.
     * 
     */
    @Import(name="expirationWeeks")
    private @Nullable Output<Integer> expirationWeeks;

    /**
     * @return The number of weeks after which a user&#39;s password expires and they need to replace it.
     * 
     */
    public Optional<Output<Integer>> expirationWeeks() {
        return Optional.ofNullable(this.expirationWeeks);
    }

    /**
     * Whether the user account should be locked after a specified number of failed login attempts.
     * 
     */
    @Import(name="lock")
    private @Nullable Output<Boolean> lock;

    /**
     * @return Whether the user account should be locked after a specified number of failed login attempts.
     * 
     */
    public Optional<Output<Boolean>> lock() {
        return Optional.ofNullable(this.lock);
    }

    /**
     * The number of failed login attempts allowed before an account is locked.
     * 
     */
    @Import(name="lockAttempts")
    private @Nullable Output<Integer> lockAttempts;

    /**
     * @return The number of failed login attempts allowed before an account is locked.
     * 
     */
    public Optional<Output<Integer>> lockAttempts() {
        return Optional.ofNullable(this.lockAttempts);
    }

    /**
     * Whether passwords must contain at least one lowercase letter.
     * 
     */
    @Import(name="lowercase")
    private @Nullable Output<Boolean> lowercase;

    /**
     * @return Whether passwords must contain at least one lowercase letter.
     * 
     */
    public Optional<Output<Boolean>> lowercase() {
        return Optional.ofNullable(this.lowercase);
    }

    /**
     * The minimum length of the password that users are required to use. The maximum length is always `64`.
     * 
     */
    @Import(name="minLength")
    private @Nullable Output<Integer> minLength;

    /**
     * @return The minimum length of the password that users are required to use. The maximum length is always `64`.
     * 
     */
    public Optional<Output<Integer>> minLength() {
        return Optional.ofNullable(this.minLength);
    }

    /**
     * Whether passwords must contain at least one non-alphanumeric character (e.g. `!`, `{@literal @}`, `#`).
     * 
     */
    @Import(name="nonAlphanumeric")
    private @Nullable Output<Boolean> nonAlphanumeric;

    /**
     * @return Whether passwords must contain at least one non-alphanumeric character (e.g. `!`, `{@literal @}`, `#`).
     * 
     */
    public Optional<Output<Boolean>> nonAlphanumeric() {
        return Optional.ofNullable(this.nonAlphanumeric);
    }

    /**
     * Whether passwords must contain at least one number.
     * 
     */
    @Import(name="number")
    private @Nullable Output<Boolean> number;

    /**
     * @return Whether passwords must contain at least one number.
     * 
     */
    public Optional<Output<Boolean>> number() {
        return Optional.ofNullable(this.number);
    }

    /**
     * Whether to forbid password reuse when users change their password.
     * 
     */
    @Import(name="reuse")
    private @Nullable Output<Boolean> reuse;

    /**
     * @return Whether to forbid password reuse when users change their password.
     * 
     */
    public Optional<Output<Boolean>> reuse() {
        return Optional.ofNullable(this.reuse);
    }

    /**
     * The number of previous passwords whose hashes are kept to prevent users from reusing old passwords.
     * 
     */
    @Import(name="reuseAmount")
    private @Nullable Output<Integer> reuseAmount;

    /**
     * @return The number of previous passwords whose hashes are kept to prevent users from reusing old passwords.
     * 
     */
    public Optional<Output<Integer>> reuseAmount() {
        return Optional.ofNullable(this.reuseAmount);
    }

    /**
     * Whether passwords must contain at least one uppercase letter.
     * 
     */
    @Import(name="uppercase")
    private @Nullable Output<Boolean> uppercase;

    /**
     * @return Whether passwords must contain at least one uppercase letter.
     * 
     */
    public Optional<Output<Boolean>> uppercase() {
        return Optional.ofNullable(this.uppercase);
    }

    private ProjectAuthenticationPasswordArgs() {}

    private ProjectAuthenticationPasswordArgs(ProjectAuthenticationPasswordArgs $) {
        this.disabled = $.disabled;
        this.emailService = $.emailService;
        this.expiration = $.expiration;
        this.expirationWeeks = $.expirationWeeks;
        this.lock = $.lock;
        this.lockAttempts = $.lockAttempts;
        this.lowercase = $.lowercase;
        this.minLength = $.minLength;
        this.nonAlphanumeric = $.nonAlphanumeric;
        this.number = $.number;
        this.reuse = $.reuse;
        this.reuseAmount = $.reuseAmount;
        this.uppercase = $.uppercase;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectAuthenticationPasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectAuthenticationPasswordArgs $;

        public Builder() {
            $ = new ProjectAuthenticationPasswordArgs();
        }

        public Builder(ProjectAuthenticationPasswordArgs defaults) {
            $ = new ProjectAuthenticationPasswordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled Setting this to `true` will disallow using this authentication method directly via API and SDK calls. Note that this does not affect authentication flows that are configured to use this authentication method.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Setting this to `true` will disallow using this authentication method directly via API and SDK calls. Note that this does not affect authentication flows that are configured to use this authentication method.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param emailService Settings related to sending password reset emails as part of the password feature.
         * 
         * @return builder
         * 
         */
        public Builder emailService(@Nullable Output<ProjectAuthenticationPasswordEmailServiceArgs> emailService) {
            $.emailService = emailService;
            return this;
        }

        /**
         * @param emailService Settings related to sending password reset emails as part of the password feature.
         * 
         * @return builder
         * 
         */
        public Builder emailService(ProjectAuthenticationPasswordEmailServiceArgs emailService) {
            return emailService(Output.of(emailService));
        }

        /**
         * @param expiration Whether users are required to change their password periodically.
         * 
         * @return builder
         * 
         */
        public Builder expiration(@Nullable Output<Boolean> expiration) {
            $.expiration = expiration;
            return this;
        }

        /**
         * @param expiration Whether users are required to change their password periodically.
         * 
         * @return builder
         * 
         */
        public Builder expiration(Boolean expiration) {
            return expiration(Output.of(expiration));
        }

        /**
         * @param expirationWeeks The number of weeks after which a user&#39;s password expires and they need to replace it.
         * 
         * @return builder
         * 
         */
        public Builder expirationWeeks(@Nullable Output<Integer> expirationWeeks) {
            $.expirationWeeks = expirationWeeks;
            return this;
        }

        /**
         * @param expirationWeeks The number of weeks after which a user&#39;s password expires and they need to replace it.
         * 
         * @return builder
         * 
         */
        public Builder expirationWeeks(Integer expirationWeeks) {
            return expirationWeeks(Output.of(expirationWeeks));
        }

        /**
         * @param lock Whether the user account should be locked after a specified number of failed login attempts.
         * 
         * @return builder
         * 
         */
        public Builder lock(@Nullable Output<Boolean> lock) {
            $.lock = lock;
            return this;
        }

        /**
         * @param lock Whether the user account should be locked after a specified number of failed login attempts.
         * 
         * @return builder
         * 
         */
        public Builder lock(Boolean lock) {
            return lock(Output.of(lock));
        }

        /**
         * @param lockAttempts The number of failed login attempts allowed before an account is locked.
         * 
         * @return builder
         * 
         */
        public Builder lockAttempts(@Nullable Output<Integer> lockAttempts) {
            $.lockAttempts = lockAttempts;
            return this;
        }

        /**
         * @param lockAttempts The number of failed login attempts allowed before an account is locked.
         * 
         * @return builder
         * 
         */
        public Builder lockAttempts(Integer lockAttempts) {
            return lockAttempts(Output.of(lockAttempts));
        }

        /**
         * @param lowercase Whether passwords must contain at least one lowercase letter.
         * 
         * @return builder
         * 
         */
        public Builder lowercase(@Nullable Output<Boolean> lowercase) {
            $.lowercase = lowercase;
            return this;
        }

        /**
         * @param lowercase Whether passwords must contain at least one lowercase letter.
         * 
         * @return builder
         * 
         */
        public Builder lowercase(Boolean lowercase) {
            return lowercase(Output.of(lowercase));
        }

        /**
         * @param minLength The minimum length of the password that users are required to use. The maximum length is always `64`.
         * 
         * @return builder
         * 
         */
        public Builder minLength(@Nullable Output<Integer> minLength) {
            $.minLength = minLength;
            return this;
        }

        /**
         * @param minLength The minimum length of the password that users are required to use. The maximum length is always `64`.
         * 
         * @return builder
         * 
         */
        public Builder minLength(Integer minLength) {
            return minLength(Output.of(minLength));
        }

        /**
         * @param nonAlphanumeric Whether passwords must contain at least one non-alphanumeric character (e.g. `!`, `{@literal @}`, `#`).
         * 
         * @return builder
         * 
         */
        public Builder nonAlphanumeric(@Nullable Output<Boolean> nonAlphanumeric) {
            $.nonAlphanumeric = nonAlphanumeric;
            return this;
        }

        /**
         * @param nonAlphanumeric Whether passwords must contain at least one non-alphanumeric character (e.g. `!`, `{@literal @}`, `#`).
         * 
         * @return builder
         * 
         */
        public Builder nonAlphanumeric(Boolean nonAlphanumeric) {
            return nonAlphanumeric(Output.of(nonAlphanumeric));
        }

        /**
         * @param number Whether passwords must contain at least one number.
         * 
         * @return builder
         * 
         */
        public Builder number(@Nullable Output<Boolean> number) {
            $.number = number;
            return this;
        }

        /**
         * @param number Whether passwords must contain at least one number.
         * 
         * @return builder
         * 
         */
        public Builder number(Boolean number) {
            return number(Output.of(number));
        }

        /**
         * @param reuse Whether to forbid password reuse when users change their password.
         * 
         * @return builder
         * 
         */
        public Builder reuse(@Nullable Output<Boolean> reuse) {
            $.reuse = reuse;
            return this;
        }

        /**
         * @param reuse Whether to forbid password reuse when users change their password.
         * 
         * @return builder
         * 
         */
        public Builder reuse(Boolean reuse) {
            return reuse(Output.of(reuse));
        }

        /**
         * @param reuseAmount The number of previous passwords whose hashes are kept to prevent users from reusing old passwords.
         * 
         * @return builder
         * 
         */
        public Builder reuseAmount(@Nullable Output<Integer> reuseAmount) {
            $.reuseAmount = reuseAmount;
            return this;
        }

        /**
         * @param reuseAmount The number of previous passwords whose hashes are kept to prevent users from reusing old passwords.
         * 
         * @return builder
         * 
         */
        public Builder reuseAmount(Integer reuseAmount) {
            return reuseAmount(Output.of(reuseAmount));
        }

        /**
         * @param uppercase Whether passwords must contain at least one uppercase letter.
         * 
         * @return builder
         * 
         */
        public Builder uppercase(@Nullable Output<Boolean> uppercase) {
            $.uppercase = uppercase;
            return this;
        }

        /**
         * @param uppercase Whether passwords must contain at least one uppercase letter.
         * 
         * @return builder
         * 
         */
        public Builder uppercase(Boolean uppercase) {
            return uppercase(Output.of(uppercase));
        }

        public ProjectAuthenticationPasswordArgs build() {
            return $;
        }
    }

}
