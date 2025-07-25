package com.fyber.inneractive.sdk.network;

import p1077ze.C45292c0;

/* renamed from: com.fyber.inneractive.sdk.network.o0 */
/* loaded from: classes4.dex */
public final class C14721o0 extends C14714l {

    /* renamed from: g */
    public final C45292c0 f27899g;

    public C14721o0(C14714l c14714l, C45292c0 c45292c0) {
        this.f27899g = c45292c0;
        this.f27885d = c14714l.f27885d;
        this.f27884c = c14714l.f27884c;
        this.f27886e = c14714l.f27886e;
        this.f27882a = c14714l.f27882a;
    }

    @Override // com.fyber.inneractive.sdk.network.C14714l
    /* renamed from: a */
    public final void mo77681a() {
        super.mo77681a();
        C45292c0 c45292c0 = this.f27899g;
        if (c45292c0 != null) {
            c45292c0.close();
        }
    }
}
