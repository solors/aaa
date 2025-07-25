package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class vr0 {

    /* renamed from: a */
    private final int f86867a;
    @NotNull

    /* renamed from: b */
    private final wr0 f86868b;

    public vr0(int i, @NotNull wr0 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f86867a = i;
        this.f86868b = mode;
    }

    @NotNull
    /* renamed from: a */
    public final wr0 m28233a() {
        return this.f86868b;
    }

    /* renamed from: b */
    public final int m28232b() {
        return this.f86867a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr0)) {
            return false;
        }
        vr0 vr0Var = (vr0) obj;
        if (this.f86867a == vr0Var.f86867a && this.f86868b == vr0Var.f86868b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f86868b.hashCode() + (Integer.hashCode(this.f86867a) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f86867a;
        wr0 wr0Var = this.f86868b;
        return "MeasuredSizeSpec(value=" + i + ", mode=" + wr0Var + ")";
    }
}
