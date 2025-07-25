package com.smaato.sdk.core.remoteconfig.publisher;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkConnectionType;
import com.smaato.sdk.core.p568ad.AdFormat;
import com.smaato.sdk.core.util.HeaderValueUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;

/* loaded from: classes7.dex */
public interface Param {

    /* loaded from: classes7.dex */
    public static class AdSpaceId implements Param {
        @NonNull
        private final String adSpaceId;

        public AdSpaceId(@NonNull String str) {
            this.adSpaceId = str;
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @NonNull
        public String getName() {
            return "adSpaceId";
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @Nullable
        public Object getValue() {
            return this.adSpaceId;
        }
    }

    /* loaded from: classes7.dex */
    public static class ConfiguredTimeout implements Param {
        private final long configuredTimeoutMillis;

        public ConfiguredTimeout(long j) {
            this.configuredTimeoutMillis = j;
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @NonNull
        public String getName() {
            return "configuredTimeout";
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @Nullable
        public Object getValue() {
            return Long.valueOf(this.configuredTimeoutMillis);
        }
    }

    /* loaded from: classes7.dex */
    public static class ConnectionType implements Param {
        @Nullable
        private final NetworkConnectionType networkConnectionType;

        public ConnectionType(@NonNull DataCollector dataCollector) {
            this.networkConnectionType = dataCollector.getSystemInfo().getNetworkConnectionType();
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @NonNull
        public String getName() {
            return C21114v8.C21123i.f54168t;
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @Nullable
        public Object getValue() {
            NetworkConnectionType networkConnectionType = this.networkConnectionType;
            if (networkConnectionType == null) {
                return null;
            }
            return networkConnectionType.toString();
        }
    }

    /* loaded from: classes7.dex */
    public static class ErrorType implements Param {
        @NonNull
        private final String error;

        public ErrorType(@NonNull String str) {
            this.error = str;
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @NonNull
        public String getName() {
            return "errorType";
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @Nullable
        public Object getValue() {
            return this.error;
        }
    }

    /* loaded from: classes7.dex */
    public static class FormatOfAd implements Param {
        @Nullable
        private final AdFormat adFormat;
        @NonNull
        private final HeaderValueUtils headerValueUtils;

        public FormatOfAd(@NonNull Logger logger, @Nullable AdFormat adFormat) {
            this.adFormat = adFormat;
            this.headerValueUtils = new HeaderValueUtils(logger);
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @NonNull
        public String getName() {
            return ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT;
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @Nullable
        public Object getValue() {
            AdFormat adFormat = this.adFormat;
            if (adFormat == null) {
                return null;
            }
            return this.headerValueUtils.adFormatToApiValue(adFormat);
        }
    }

    /* loaded from: classes7.dex */
    public static class PublisherId implements Param {
        @NonNull
        private final String publisherId;

        public PublisherId(@NonNull String str) {
            this.publisherId = str;
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @NonNull
        public String getName() {
            return "publisherId";
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @Nullable
        public Object getValue() {
            return this.publisherId;
        }
    }

    /* loaded from: classes7.dex */
    public static class SampleRate implements Param {
        private final int sampleRate;

        public SampleRate(int i) {
            this.sampleRate = i;
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @NonNull
        public String getName() {
            return "sampleRate";
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @Nullable
        public Object getValue() {
            return Integer.valueOf(this.sampleRate);
        }
    }

    /* loaded from: classes7.dex */
    public static class Sci implements Param {
        @Nullable
        private final String sci;

        public Sci(@Nullable String str) {
            this.sci = str;
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @NonNull
        public String getName() {
            return "somaSciHeader";
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @Nullable
        public Object getValue() {
            return this.sci;
        }
    }

    /* loaded from: classes7.dex */
    public static class SdkVersion implements Param {
        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @NonNull
        public String getName() {
            return "clientSdkVersion";
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @Nullable
        public Object getValue() {
            return String.format("ubsdkandroid_%s", SmaatoSdk.getVersion());
        }
    }

    /* loaded from: classes7.dex */
    public static class SessionId implements Param {
        @Nullable
        private final String sessionId;

        public SessionId(@Nullable String str) {
            this.sessionId = str;
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @NonNull
        public String getName() {
            return JsonStorageKeyNames.SESSION_ID_KEY;
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @Nullable
        public Object getValue() {
            return this.sessionId;
        }
    }

    /* loaded from: classes7.dex */
    public static class Timestamp implements Param {
        @Nullable
        private final Long timestamp;

        public Timestamp(@Nullable Long l) {
            this.timestamp = l;
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @NonNull
        public String getName() {
            return "originalRequestTime";
        }

        @Override // com.smaato.sdk.core.remoteconfig.publisher.Param
        @Nullable
        public Object getValue() {
            return this.timestamp;
        }
    }

    @NonNull
    String getName();

    @Nullable
    Object getValue();
}
