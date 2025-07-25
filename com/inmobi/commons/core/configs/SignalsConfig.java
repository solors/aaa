package com.inmobi.commons.core.configs;

import android.webkit.URLUtil;
import androidx.annotation.Keep;
import com.inmobi.media.InterfaceC19241d4;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class SignalsConfig extends Config {
    @NotNull
    public static final C18844f Companion = new C18844f();
    @InterfaceC19241d4
    private final String TAG;
    @Nullable
    private JSONObject ext;
    @NotNull
    private IceConfig ice;
    @NotNull

    /* renamed from: kA */
    private String f47067kA;
    @NotNull
    private NovatiqConfig novatiqConfig;
    @NotNull
    private PublisherConfig publisher;
    @NotNull
    private SessionConfig session;
    @NotNull
    private UnifiedIdServiceConfig unifiedIdServiceConfig;
    private int vAK;

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class CellIceConfig {
        private boolean cce;
        private int cof;
        private boolean vce;

        public final boolean getCce() {
            return this.cce;
        }

        public final int getCof() {
            return this.cof;
        }

        public final boolean getVce() {
            return this.vce;
        }

        public final void setCce(boolean z) {
            this.cce = z;
        }

        public final void setCof(int i) {
            this.cof = i;
        }

        public final void setVce(boolean z) {
            this.vce = z;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class IceConfig {
        private boolean locationEnabled;
        private boolean sessionEnabled;
        private int sampleInterval = 300;
        private int stopRequestTimeout = 3;
        @NotNull

        /* renamed from: w */
        private WifiIceConfig f47069w = new WifiIceConfig();
        @NotNull

        /* renamed from: c */
        private CellIceConfig f47068c = new CellIceConfig();

        public final int getCellOperatorFlag() {
            return this.f47068c.getCof();
        }

        public final int getSampleInterval() {
            return this.sampleInterval;
        }

        public final int getStopRequestTimeout() {
            return this.stopRequestTimeout;
        }

        public final int getWifiFlag() {
            return this.f47069w.getWf();
        }

        public final boolean isConnectedCellTowerEnabled() {
            return this.f47068c.getCce();
        }

        public final boolean isConnectedWifiEnabled() {
            return this.f47069w.getCwe();
        }

        public final boolean isLocationEnabled() {
            return this.locationEnabled;
        }

        public final boolean isSessionEnabled() {
            return this.sessionEnabled;
        }

        public final boolean isValid() {
            if (getSampleInterval() >= 0 && getStopRequestTimeout() >= 0 && getWifiFlag() >= 0 && getCellOperatorFlag() >= 0) {
                return true;
            }
            return false;
        }

        public final boolean isVisibleCellTowerEnabled() {
            return this.f47068c.getVce();
        }

        public final boolean isVisibleWifiEnabled() {
            return this.f47069w.getVwe();
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class NovatiqConfig {
        @NotNull
        private String beaconUrl;
        @NotNull
        private List<String> carrierNames;
        private boolean isNovatiqEnabled = true;

        public NovatiqConfig() {
            List<String> m17166m;
            m17166m = C37563v.m17166m();
            this.carrierNames = m17166m;
            this.beaconUrl = "https://spadsync.com/sync";
        }

        @NotNull
        public final String getBeaconUrl() {
            return this.beaconUrl;
        }

        @NotNull
        public final List<String> getCarrierNames() {
            return this.carrierNames;
        }

        public final boolean isNovatiqEnabled() {
            return this.isNovatiqEnabled;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class PublisherConfig {
        private final boolean enableAB;
        private final boolean enableMCO;
        @NotNull
        private final Map<String, String> generalKeys = new LinkedHashMap();
        @NotNull
        private final Map<String, String> adSpecificKeys = new LinkedHashMap();
        private final int payloadSize = 1500;

        @NotNull
        public final Map<String, String> getAdSpecificKeys() {
            return this.adSpecificKeys;
        }

        public final boolean getEnableAB() {
            return this.enableAB;
        }

        public final boolean getEnableMCO() {
            return this.enableMCO;
        }

        @NotNull
        public final Map<String, String> getGeneralKeys() {
            return this.generalKeys;
        }

        public final int getPayloadSize() {
            return this.payloadSize;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class SessionConfig {
        @NotNull
        private List<Integer> control;

        public SessionConfig() {
            List<Integer> m17163p;
            m17163p = C37563v.m17163p(0, 1, 2, 3, 4, 5, 6);
            this.control = m17163p;
        }

        @NotNull
        public final List<Integer> getSigControlList() {
            return this.control;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class UnifiedIdServiceConfig {
        private boolean enabled;
        private int maxRetries;
        private int retryInterval;
        @NotNull
        private String url = "https://unif-id.ssp.inmobi.com/fetch";
        private int timeout = 10;

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final boolean isEnabled() {
            return this.enabled;
        }

        public final boolean isValid() {
            if (URLUtil.isValidUrl(this.url) && this.maxRetries >= 0 && this.timeout >= 0 && this.retryInterval >= 0) {
                return true;
            }
            return false;
        }

        public final void setMaxRetries(int i) {
            this.maxRetries = i;
        }

        public final void setRetryInterval(int i) {
            this.retryInterval = i;
        }

        public final void setTimeout(int i) {
            this.timeout = i;
        }

        public final void setUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.url = str;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class WifiIceConfig {
        private boolean cwe;
        private boolean vwe;

        /* renamed from: wf */
        private int f47070wf;

        public final boolean getCwe() {
            return this.cwe;
        }

        public final boolean getVwe() {
            return this.vwe;
        }

        public final int getWf() {
            return this.f47070wf;
        }

        public final void setCwe(boolean z) {
            this.cwe = z;
        }

        public final void setVwe(boolean z) {
            this.vwe = z;
        }

        public final void setWf(int i) {
            this.f47070wf = i;
        }
    }

    public SignalsConfig(@Nullable String str) {
        super(str);
        this.TAG = "SignalsConfig";
        this.ice = new IceConfig();
        this.unifiedIdServiceConfig = new UnifiedIdServiceConfig();
        this.novatiqConfig = new NovatiqConfig();
        this.session = new SessionConfig();
        this.publisher = new PublisherConfig();
        this.f47067kA = "wWFMAWbSEtvl5VxZbQGMK7";
        this.vAK = 1;
    }

    @NotNull
    public final String getAK() {
        return this.f47067kA;
    }

    public final int getAKV() {
        return this.vAK;
    }

    @Nullable
    public final JSONObject getExt() {
        return this.ext;
    }

    @NotNull
    public final IceConfig getIceConfig() {
        return this.ice;
    }

    @NotNull
    public final NovatiqConfig getNovatiqConfig() {
        return this.novatiqConfig;
    }

    @NotNull
    public final PublisherConfig getPublisherConfig() {
        return this.publisher;
    }

    @NotNull
    public final SessionConfig getSessionConfig() {
        return this.session;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public String getType() {
        return "signals";
    }

    @NotNull
    public final UnifiedIdServiceConfig getUnifiedIdServiceConfig() {
        return this.unifiedIdServiceConfig;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        if (this.ice.isValid() && this.unifiedIdServiceConfig.isValid()) {
            return true;
        }
        return false;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject m60031a = C18844f.m61279a().m60031a(this);
        if (m60031a == null) {
            String TAG = this.TAG;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return new JSONObject();
        }
        return m60031a;
    }
}
