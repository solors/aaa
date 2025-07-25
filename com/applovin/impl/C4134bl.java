package com.applovin.impl;

/* renamed from: com.applovin.impl.bl */
/* loaded from: classes2.dex */
public final class C4134bl implements InterfaceC4390fd {

    /* renamed from: a */
    private final InterfaceC4747l3 f5079a;

    /* renamed from: b */
    private boolean f5080b;

    /* renamed from: c */
    private long f5081c;

    /* renamed from: d */
    private long f5082d;

    /* renamed from: f */
    private C5123ph f5083f = C5123ph.f9017d;

    public C4134bl(InterfaceC4747l3 interfaceC4747l3) {
        this.f5079a = interfaceC4747l3;
    }

    @Override // com.applovin.impl.InterfaceC4390fd
    /* renamed from: a */
    public C5123ph mo98733a() {
        return this.f5083f;
    }

    /* renamed from: b */
    public void m100366b() {
        if (!this.f5080b) {
            this.f5082d = this.f5079a.mo93849c();
            this.f5080b = true;
        }
    }

    /* renamed from: c */
    public void m100365c() {
        if (this.f5080b) {
            m100367a(mo98722p());
            this.f5080b = false;
        }
    }

    @Override // com.applovin.impl.InterfaceC4390fd
    /* renamed from: p */
    public long mo98722p() {
        long m96537a;
        long j = this.f5081c;
        if (this.f5080b) {
            long mo93849c = this.f5079a.mo93849c() - this.f5082d;
            C5123ph c5123ph = this.f5083f;
            if (c5123ph.f9019a == 1.0f) {
                m96537a = AbstractC5538t2.m94555a(mo93849c);
            } else {
                m96537a = c5123ph.m96537a(mo93849c);
            }
            return j + m96537a;
        }
        return j;
    }

    /* renamed from: a */
    public void m100367a(long j) {
        this.f5081c = j;
        if (this.f5080b) {
            this.f5082d = this.f5079a.mo93849c();
        }
    }

    @Override // com.applovin.impl.InterfaceC4390fd
    /* renamed from: a */
    public void mo98728a(C5123ph c5123ph) {
        if (this.f5080b) {
            m100367a(mo98722p());
        }
        this.f5083f = c5123ph;
    }
}
