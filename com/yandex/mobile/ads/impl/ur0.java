package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ur0 {
    @NotNull

    /* renamed from: a */
    private final vr0 f86390a;
    @NotNull

    /* renamed from: b */
    private final vr0 f86391b;

    public ur0(@NotNull vr0 width, @NotNull vr0 height) {
        Intrinsics.checkNotNullParameter(width, "width");
        Intrinsics.checkNotNullParameter(height, "height");
        this.f86390a = width;
        this.f86391b = height;
    }

    @NotNull
    /* renamed from: a */
    public final vr0 m28685a() {
        return this.f86391b;
    }

    @NotNull
    /* renamed from: b */
    public final vr0 m28684b() {
        return this.f86390a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur0)) {
            return false;
        }
        ur0 ur0Var = (ur0) obj;
        if (Intrinsics.m17075f(this.f86390a, ur0Var.f86390a) && Intrinsics.m17075f(this.f86391b, ur0Var.f86391b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f86391b.hashCode() + (this.f86390a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        vr0 vr0Var = this.f86390a;
        vr0 vr0Var2 = this.f86391b;
        return "MeasuredSize(width=" + vr0Var + ", height=" + vr0Var2 + ")";
    }
}
