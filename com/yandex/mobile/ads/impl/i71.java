package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class i71 {
    @NotNull

    /* renamed from: a */
    private final e71 f80354a;

    public i71(@NotNull e71 videoAdPlayer) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        this.f80354a = videoAdPlayer;
    }

    /* renamed from: a */
    public final void m33356a(@Nullable Double d) {
        double d2;
        if (d != null) {
            d2 = d.doubleValue();
        } else {
            d2 = 0.0d;
        }
        this.f80354a.setVolume((float) d2);
    }
}
