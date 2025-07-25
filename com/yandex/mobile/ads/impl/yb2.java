package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class yb2 {
    @NotNull

    /* renamed from: a */
    private final String f88140a;

    /* renamed from: b */
    private final int f88141b;

    public yb2(int i, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f88140a = adUnitId;
        this.f88141b = i;
    }

    @NotNull
    /* renamed from: a */
    public final String m26970a() {
        return this.f88140a;
    }

    /* renamed from: b */
    public final int m26969b() {
        return this.f88141b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb2)) {
            return false;
        }
        yb2 yb2Var = (yb2) obj;
        if (Intrinsics.m17075f(this.f88140a, yb2Var.f88140a) && this.f88141b == yb2Var.f88141b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88141b) + (this.f88140a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f88140a;
        int i = this.f88141b;
        return "ViewSizeKey(adUnitId=" + str + ", screenOrientation=" + i + ")";
    }
}
