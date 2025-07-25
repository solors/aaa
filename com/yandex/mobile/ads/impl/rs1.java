package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.ironsource.C21114v8;

/* loaded from: classes8.dex */
public final class rs1 {

    /* renamed from: c */
    public static final rs1 f84870c = new rs1(0, 0);

    /* renamed from: a */
    public final long f84871a;

    /* renamed from: b */
    public final long f84872b;

    public rs1(long j, long j2) {
        this.f84871a = j;
        this.f84872b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rs1.class != obj.getClass()) {
            return false;
        }
        rs1 rs1Var = (rs1) obj;
        if (this.f84871a == rs1Var.f84871a && this.f84872b == rs1Var.f84872b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f84871a) * 31) + ((int) this.f84872b);
    }

    public final String toString() {
        return "[timeUs=" + this.f84871a + ", position=" + this.f84872b + C21114v8.C21123i.f54139e;
    }
}
