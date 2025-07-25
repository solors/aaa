package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ie1 {
    @NotNull

    /* renamed from: a */
    private final p40 f80439a;

    public ie1(@NotNull p40 playerProvider) {
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f80439a = playerProvider;
    }

    /* renamed from: a */
    public final void m33287a() {
        Player m30841a = this.f80439a.m30841a();
        if (m30841a != null) {
            m30841a.setPlayWhenReady(false);
        }
    }

    /* renamed from: b */
    public final void m33286b() {
        Player m30841a = this.f80439a.m30841a();
        if (m30841a != null) {
            m30841a.setPlayWhenReady(true);
        }
    }
}
