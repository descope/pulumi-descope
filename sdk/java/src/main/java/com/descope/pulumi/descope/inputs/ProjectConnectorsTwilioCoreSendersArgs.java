// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.descope.pulumi.descope.inputs.ProjectConnectorsTwilioCoreSendersSmsArgs;
import com.descope.pulumi.descope.inputs.ProjectConnectorsTwilioCoreSendersVoiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectConnectorsTwilioCoreSendersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectConnectorsTwilioCoreSendersArgs Empty = new ProjectConnectorsTwilioCoreSendersArgs();

    @Import(name="sms", required=true)
    private Output<ProjectConnectorsTwilioCoreSendersSmsArgs> sms;

    public Output<ProjectConnectorsTwilioCoreSendersSmsArgs> sms() {
        return this.sms;
    }

    @Import(name="voice")
    private @Nullable Output<ProjectConnectorsTwilioCoreSendersVoiceArgs> voice;

    public Optional<Output<ProjectConnectorsTwilioCoreSendersVoiceArgs>> voice() {
        return Optional.ofNullable(this.voice);
    }

    private ProjectConnectorsTwilioCoreSendersArgs() {}

    private ProjectConnectorsTwilioCoreSendersArgs(ProjectConnectorsTwilioCoreSendersArgs $) {
        this.sms = $.sms;
        this.voice = $.voice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectConnectorsTwilioCoreSendersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectConnectorsTwilioCoreSendersArgs $;

        public Builder() {
            $ = new ProjectConnectorsTwilioCoreSendersArgs();
        }

        public Builder(ProjectConnectorsTwilioCoreSendersArgs defaults) {
            $ = new ProjectConnectorsTwilioCoreSendersArgs(Objects.requireNonNull(defaults));
        }

        public Builder sms(Output<ProjectConnectorsTwilioCoreSendersSmsArgs> sms) {
            $.sms = sms;
            return this;
        }

        public Builder sms(ProjectConnectorsTwilioCoreSendersSmsArgs sms) {
            return sms(Output.of(sms));
        }

        public Builder voice(@Nullable Output<ProjectConnectorsTwilioCoreSendersVoiceArgs> voice) {
            $.voice = voice;
            return this;
        }

        public Builder voice(ProjectConnectorsTwilioCoreSendersVoiceArgs voice) {
            return voice(Output.of(voice));
        }

        public ProjectConnectorsTwilioCoreSendersArgs build() {
            if ($.sms == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsTwilioCoreSendersArgs", "sms");
            }
            return $;
        }
    }

}
