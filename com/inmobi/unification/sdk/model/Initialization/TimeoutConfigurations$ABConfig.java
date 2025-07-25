package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.C18885Cb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class TimeoutConfigurations$ABConfig {
    @NotNull
    private TimeoutConfigurations$AdABConfig audio;
    @NotNull
    private TimeoutConfigurations$AdABConfig banner;
    @NotNull

    /* renamed from: int  reason: not valid java name */
    private TimeoutConfigurations$AdABConfig f119452int;
    @NotNull

    /* renamed from: native  reason: not valid java name */
    private TimeoutConfigurations$AdABConfig f119453native;

    public TimeoutConfigurations$ABConfig() {
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
        C18885Cb.Companion.getClass();
        jSONObject = C18885Cb.defaultABBannerloadTimeout;
        jSONObject2 = C18885Cb.defaultABBannerRetryInterval;
        jSONObject3 = C18885Cb.defaultABBannerMaxRetries;
        this.banner = new TimeoutConfigurations$AdABConfig(jSONObject, jSONObject2, jSONObject3);
        jSONObject4 = C18885Cb.defaultABIntloadTimeout;
        jSONObject5 = C18885Cb.defaultABIntRetryInterval;
        jSONObject6 = C18885Cb.defaultABIntMaxRetries;
        this.f119452int = new TimeoutConfigurations$AdABConfig(jSONObject4, jSONObject5, jSONObject6);
        jSONObject7 = C18885Cb.defaultABNativeloadTimeout;
        jSONObject8 = C18885Cb.defaultABNativeRetryInterval;
        jSONObject9 = C18885Cb.defaultABNativeMaxRetries;
        this.f119453native = new TimeoutConfigurations$AdABConfig(jSONObject7, jSONObject8, jSONObject9);
        jSONObject10 = C18885Cb.defaultABAudioloadTimeout;
        jSONObject11 = C18885Cb.defaultABAudioRetryInterval;
        jSONObject12 = C18885Cb.defaultABAudioMaxRetries;
        this.audio = new TimeoutConfigurations$AdABConfig(jSONObject10, jSONObject11, jSONObject12);
    }

    @NotNull
    public final TimeoutConfigurations$AdABConfig getAudio() {
        return this.audio;
    }

    @NotNull
    public final TimeoutConfigurations$AdABConfig getBanner() {
        return this.banner;
    }

    @NotNull
    public final TimeoutConfigurations$AdABConfig getInterstitial() {
        return this.f119452int;
    }

    @NotNull
    public final TimeoutConfigurations$AdABConfig getNative() {
        return this.f119453native;
    }

    public final boolean isValid() {
        if (this.banner.isValid() && this.f119452int.isValid() && this.f119453native.isValid() && this.audio.isValid()) {
            return true;
        }
        return false;
    }
}
