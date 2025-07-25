package com.applovin.impl;

import com.applovin.impl.InterfaceC4591ij;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.i6 */
/* loaded from: classes2.dex */
public final class C4568i6 implements InterfaceC4652jg {

    /* renamed from: a */
    private final C4587ig f6794a;

    /* renamed from: b */
    private final long f6795b;

    /* renamed from: c */
    private final long f6796c;

    /* renamed from: d */
    private final AbstractC4474gl f6797d;

    /* renamed from: e */
    private int f6798e;

    /* renamed from: f */
    private long f6799f;

    /* renamed from: g */
    private long f6800g;

    /* renamed from: h */
    private long f6801h;

    /* renamed from: i */
    private long f6802i;

    /* renamed from: j */
    private long f6803j;

    /* renamed from: k */
    private long f6804k;

    /* renamed from: l */
    private long f6805l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.i6$b */
    /* loaded from: classes2.dex */
    public final class C4570b implements InterfaceC4591ij {
        private C4570b() {
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: b */
        public boolean mo92788b() {
            return true;
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: d */
        public long mo92786d() {
            return C4568i6.this.f6797d.m98926a(C4568i6.this.f6799f);
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: b */
        public InterfaceC4591ij.C4592a mo92787b(long j) {
            return new InterfaceC4591ij.C4592a(new C4719kj(j, AbstractC5863xp.m92990b((C4568i6.this.f6795b + ((C4568i6.this.f6797d.m98921b(j) * (C4568i6.this.f6796c - C4568i6.this.f6795b)) / C4568i6.this.f6799f)) - 30000, C4568i6.this.f6795b, C4568i6.this.f6796c - 1)));
        }
    }

    public C4568i6(AbstractC4474gl abstractC4474gl, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC4100b1.m100580a(z2);
        this.f6797d = abstractC4474gl;
        this.f6795b = j;
        this.f6796c = j2;
        if (j3 != j2 - j && !z) {
            this.f6798e = 0;
        } else {
            this.f6799f = j4;
            this.f6798e = 4;
        }
        this.f6794a = new C4587ig();
    }

    /* renamed from: d */
    private void m98531d(InterfaceC4703k8 interfaceC4703k8) {
        while (true) {
            this.f6794a.m98429a(interfaceC4703k8);
            this.f6794a.m98427a(interfaceC4703k8, false);
            C4587ig c4587ig = this.f6794a;
            if (c4587ig.f6895c > this.f6801h) {
                interfaceC4703k8.mo98007b();
                return;
            }
            interfaceC4703k8.mo98010a(c4587ig.f6900h + c4587ig.f6901i);
            this.f6802i = interfaceC4703k8.mo97999f();
            this.f6804k = this.f6794a.f6895c;
        }
    }

    @Override // com.applovin.impl.InterfaceC4652jg
    /* renamed from: b */
    public C4570b mo93208a() {
        if (this.f6799f != 0) {
            return new C4570b();
        }
        return null;
    }

    /* renamed from: c */
    long m98533c(InterfaceC4703k8 interfaceC4703k8) {
        this.f6794a.m98430a();
        if (this.f6794a.m98429a(interfaceC4703k8)) {
            this.f6794a.m98427a(interfaceC4703k8, false);
            C4587ig c4587ig = this.f6794a;
            interfaceC4703k8.mo98010a(c4587ig.f6900h + c4587ig.f6901i);
            long j = this.f6794a.f6895c;
            while (true) {
                C4587ig c4587ig2 = this.f6794a;
                if ((c4587ig2.f6894b & 4) == 4 || !c4587ig2.m98429a(interfaceC4703k8) || interfaceC4703k8.mo97999f() >= this.f6796c || !this.f6794a.m98427a(interfaceC4703k8, true)) {
                    break;
                }
                C4587ig c4587ig3 = this.f6794a;
                if (!AbstractC4823m8.m97563a(interfaceC4703k8, c4587ig3.f6900h + c4587ig3.f6901i)) {
                    break;
                }
                j = this.f6794a.f6895c;
            }
            return j;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    private long m98535b(InterfaceC4703k8 interfaceC4703k8) {
        if (this.f6802i == this.f6803j) {
            return -1L;
        }
        long mo97999f = interfaceC4703k8.mo97999f();
        if (!this.f6794a.m98428a(interfaceC4703k8, this.f6803j)) {
            long j = this.f6802i;
            if (j != mo97999f) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f6794a.m98427a(interfaceC4703k8, false);
        interfaceC4703k8.mo98007b();
        long j2 = this.f6801h;
        C4587ig c4587ig = this.f6794a;
        long j3 = c4587ig.f6895c;
        long j4 = j2 - j3;
        int i = c4587ig.f6900h + c4587ig.f6901i;
        if (0 > j4 || j4 >= 72000) {
            int i2 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
            if (i2 < 0) {
                this.f6803j = mo97999f;
                this.f6805l = j3;
            } else {
                this.f6802i = interfaceC4703k8.mo97999f() + i;
                this.f6804k = this.f6794a.f6895c;
            }
            long j5 = this.f6803j;
            long j6 = this.f6802i;
            if (j5 - j6 < 100000) {
                this.f6803j = j6;
                return j6;
            }
            long mo97999f2 = interfaceC4703k8.mo97999f() - (i * (i2 <= 0 ? 2L : 1L));
            long j7 = this.f6803j;
            long j8 = this.f6802i;
            return AbstractC5863xp.m92990b(mo97999f2 + ((j4 * (j7 - j8)) / (this.f6805l - this.f6804k)), j8, j7 - 1);
        }
        return -1L;
    }

    @Override // com.applovin.impl.InterfaceC4652jg
    /* renamed from: a */
    public long mo93206a(InterfaceC4703k8 interfaceC4703k8) {
        int i = this.f6798e;
        if (i == 0) {
            long mo97999f = interfaceC4703k8.mo97999f();
            this.f6800g = mo97999f;
            this.f6798e = 1;
            long j = this.f6796c - 65307;
            if (j > mo97999f) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long m98535b = m98535b(interfaceC4703k8);
                if (m98535b != -1) {
                    return m98535b;
                }
                this.f6798e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            m98531d(interfaceC4703k8);
            this.f6798e = 4;
            return -(this.f6804k + 2);
        }
        this.f6799f = m98533c(interfaceC4703k8);
        this.f6798e = 4;
        return this.f6800g;
    }

    @Override // com.applovin.impl.InterfaceC4652jg
    /* renamed from: a */
    public void mo93207a(long j) {
        this.f6801h = AbstractC5863xp.m92990b(j, 0L, this.f6799f - 1);
        this.f6798e = 2;
        this.f6802i = this.f6795b;
        this.f6803j = this.f6796c;
        this.f6804k = 0L;
        this.f6805l = this.f6799f;
    }
}
