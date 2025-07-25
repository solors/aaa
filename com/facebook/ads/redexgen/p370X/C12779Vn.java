package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Vn */
/* loaded from: assets/audience_network.dex */
public class C12779Vn implements InterfaceC12157Lj {
    public int A00;
    public final InterfaceC12157Lj A01;
    public final InterfaceC12157Lj A02;

    public C12779Vn(InterfaceC12157Lj interfaceC12157Lj, int i, InterfaceC12157Lj interfaceC12157Lj2) {
        this.A01 = interfaceC12157Lj;
        this.A00 = i;
        this.A02 = interfaceC12157Lj2;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12157Lj
    public final void AEb(String str) {
        if (this.A00 > 0) {
            this.A01.AEb(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AEb(str);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12157Lj
    public final void flush() {
        this.A02.flush();
    }
}
