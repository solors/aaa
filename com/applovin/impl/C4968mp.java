package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.mp */
/* loaded from: classes2.dex */
final class C4968mp implements InterfaceC5019nl {

    /* renamed from: b */
    public static final C4968mp f8458b = new C4968mp();

    /* renamed from: a */
    private final List f8459a;

    private C4968mp() {
        this.f8459a = Collections.emptyList();
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
            return this.f8459a;
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94600a(long j) {
        return j < 0 ? 0 : -1;
    }

    public C4968mp(C3989a5 c3989a5) {
        this.f8459a = Collections.singletonList(c3989a5);
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public long mo94601a(int i) {
        AbstractC4100b1.m100580a(i == 0);
        return 0L;
    }
}
