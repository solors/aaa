package com.facebook.ads.redexgen.p370X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Uf */
/* loaded from: assets/audience_network.dex */
public class C12710Uf implements InterfaceC12305O7 {
    public final WeakReference<C11561BZ> A00;

    public C12710Uf(C11561BZ c11561bz) {
        this.A00 = new WeakReference<>(c11561bz);
    }

    public /* synthetic */ C12710Uf(C11561BZ c11561bz, C11570Bk c11570Bk) {
        this(c11561bz);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12305O7
    public final void AC8(boolean z) {
        C11561BZ cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z;
            cardLayout.A04();
        }
    }
}
