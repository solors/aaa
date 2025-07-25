package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class he1 {
    @NotNull

    /* renamed from: a */
    private final o40 f80047a;

    public he1(@NotNull o40 playerProvider) {
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f80047a = playerProvider;
    }

    /* renamed from: a */
    public final void m33571a() {
        Player m31184a = this.f80047a.m31184a();
        if (m31184a != null) {
            m31184a.setPlayWhenReady(false);
        }
    }

    /* renamed from: b */
    public final void m33570b() {
        Player m31184a = this.f80047a.m31184a();
        if (m31184a != null) {
            m31184a.setPlayWhenReady(true);
        }
    }
}
