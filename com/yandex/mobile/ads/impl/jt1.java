package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jt1 {

    /* renamed from: a */
    private int f81158a;
    @NotNull

    /* renamed from: b */
    private final int[] f81159b = new int[10];

    /* renamed from: a */
    public final int m32734a(int i) {
        return this.f81159b[i];
    }

    /* renamed from: b */
    public final int m32731b() {
        if ((this.f81158a & 128) != 0) {
            return this.f81159b[7];
        }
        return 65535;
    }

    /* renamed from: c */
    public final int m32729c() {
        if ((this.f81158a & 16) != 0) {
            return this.f81159b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: d */
    public final int m32727d() {
        return Integer.bitCount(this.f81158a);
    }

    /* renamed from: a */
    public final int m32735a() {
        if ((this.f81158a & 2) != 0) {
            return this.f81159b[1];
        }
        return -1;
    }

    /* renamed from: b */
    public final int m32730b(int i) {
        return (this.f81158a & 32) != 0 ? this.f81159b[5] : i;
    }

    /* renamed from: c */
    public final boolean m32728c(int i) {
        return ((1 << i) & this.f81158a) != 0;
    }

    /* renamed from: a */
    public final void m32732a(@NotNull jt1 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 10; i++) {
            if (other.m32728c(i)) {
                m32733a(i, other.f81159b[i]);
            }
        }
    }

    @NotNull
    /* renamed from: a */
    public final void m32733a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f81159b;
            if (i >= iArr.length) {
                return;
            }
            this.f81158a = (1 << i) | this.f81158a;
            iArr[i] = i2;
        }
    }
}
