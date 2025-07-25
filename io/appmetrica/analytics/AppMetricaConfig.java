package io.appmetrica.analytics;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC34341Y3;
import io.appmetrica.analytics.impl.AbstractC34451cb;
import io.appmetrica.analytics.impl.C33853Dm;
import io.appmetrica.analytics.impl.C34440c0;
import io.appmetrica.analytics.impl.C34927u5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class AppMetricaConfig {
    @NonNull
    public final Map<String, Object> additionalConfig;
    @Nullable
    public final Boolean anrMonitoring;
    @Nullable
    public final Integer anrMonitoringTimeout;
    @NonNull
    public final String apiKey;
    @Nullable
    public final Integer appBuildNumber;
    @Nullable
    public final Map<String, String> appEnvironment;
    @Nullable
    public final Boolean appOpenTrackingEnabled;
    @Nullable
    public final String appVersion;
    @Nullable
    public final Boolean crashReporting;
    @Nullable
    public final ICrashTransformer crashTransformer;
    @Nullable
    public final List<String> customHosts;
    @Nullable
    public final Boolean dataSendingEnabled;
    @Nullable
    public final String deviceType;
    @Nullable
    public final Integer dispatchPeriodSeconds;
    @Nullable
    public final Map<String, String> errorEnvironment;
    @Nullable
    public final Boolean firstActivationAsUpdate;
    @Nullable
    public final Location location;
    @Nullable
    public final Boolean locationTracking;
    @Nullable
    public final Boolean logs;
    @Nullable
    public final Integer maxReportsCount;
    @Nullable
    public final Integer maxReportsInDatabaseCount;
    @Nullable
    public final Boolean nativeCrashReporting;
    @Nullable
    public final PreloadInfo preloadInfo;
    @Nullable
    public final Boolean revenueAutoTrackingEnabled;
    @Nullable
    public final Integer sessionTimeout;
    @Nullable
    public final Boolean sessionsAutoTrackingEnabled;
    @Nullable
    public final String userProfileID;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: C */
        private static final C33853Dm f92173C = new C33853Dm(new C34440c0());

        /* renamed from: A */
        private List f92174A;

        /* renamed from: B */
        private final HashMap f92175B;

        /* renamed from: a */
        private final C34927u5 f92176a;

        /* renamed from: b */
        private final String f92177b;

        /* renamed from: c */
        private String f92178c;

        /* renamed from: d */
        private Integer f92179d;

        /* renamed from: e */
        private Boolean f92180e;

        /* renamed from: f */
        private Boolean f92181f;

        /* renamed from: g */
        private Location f92182g;

        /* renamed from: h */
        private Boolean f92183h;

        /* renamed from: i */
        private Boolean f92184i;

        /* renamed from: j */
        private PreloadInfo f92185j;

        /* renamed from: k */
        private Boolean f92186k;

        /* renamed from: l */
        private Boolean f92187l;

        /* renamed from: m */
        private Integer f92188m;

        /* renamed from: n */
        private final LinkedHashMap f92189n;

        /* renamed from: o */
        private String f92190o;

        /* renamed from: p */
        private Boolean f92191p;

        /* renamed from: q */
        private Boolean f92192q;

        /* renamed from: r */
        private Boolean f92193r;

        /* renamed from: s */
        private String f92194s;

        /* renamed from: t */
        private Integer f92195t;

        /* renamed from: u */
        private Integer f92196u;

        /* renamed from: v */
        private Integer f92197v;

        /* renamed from: w */
        private final LinkedHashMap f92198w;

        /* renamed from: x */
        private ICrashTransformer f92199x;

        /* renamed from: y */
        private Boolean f92200y;

        /* renamed from: z */
        private Integer f92201z;

        /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        @NonNull
        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        @NonNull
        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.f92186k = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, @Nullable Object obj) {
            this.f92175B.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoring(boolean z) {
            this.f92200y = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoringTimeout(int i) {
            this.f92201z = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withAppBuildNumber(int i) {
            if (i >= 0) {
                this.f92195t = Integer.valueOf(i);
                return this;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
        }

        @NonNull
        public Builder withAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
            this.f92198w.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withAppOpenTrackingEnabled(boolean z) {
            this.f92193r = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withAppVersion(@Nullable String str) {
            this.f92178c = str;
            return this;
        }

        @NonNull
        public Builder withCrashReporting(boolean z) {
            this.f92180e = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withCrashTransformer(@Nullable ICrashTransformer iCrashTransformer) {
            this.f92199x = iCrashTransformer;
            return this;
        }

        @NonNull
        public Builder withCustomHosts(@NonNull List<String> list) {
            this.f92174A = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z) {
            this.f92187l = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withDeviceType(@Nullable String str) {
            this.f92194s = str;
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i) {
            this.f92196u = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
            this.f92189n.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withLocation(@Nullable Location location) {
            this.f92182g = location;
            return this;
        }

        @NonNull
        public Builder withLocationTracking(boolean z) {
            this.f92183h = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f92184i = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i) {
            this.f92197v = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f92188m = Integer.valueOf(this.f92176a.m20921a(i));
            return this;
        }

        @NonNull
        public Builder withNativeCrashReporting(boolean z) {
            this.f92181f = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withPreloadInfo(@Nullable PreloadInfo preloadInfo) {
            this.f92185j = preloadInfo;
            return this;
        }

        @NonNull
        public Builder withRevenueAutoTrackingEnabled(boolean z) {
            this.f92191p = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i) {
            this.f92179d = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withSessionsAutoTrackingEnabled(boolean z) {
            this.f92192q = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f92190o = str;
            return this;
        }

        private Builder(String str) {
            this.f92189n = new LinkedHashMap();
            this.f92198w = new LinkedHashMap();
            this.f92175B = new HashMap();
            f92173C.mo20778a(str);
            this.f92176a = new C34927u5(str);
            this.f92177b = str;
        }
    }

    /* synthetic */ AppMetricaConfig(Builder builder, int i) {
        this(builder);
    }

    @Nullable
    public static AppMetricaConfig fromJson(String str) {
        AppMetricaConfig appMetricaConfig;
        HashMap m21876c;
        HashMap m21876c2;
        HashMap m21876c3;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Builder newConfigBuilder = newConfigBuilder(jSONObject.getString("apikey"));
                if (jSONObject.has("app_version")) {
                    newConfigBuilder.withAppVersion(jSONObject.optString("app_version"));
                }
                if (jSONObject.has("session_timeout")) {
                    newConfigBuilder.withSessionTimeout(jSONObject.getInt("session_timeout"));
                }
                newConfigBuilder.withLocation(AbstractC34341Y3.m22080a(jSONObject.optString("location")));
                newConfigBuilder.withPreloadInfo(AbstractC34341Y3.m22079b(jSONObject.optString("preload_info")));
                if (jSONObject.has("logs") && jSONObject.optBoolean("logs")) {
                    newConfigBuilder.withLogs();
                }
                if (jSONObject.has("crash_enabled")) {
                    newConfigBuilder.withCrashReporting(jSONObject.optBoolean("crash_enabled"));
                }
                if (jSONObject.has("crash_native_enabled")) {
                    newConfigBuilder.withNativeCrashReporting(jSONObject.optBoolean("crash_native_enabled"));
                }
                if (jSONObject.has("location_enabled")) {
                    newConfigBuilder.withLocationTracking(jSONObject.optBoolean("location_enabled"));
                }
                if (jSONObject.has("max_reports_in_db_count")) {
                    newConfigBuilder.withMaxReportsInDatabaseCount(jSONObject.optInt("max_reports_in_db_count"));
                }
                if (jSONObject.has("error_environment") && (m21876c3 = AbstractC34451cb.m21876c(jSONObject.optString("error_environment"))) != null) {
                    for (Map.Entry entry : m21876c3.entrySet()) {
                        newConfigBuilder.withErrorEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (jSONObject.has("first_activation_as_update")) {
                    newConfigBuilder.handleFirstActivationAsUpdate(jSONObject.optBoolean("first_activation_as_update"));
                }
                if (jSONObject.has("data_sending_enabled")) {
                    newConfigBuilder.withDataSendingEnabled(jSONObject.optBoolean("data_sending_enabled"));
                }
                if (jSONObject.has("user_profile_id")) {
                    appMetricaConfig = null;
                    try {
                        newConfigBuilder.withUserProfileID(jSONObject.optString("user_profile_id", null));
                    } catch (Throwable unused) {
                    }
                } else {
                    appMetricaConfig = null;
                }
                if (jSONObject.has("revenue_auto_tracking_enabled")) {
                    newConfigBuilder.withRevenueAutoTrackingEnabled(jSONObject.optBoolean("revenue_auto_tracking_enabled"));
                }
                if (jSONObject.has("sessions_auto_tracking_enabled")) {
                    newConfigBuilder.withSessionsAutoTrackingEnabled(jSONObject.optBoolean("sessions_auto_tracking_enabled"));
                }
                if (jSONObject.has("app_open_tracking_enabled")) {
                    newConfigBuilder.withAppOpenTrackingEnabled(jSONObject.optBoolean("app_open_tracking_enabled"));
                }
                if (jSONObject.has(CommonUrlParts.DEVICE_TYPE)) {
                    newConfigBuilder.withDeviceType(jSONObject.optString(CommonUrlParts.DEVICE_TYPE));
                }
                if (jSONObject.has(CommonUrlParts.APP_VERSION_CODE)) {
                    newConfigBuilder.withAppBuildNumber(jSONObject.optInt(CommonUrlParts.APP_VERSION_CODE));
                }
                if (jSONObject.has("dispatch_period_seconds")) {
                    newConfigBuilder.withDispatchPeriodSeconds(jSONObject.optInt("dispatch_period_seconds"));
                }
                if (jSONObject.has("max_reports_count")) {
                    newConfigBuilder.withMaxReportsCount(jSONObject.optInt("max_reports_count"));
                }
                if (jSONObject.has("app_environment") && (m21876c2 = AbstractC34451cb.m21876c(jSONObject.optString("app_environment"))) != null) {
                    for (Map.Entry entry2 : m21876c2.entrySet()) {
                        newConfigBuilder.withAppEnvironmentValue((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                if (jSONObject.has("anr_monitoring")) {
                    newConfigBuilder.withAnrMonitoring(jSONObject.optBoolean("anr_monitoring"));
                }
                if (jSONObject.has("anr_monitoring_timeout")) {
                    newConfigBuilder.withAnrMonitoringTimeout(jSONObject.optInt("anr_monitoring_timeout"));
                }
                if (jSONObject.has("customHosts")) {
                    newConfigBuilder.withCustomHosts(AbstractC34451cb.m21880a(jSONObject.optJSONArray("customHosts")));
                }
                if (jSONObject.has("additional_config") && (m21876c = AbstractC34451cb.m21876c(jSONObject.optString("additional_config"))) != null) {
                    for (Map.Entry entry3 : m21876c.entrySet()) {
                        newConfigBuilder.withAdditionalConfig((String) entry3.getKey(), entry3.getValue());
                    }
                }
                return newConfigBuilder.build();
            } catch (Throwable unused2) {
            }
        }
        appMetricaConfig = null;
        return appMetricaConfig;
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081 A[Catch: all -> 0x0117, TryCatch #1 {all -> 0x0117, blocks: (B:2:0x0000, B:13:0x0053, B:17:0x0086, B:21:0x00dc, B:23:0x00f1, B:27:0x0100, B:26:0x00fb, B:28:0x0103, B:32:0x010f, B:31:0x010a, B:20:0x00d7, B:16:0x0081), top: B:38:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7 A[Catch: all -> 0x0117, TryCatch #1 {all -> 0x0117, blocks: (B:2:0x0000, B:13:0x0053, B:17:0x0086, B:21:0x00dc, B:23:0x00f1, B:27:0x0100, B:26:0x00fb, B:28:0x0103, B:32:0x010f, B:31:0x010a, B:20:0x00d7, B:16:0x0081), top: B:38:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1 A[Catch: all -> 0x0117, TryCatch #1 {all -> 0x0117, blocks: (B:2:0x0000, B:13:0x0053, B:17:0x0086, B:21:0x00dc, B:23:0x00f1, B:27:0x0100, B:26:0x00fb, B:28:0x0103, B:32:0x010f, B:31:0x010a, B:20:0x00d7, B:16:0x0081), top: B:38:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010a A[Catch: all -> 0x0117, TryCatch #1 {all -> 0x0117, blocks: (B:2:0x0000, B:13:0x0053, B:17:0x0086, B:21:0x00dc, B:23:0x00f1, B:27:0x0100, B:26:0x00fb, B:28:0x0103, B:32:0x010f, B:31:0x010a, B:20:0x00d7, B:16:0x0081), top: B:38:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toJson() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.AppMetricaConfig.toJson():java.lang.String");
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f92177b;
        this.appVersion = builder.f92178c;
        this.sessionTimeout = builder.f92179d;
        this.crashReporting = builder.f92180e;
        this.nativeCrashReporting = builder.f92181f;
        this.location = builder.f92182g;
        this.locationTracking = builder.f92183h;
        this.logs = builder.f92184i;
        this.preloadInfo = builder.f92185j;
        this.firstActivationAsUpdate = builder.f92186k;
        this.dataSendingEnabled = builder.f92187l;
        this.maxReportsInDatabaseCount = builder.f92188m;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f92189n);
        this.userProfileID = builder.f92190o;
        this.revenueAutoTrackingEnabled = builder.f92191p;
        this.sessionsAutoTrackingEnabled = builder.f92192q;
        this.appOpenTrackingEnabled = builder.f92193r;
        this.deviceType = builder.f92194s;
        this.appBuildNumber = builder.f92195t;
        this.dispatchPeriodSeconds = builder.f92196u;
        this.maxReportsCount = builder.f92197v;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f92198w);
        this.crashTransformer = builder.f92199x;
        this.anrMonitoring = builder.f92200y;
        this.anrMonitoringTimeout = builder.f92201z;
        this.customHosts = builder.f92174A;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f92175B);
    }

    protected AppMetricaConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
