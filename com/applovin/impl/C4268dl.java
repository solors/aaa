package com.applovin.impl;

/* renamed from: com.applovin.impl.dl */
/* loaded from: classes2.dex */
final class C4268dl extends AbstractC4448g9 {

    /* renamed from: b */
    private final long f5666b;

    public C4268dl(InterfaceC4703k8 interfaceC4703k8, long j) {
        super(interfaceC4703k8);
        boolean z;
        if (interfaceC4703k8.mo97999f() >= j) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        this.f5666b = j;
    }

    @Override // com.applovin.impl.AbstractC4448g9, com.applovin.impl.InterfaceC4703k8
    /* renamed from: a */
    public long mo98011a() {
        return super.mo98011a() - this.f5666b;
    }

    @Override // com.applovin.impl.AbstractC4448g9, com.applovin.impl.InterfaceC4703k8
    /* renamed from: d */
    public long mo98001d() {
        return super.mo98001d() - this.f5666b;
    }

    @Override // com.applovin.impl.AbstractC4448g9, com.applovin.impl.InterfaceC4703k8
    /* renamed from: f */
    public long mo97999f() {
        return super.mo97999f() - this.f5666b;
    }
}
