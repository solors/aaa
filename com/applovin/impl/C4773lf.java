package com.applovin.impl;

import java.util.List;

/* renamed from: com.applovin.impl.lf */
/* loaded from: classes2.dex */
final class C4773lf {

    /* renamed from: a */
    public final long f7745a;

    /* renamed from: b */
    public final List f7746b;

    /* renamed from: com.applovin.impl.lf$a */
    /* loaded from: classes2.dex */
    public static final class C4774a {

        /* renamed from: a */
        public final String f7747a;

        /* renamed from: b */
        public final String f7748b;

        /* renamed from: c */
        public final long f7749c;

        /* renamed from: d */
        public final long f7750d;

        public C4774a(String str, String str2, long j, long j2) {
            this.f7747a = str;
            this.f7748b = str2;
            this.f7749c = j;
            this.f7750d = j2;
        }
    }

    public C4773lf(long j, List list) {
        this.f7745a = j;
        this.f7746b = list;
    }

    /* renamed from: a */
    public C4954mf m97696a(long j) {
        long j2;
        if (this.f7746b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f7746b.size() - 1; size >= 0; size--) {
            C4774a c4774a = (C4774a) this.f7746b.get(size);
            boolean equals = "video/mp4".equals(c4774a.f7747a) | z;
            if (size == 0) {
                j3 -= c4774a.f7750d;
                j2 = 0;
            } else {
                j2 = j3 - c4774a.f7749c;
            }
            long j8 = j3;
            j3 = j2;
            if (equals && j3 != j8) {
                j7 = j8 - j3;
                j6 = j3;
                z = false;
            } else {
                z = equals;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j8;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new C4954mf(j4, j5, this.f7745a, j6, j7);
    }
}
