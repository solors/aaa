package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.InterfaceC9657Ad;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ShowEvent implements AdEvent {
    @NotNull

    /* renamed from: ad */
    private final InterfaceC9657Ad f21541ad;
    @Nullable
    private final String adID;

    public ShowEvent(@Nullable String str, @NotNull InterfaceC9657Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.adID = str;
        this.f21541ad = ad2;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    @NotNull
    public InterfaceC9657Ad getAd() {
        return this.f21541ad;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    @Nullable
    public String getAdID() {
        return this.adID;
    }
}
