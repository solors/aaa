package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.al */
/* loaded from: classes2.dex */
final class C4076al implements InterfaceC5019nl {

    /* renamed from: a */
    private final List f4801a;

    /* renamed from: b */
    private final List f4802b;

    public C4076al(List list, List list2) {
        this.f4801a = list;
        this.f4802b = list2;
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public long mo94601a(int i) {
        AbstractC4100b1.m100580a(i >= 0);
        AbstractC4100b1.m100580a(i < this.f4802b.size());
        return ((Long) this.f4802b.get(i)).longValue();
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: b */
    public List mo94597b(long j) {
        int m92983b = AbstractC5863xp.m92983b(this.f4802b, (Comparable) Long.valueOf(j), true, false);
        if (m92983b == -1) {
            return Collections.emptyList();
        }
        return (List) this.f4801a.get(m92983b);
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94602a() {
        return this.f4802b.size();
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94600a(long j) {
        int m93009a = AbstractC5863xp.m93009a(this.f4802b, (Comparable) Long.valueOf(j), false, false);
        if (m93009a < this.f4802b.size()) {
            return m93009a;
        }
        return -1;
    }
}
