package com.facebook.ads.redexgen.p370X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ur */
/* loaded from: assets/audience_network.dex */
public class C12722Ur extends AbstractRunnableC12086KY {
    public final WeakReference<C12530Rk> A00;

    public C12722Ur(C12530Rk c12530Rk) {
        this.A00 = new WeakReference<>(c12530Rk);
    }

    public C12722Ur(WeakReference<C12530Rk> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        C12530Rk viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
