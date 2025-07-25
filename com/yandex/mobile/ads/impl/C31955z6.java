package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.z6 */
/* loaded from: classes8.dex */
public final class C31955z6 {
    @NotNull
    /* renamed from: a */
    public static AdQualityVerifierAdapterConfiguration m26339a(@NotNull C31427t6 sdkAdQualityConfiguration) {
        Intrinsics.checkNotNullParameter(sdkAdQualityConfiguration, "sdkAdQualityConfiguration");
        return new AdQualityVerifierAdapterConfiguration(sdkAdQualityConfiguration.m29279b(), sdkAdQualityConfiguration.m29273h(), sdkAdQualityConfiguration.m29277d());
    }
}
