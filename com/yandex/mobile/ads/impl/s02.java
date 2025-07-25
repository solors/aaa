package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class s02 {

    /* renamed from: a */
    public final int f84969a;

    /* renamed from: b */
    public final int f84970b;

    /* renamed from: c */
    public final long f84971c;

    /* renamed from: d */
    public final long f84972d;

    /* renamed from: e */
    public final long f84973e;

    /* renamed from: f */
    public final v90 f84974f;

    /* renamed from: g */
    public final int f84975g;
    @Nullable

    /* renamed from: h */
    public final long[] f84976h;
    @Nullable

    /* renamed from: i */
    public final long[] f84977i;

    /* renamed from: j */
    public final int f84978j;
    @Nullable

    /* renamed from: k */
    private final t02[] f84979k;

    public s02(int i, int i2, long j, long j2, long j3, v90 v90Var, int i3, @Nullable t02[] t02VarArr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f84969a = i;
        this.f84970b = i2;
        this.f84971c = j;
        this.f84972d = j2;
        this.f84973e = j3;
        this.f84974f = v90Var;
        this.f84975g = i3;
        this.f84979k = t02VarArr;
        this.f84978j = i4;
        this.f84976h = jArr;
        this.f84977i = jArr2;
    }

    @Nullable
    /* renamed from: a */
    public final t02 m29887a(int i) {
        t02[] t02VarArr = this.f84979k;
        if (t02VarArr == null) {
            return null;
        }
        return t02VarArr[i];
    }
}
