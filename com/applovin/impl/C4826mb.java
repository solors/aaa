package com.applovin.impl;

import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.mb */
/* loaded from: classes2.dex */
final class C4826mb implements InterfaceC4780lj {

    /* renamed from: a */
    private final long f7930a;

    /* renamed from: b */
    private final C5178qc f7931b;

    /* renamed from: c */
    private final C5178qc f7932c;

    /* renamed from: d */
    private long f7933d;

    public C4826mb(long j, long j2, long j3) {
        this.f7933d = j;
        this.f7930a = j3;
        C5178qc c5178qc = new C5178qc();
        this.f7931b = c5178qc;
        C5178qc c5178qc2 = new C5178qc();
        this.f7932c = c5178qc2;
        c5178qc.m96392a(0L);
        c5178qc2.m96392a(j2);
    }

    @Override // com.applovin.impl.InterfaceC4780lj
    /* renamed from: a */
    public long mo96504a(long j) {
        return this.f7931b.m96393a(AbstractC5863xp.m93021a(this.f7932c, j, true, true));
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public boolean mo92788b() {
        return true;
    }

    @Override // com.applovin.impl.InterfaceC4780lj
    /* renamed from: c */
    public long mo96502c() {
        return this.f7930a;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: d */
    public long mo92786d() {
        return this.f7933d;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public InterfaceC4591ij.C4592a mo92787b(long j) {
        int m93021a = AbstractC5863xp.m93021a(this.f7931b, j, true, true);
        C4719kj c4719kj = new C4719kj(this.f7931b.m96393a(m93021a), this.f7932c.m96393a(m93021a));
        if (c4719kj.f7553a != j && m93021a != this.f7931b.m96394a() - 1) {
            int i = m93021a + 1;
            return new InterfaceC4591ij.C4592a(c4719kj, new C4719kj(this.f7931b.m96393a(i), this.f7932c.m96393a(i)));
        }
        return new InterfaceC4591ij.C4592a(c4719kj);
    }

    /* renamed from: c */
    public boolean m97554c(long j) {
        C5178qc c5178qc = this.f7931b;
        return j - c5178qc.m96393a(c5178qc.m96394a() - 1) < 100000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m97553d(long j) {
        this.f7933d = j;
    }

    /* renamed from: a */
    public void m97555a(long j, long j2) {
        if (m97554c(j)) {
            return;
        }
        this.f7931b.m96392a(j);
        this.f7932c.m96392a(j2);
    }
}
