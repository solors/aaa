package com.applovin.impl;

import java.util.Arrays;

/* renamed from: com.applovin.impl.q8 */
/* loaded from: classes2.dex */
final class C5173q8 {

    /* renamed from: c */
    private boolean f9164c;

    /* renamed from: d */
    private boolean f9165d;

    /* renamed from: f */
    private int f9167f;

    /* renamed from: a */
    private C5174a f9162a = new C5174a();

    /* renamed from: b */
    private C5174a f9163b = new C5174a();

    /* renamed from: e */
    private long f9166e = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.q8$a */
    /* loaded from: classes2.dex */
    public static final class C5174a {

        /* renamed from: a */
        private long f9168a;

        /* renamed from: b */
        private long f9169b;

        /* renamed from: c */
        private long f9170c;

        /* renamed from: d */
        private long f9171d;

        /* renamed from: e */
        private long f9172e;

        /* renamed from: f */
        private long f9173f;

        /* renamed from: g */
        private final boolean[] f9174g = new boolean[15];

        /* renamed from: h */
        private int f9175h;

        /* renamed from: a */
        public long m96407a() {
            long j = this.f9172e;
            if (j == 0) {
                return 0L;
            }
            return this.f9173f / j;
        }

        /* renamed from: b */
        public long m96405b() {
            return this.f9173f;
        }

        /* renamed from: c */
        public boolean m96403c() {
            long j = this.f9171d;
            if (j == 0) {
                return false;
            }
            return this.f9174g[m96406a(j - 1)];
        }

        /* renamed from: d */
        public boolean m96402d() {
            if (this.f9171d > 15 && this.f9175h == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void m96401e() {
            this.f9171d = 0L;
            this.f9172e = 0L;
            this.f9173f = 0L;
            this.f9175h = 0;
            Arrays.fill(this.f9174g, false);
        }

        /* renamed from: a */
        private static int m96406a(long j) {
            return (int) (j % 15);
        }

        /* renamed from: b */
        public void m96404b(long j) {
            long j2 = this.f9171d;
            if (j2 == 0) {
                this.f9168a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f9168a;
                this.f9169b = j3;
                this.f9173f = j3;
                this.f9172e = 1L;
            } else {
                long j4 = j - this.f9170c;
                int m96406a = m96406a(j2);
                if (Math.abs(j4 - this.f9169b) <= 1000000) {
                    this.f9172e++;
                    this.f9173f += j4;
                    boolean[] zArr = this.f9174g;
                    if (zArr[m96406a]) {
                        zArr[m96406a] = false;
                        this.f9175h--;
                    }
                } else {
                    boolean[] zArr2 = this.f9174g;
                    if (!zArr2[m96406a]) {
                        zArr2[m96406a] = true;
                        this.f9175h++;
                    }
                }
            }
            this.f9171d++;
            this.f9170c = j;
        }
    }

    /* renamed from: a */
    public long m96414a() {
        if (m96409e()) {
            return this.f9162a.m96407a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public float m96412b() {
        if (m96409e()) {
            return (float) (1.0E9d / this.f9162a.m96407a());
        }
        return -1.0f;
    }

    /* renamed from: c */
    public int m96411c() {
        return this.f9167f;
    }

    /* renamed from: d */
    public long m96410d() {
        if (m96409e()) {
            return this.f9162a.m96405b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean m96409e() {
        return this.f9162a.m96402d();
    }

    /* renamed from: f */
    public void m96408f() {
        this.f9162a.m96401e();
        this.f9163b.m96401e();
        this.f9164c = false;
        this.f9166e = -9223372036854775807L;
        this.f9167f = 0;
    }

    /* renamed from: a */
    public void m96413a(long j) {
        this.f9162a.m96404b(j);
        if (this.f9162a.m96402d() && !this.f9165d) {
            this.f9164c = false;
        } else if (this.f9166e != -9223372036854775807L) {
            if (!this.f9164c || this.f9163b.m96403c()) {
                this.f9163b.m96401e();
                this.f9163b.m96404b(this.f9166e);
            }
            this.f9164c = true;
            this.f9163b.m96404b(j);
        }
        if (this.f9164c && this.f9163b.m96402d()) {
            C5174a c5174a = this.f9162a;
            this.f9162a = this.f9163b;
            this.f9163b = c5174a;
            this.f9164c = false;
            this.f9165d = false;
        }
        this.f9166e = j;
        this.f9167f = this.f9162a.m96402d() ? 0 : this.f9167f + 1;
    }
}
