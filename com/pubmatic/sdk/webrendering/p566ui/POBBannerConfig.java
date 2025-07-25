package com.pubmatic.sdk.webrendering.p566ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.DTBAdLoader;
import com.pubmatic.sdk.common.log.POBLog;
import org.json.JSONObject;

/* renamed from: com.pubmatic.sdk.webrendering.ui.POBBannerConfig */
/* loaded from: classes7.dex */
public class POBBannerConfig {

    /* renamed from: a */
    private final int f71251a;

    /* renamed from: b */
    private final boolean f71252b;

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBBannerConfig$ConfigBuilder */
    /* loaded from: classes7.dex */
    public static class ConfigBuilder {

        /* renamed from: a */
        private boolean f71253a = false;

        /* renamed from: b */
        private int f71254b = 5;

        @NonNull
        public static POBBannerConfig createBannerConfig(@Nullable JSONObject jSONObject, @NonNull String str) {
            ConfigBuilder configBuilder = new ConfigBuilder();
            if (jSONObject != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject("ext");
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("banner");
                    if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                        POBLog.info("ConfigBuilder", "Banner config: " + optJSONObject2, new Object[0]);
                        JSONObject optJSONObject3 = optJSONObject2.optJSONObject("clientconfig");
                        if (optJSONObject3 != null) {
                            configBuilder.setSkipAfter(optJSONObject3.optInt(DTBAdLoader.APS_VIDEO_SKIP_AFTER, 5));
                            if ("interstitial".equals(str)) {
                                configBuilder.setBackButtonEnabled(optJSONObject3.optBoolean("enablehardwarebackbutton", false));
                            }
                        }
                    } else {
                        POBLog.warn("ConfigBuilder", "Null/empty banner response parameter.", new Object[0]);
                    }
                } else {
                    POBLog.warn("ConfigBuilder", "Null/empty extension response parameter.", new Object[0]);
                }
            }
            return configBuilder.build();
        }

        public POBBannerConfig build() {
            return new POBBannerConfig(this);
        }

        public ConfigBuilder setBackButtonEnabled(boolean z) {
            this.f71253a = z;
            return this;
        }

        public ConfigBuilder setSkipAfter(int i) {
            this.f71254b = i;
            return this;
        }
    }

    public int getSkipAfter() {
        return this.f71251a;
    }

    public boolean isBackButtonEnabled() {
        return this.f71252b;
    }

    private POBBannerConfig(@NonNull ConfigBuilder configBuilder) {
        this.f71251a = configBuilder.f71254b;
        this.f71252b = configBuilder.f71253a;
    }
}
