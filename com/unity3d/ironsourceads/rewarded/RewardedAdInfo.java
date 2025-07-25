package com.unity3d.ironsourceads.rewarded;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class RewardedAdInfo {
    @NotNull

    /* renamed from: a */
    private final String f74464a;
    @NotNull

    /* renamed from: b */
    private final String f74465b;

    public RewardedAdInfo(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f74464a = instanceId;
        this.f74465b = adId;
    }

    @NotNull
    public final String getAdId() {
        return this.f74465b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f74464a;
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f74464a + "', adId: '" + this.f74465b + "']";
    }
}
