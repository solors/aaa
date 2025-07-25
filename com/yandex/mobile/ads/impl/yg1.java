package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class yg1 {
    @NotNull

    /* renamed from: a */
    private final m92 f88214a;

    public yg1(@NotNull m92 videoPlayerController) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        this.f88214a = videoPlayerController;
    }

    /* renamed from: a */
    public final boolean m26913a() {
        if (this.f88214a.m32063c() <= 0) {
            return true;
        }
        return false;
    }
}
