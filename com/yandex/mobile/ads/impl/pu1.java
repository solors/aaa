package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class pu1 implements Comparable<pu1> {

    /* renamed from: b */
    private final int f84084b;

    /* renamed from: c */
    private final int f84085c;

    public pu1(int i, int i2) {
        this.f84084b = i;
        this.f84085c = i2;
    }

    /* renamed from: a */
    public final int m30582a() {
        return this.f84085c;
    }

    /* renamed from: b */
    public final int m30581b() {
        return this.f84084b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(pu1 pu1Var) {
        pu1 other = pu1Var;
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.m17071j(this.f84084b * this.f84085c, other.f84084b * other.f84085c);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu1)) {
            return false;
        }
        pu1 pu1Var = (pu1) obj;
        if (this.f84084b == pu1Var.f84084b && this.f84085c == pu1Var.f84085c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84085c) + (Integer.hashCode(this.f84084b) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f84084b;
        int i2 = this.f84085c;
        return "Size(width=" + i + ", height=" + i2 + ")";
    }
}
