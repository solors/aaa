package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class xe1 {
    @NotNull

    /* renamed from: a */
    private final o40 f87661a;
    @Nullable

    /* renamed from: b */
    private Float f87662b;

    public xe1(@NotNull o40 playerProvider) {
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f87661a = playerProvider;
    }

    /* renamed from: a */
    public final void m27545a(float f) {
        if (this.f87662b == null) {
            this.f87662b = m27546a();
        }
        Player m31184a = this.f87661a.m31184a();
        if (m31184a == null) {
            return;
        }
        m31184a.setVolume(f);
    }

    /* renamed from: b */
    public final void m27544b() {
        Float f = this.f87662b;
        if (f != null) {
            float floatValue = f.floatValue();
            Player m31184a = this.f87661a.m31184a();
            if (m31184a != null) {
                m31184a.setVolume(floatValue);
            }
        }
        this.f87662b = null;
    }

    @Nullable
    /* renamed from: a */
    public final Float m27546a() {
        Player m31184a = this.f87661a.m31184a();
        if (m31184a != null) {
            return Float.valueOf(m31184a.getVolume());
        }
        return null;
    }
}
