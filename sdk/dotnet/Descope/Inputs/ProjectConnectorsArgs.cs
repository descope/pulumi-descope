// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Descope.Pulumi.Descope.Inputs
{

    public sealed class ProjectConnectorsArgs : global::Pulumi.ResourceArgs
    {
        [Input("abuseipdbs")]
        private InputList<Inputs.ProjectConnectorsAbuseipdbArgs>? _abuseipdbs;
        public InputList<Inputs.ProjectConnectorsAbuseipdbArgs> Abuseipdbs
        {
            get => _abuseipdbs ?? (_abuseipdbs = new InputList<Inputs.ProjectConnectorsAbuseipdbArgs>());
            set => _abuseipdbs = value;
        }

        [Input("amplitudes")]
        private InputList<Inputs.ProjectConnectorsAmplitudeArgs>? _amplitudes;
        public InputList<Inputs.ProjectConnectorsAmplitudeArgs> Amplitudes
        {
            get => _amplitudes ?? (_amplitudes = new InputList<Inputs.ProjectConnectorsAmplitudeArgs>());
            set => _amplitudes = value;
        }

        [Input("auditWebhooks")]
        private InputList<Inputs.ProjectConnectorsAuditWebhookArgs>? _auditWebhooks;
        public InputList<Inputs.ProjectConnectorsAuditWebhookArgs> AuditWebhooks
        {
            get => _auditWebhooks ?? (_auditWebhooks = new InputList<Inputs.ProjectConnectorsAuditWebhookArgs>());
            set => _auditWebhooks = value;
        }

        [Input("awsS3s")]
        private InputList<Inputs.ProjectConnectorsAwsS3Args>? _awsS3s;
        public InputList<Inputs.ProjectConnectorsAwsS3Args> AwsS3s
        {
            get => _awsS3s ?? (_awsS3s = new InputList<Inputs.ProjectConnectorsAwsS3Args>());
            set => _awsS3s = value;
        }

        [Input("awsTranslates")]
        private InputList<Inputs.ProjectConnectorsAwsTranslateArgs>? _awsTranslates;
        public InputList<Inputs.ProjectConnectorsAwsTranslateArgs> AwsTranslates
        {
            get => _awsTranslates ?? (_awsTranslates = new InputList<Inputs.ProjectConnectorsAwsTranslateArgs>());
            set => _awsTranslates = value;
        }

        [Input("clears")]
        private InputList<Inputs.ProjectConnectorsClearArgs>? _clears;
        public InputList<Inputs.ProjectConnectorsClearArgs> Clears
        {
            get => _clears ?? (_clears = new InputList<Inputs.ProjectConnectorsClearArgs>());
            set => _clears = value;
        }

        [Input("datadogs")]
        private InputList<Inputs.ProjectConnectorsDatadogArgs>? _datadogs;
        public InputList<Inputs.ProjectConnectorsDatadogArgs> Datadogs
        {
            get => _datadogs ?? (_datadogs = new InputList<Inputs.ProjectConnectorsDatadogArgs>());
            set => _datadogs = value;
        }

        [Input("devrevGrows")]
        private InputList<Inputs.ProjectConnectorsDevrevGrowArgs>? _devrevGrows;
        public InputList<Inputs.ProjectConnectorsDevrevGrowArgs> DevrevGrows
        {
            get => _devrevGrows ?? (_devrevGrows = new InputList<Inputs.ProjectConnectorsDevrevGrowArgs>());
            set => _devrevGrows = value;
        }

        [Input("docebos")]
        private InputList<Inputs.ProjectConnectorsDoceboArgs>? _docebos;
        public InputList<Inputs.ProjectConnectorsDoceboArgs> Docebos
        {
            get => _docebos ?? (_docebos = new InputList<Inputs.ProjectConnectorsDoceboArgs>());
            set => _docebos = value;
        }

        [Input("forters")]
        private InputList<Inputs.ProjectConnectorsForterArgs>? _forters;
        public InputList<Inputs.ProjectConnectorsForterArgs> Forters
        {
            get => _forters ?? (_forters = new InputList<Inputs.ProjectConnectorsForterArgs>());
            set => _forters = value;
        }

        [Input("googleCloudTranslations")]
        private InputList<Inputs.ProjectConnectorsGoogleCloudTranslationArgs>? _googleCloudTranslations;
        public InputList<Inputs.ProjectConnectorsGoogleCloudTranslationArgs> GoogleCloudTranslations
        {
            get => _googleCloudTranslations ?? (_googleCloudTranslations = new InputList<Inputs.ProjectConnectorsGoogleCloudTranslationArgs>());
            set => _googleCloudTranslations = value;
        }

        [Input("hibps")]
        private InputList<Inputs.ProjectConnectorsHibpArgs>? _hibps;
        public InputList<Inputs.ProjectConnectorsHibpArgs> Hibps
        {
            get => _hibps ?? (_hibps = new InputList<Inputs.ProjectConnectorsHibpArgs>());
            set => _hibps = value;
        }

        [Input("https")]
        private InputList<Inputs.ProjectConnectorsHttpArgs>? _https;
        public InputList<Inputs.ProjectConnectorsHttpArgs> Https
        {
            get => _https ?? (_https = new InputList<Inputs.ProjectConnectorsHttpArgs>());
            set => _https = value;
        }

        [Input("hubspots")]
        private InputList<Inputs.ProjectConnectorsHubspotArgs>? _hubspots;
        public InputList<Inputs.ProjectConnectorsHubspotArgs> Hubspots
        {
            get => _hubspots ?? (_hubspots = new InputList<Inputs.ProjectConnectorsHubspotArgs>());
            set => _hubspots = value;
        }

        [Input("intercoms")]
        private InputList<Inputs.ProjectConnectorsIntercomArgs>? _intercoms;
        public InputList<Inputs.ProjectConnectorsIntercomArgs> Intercoms
        {
            get => _intercoms ?? (_intercoms = new InputList<Inputs.ProjectConnectorsIntercomArgs>());
            set => _intercoms = value;
        }

        [Input("newrelics")]
        private InputList<Inputs.ProjectConnectorsNewrelicArgs>? _newrelics;
        public InputList<Inputs.ProjectConnectorsNewrelicArgs> Newrelics
        {
            get => _newrelics ?? (_newrelics = new InputList<Inputs.ProjectConnectorsNewrelicArgs>());
            set => _newrelics = value;
        }

        [Input("recaptchaEnterprises")]
        private InputList<Inputs.ProjectConnectorsRecaptchaEnterpriseArgs>? _recaptchaEnterprises;
        public InputList<Inputs.ProjectConnectorsRecaptchaEnterpriseArgs> RecaptchaEnterprises
        {
            get => _recaptchaEnterprises ?? (_recaptchaEnterprises = new InputList<Inputs.ProjectConnectorsRecaptchaEnterpriseArgs>());
            set => _recaptchaEnterprises = value;
        }

        [Input("recaptchas")]
        private InputList<Inputs.ProjectConnectorsRecaptchaArgs>? _recaptchas;
        public InputList<Inputs.ProjectConnectorsRecaptchaArgs> Recaptchas
        {
            get => _recaptchas ?? (_recaptchas = new InputList<Inputs.ProjectConnectorsRecaptchaArgs>());
            set => _recaptchas = value;
        }

        [Input("rekognitions")]
        private InputList<Inputs.ProjectConnectorsRekognitionArgs>? _rekognitions;
        public InputList<Inputs.ProjectConnectorsRekognitionArgs> Rekognitions
        {
            get => _rekognitions ?? (_rekognitions = new InputList<Inputs.ProjectConnectorsRekognitionArgs>());
            set => _rekognitions = value;
        }

        [Input("salesforces")]
        private InputList<Inputs.ProjectConnectorsSalesforceArgs>? _salesforces;
        public InputList<Inputs.ProjectConnectorsSalesforceArgs> Salesforces
        {
            get => _salesforces ?? (_salesforces = new InputList<Inputs.ProjectConnectorsSalesforceArgs>());
            set => _salesforces = value;
        }

        [Input("segments")]
        private InputList<Inputs.ProjectConnectorsSegmentArgs>? _segments;
        public InputList<Inputs.ProjectConnectorsSegmentArgs> Segments
        {
            get => _segments ?? (_segments = new InputList<Inputs.ProjectConnectorsSegmentArgs>());
            set => _segments = value;
        }

        [Input("sendgrids")]
        private InputList<Inputs.ProjectConnectorsSendgridArgs>? _sendgrids;
        public InputList<Inputs.ProjectConnectorsSendgridArgs> Sendgrids
        {
            get => _sendgrids ?? (_sendgrids = new InputList<Inputs.ProjectConnectorsSendgridArgs>());
            set => _sendgrids = value;
        }

        [Input("smtps")]
        private InputList<Inputs.ProjectConnectorsSmtpArgs>? _smtps;
        public InputList<Inputs.ProjectConnectorsSmtpArgs> Smtps
        {
            get => _smtps ?? (_smtps = new InputList<Inputs.ProjectConnectorsSmtpArgs>());
            set => _smtps = value;
        }

        [Input("sumologics")]
        private InputList<Inputs.ProjectConnectorsSumologicArgs>? _sumologics;
        public InputList<Inputs.ProjectConnectorsSumologicArgs> Sumologics
        {
            get => _sumologics ?? (_sumologics = new InputList<Inputs.ProjectConnectorsSumologicArgs>());
            set => _sumologics = value;
        }

        [Input("telesigns")]
        private InputList<Inputs.ProjectConnectorsTelesignArgs>? _telesigns;
        public InputList<Inputs.ProjectConnectorsTelesignArgs> Telesigns
        {
            get => _telesigns ?? (_telesigns = new InputList<Inputs.ProjectConnectorsTelesignArgs>());
            set => _telesigns = value;
        }

        [Input("traceables")]
        private InputList<Inputs.ProjectConnectorsTraceableArgs>? _traceables;
        public InputList<Inputs.ProjectConnectorsTraceableArgs> Traceables
        {
            get => _traceables ?? (_traceables = new InputList<Inputs.ProjectConnectorsTraceableArgs>());
            set => _traceables = value;
        }

        [Input("twilioCores")]
        private InputList<Inputs.ProjectConnectorsTwilioCoreArgs>? _twilioCores;
        public InputList<Inputs.ProjectConnectorsTwilioCoreArgs> TwilioCores
        {
            get => _twilioCores ?? (_twilioCores = new InputList<Inputs.ProjectConnectorsTwilioCoreArgs>());
            set => _twilioCores = value;
        }

        [Input("twilioVerifies")]
        private InputList<Inputs.ProjectConnectorsTwilioVerifyArgs>? _twilioVerifies;
        public InputList<Inputs.ProjectConnectorsTwilioVerifyArgs> TwilioVerifies
        {
            get => _twilioVerifies ?? (_twilioVerifies = new InputList<Inputs.ProjectConnectorsTwilioVerifyArgs>());
            set => _twilioVerifies = value;
        }

        [Input("veriffs")]
        private InputList<Inputs.ProjectConnectorsVeriffArgs>? _veriffs;
        public InputList<Inputs.ProjectConnectorsVeriffArgs> Veriffs
        {
            get => _veriffs ?? (_veriffs = new InputList<Inputs.ProjectConnectorsVeriffArgs>());
            set => _veriffs = value;
        }

        public ProjectConnectorsArgs()
        {
        }
        public static new ProjectConnectorsArgs Empty => new ProjectConnectorsArgs();
    }
}