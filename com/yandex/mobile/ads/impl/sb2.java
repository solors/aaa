package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class sb2 {

    /* renamed from: a */
    private final int f85170a;

    /* renamed from: b */
    private final int f85171b;

    public sb2(int i, int i2) {
        this.f85170a = i;
        this.f85171b = i2;
    }

    /* renamed from: a */
    public final int m29649a() {
        return this.f85171b;
    }

    /* renamed from: b */
    public final int m29648b() {
        return this.f85170a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb2)) {
            return false;
        }
        sb2 sb2Var = (sb2) obj;
        if (this.f85170a == sb2Var.f85170a && this.f85171b == sb2Var.f85171b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85171b) + (Integer.hashCode(this.f85170a) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f85170a;
        int i2 = this.f85171b;
        return "ViewSize(width=" + i + ", height=" + i2 + ")";
    }
}
