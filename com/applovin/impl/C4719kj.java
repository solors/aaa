package com.applovin.impl;

import com.ironsource.C21114v8;

/* renamed from: com.applovin.impl.kj */
/* loaded from: classes2.dex */
public final class C4719kj {

    /* renamed from: c */
    public static final C4719kj f7552c = new C4719kj(0, 0);

    /* renamed from: a */
    public final long f7553a;

    /* renamed from: b */
    public final long f7554b;

    public C4719kj(long j, long j2) {
        this.f7553a = j;
        this.f7554b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4719kj.class != obj.getClass()) {
            return false;
        }
        C4719kj c4719kj = (C4719kj) obj;
        if (this.f7553a == c4719kj.f7553a && this.f7554b == c4719kj.f7554b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f7553a) * 31) + ((int) this.f7554b);
    }

    public String toString() {
        return "[timeUs=" + this.f7553a + ", position=" + this.f7554b + C21114v8.C21123i.f54139e;
    }
}
