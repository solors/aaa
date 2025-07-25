package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.by */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC13156by implements InterfaceC112646X {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC13156by(boolean z) {
        this.A00 = z;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC112646X
    public final void ABT() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC112646X
    public final void ABc() {
        A01(true);
    }
}
