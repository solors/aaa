package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.C18885Cb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class TimeoutConfigurations$NonABConfig {
    @NotNull
    private TimeoutConfigurations$AdNonABConfig audio;
    @NotNull
    private TimeoutConfigurations$AdNonABConfig banner;
    @NotNull

    /* renamed from: int  reason: not valid java name */
    private TimeoutConfigurations$AdNonABConfig f119454int;
    @NotNull

    /* renamed from: native  reason: not valid java name */
    private TimeoutConfigurations$AdNonABConfig f119455native;

    public TimeoutConfigurations$NonABConfig() {
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
        C18885Cb.Companion.getClass();
        jSONObject = C18885Cb.defaultNonABBannerloadTimeout;
        jSONObject2 = C18885Cb.defaultNonABBannerMuttTimeout;
        jSONObject3 = C18885Cb.defaultNonABBannerRetryInterval;
        jSONObject4 = C18885Cb.defaultNonABBannerMaxRetries;
        this.banner = new TimeoutConfigurations$AdNonABConfig(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        jSONObject5 = C18885Cb.defaultNonABIntloadTimeout;
        jSONObject6 = C18885Cb.defaultNonABIntMuttTimeout;
        jSONObject7 = C18885Cb.defaultNonABIntRetryInterval;
        jSONObject8 = C18885Cb.defaultNonABIntMaxRetries;
        this.f119454int = new TimeoutConfigurations$AdNonABConfig(jSONObject5, jSONObject6, jSONObject7, jSONObject8);
        jSONObject9 = C18885Cb.defaultNonABNativeloadTimeout;
        jSONObject10 = C18885Cb.defaultNonABNativeMuttTimeout;
        jSONObject11 = C18885Cb.defaultNonABNativeRetryInterval;
        jSONObject12 = C18885Cb.defaultNonABNativeMaxRetries;
        this.f119455native = new TimeoutConfigurations$AdNonABConfig(jSONObject9, jSONObject10, jSONObject11, jSONObject12);
        jSONObject13 = C18885Cb.defaultNonABAudioloadTimeout;
        jSONObject14 = C18885Cb.defaultNonABAudioMuttTimeout;
        jSONObject15 = C18885Cb.defaultNonABAudioRetryInterval;
        jSONObject16 = C18885Cb.defaultNonABAudioMaxRetries;
        this.audio = new TimeoutConfigurations$AdNonABConfig(jSONObject13, jSONObject14, jSONObject15, jSONObject16);
    }

    @NotNull
    public final TimeoutConfigurations$AdNonABConfig getAudio() {
        return this.audio;
    }

    @NotNull
    public final TimeoutConfigurations$AdNonABConfig getBanner() {
        return this.banner;
    }

    @NotNull
    public final TimeoutConfigurations$AdNonABConfig getInterstitial() {
        return this.f119454int;
    }

    @NotNull
    public final TimeoutConfigurations$AdNonABConfig getNative() {
        return this.f119455native;
    }

    public final boolean isValid() {
        if (this.banner.isValid() && this.f119454int.isValid() && this.f119455native.isValid() && this.audio.isValid()) {
            return true;
        }
        return false;
    }
}
