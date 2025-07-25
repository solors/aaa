package com.applovin.impl;

/* renamed from: com.applovin.impl.e2 */
/* loaded from: classes2.dex */
public abstract class AbstractC4301e2 implements InterfaceC5201qi, InterfaceC5269ri {

    /* renamed from: a */
    private final int f5742a;

    /* renamed from: c */
    private C5516si f5744c;

    /* renamed from: d */
    private int f5745d;

    /* renamed from: f */
    private int f5746f;

    /* renamed from: g */
    private InterfaceC4191cj f5747g;

    /* renamed from: h */
    private C4310e9[] f5748h;

    /* renamed from: i */
    private long f5749i;

    /* renamed from: j */
    private long f5750j;

    /* renamed from: l */
    private boolean f5752l;

    /* renamed from: m */
    private boolean f5753m;

    /* renamed from: b */
    private final C4383f9 f5743b = new C4383f9();

    /* renamed from: k */
    private long f5751k = Long.MIN_VALUE;

    public AbstractC4301e2(int i) {
        this.f5742a = i;
    }

    @Override // com.applovin.impl.C5266rh.InterfaceC5268b
    /* renamed from: a */
    public void mo93753a(int i, Object obj) {
    }

    /* renamed from: a */
    protected abstract void mo93751a(long j, boolean z);

    /* renamed from: a */
    protected abstract void mo93748a(C4310e9[] c4310e9Arr, long j, long j2);

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: b */
    public final int mo96298b() {
        return this.f5746f;
    }

    @Override // com.applovin.impl.InterfaceC5201qi, com.applovin.impl.InterfaceC5269ri
    /* renamed from: e */
    public final int mo95839e() {
        return this.f5742a;
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: f */
    public final void mo96296f() {
        boolean z = true;
        if (this.f5746f != 1) {
            z = false;
        }
        AbstractC4100b1.m100577b(z);
        this.f5743b.m99393a();
        this.f5746f = 0;
        this.f5747g = null;
        this.f5748h = null;
        this.f5752l = false;
        mo93745v();
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: g */
    public final void mo96295g() {
        this.f5752l = true;
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: h */
    public final void mo96294h() {
        ((InterfaceC4191cj) AbstractC4100b1.m100583a(this.f5747g)).mo95931a();
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: i */
    public final long mo96293i() {
        return this.f5751k;
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: j */
    public final boolean mo96292j() {
        if (this.f5751k == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: k */
    public final boolean mo96291k() {
        return this.f5752l;
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: l */
    public InterfaceC4390fd mo96290l() {
        return null;
    }

    @Override // com.applovin.impl.InterfaceC5269ri
    /* renamed from: m */
    public int mo95838m() {
        return 0;
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: o */
    public final InterfaceC4191cj mo96288o() {
        return this.f5747g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final C5516si m99688q() {
        return (C5516si) AbstractC4100b1.m100583a(this.f5744c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final C4383f9 m99687r() {
        this.f5743b.m99393a();
        return this.f5743b;
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    public final void reset() {
        boolean z;
        if (this.f5746f == 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100577b(z);
        this.f5743b.m99393a();
        mo96739w();
    }

    /* renamed from: s */
    protected final int m99686s() {
        return this.f5745d;
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    public final void start() {
        boolean z = true;
        if (this.f5746f != 1) {
            z = false;
        }
        AbstractC4100b1.m100577b(z);
        this.f5746f = 2;
        mo96738x();
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    public final void stop() {
        boolean z;
        if (this.f5746f == 2) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100577b(z);
        this.f5746f = 1;
        mo96737y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final C4310e9[] m99685t() {
        return (C4310e9[]) AbstractC4100b1.m100583a(this.f5748h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean m99684u() {
        if (mo96292j()) {
            return this.f5752l;
        }
        return ((InterfaceC4191cj) AbstractC4100b1.m100583a(this.f5747g)).mo95928d();
    }

    /* renamed from: v */
    protected abstract void mo93745v();

    /* renamed from: a */
    protected void mo96770a(boolean z, boolean z2) {
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: b */
    public final void mo96297b(int i) {
        this.f5745d = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final C5959z7 m99691a(Throwable th, C4310e9 c4310e9, int i) {
        return m99690a(th, c4310e9, false, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m99689b(long j) {
        return ((InterfaceC4191cj) AbstractC4100b1.m100583a(this.f5747g)).mo95930a(j - this.f5749i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final C5959z7 m99690a(Throwable th, C4310e9 c4310e9, boolean z, int i) {
        int i2;
        if (c4310e9 != null && !this.f5753m) {
            this.f5753m = true;
            try {
                i2 = InterfaceC5269ri.m95840d(mo93750a(c4310e9));
            } catch (C5959z7 unused) {
            } finally {
                this.f5753m = false;
            }
            return C5959z7.m92471a(th, getName(), m99686s(), c4310e9, i2, z, i);
        }
        i2 = 4;
        return C5959z7.m92471a(th, getName(), m99686s(), c4310e9, i2, z, i);
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: a */
    public final void mo96300a(C5516si c5516si, C4310e9[] c4310e9Arr, InterfaceC4191cj interfaceC4191cj, long j, boolean z, boolean z2, long j2, long j3) {
        AbstractC4100b1.m100577b(this.f5746f == 0);
        this.f5744c = c5516si;
        this.f5746f = 1;
        this.f5750j = j;
        mo96770a(z, z2);
        mo96299a(c4310e9Arr, interfaceC4191cj, j2, j3);
        mo93751a(j, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final int m99692a(C4383f9 c4383f9, C5048o5 c5048o5, int i) {
        int mo95929a = ((InterfaceC4191cj) AbstractC4100b1.m100583a(this.f5747g)).mo95929a(c4383f9, c5048o5, i);
        if (mo95929a == -4) {
            if (c5048o5.m97866e()) {
                this.f5751k = Long.MIN_VALUE;
                return this.f5752l ? -4 : -3;
            }
            long j = c5048o5.f8727f + this.f5749i;
            c5048o5.f8727f = j;
            this.f5751k = Math.max(this.f5751k, j);
        } else if (mo95929a == -5) {
            C4310e9 c4310e9 = (C4310e9) AbstractC4100b1.m100583a(c4383f9.f6063b);
            if (c4310e9.f5817q != Long.MAX_VALUE) {
                c4383f9.f6063b = c4310e9.m99645a().m99629a(c4310e9.f5817q + this.f5749i).m99632a();
            }
        }
        return mo95929a;
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: n */
    public final InterfaceC5269ri mo96289n() {
        return this;
    }

    /* renamed from: w */
    protected void mo96739w() {
    }

    /* renamed from: x */
    protected void mo96738x() {
    }

    /* renamed from: y */
    protected void mo96737y() {
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: a */
    public final void mo96299a(C4310e9[] c4310e9Arr, InterfaceC4191cj interfaceC4191cj, long j, long j2) {
        AbstractC4100b1.m100577b(!this.f5752l);
        this.f5747g = interfaceC4191cj;
        if (this.f5751k == Long.MIN_VALUE) {
            this.f5751k = j;
        }
        this.f5748h = c4310e9Arr;
        this.f5749i = j2;
        mo93748a(c4310e9Arr, j, j2);
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: a */
    public final void mo96301a(long j) {
        this.f5752l = false;
        this.f5750j = j;
        this.f5751k = j;
        mo93751a(j, false);
    }
}
