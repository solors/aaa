package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.b3 */
/* loaded from: classes2.dex */
final class C4102b3 implements InterfaceC5019nl {

    /* renamed from: a */
    private final List f4884a;

    public C4102b3(List list) {
        this.f4884a = list;
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94602a() {
        return 1;
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: b */
    public List mo94597b(long j) {
        if (j >= 0) {
            return this.f4884a;
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94600a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public long mo94601a(int i) {
        AbstractC4100b1.m100580a(i == 0);
        return 0L;
    }
}
