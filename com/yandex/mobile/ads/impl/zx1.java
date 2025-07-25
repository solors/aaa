package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k90;
import com.yandex.mobile.ads.impl.ps1;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public abstract class zx1 {

    /* renamed from: b */
    private x02 f89148b;

    /* renamed from: c */
    private p50 f89149c;

    /* renamed from: d */
    private ha1 f89150d;

    /* renamed from: e */
    private long f89151e;

    /* renamed from: f */
    private long f89152f;

    /* renamed from: g */
    private long f89153g;

    /* renamed from: h */
    private int f89154h;

    /* renamed from: i */
    private int f89155i;

    /* renamed from: k */
    private long f89157k;

    /* renamed from: l */
    private boolean f89158l;

    /* renamed from: m */
    private boolean f89159m;

    /* renamed from: a */
    private final fa1 f89147a = new fa1();

    /* renamed from: j */
    private C32024a f89156j = new C32024a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.zx1$a */
    /* loaded from: classes8.dex */
    public static class C32024a {

        /* renamed from: a */
        v90 f89160a;

        /* renamed from: b */
        k90.C30712a f89161b;

        C32024a() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zx1$b */
    /* loaded from: classes8.dex */
    private static final class C32025b implements ha1 {
        @Override // com.yandex.mobile.ads.impl.ha1
        /* renamed from: a */
        public final long mo25959a(C30513hy c30513hy) {
            return -1L;
        }

        private C32025b() {
        }

        @Override // com.yandex.mobile.ads.impl.ha1
        /* renamed from: a */
        public final void mo25960a(long j) {
        }

        @Override // com.yandex.mobile.ads.impl.ha1
        /* renamed from: a */
        public final ps1 mo25961a() {
            return new ps1.C31151b(-9223372036854775807L, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final long m25970a(long j) {
        return (j * 1000000) / this.f89155i;
    }

    /* renamed from: a */
    protected abstract long mo25968a(cc1 cc1Var);

    /* renamed from: a */
    protected abstract boolean mo25967a(cc1 cc1Var, long j, C32024a c32024a) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final long m25963b(long j) {
        return (this.f89155i * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo25962c(long j) {
        this.f89153g = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m25965a(p50 p50Var, x02 x02Var) {
        this.f89149c = p50Var;
        this.f89148b = x02Var;
        mo25964a(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m25966a(C30513hy c30513hy, of1 of1Var) throws IOException {
        if (this.f89148b != null) {
            int i = y32.f88010a;
            int i2 = this.f89154h;
            if (i2 == 0) {
                while (this.f89147a.m34186a(c30513hy)) {
                    this.f89157k = c30513hy.mo27622a() - this.f89152f;
                    if (mo25967a(this.f89147a.m34185b(), this.f89152f, this.f89156j)) {
                        this.f89152f = c30513hy.mo27622a();
                    } else {
                        v90 v90Var = this.f89156j.f89160a;
                        this.f89155i = v90Var.f86605A;
                        if (!this.f89159m) {
                            this.f89148b.mo26064a(v90Var);
                            this.f89159m = true;
                        }
                        k90.C30712a c30712a = this.f89156j.f89161b;
                        if (c30712a != null) {
                            this.f89150d = c30712a;
                        } else if (c30513hy.mo27618b() == -1) {
                            this.f89150d = new C32025b();
                        } else {
                            ga1 m34187a = this.f89147a.m34187a();
                            this.f89150d = new C31617uy(this, this.f89152f, c30513hy.mo27618b(), m34187a.f79583d + m34187a.f79584e, m34187a.f79581b, (m34187a.f79580a & 4) != 0);
                        }
                        this.f89154h = 2;
                        this.f89147a.m34183d();
                        return 0;
                    }
                }
                this.f89154h = 3;
                return -1;
            } else if (i2 == 1) {
                c30513hy.mo27621a((int) this.f89152f);
                this.f89154h = 2;
                return 0;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            } else {
                long mo25959a = this.f89150d.mo25959a(c30513hy);
                if (mo25959a >= 0) {
                    of1Var.f83478a = mo25959a;
                    return 1;
                }
                if (mo25959a < -1) {
                    mo25962c(-(mo25959a + 2));
                }
                if (!this.f89158l) {
                    ps1 mo25961a = this.f89150d.mo25961a();
                    if (mo25961a != null) {
                        this.f89149c.mo26218a(mo25961a);
                        this.f89158l = true;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (this.f89157k <= 0 && !this.f89147a.m34186a(c30513hy)) {
                    this.f89154h = 3;
                    return -1;
                }
                this.f89157k = 0L;
                cc1 m34185b = this.f89147a.m34185b();
                long mo25968a = mo25968a(m34185b);
                if (mo25968a >= 0) {
                    long j = this.f89153g;
                    if (j + mo25968a >= this.f89151e) {
                        long m25970a = m25970a(j);
                        this.f89148b.m27709a(m34185b.m35287e(), m34185b);
                        this.f89148b.mo26069a(m25970a, 1, m34185b.m35287e(), 0, null);
                        this.f89151e = -1L;
                    }
                }
                this.f89153g += mo25968a;
                return 0;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25964a(boolean z) {
        if (z) {
            this.f89156j = new C32024a();
            this.f89152f = 0L;
            this.f89154h = 0;
        } else {
            this.f89154h = 1;
        }
        this.f89151e = -1L;
        this.f89153g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m25969a(long j, long j2) {
        this.f89147a.m34184c();
        if (j == 0) {
            mo25964a(!this.f89158l);
        } else if (this.f89154h != 0) {
            long m25963b = m25963b(j2);
            this.f89151e = m25963b;
            ha1 ha1Var = this.f89150d;
            int i = y32.f88010a;
            ha1Var.mo25960a(m25963b);
            this.f89154h = 2;
        }
    }
}
