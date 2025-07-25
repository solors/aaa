package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ye1 {
    @NotNull

    /* renamed from: a */
    private final p40 f88183a;
    @Nullable

    /* renamed from: b */
    private Float f88184b;

    public ye1(@NotNull p40 playerProvider) {
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f88183a = playerProvider;
    }

    /* renamed from: a */
    public final void m26937a(float f) {
        if (this.f88184b == null) {
            this.f88184b = m26938a();
        }
        Player m30841a = this.f88183a.m30841a();
        if (m30841a == null) {
            return;
        }
        m30841a.setVolume(f);
    }

    /* renamed from: b */
    public final void m26936b() {
        Float f = this.f88184b;
        if (f != null) {
            float floatValue = f.floatValue();
            Player m30841a = this.f88183a.m30841a();
            if (m30841a != null) {
                m30841a.setVolume(floatValue);
            }
        }
        this.f88184b = null;
    }

    @Nullable
    /* renamed from: a */
    public final Float m26938a() {
        Player m30841a = this.f88183a.m30841a();
        if (m30841a != null) {
            return Float.valueOf(m30841a.getVolume());
        }
        return null;
    }
}
