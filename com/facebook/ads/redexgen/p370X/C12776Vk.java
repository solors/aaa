package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Vk */
/* loaded from: assets/audience_network.dex */
public class C12776Vk implements InterfaceC12157Lj {
    public int A00;
    public final InterfaceC12157Lj A01;

    public C12776Vk(InterfaceC12157Lj interfaceC12157Lj, int i) {
        this.A01 = interfaceC12157Lj;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12157Lj
    public final void AEb(String str) {
        if (this.A00 > 0) {
            this.A01.AEb(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12157Lj
    public final void flush() {
        this.A01.flush();
    }
}
