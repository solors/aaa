package com.inmobi.media;

import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$MediationConfig;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.Cb */
/* loaded from: classes6.dex */
public final class C18885Cb implements Serializable {
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int DEFAULT_AB_AUDIO_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_BANNER_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_AB_NATIVE_LOAD_TIMEOUT = 14500;
    @NotNull
    private static final String DEFAULT_KEY = "default";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_NONAB_AUDIO_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_AUDIO_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_TIMEOUT = 15000;
    @NotNull
    public static final C18857Ab Companion = new C18857Ab();
    @NotNull
    private static final String APPLOVIN_KEY = "c_applovin";
    @NotNull
    private static final JSONObject defaultNonABBannerloadTimeout = AbstractC18953H9.m61086a("default", 29500, APPLOVIN_KEY, 9500);
    @NotNull
    private static final JSONObject defaultNonABBannerMuttTimeout = AbstractC18953H9.m61086a("default", 29500, APPLOVIN_KEY, 9500);
    @NotNull
    private static final JSONObject defaultNonABBannerMaxRetries = AbstractC18953H9.m61086a("default", 3, APPLOVIN_KEY, 3);
    @NotNull
    private static final JSONObject defaultNonABBannerRetryInterval = AbstractC18953H9.m61086a("default", 1000, APPLOVIN_KEY, 1000);
    @NotNull
    private static final JSONObject defaultNonABIntloadTimeout = AbstractC18953H9.m61086a("default", 29500, APPLOVIN_KEY, 14500);
    @NotNull
    private static final JSONObject defaultNonABIntMuttTimeout = AbstractC18953H9.m61086a("default", 29500, APPLOVIN_KEY, 14500);
    @NotNull
    private static final JSONObject defaultNonABIntMaxRetries = AbstractC18953H9.m61086a("default", 3, APPLOVIN_KEY, 3);
    @NotNull
    private static final JSONObject defaultNonABIntRetryInterval = AbstractC18953H9.m61086a("default", 1000, APPLOVIN_KEY, 1000);
    @NotNull
    private static final JSONObject defaultNonABNativeloadTimeout = AbstractC18953H9.m61086a("default", 29500, APPLOVIN_KEY, 14500);
    @NotNull
    private static final JSONObject defaultNonABNativeMuttTimeout = AbstractC18953H9.m61086a("default", 29500, APPLOVIN_KEY, 14500);
    @NotNull
    private static final JSONObject defaultNonABNativeMaxRetries = AbstractC18953H9.m61086a("default", 3, APPLOVIN_KEY, 3);
    @NotNull
    private static final JSONObject defaultNonABNativeRetryInterval = AbstractC18953H9.m61086a("default", 1000, APPLOVIN_KEY, 1000);
    @NotNull
    private static final JSONObject defaultNonABAudioloadTimeout = AbstractC18953H9.m61086a("default", 29500, APPLOVIN_KEY, 9500);
    @NotNull
    private static final JSONObject defaultNonABAudioMuttTimeout = AbstractC18953H9.m61086a("default", 29500, APPLOVIN_KEY, 9500);
    @NotNull
    private static final JSONObject defaultNonABAudioMaxRetries = AbstractC18953H9.m61086a("default", 3, APPLOVIN_KEY, 3);
    @NotNull
    private static final JSONObject defaultNonABAudioRetryInterval = AbstractC18953H9.m61086a("default", 1000, APPLOVIN_KEY, 1000);
    @NotNull
    private static final JSONObject defaultABBannerloadTimeout = AbstractC18953H9.m61086a("default", 14500, APPLOVIN_KEY, 9500);
    @NotNull
    private static final JSONObject defaultABBannerMaxRetries = AbstractC18953H9.m61086a("default", 3, APPLOVIN_KEY, 3);
    @NotNull
    private static final JSONObject defaultABBannerRetryInterval = AbstractC18953H9.m61086a("default", 1000, APPLOVIN_KEY, 1000);
    @NotNull
    private static final JSONObject defaultABIntloadTimeout = AbstractC18953H9.m61086a("default", 29500, APPLOVIN_KEY, 29500);
    @NotNull
    private static final JSONObject defaultABIntMaxRetries = AbstractC18953H9.m61086a("default", 3, APPLOVIN_KEY, 3);
    @NotNull
    private static final JSONObject defaultABIntRetryInterval = AbstractC18953H9.m61086a("default", 1000, APPLOVIN_KEY, 1000);
    @NotNull
    private static final JSONObject defaultABNativeloadTimeout = AbstractC18953H9.m61086a("default", 14500, APPLOVIN_KEY, 14500);
    @NotNull
    private static final JSONObject defaultABNativeMaxRetries = AbstractC18953H9.m61086a("default", 3, APPLOVIN_KEY, 3);
    @NotNull
    private static final JSONObject defaultABNativeRetryInterval = AbstractC18953H9.m61086a("default", 1000, APPLOVIN_KEY, 1000);
    @NotNull
    private static final JSONObject defaultABAudioloadTimeout = AbstractC18953H9.m61086a("default", 14500, APPLOVIN_KEY, 9500);
    @NotNull
    private static final JSONObject defaultABAudioMaxRetries = AbstractC18953H9.m61086a("default", 3, APPLOVIN_KEY, 3);
    @NotNull
    private static final JSONObject defaultABAudioRetryInterval = AbstractC18953H9.m61086a("default", 1000, APPLOVIN_KEY, 1000);
    @NotNull
    private static final JSONObject defaultPreloadBannerPreloadTimeout = AbstractC19542yb.m59533a("default", 29500);
    @NotNull
    private static final JSONObject defaultPreloadBannerMuttTimeout = AbstractC19542yb.m59533a("default", 29500);
    @NotNull
    private static final JSONObject defaultPreloadBannerLoadTimeout = AbstractC19542yb.m59533a("default", 14500);
    @NotNull
    private static final JSONObject defaultPreloadBannerMaxRetries = AbstractC19542yb.m59533a("default", 3);
    @NotNull
    private static final JSONObject defaultPreloadBannerRetryInterval = AbstractC19542yb.m59533a("default", 1000);
    @NotNull
    private static final JSONObject defaultPreloadIntPreloadTimeout = AbstractC19542yb.m59533a("default", 29500);
    @NotNull
    private static final JSONObject defaultPreloadIntMuttTimeout = AbstractC19542yb.m59533a("default", 29500);
    @NotNull
    private static final JSONObject defaultPreloadIntloadTimeout = AbstractC19542yb.m59533a("default", 29500);
    @NotNull
    private static final JSONObject defaultPreloadIntMaxRetries = AbstractC19542yb.m59533a("default", 3);
    @NotNull
    private static final JSONObject defaultPreloadIntRetryInterval = AbstractC19542yb.m59533a("default", 1000);
    @NotNull
    private static final JSONObject defaultPreloadNativePreloadTimeout = AbstractC19542yb.m59533a("default", 29500);
    @NotNull
    private static final JSONObject defaultPreloadNativeMuttTimeout = AbstractC19542yb.m59533a("default", 29500);
    @NotNull
    private static final JSONObject defaultPreloadNativeloadTimeout = AbstractC19542yb.m59533a("default", 14500);
    @NotNull
    private static final JSONObject defaultPreloadNativeMaxRetries = AbstractC19542yb.m59533a("default", 3);
    @NotNull
    private static final JSONObject defaultPreloadNativeRetryInterval = AbstractC19542yb.m59533a("default", 1000);
    @NotNull
    private static final JSONObject defaultPreloadAudioPreloadTimeout = AbstractC19542yb.m59533a("default", 29500);
    @NotNull
    private static final JSONObject defaultPreloadAudioMuttTimeout = AbstractC19542yb.m59533a("default", 29500);
    @NotNull
    private static final JSONObject defaultPreloadAudioloadTimeout = AbstractC19542yb.m59533a("default", 14500);
    @NotNull
    private static final JSONObject defaultPreloadAudioMaxRetries = AbstractC19542yb.m59533a("default", 3);
    @NotNull
    private static final JSONObject defaultPreloadAudioRetryInterval = AbstractC19542yb.m59533a("default", 1000);
    @NotNull
    private static final Function2<JSONObject, Integer, Boolean> validator = C19556zb.f48970a;
    private int step4s = 15000;
    @NotNull
    private TimeoutConfigurations$MediationConfig mediationConfig = new TimeoutConfigurations$MediationConfig();

    @NotNull
    /* renamed from: X */
    public final TimeoutConfigurations$MediationConfig m61201X() {
        return this.mediationConfig;
    }

    /* renamed from: Y */
    public final int m61200Y() {
        return this.step4s;
    }

    /* renamed from: Z */
    public final boolean m61199Z() {
        if (m61200Y() >= 0 && this.mediationConfig.isValid()) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public final void m61197a0() {
        int i = this.step4s;
        if (i <= 0) {
            i = 15000;
        }
        this.step4s = i;
    }
}
