package com.inmobi.commons.core.configs;

import androidx.annotation.Keep;
import com.inmobi.media.AbstractC18975J3;
import com.inmobi.media.C18932G2;
import com.inmobi.media.C18966I8;
import com.inmobi.media.C18980J8;
import com.inmobi.media.C19368m5;
import com.inmobi.media.C19520x3;
import com.inmobi.media.InterfaceC19241d4;
import com.ironsource.C20747r8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class CrashConfig extends Config {
    @NotNull
    public static final C18932G2 Companion = new C18932G2();
    public static final long DEFAULT_ANR_WATCHDOG_INTERVAL = 4500;
    public static final long DEFAULT_APP_EXIT_REASON_WAIT_INTERVAL = 1000;
    public static final double DEFAULT_APP_EXIT_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CATCH_ENABLED = false;
    public static final double DEFAULT_CATCH_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CRASH_ENABLED = true;
    public static final double DEFAULT_CRASH_SAMPLING_PERCENT = 1.0d;
    public static final long DEFAULT_EVENT_TTL_SEC = 259200;
    public static final long DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL = 30000;
    public static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    public static final int DEFAULT_MAX_BATCH_SIZE = 2;
    public static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 50;
    public static final int DEFAULT_MAX_NO_OF_LINES = 200;
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_MIN_BATCH_SIZE = 1;
    public static final long DEFAULT_PROCESSING_INTERVAL_SEC = 60;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 10;
    @NotNull
    public static final String DEFAULT_URL = "https://crash-metrics.sdk.inmobi.com/trace";
    public static final double DEFAULT_WATCHDOG_SAMPLING_PERCENT = 0.0d;
    @InterfaceC19241d4
    private final String TAG;
    @NotNull
    private ANRConfig anr;
    @NotNull
    private CatchConfig catchConfig;
    private boolean catchEnabled;
    @NotNull
    private CrashIncidentConfig crashConfig;
    private boolean crashEnabled;
    private long eventTTL;
    private int maxEventsToPersist;
    private int maxRetryCount;
    @NotNull
    private C18980J8 networkType;
    private long processingInterval;
    private long txLatency;
    @NotNull
    private String url;

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class ANRConfig {
        @NotNull
        private AppExitReasonConfig appExitReason = new AppExitReasonConfig();
        @NotNull
        private WatchDogConfig watchdog = new WatchDogConfig();

        @NotNull
        public final AppExitReasonConfig getAppExitReason() {
            return this.appExitReason;
        }

        @NotNull
        public final WatchDogConfig getWatchdog() {
            return this.watchdog;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class AppExitReasonConfig {
        private boolean enabled;
        private long incidentWaitInterval = 1000;
        private long incompleteLogThresholdTime = 30000;
        private int maxNumberOfLines = 200;
        private boolean reportToLogs;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getIncidentWaitInterval() {
            return this.incidentWaitInterval;
        }

        public final long getIncompleteLogThresholdTime() {
            return this.incompleteLogThresholdTime;
        }

        public final int getMaxNumberOfLines() {
            return this.maxNumberOfLines;
        }

        public final boolean getReportToLogs() {
            return this.reportToLogs;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class CatchConfig {
        private boolean enabled;
        private double samplingPercent;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class CrashIncidentConfig {
        private boolean enabled = true;
        private double samplingPercent = 1.0d;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class WatchDogConfig {
        private boolean enabled;
        private long interval = CrashConfig.DEFAULT_ANR_WATCHDOG_INTERVAL;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    public CrashConfig(@Nullable String str) {
        super(str);
        this.TAG = "CrashConfig";
        this.url = DEFAULT_URL;
        this.processingInterval = 60L;
        this.maxRetryCount = 3;
        this.maxEventsToPersist = 50;
        this.eventTTL = DEFAULT_EVENT_TTL_SEC;
        this.txLatency = 86400L;
        this.crashEnabled = true;
        this.networkType = new C18980J8();
        this.anr = new ANRConfig();
        this.crashConfig = new CrashIncidentConfig();
        this.catchConfig = new CatchConfig();
        setDefaultNetworkConfig();
    }

    private final void setDefaultNetworkConfig() {
        C18980J8 c18980j8 = this.networkType;
        C18966I8 c18966i8 = new C18966I8();
        c18966i8.m61039a(10L);
        c18966i8.m61035c(1);
        c18966i8.m61037b(2);
        c18980j8.getClass();
        Intrinsics.checkNotNullParameter(c18966i8, "<set-?>");
        c18980j8.wifi = c18966i8;
        C18980J8 c18980j82 = this.networkType;
        C18966I8 c18966i82 = new C18966I8();
        c18966i82.m61039a(10L);
        c18966i82.m61035c(1);
        c18966i82.m61037b(2);
        c18980j82.getClass();
        Intrinsics.checkNotNullParameter(c18966i82, "<set-?>");
        c18980j82.others = c18966i82;
    }

    @NotNull
    public final ANRConfig getANRConfig() {
        return this.anr;
    }

    @NotNull
    public final CatchConfig getCatchConfig() {
        return this.catchConfig;
    }

    @NotNull
    public final CrashIncidentConfig getCrashConfig() {
        return this.crashConfig;
    }

    @NotNull
    public final C19520x3 getEventConfig() {
        return new C19520x3(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, getWifiConfig().m61038b(), getWifiConfig().m61041a(), getMobileConfig().m61038b(), getMobileConfig().m61041a(), getWifiConfig().m61036c(), getMobileConfig().m61036c());
    }

    public final long getEventTTL() {
        return this.eventTTL;
    }

    public final int getMaxEventsToPersist() {
        return this.maxEventsToPersist;
    }

    @NotNull
    public final C18966I8 getMobileConfig() {
        C18966I8 c18966i8 = this.networkType.others;
        if (c18966i8 == null) {
            Intrinsics.m17056y("others");
            return null;
        }
        return c18966i8;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public String getType() {
        return "crashReporting";
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final C18966I8 getWifiConfig() {
        C18966I8 c18966i8 = this.networkType.wifi;
        if (c18966i8 == null) {
            Intrinsics.m17056y(C20747r8.f52730b);
            return null;
        }
        return c18966i8;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        if (AbstractC18975J3.m60997a(this.url)) {
            return false;
        }
        long j = this.txLatency;
        if (j < this.processingInterval || j > this.eventTTL) {
            return false;
        }
        C18980J8 c18980j8 = this.networkType;
        int i = this.maxEventsToPersist;
        C18966I8 c18966i8 = c18980j8.wifi;
        C18966I8 c18966i82 = null;
        if (c18966i8 == null) {
            Intrinsics.m17056y(C20747r8.f52730b);
            c18966i8 = null;
        }
        if (!c18966i8.m61040a(i)) {
            return false;
        }
        C18966I8 c18966i83 = c18980j8.others;
        if (c18966i83 != null) {
            c18966i82 = c18966i83;
        } else {
            Intrinsics.m17056y("others");
        }
        if (!c18966i82.m61040a(i) || this.processingInterval <= 0 || this.maxRetryCount < 0 || this.txLatency <= 0 || this.eventTTL <= 0 || this.maxEventsToPersist <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject m60031a = new C19368m5().m60031a(this);
        if (m60031a == null) {
            String TAG = this.TAG;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return new JSONObject();
        }
        return m60031a;
    }
}
