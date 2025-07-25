package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.YW */
/* loaded from: assets/audience_network.dex */
public final class C12945YW implements InterfaceC11612CQ {
    public final int A00;
    public final int A01;
    public final C11939I4 A02;

    public C12945YW(C12946YX c12946yx) {
        this.A02 = c12946yx.A00;
        this.A02.A0Y(12);
        this.A00 = this.A02.A0H();
        this.A01 = this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11612CQ
    public final int A8C() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11612CQ
    public final boolean A9S() {
        return this.A00 != 0;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11612CQ
    public final int AEq() {
        return this.A00 == 0 ? this.A02.A0H() : this.A00;
    }
}
