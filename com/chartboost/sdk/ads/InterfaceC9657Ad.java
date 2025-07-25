package com.chartboost.sdk.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.chartboost.sdk.ads.Ad */
/* loaded from: classes3.dex */
public interface InterfaceC9657Ad {
    void cache();

    void cache(@Nullable String str);

    void clearCache();

    @NotNull
    String getLocation();

    boolean isCached();

    void show();
}
