package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class rb2 {

    /* renamed from: a */
    private final int f84696a;

    /* renamed from: b */
    private final int f84697b;

    public rb2(int i, int i2) {
        this.f84696a = i;
        this.f84697b = i2;
    }

    /* renamed from: a */
    public final int m30086a() {
        return this.f84697b;
    }

    /* renamed from: b */
    public final int m30085b() {
        return this.f84696a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb2)) {
            return false;
        }
        rb2 rb2Var = (rb2) obj;
        if (this.f84696a == rb2Var.f84696a && this.f84697b == rb2Var.f84697b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84697b) + (Integer.hashCode(this.f84696a) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f84696a;
        int i2 = this.f84697b;
        return "ViewSize(width=" + i + ", height=" + i2 + ")";
    }
}
