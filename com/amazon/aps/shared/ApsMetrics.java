package com.amazon.aps.shared;

import android.content.Context;
import be.MathJVM;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.model.ApsLogLevel;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.ApsMetricsCustomEventModelBuilder;
import com.amazon.aps.shared.metrics.ApsMetricsPerfEventModelBuilder;
import com.amazon.aps.shared.metrics.model.ApsMetricsDeviceInfo;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAaxBidEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsSdkInfo;
import com.amazon.aps.shared.util.APSNetworkManager;
import com.amazon.aps.shared.util.APSSharedUtil;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetrics.kt */
@Metadata
/* loaded from: classes2.dex */
public class ApsMetrics {
    @NotNull
    private static final String CUSTOM_FAILURE_ERROR_DETAIL = "Error in sending the custom event";
    public static final int METRICS_API_SCHEMA_VERSION = 1;
    public static final double METRICS_DEFAULT_SAMPLING_RATE = 0.1d;
    private static final int SAMPLING_ALLOWED_FROM = 0;
    @Nullable
    private static String adapterVersion;
    @Nullable
    private static Context context;
    private static boolean isSamplingAllowed;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static ApsMetricsDeviceInfo apsMetricsDeviceInfo = new ApsMetricsDeviceInfo(null, null, null, null, null, 31, null);
    @NotNull
    private static ApsMetricsSdkInfo apsMetricsSdkInfo = new ApsMetricsSdkInfo(null, 1, null);
    private static double samplingPercentage = 0.1d;
    @NotNull
    public static final String METRICS_DEFAULT_ENDPOINT_URL = "https://prod.tahoe-analytics.publishers.advertising.a2z.com/logevent/putRecord";
    @Nullable
    private static String endpointUrl = METRICS_DEFAULT_ENDPOINT_URL;
    @NotNull
    public static final String METRICS_DEFAULT_METRICS_API_KEY = "a5c71f6aff54eb34c826d952c285eaf0650b4259c83ae598962681a6429b63f6";
    @Nullable
    private static String apiKey = METRICS_DEFAULT_METRICS_API_KEY;

    /* compiled from: ApsMetrics.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void calculateSamplingAllowed() {
            int m103792c;
            try {
                m103792c = MathJVM.m103792c(getSamplingPercentage() * 100000);
                boolean z = true;
                if (new Random().nextInt(10000000) + 1 > m103792c) {
                    z = false;
                }
                ApsMetrics.isSamplingAllowed = z;
            } catch (RuntimeException e) {
                ApsLog.m102716e(Intrinsics.m17064q("Unable to set the sampling rate ", e));
            }
        }

        public static /* synthetic */ void customEvent$default(Companion companion, String str, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                jSONObject = null;
            }
            companion.customEvent(str, str2, jSONObject);
        }

        public static /* synthetic */ void init$default(Companion companion, Context context, ApsMetricsDeviceInfo apsMetricsDeviceInfo, ApsMetricsSdkInfo apsMetricsSdkInfo, int i, Object obj) {
            if ((i & 2) != 0) {
                apsMetricsDeviceInfo = null;
            }
            if ((i & 4) != 0) {
                apsMetricsSdkInfo = null;
            }
            companion.init(context, apsMetricsDeviceInfo, apsMetricsSdkInfo);
        }

        public final boolean isOkToSendData() {
            if (isInitialized() && ApsMetrics.isSamplingAllowed && !APSSharedUtil.isNullOrEmpty(getApiKey()) && !APSSharedUtil.isNullOrEmpty(getEndpointUrl())) {
                return true;
            }
            return false;
        }

        public final void adEvent(@Nullable String str, @NotNull ApsMetricsPerfEventModelBuilder builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            ApsLog.m102718d("Logging perf metrics event");
            try {
                if (!isOkToSendData()) {
                    return;
                }
                APSNetworkManager.getInstance(ApsMetrics.context).sendMetrics(builder.withBidId(str).build());
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error sending the ad event", e);
            }
        }

        public final void adapterEvent(@Nullable String str, @NotNull ApsMetricsPerfEventModelBuilder builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            ApsLog.m102718d("Logging adapter event");
            adEvent(str, builder);
        }

        public final void bidEvent(@Nullable String str, @Nullable String str2, @NotNull ApsMetricsPerfAaxBidEvent aaxBid) {
            Intrinsics.checkNotNullParameter(aaxBid, "aaxBid");
            ApsLog.m102718d("Logging bid event");
            try {
                if (!isOkToSendData()) {
                    return;
                }
                APSNetworkManager.getInstance(ApsMetrics.context).sendMetrics(new ApsMetricsPerfEventModelBuilder().withMediationName(str2).withBidId(str).withEvent(aaxBid).build());
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error sending the bid event", e);
            }
        }

        public final void customEvent(@NotNull String eventName, @Nullable String str, @Nullable JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            customEvent(eventName, str, jSONObject, null);
        }

        @Nullable
        public final String getAdapterVersion() {
            return ApsMetrics.adapterVersion;
        }

        @Nullable
        public final String getApiKey() {
            return ApsMetrics.apiKey;
        }

        @NotNull
        public final ApsMetricsDeviceInfo getApsMetricsDeviceInfo() {
            return ApsMetrics.apsMetricsDeviceInfo;
        }

        @NotNull
        public final ApsMetricsSdkInfo getApsMetricsSdkInfo() {
            return ApsMetrics.apsMetricsSdkInfo;
        }

        @Nullable
        public final String getEndpointUrl() {
            return ApsMetrics.endpointUrl;
        }

        public final double getSamplingPercentage() {
            return ApsMetrics.samplingPercentage;
        }

        public final void init(@NotNull Context context, @Nullable ApsMetricsDeviceInfo apsMetricsDeviceInfo, @Nullable ApsMetricsSdkInfo apsMetricsSdkInfo) {
            Intrinsics.checkNotNullParameter(context, "context");
            ApsLog.setLogLevel(ApsLogLevel.All);
            if (apsMetricsDeviceInfo != null) {
                try {
                    Companion companion = ApsMetrics.Companion;
                    ApsMetrics.apsMetricsDeviceInfo = ApsMetricsDeviceInfo.copy$default(apsMetricsDeviceInfo, null, null, null, null, null, 31, null);
                } catch (RuntimeException e) {
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in initializing the ApsMetrics", e);
                    return;
                }
            }
            if (apsMetricsSdkInfo != null) {
                Companion companion2 = ApsMetrics.Companion;
                ApsMetrics.apsMetricsSdkInfo = ApsMetricsSdkInfo.copy$default(apsMetricsSdkInfo, null, 1, null);
            }
            ApsMetrics.context = context;
            calculateSamplingAllowed();
        }

        public final boolean isInitialized() {
            if (ApsMetrics.context != null) {
                return true;
            }
            return false;
        }

        public final void setAdapterVersion(@Nullable String str) {
            if (str != null) {
                ApsMetrics.adapterVersion = str;
            }
        }

        public final void setApiKey(@Nullable String str) {
            if (!APSSharedUtil.isNullOrEmpty(str)) {
                ApsMetrics.apiKey = str;
            }
        }

        public final void setEndpointUrl(@Nullable String str) {
            if (!APSSharedUtil.isNullOrEmpty(str)) {
                ApsMetrics.endpointUrl = str;
            }
        }

        public final void setSamplingPercentage(double d) {
            boolean z = false;
            if (0.0d <= d && d <= 100.0d) {
                z = true;
            }
            if (z) {
                ApsMetrics.samplingPercentage = d;
                calculateSamplingAllowed();
            }
        }

        public static /* synthetic */ void customEvent$default(Companion companion, String str, String str2, JSONObject jSONObject, String str3, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                jSONObject = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            companion.customEvent(str, str2, jSONObject, str3);
        }

        public final void customEvent(@NotNull String eventName, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            try {
                ApsLog.m102718d(Intrinsics.m17064q("Logging custom event:", eventName));
                if (isOkToSendData()) {
                    ApsMetricsCustomEventModelBuilder apsMetricsCustomEventModelBuilder = new ApsMetricsCustomEventModelBuilder();
                    apsMetricsCustomEventModelBuilder.withEventName(eventName);
                    if (str != null) {
                        apsMetricsCustomEventModelBuilder.withEventValue(str);
                    }
                    if (jSONObject != null) {
                        apsMetricsCustomEventModelBuilder.withEventDetail(jSONObject);
                    }
                    if (str2 != null) {
                        apsMetricsCustomEventModelBuilder.withEventCategory(str2);
                    }
                    JSONObject build = apsMetricsCustomEventModelBuilder.build();
                    if (build == null) {
                        return;
                    }
                    APSNetworkManager.getInstance(ApsMetrics.context).sendMetrics(build);
                }
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, ApsMetrics.CUSTOM_FAILURE_ERROR_DETAIL, e);
            }
        }
    }

    private ApsMetrics() {
    }

    public static final void adEvent(@Nullable String str, @NotNull ApsMetricsPerfEventModelBuilder apsMetricsPerfEventModelBuilder) {
        Companion.adEvent(str, apsMetricsPerfEventModelBuilder);
    }

    public static final void adapterEvent(@Nullable String str, @NotNull ApsMetricsPerfEventModelBuilder apsMetricsPerfEventModelBuilder) {
        Companion.adapterEvent(str, apsMetricsPerfEventModelBuilder);
    }

    public static final void bidEvent(@Nullable String str, @Nullable String str2, @NotNull ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent) {
        Companion.bidEvent(str, str2, apsMetricsPerfAaxBidEvent);
    }

    public static final void customEvent(@NotNull String str, @Nullable String str2, @Nullable JSONObject jSONObject) {
        Companion.customEvent(str, str2, jSONObject);
    }

    public static final void init(@NotNull Context context2, @Nullable ApsMetricsDeviceInfo apsMetricsDeviceInfo2, @Nullable ApsMetricsSdkInfo apsMetricsSdkInfo2) {
        Companion.init(context2, apsMetricsDeviceInfo2, apsMetricsSdkInfo2);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    private static final boolean isOkToSendData() {
        return Companion.isOkToSendData();
    }

    public static final void customEvent(@NotNull String str, @Nullable String str2, @Nullable JSONObject jSONObject, @Nullable String str3) {
        Companion.customEvent(str, str2, jSONObject, str3);
    }
}
