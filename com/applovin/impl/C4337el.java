package com.applovin.impl;

import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.el */
/* loaded from: classes2.dex */
public final class C4337el implements InterfaceC4760l8 {

    /* renamed from: a */
    private final long f5942a;

    /* renamed from: b */
    private final InterfaceC4760l8 f5943b;

    public C4337el(long j, InterfaceC4760l8 interfaceC4760l8) {
        this.f5942a = j;
        this.f5943b = interfaceC4760l8;
    }

    @Override // com.applovin.impl.InterfaceC4760l8
    /* renamed from: c */
    public void mo97780c() {
        this.f5943b.mo97780c();
    }

    @Override // com.applovin.impl.InterfaceC4760l8
    /* renamed from: a */
    public void mo97781a(InterfaceC4591ij interfaceC4591ij) {
        this.f5943b.mo97781a(new C4338a(interfaceC4591ij));
    }

    @Override // com.applovin.impl.InterfaceC4760l8
    /* renamed from: a */
    public InterfaceC5209qo mo97782a(int i, int i2) {
        return this.f5943b.mo97782a(i, i2);
    }

    /* renamed from: com.applovin.impl.el$a */
    /* loaded from: classes2.dex */
    class C4338a implements InterfaceC4591ij {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4591ij f5944a;

        C4338a(InterfaceC4591ij interfaceC4591ij) {
            this.f5944a = interfaceC4591ij;
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: b */
        public InterfaceC4591ij.C4592a mo92787b(long j) {
            InterfaceC4591ij.C4592a mo92787b = this.f5944a.mo92787b(j);
            C4719kj c4719kj = mo92787b.f6936a;
            C4719kj c4719kj2 = new C4719kj(c4719kj.f7553a, c4719kj.f7554b + C4337el.this.f5942a);
            C4719kj c4719kj3 = mo92787b.f6937b;
            return new InterfaceC4591ij.C4592a(c4719kj2, new C4719kj(c4719kj3.f7553a, c4719kj3.f7554b + C4337el.this.f5942a));
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: d */
        public long mo92786d() {
            return this.f5944a.mo92786d();
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: b */
        public boolean mo92788b() {
            return this.f5944a.mo92788b();
        }
    }
}
