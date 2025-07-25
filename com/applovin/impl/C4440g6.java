package com.applovin.impl;

/* renamed from: com.applovin.impl.g6 */
/* loaded from: classes2.dex */
final class C4440g6 implements InterfaceC4390fd {

    /* renamed from: a */
    private final C4134bl f6299a;

    /* renamed from: b */
    private final InterfaceC4441a f6300b;

    /* renamed from: c */
    private InterfaceC5201qi f6301c;

    /* renamed from: d */
    private InterfaceC4390fd f6302d;

    /* renamed from: f */
    private boolean f6303f = true;

    /* renamed from: g */
    private boolean f6304g;

    /* renamed from: com.applovin.impl.g6$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4441a {
        /* renamed from: a */
        void mo99014a(C5123ph c5123ph);
    }

    public C4440g6(InterfaceC4441a interfaceC4441a, InterfaceC4747l3 interfaceC4747l3) {
        this.f6300b = interfaceC4441a;
        this.f6299a = new C4134bl(interfaceC4747l3);
    }

    @Override // com.applovin.impl.InterfaceC4390fd
    /* renamed from: a */
    public C5123ph mo98733a() {
        InterfaceC4390fd interfaceC4390fd = this.f6302d;
        if (interfaceC4390fd != null) {
            return interfaceC4390fd.mo98733a();
        }
        return this.f6299a.mo98733a();
    }

    /* renamed from: b */
    public void m99018b(InterfaceC5201qi interfaceC5201qi) {
        InterfaceC4390fd interfaceC4390fd;
        InterfaceC4390fd mo96290l = interfaceC5201qi.mo96290l();
        if (mo96290l == null || mo96290l == (interfaceC4390fd = this.f6302d)) {
            return;
        }
        if (interfaceC4390fd == null) {
            this.f6302d = mo96290l;
            this.f6301c = interfaceC5201qi;
            mo96290l.mo98728a(this.f6299a.mo98733a());
            return;
        }
        throw C5959z7.m92473a(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    /* renamed from: c */
    public void m99016c() {
        this.f6304g = false;
        this.f6299a.m100365c();
    }

    @Override // com.applovin.impl.InterfaceC4390fd
    /* renamed from: p */
    public long mo98722p() {
        if (this.f6303f) {
            return this.f6299a.mo98722p();
        }
        return ((InterfaceC4390fd) AbstractC4100b1.m100583a(this.f6302d)).mo98722p();
    }

    /* renamed from: c */
    private void m99015c(boolean z) {
        if (m99020a(z)) {
            this.f6303f = true;
            if (this.f6304g) {
                this.f6299a.m100366b();
                return;
            }
            return;
        }
        InterfaceC4390fd interfaceC4390fd = (InterfaceC4390fd) AbstractC4100b1.m100583a(this.f6302d);
        long mo98722p = interfaceC4390fd.mo98722p();
        if (this.f6303f) {
            if (mo98722p < this.f6299a.mo98722p()) {
                this.f6299a.m100365c();
                return;
            }
            this.f6303f = false;
            if (this.f6304g) {
                this.f6299a.m100366b();
            }
        }
        this.f6299a.m100367a(mo98722p);
        C5123ph mo98733a = interfaceC4390fd.mo98733a();
        if (mo98733a.equals(this.f6299a.mo98733a())) {
            return;
        }
        this.f6299a.mo98728a(mo98733a);
        this.f6300b.mo99014a(mo98733a);
    }

    /* renamed from: a */
    public void m99021a(InterfaceC5201qi interfaceC5201qi) {
        if (interfaceC5201qi == this.f6301c) {
            this.f6302d = null;
            this.f6301c = null;
            this.f6303f = true;
        }
    }

    /* renamed from: b */
    public void m99019b() {
        this.f6304g = true;
        this.f6299a.m100366b();
    }

    /* renamed from: a */
    public void m99022a(long j) {
        this.f6299a.m100367a(j);
    }

    @Override // com.applovin.impl.InterfaceC4390fd
    /* renamed from: a */
    public void mo98728a(C5123ph c5123ph) {
        InterfaceC4390fd interfaceC4390fd = this.f6302d;
        if (interfaceC4390fd != null) {
            interfaceC4390fd.mo98728a(c5123ph);
            c5123ph = this.f6302d.mo98733a();
        }
        this.f6299a.mo98728a(c5123ph);
    }

    /* renamed from: b */
    public long m99017b(boolean z) {
        m99015c(z);
        return mo98722p();
    }

    /* renamed from: a */
    private boolean m99020a(boolean z) {
        InterfaceC5201qi interfaceC5201qi = this.f6301c;
        return interfaceC5201qi == null || interfaceC5201qi.mo93747c() || (!this.f6301c.mo93746d() && (z || this.f6301c.mo96292j()));
    }
}
