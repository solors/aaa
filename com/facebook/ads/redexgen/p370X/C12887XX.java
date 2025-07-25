package com.facebook.ads.redexgen.p370X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.XX */
/* loaded from: assets/audience_network.dex */
public final class C12887XX implements InterfaceC11769FG {
    public final int A00;
    public final /* synthetic */ C11688Dg A01;

    public C12887XX(C11688Dg c11688Dg, int i) {
        this.A01 = c11688Dg;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11769FG
    public final boolean A9b() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11769FG
    public final void AAm() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11769FG
    public final int AEn(C114589u c114589u, C12971Yw c12971Yw, boolean z) {
        return this.A01.A0P(this.A00, c114589u, c12971Yw, z);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11769FG
    public final int AGp(long j) {
        return this.A01.A0O(this.A00, j);
    }
}
