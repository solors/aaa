package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Vj */
/* loaded from: assets/audience_network.dex */
public class C12775Vj implements InterfaceC12157Lj {
    public final C12156Li A00;
    public final InterfaceC12157Lj A01;

    public C12775Vj(InterfaceC12157Lj interfaceC12157Lj, int i, int i2) {
        this.A01 = interfaceC12157Lj;
        this.A00 = new C12156Li(i, i2);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12157Lj
    public final void AEb(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() != null) {
            A08 = AbstractC12159Ll.A08(this.A00);
            if (A08) {
                this.A01.AEb(this.A00.A02());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12157Lj
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = AbstractC12159Ll.A08(this.A00);
            if (A08) {
                this.A01.AEb(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
