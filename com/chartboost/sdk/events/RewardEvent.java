package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.InterfaceC9657Ad;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class RewardEvent implements AdEvent {
    @NotNull

    /* renamed from: ad */
    private final InterfaceC9657Ad f21540ad;
    @Nullable
    private final String adID;
    private final int reward;

    public RewardEvent(@Nullable String str, @NotNull InterfaceC9657Ad ad2, int i) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.adID = str;
        this.f21540ad = ad2;
        this.reward = i;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    @NotNull
    public InterfaceC9657Ad getAd() {
        return this.f21540ad;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    @Nullable
    public String getAdID() {
        return this.adID;
    }

    public final int getReward() {
        return this.reward;
    }
}
