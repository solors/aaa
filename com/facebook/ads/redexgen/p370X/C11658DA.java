package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.DA */
/* loaded from: assets/audience_network.dex */
public final class C11658DA {
    public static String[] A08 = {"ZunWLTCOIeJYFJffUw9", "v7UW83uB4CXpuAJPiqL", "m2soIO3PVQ24y4mXJp6BPxoiSRSk", "lWXZgTR79dXfBN4bKYDC9NT5SIZThBqa", "jJ62S2YkTrNcVcfPKr8ssmQcBjICfRdL", "nHkGt1MBBsIxXO9Vrc3pA339", "iQBWmVjB1ByHXi", "McIj8fqGFOMO4oIbQR6Ew6MhQAT"};
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC11651D3 A05;
    public final C11938I3 A06 = new C11938I3(new byte[64]);
    public final C11950IG A07;

    public C11658DA(InterfaceC11651D3 interfaceC11651D3, C11950IG c11950ig) {
        this.A05 = interfaceC11651D3;
        this.A07 = c11950ig;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            long pts = this.A06.A04(3) << 30;
            this.A06.A08(1);
            long pts2 = pts | (this.A06.A04(15) << 15);
            this.A06.A08(1);
            long pts3 = pts2 | this.A06.A04(15);
            this.A06.A08(1);
            if (!this.A04) {
                boolean z = this.A02;
                if (A08[6].length() != 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[0] = "feqv4rRQ7ZP5D55JX2e";
                strArr[1] = "tJttPKovNmfgsPQIHKZ";
                if (z) {
                    this.A06.A08(4);
                    this.A06.A08(1);
                    long A04 = (this.A06.A04(3) << 30) | (this.A06.A04(15) << 15);
                    C11938I3 c11938i3 = this.A06;
                    if (A08[5].length() != 24) {
                        A08[2] = "k2SpdwxF2GRIVTLIk4dksKuAMULx";
                        c11938i3.A08(1);
                        this.A06.A08(1);
                        this.A07.A07(A04 | this.A06.A04(15));
                        this.A04 = true;
                    } else {
                        A08[2] = "VPNHH6bjz4BHnLiGSe5ehxt0fgft";
                        c11938i3.A08(1);
                        this.A06.A08(1);
                        this.A07.A07(A04 | this.A06.A04(15));
                        this.A04 = true;
                    }
                }
            }
            this.A01 = this.A07.A07(pts3);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AG6();
    }

    public final void A03(C11939I4 c11939i4) throws C11464A0 {
        c11939i4.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c11939i4.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.AEM(this.A01, true);
        this.A05.A4n(c11939i4);
        this.A05.AEL();
    }
}
