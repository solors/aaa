package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.dm */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC13255dm {
    public InterfaceC13256dn A00;

    public final void A00() {
        if (this.A00 != null) {
            this.A00.onStart();
        }
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.onStop();
        }
    }

    public final void A02(InterfaceC13256dn interfaceC13256dn) {
        this.A00 = interfaceC13256dn;
    }
}
