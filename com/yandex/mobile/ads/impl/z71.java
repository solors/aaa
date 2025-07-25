package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class z71 implements aa2 {
    @NotNull

    /* renamed from: a */
    private final za2 f88757a;

    public z71(@NotNull m81 videoViewProvider) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        this.f88757a = new za2(videoViewProvider);
    }

    @Override // com.yandex.mobile.ads.impl.aa2
    /* renamed from: a */
    public final boolean mo26325a() {
        return this.f88757a.m26291a();
    }
}
