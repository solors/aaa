package com.applovin.impl;

import java.util.List;

/* renamed from: com.applovin.impl.i7 */
/* loaded from: classes2.dex */
public final class C4571i7 extends AbstractC4336ek {

    /* renamed from: o */
    private final C4632j7 f6808o;

    public C4571i7(List list) {
        super("DvbDecoder");
        C4066ah c4066ah = new C4066ah((byte[]) list.get(0));
        this.f6808o = new C4632j7(c4066ah.m100799C(), c4066ah.m100799C());
    }

    @Override // com.applovin.impl.AbstractC4336ek
    /* renamed from: a */
    protected InterfaceC5019nl mo92614a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f6808o.m98290d();
        }
        return new C4702k7(this.f6808o.m98299a(bArr, i));
    }
}
