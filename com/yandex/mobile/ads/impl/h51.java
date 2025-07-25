package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h51 implements l21 {
    @NotNull

    /* renamed from: a */
    private final u90 f79957a;

    public h51(@NotNull e71 forcePausablePlayer) {
        Intrinsics.checkNotNullParameter(forcePausablePlayer, "forcePausablePlayer");
        this.f79957a = forcePausablePlayer;
    }

    @Override // com.yandex.mobile.ads.impl.l21
    /* renamed from: a */
    public final void mo32364a() {
        this.f79957a.mo28037d();
    }

    @Override // com.yandex.mobile.ads.impl.l21
    /* renamed from: b */
    public final void mo32363b() {
        this.f79957a.mo28033f();
    }
}
