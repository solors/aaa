package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.YP */
/* loaded from: assets/audience_network.dex */
public class C12938YP implements InterfaceC11592C6 {
    public final /* synthetic */ C12937YO A00;

    public C12938YP(C12937YO c12937yo) {
        this.A00 = c12937yo;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final long A7F() {
        AbstractC11641Ct abstractC11641Ct;
        long j;
        abstractC11641Ct = this.A00.A0B;
        j = this.A00.A07;
        return abstractC11641Ct.A03(j);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final C11591C5 A8H(long j) {
        AbstractC11641Ct abstractC11641Ct;
        long j2;
        long A00;
        long j3;
        if (j == 0) {
            j3 = this.A00.A09;
            return new C11591C5(new C11593C7(0L, j3));
        }
        abstractC11641Ct = this.A00.A0B;
        long A04 = abstractC11641Ct.A04(j);
        C12937YO c12937yo = this.A00;
        j2 = this.A00.A09;
        A00 = c12937yo.A00(j2, A04, 30000L);
        return new C11591C5(new C11593C7(j, A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final boolean A9h() {
        return true;
    }
}
