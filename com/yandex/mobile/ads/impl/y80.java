package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
final class y80 {

    /* renamed from: c */
    private boolean f88102c;

    /* renamed from: e */
    private int f88104e;

    /* renamed from: a */
    private C31875a f88100a = new C31875a();

    /* renamed from: b */
    private C31875a f88101b = new C31875a();

    /* renamed from: d */
    private long f88103d = -9223372036854775807L;

    /* renamed from: com.yandex.mobile.ads.impl.y80$a */
    /* loaded from: classes8.dex */
    private static final class C31875a {

        /* renamed from: a */
        private long f88105a;

        /* renamed from: b */
        private long f88106b;

        /* renamed from: c */
        private long f88107c;

        /* renamed from: d */
        private long f88108d;

        /* renamed from: e */
        private long f88109e;

        /* renamed from: f */
        private long f88110f;

        /* renamed from: g */
        private final boolean[] f88111g = new boolean[15];

        /* renamed from: h */
        private int f88112h;

        /* renamed from: a */
        public final boolean m26996a() {
            return this.f88108d > 15 && this.f88112h == 0;
        }

        /* renamed from: a */
        public final void m26995a(long j) {
            long j2 = this.f88108d;
            if (j2 == 0) {
                this.f88105a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f88105a;
                this.f88106b = j3;
                this.f88110f = j3;
                this.f88109e = 1L;
            } else {
                long j4 = j - this.f88107c;
                int i = (int) (j2 % 15);
                if (Math.abs(j4 - this.f88106b) <= 1000000) {
                    this.f88109e++;
                    this.f88110f += j4;
                    boolean[] zArr = this.f88111g;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.f88112h--;
                    }
                } else {
                    boolean[] zArr2 = this.f88111g;
                    if (!zArr2[i]) {
                        zArr2[i] = true;
                        this.f88112h++;
                    }
                }
            }
            this.f88108d++;
            this.f88107c = j;
        }
    }

    /* renamed from: a */
    public final long m27003a() {
        if (this.f88100a.m26996a()) {
            C31875a c31875a = this.f88100a;
            long j = c31875a.f88109e;
            if (j == 0) {
                return 0L;
            }
            return c31875a.f88110f / j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public final float m27001b() {
        if (this.f88100a.m26996a()) {
            C31875a c31875a = this.f88100a;
            long j = c31875a.f88109e;
            long j2 = 0;
            if (j != 0) {
                j2 = c31875a.f88110f / j;
            }
            return (float) (1.0E9d / j2);
        }
        return -1.0f;
    }

    /* renamed from: c */
    public final int m27000c() {
        return this.f88104e;
    }

    /* renamed from: d */
    public final long m26999d() {
        if (this.f88100a.m26996a()) {
            return this.f88100a.f88110f;
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public final boolean m26998e() {
        return this.f88100a.m26996a();
    }

    /* renamed from: f */
    public final void m26997f() {
        C31875a c31875a = this.f88100a;
        c31875a.f88108d = 0L;
        c31875a.f88109e = 0L;
        c31875a.f88110f = 0L;
        c31875a.f88112h = 0;
        Arrays.fill(c31875a.f88111g, false);
        C31875a c31875a2 = this.f88101b;
        c31875a2.f88108d = 0L;
        c31875a2.f88109e = 0L;
        c31875a2.f88110f = 0L;
        c31875a2.f88112h = 0;
        Arrays.fill(c31875a2.f88111g, false);
        this.f88102c = false;
        this.f88103d = -9223372036854775807L;
        this.f88104e = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r0.f88111g[(int) ((r5 - 1) % 15)] == false) goto L23;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m27002a(long r10) {
        /*
            r9 = this;
            com.yandex.mobile.ads.impl.y80$a r0 = r9.f88100a
            r0.m26995a(r10)
            com.yandex.mobile.ads.impl.y80$a r0 = r9.f88100a
            boolean r0 = r0.m26996a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            r9.f88102c = r2
            goto L60
        L12:
            long r3 = r9.f88103d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L60
            boolean r0 = r9.f88102c
            r3 = 0
            if (r0 == 0) goto L3d
            com.yandex.mobile.ads.impl.y80$a r0 = r9.f88101b
            long r5 = com.yandex.mobile.ads.impl.y80.C31875a.m26994a(r0)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L2e
            goto L59
        L2e:
            boolean[] r0 = com.yandex.mobile.ads.impl.y80.C31875a.m26991d(r0)
            r7 = 1
            long r5 = r5 - r7
            r7 = 15
            long r5 = r5 % r7
            int r5 = (int) r5
            boolean r0 = r0[r5]
            if (r0 == 0) goto L59
        L3d:
            com.yandex.mobile.ads.impl.y80$a r0 = r9.f88101b
            com.yandex.mobile.ads.impl.y80.C31875a.m26990e(r0, r3)
            com.yandex.mobile.ads.impl.y80.C31875a.m26989f(r0, r3)
            com.yandex.mobile.ads.impl.y80.C31875a.m26988g(r0, r3)
            com.yandex.mobile.ads.impl.y80.C31875a.m26987h(r0, r2)
            boolean[] r0 = com.yandex.mobile.ads.impl.y80.C31875a.m26991d(r0)
            java.util.Arrays.fill(r0, r2)
            com.yandex.mobile.ads.impl.y80$a r0 = r9.f88101b
            long r3 = r9.f88103d
            r0.m26995a(r3)
        L59:
            r9.f88102c = r1
            com.yandex.mobile.ads.impl.y80$a r0 = r9.f88101b
            r0.m26995a(r10)
        L60:
            boolean r0 = r9.f88102c
            if (r0 == 0) goto L76
            com.yandex.mobile.ads.impl.y80$a r0 = r9.f88101b
            boolean r0 = r0.m26996a()
            if (r0 == 0) goto L76
            com.yandex.mobile.ads.impl.y80$a r0 = r9.f88100a
            com.yandex.mobile.ads.impl.y80$a r3 = r9.f88101b
            r9.f88100a = r3
            r9.f88101b = r0
            r9.f88102c = r2
        L76:
            r9.f88103d = r10
            com.yandex.mobile.ads.impl.y80$a r10 = r9.f88100a
            boolean r10 = r10.m26996a()
            if (r10 == 0) goto L81
            goto L85
        L81:
            int r10 = r9.f88104e
            int r2 = r10 + 1
        L85:
            r9.f88104e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.y80.m27002a(long):void");
    }
}
