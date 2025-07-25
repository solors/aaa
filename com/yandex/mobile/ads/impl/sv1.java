package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class sv1 {

    /* renamed from: a */
    private final int f85397a;

    /* renamed from: b */
    private final int f85398b;

    /* renamed from: c */
    private final int f85399c;

    /* renamed from: d */
    private final int f85400d;

    /* renamed from: e */
    private final int f85401e;

    public sv1(int i, int i2, int i3, int i4) {
        this.f85397a = i;
        this.f85398b = i2;
        this.f85399c = i3;
        this.f85400d = i4;
        this.f85401e = i3 * i4;
    }

    /* renamed from: a */
    public final int m29528a() {
        return this.f85401e;
    }

    /* renamed from: b */
    public final int m29527b() {
        return this.f85400d;
    }

    /* renamed from: c */
    public final int m29526c() {
        return this.f85399c;
    }

    /* renamed from: d */
    public final int m29525d() {
        return this.f85397a;
    }

    /* renamed from: e */
    public final int m29524e() {
        return this.f85398b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv1)) {
            return false;
        }
        sv1 sv1Var = (sv1) obj;
        if (this.f85397a == sv1Var.f85397a && this.f85398b == sv1Var.f85398b && this.f85399c == sv1Var.f85399c && this.f85400d == sv1Var.f85400d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85400d) + nt1.m31295a(this.f85399c, nt1.m31295a(this.f85398b, Integer.hashCode(this.f85397a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f85397a;
        int i2 = this.f85398b;
        int i3 = this.f85399c;
        int i4 = this.f85400d;
        return "SmartCenter(x=" + i + ", y=" + i2 + ", width=" + i3 + ", height=" + i4 + ")";
    }
}
