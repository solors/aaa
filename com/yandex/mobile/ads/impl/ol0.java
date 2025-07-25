package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ol0 {
    @NotNull

    /* renamed from: a */
    private final LinkedHashMap f83551a = new LinkedHashMap();

    @Nullable
    /* renamed from: a */
    public final rk0 m30963a(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        return (rk0) this.f83551a.get(videoAdInfo);
    }

    /* renamed from: a */
    public final void m30962a(@NotNull m62<kl0> videoAdInfo, @NotNull rk0 controlsState) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        this.f83551a.put(videoAdInfo, controlsState);
    }
}
