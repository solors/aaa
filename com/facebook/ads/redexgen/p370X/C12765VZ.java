package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.VZ */
/* loaded from: assets/audience_network.dex */
public class C12765VZ implements InterfaceC12290Ns {
    public final /* synthetic */ C12764VY A00;

    public C12765VZ(C12764VY c12764vy) {
        this.A00 = c12764vy;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12290Ns
    public final void ACw(String str) {
        this.A00.A0C.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12290Ns
    public final void ACy(String str) {
        this.A00.A05 = true;
        this.A00.A0B.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12290Ns
    public final void ADG(int i) {
        if (this.A00.A05) {
            this.A00.A0C.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12290Ns
    public final void ADJ(String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12290Ns
    public final void ADL() {
        this.A00.A0A.ABR(14);
    }
}
