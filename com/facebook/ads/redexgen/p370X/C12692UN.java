package com.facebook.ads.redexgen.p370X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.UN */
/* loaded from: assets/audience_network.dex */
public class C12692UN implements InterfaceC12305O7 {
    public final WeakReference<AbstractC11551BP> A00;

    public C12692UN(AbstractC11551BP abstractC11551BP) {
        this.A00 = new WeakReference<>(abstractC11551BP);
    }

    public /* synthetic */ C12692UN(AbstractC11551BP abstractC11551BP, C11556BU c11556bu) {
        this(abstractC11551BP);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12305O7
    public final void AC8(boolean z) {
        AbstractC11551BP cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z;
            cardLayout.A05();
        }
    }
}
