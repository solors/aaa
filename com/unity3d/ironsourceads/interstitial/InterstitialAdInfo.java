package com.unity3d.ironsourceads.interstitial;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class InterstitialAdInfo {
    @NotNull

    /* renamed from: a */
    private final String f74451a;
    @NotNull

    /* renamed from: b */
    private final String f74452b;

    public InterstitialAdInfo(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f74451a = instanceId;
        this.f74452b = adId;
    }

    @NotNull
    public final String getAdId() {
        return this.f74452b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f74451a;
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f74451a + "', adId: '" + this.f74452b + "']";
    }
}
