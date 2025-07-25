package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.InterfaceC9657Ad;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface AdEvent {
    @NotNull
    InterfaceC9657Ad getAd();

    @Nullable
    String getAdID();
}
