package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.C18885Cb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class TimeoutConfigurations$PreloadConfig {
    @NotNull
    private TimeoutConfigurations$AdPreloadConfig audio;
    @NotNull
    private TimeoutConfigurations$AdPreloadConfig banner;
    @NotNull

    /* renamed from: int  reason: not valid java name */
    private TimeoutConfigurations$AdPreloadConfig f119456int;
    @NotNull

    /* renamed from: native  reason: not valid java name */
    private TimeoutConfigurations$AdPreloadConfig f119457native;

    public TimeoutConfigurations$PreloadConfig() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        JSONObject jSONObject8;
        JSONObject jSONObject9;
        JSONObject jSONObject10;
        JSONObject jSONObject11;
        JSONObject jSONObject12;
        JSONObject jSONObject13;
        JSONObject jSONObject14;
        JSONObject jSONObject15;
        JSONObject jSONObject16;
        JSONObject jSONObject17;
        JSONObject jSONObject18;
        JSONObject jSONObject19;
        JSONObject jSONObject20;
        C18885Cb.Companion.getClass();
        jSONObject = C18885Cb.defaultPreloadBannerPreloadTimeout;
        jSONObject2 = C18885Cb.defaultPreloadBannerMuttTimeout;
        jSONObject3 = C18885Cb.defaultPreloadBannerLoadTimeout;
        jSONObject4 = C18885Cb.defaultPreloadBannerRetryInterval;
        jSONObject5 = C18885Cb.defaultPreloadBannerMaxRetries;
        this.banner = new TimeoutConfigurations$AdPreloadConfig(jSONObject, jSONObject2, jSONObject3, jSONObject4, jSONObject5);
        jSONObject6 = C18885Cb.defaultPreloadIntPreloadTimeout;
        jSONObject7 = C18885Cb.defaultPreloadIntMuttTimeout;
        jSONObject8 = C18885Cb.defaultPreloadIntloadTimeout;
        jSONObject9 = C18885Cb.defaultPreloadIntRetryInterval;
        jSONObject10 = C18885Cb.defaultPreloadIntMaxRetries;
        this.f119456int = new TimeoutConfigurations$AdPreloadConfig(jSONObject6, jSONObject7, jSONObject8, jSONObject9, jSONObject10);
        jSONObject11 = C18885Cb.defaultPreloadNativePreloadTimeout;
        jSONObject12 = C18885Cb.defaultPreloadNativeMuttTimeout;
        jSONObject13 = C18885Cb.defaultPreloadNativeloadTimeout;
        jSONObject14 = C18885Cb.defaultPreloadNativeRetryInterval;
        jSONObject15 = C18885Cb.defaultPreloadNativeMaxRetries;
        this.f119457native = new TimeoutConfigurations$AdPreloadConfig(jSONObject11, jSONObject12, jSONObject13, jSONObject14, jSONObject15);
        jSONObject16 = C18885Cb.defaultPreloadAudioPreloadTimeout;
        jSONObject17 = C18885Cb.defaultPreloadAudioMuttTimeout;
        jSONObject18 = C18885Cb.defaultPreloadAudioloadTimeout;
        jSONObject19 = C18885Cb.defaultPreloadAudioRetryInterval;
        jSONObject20 = C18885Cb.defaultPreloadAudioMaxRetries;
        this.audio = new TimeoutConfigurations$AdPreloadConfig(jSONObject16, jSONObject17, jSONObject18, jSONObject19, jSONObject20);
    }

    @NotNull
    public final TimeoutConfigurations$AdPreloadConfig getAudio() {
        return this.audio;
    }

    @NotNull
    public final TimeoutConfigurations$AdPreloadConfig getBanner() {
        return this.banner;
    }

    @NotNull
    public final TimeoutConfigurations$AdPreloadConfig getInterstitial() {
        return this.f119456int;
    }

    @NotNull
    public final TimeoutConfigurations$AdPreloadConfig getNative() {
        return this.f119457native;
    }

    public final boolean isValid() {
        if (this.banner.isValid() && this.f119456int.isValid() && this.f119457native.isValid() && this.audio.isValid()) {
            return true;
        }
        return false;
    }
}
