package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class qs1 {

    /* renamed from: c */
    public static final qs1 f84515c;

    /* renamed from: a */
    public final long f84516a;

    /* renamed from: b */
    public final long f84517b;

    static {
        qs1 qs1Var = new qs1(0L, 0L);
        new qs1(Long.MAX_VALUE, Long.MAX_VALUE);
        new qs1(Long.MAX_VALUE, 0L);
        new qs1(0L, Long.MAX_VALUE);
        f84515c = qs1Var;
    }

    public qs1(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C30937nf.m31567a(z);
        C30937nf.m31567a(j2 >= 0);
        this.f84516a = j;
        this.f84517b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qs1.class != obj.getClass()) {
            return false;
        }
        qs1 qs1Var = (qs1) obj;
        if (this.f84516a == qs1Var.f84516a && this.f84517b == qs1Var.f84517b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f84516a) * 31) + ((int) this.f84517b);
    }
}
