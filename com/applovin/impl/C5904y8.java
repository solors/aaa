package com.applovin.impl;

import com.applovin.impl.C5960z8;
import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.y8 */
/* loaded from: classes2.dex */
public final class C5904y8 implements InterfaceC4591ij {

    /* renamed from: a */
    private final C5960z8 f12299a;

    /* renamed from: b */
    private final long f12300b;

    public C5904y8(C5960z8 c5960z8, long j) {
        this.f12299a = c5960z8;
        this.f12300b = j;
    }

    /* renamed from: a */
    private C4719kj m92789a(long j, long j2) {
        return new C4719kj((j * 1000000) / this.f12299a.f12524e, this.f12300b + j2);
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public boolean mo92788b() {
        return true;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: d */
    public long mo92786d() {
        return this.f12299a.m92461b();
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public InterfaceC4591ij.C4592a mo92787b(long j) {
        AbstractC4100b1.m100578b(this.f12299a.f12530k);
        C5960z8 c5960z8 = this.f12299a;
        C5960z8.C5961a c5961a = c5960z8.f12530k;
        long[] jArr = c5961a.f12532a;
        long[] jArr2 = c5961a.f12533b;
        int m92980b = AbstractC5863xp.m92980b(jArr, c5960z8.m92467a(j), true, false);
        C4719kj m92789a = m92789a(m92980b == -1 ? 0L : jArr[m92980b], m92980b != -1 ? jArr2[m92980b] : 0L);
        if (m92789a.f7553a != j && m92980b != jArr.length - 1) {
            int i = m92980b + 1;
            return new InterfaceC4591ij.C4592a(m92789a, m92789a(jArr[i], jArr2[i]));
        }
        return new InterfaceC4591ij.C4592a(m92789a);
    }
}
