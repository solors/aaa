package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.YE */
/* loaded from: assets/audience_network.dex */
public final class C12927YE implements InterfaceC11651D3 {
    public static String[] A0C = {"UR", "FY5Q8wkMzwGgA7CHszR", "oo", "rr9Xmu114t4y3gs6khcCbH1NFDvtdjMs", "UjrPFe3d7TQjPi7HMFQy8aGwM8eNaoDN", "xcuQi76y2EBejEkhYDRMU4MF2hp8ggad", "ib8jr0kQKGvv5", "3vBuLU5L6MxmfiHBCqMCSpz7UqqXldTw"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Format A05;
    public InterfaceC11595C9 A06;
    public String A07;
    public boolean A08;
    public final C11938I3 A09;
    public final C11939I4 A0A;
    public final String A0B;

    public C12927YE() {
        this(null);
    }

    public C12927YE(String str) {
        this.A09 = new C11938I3(new byte[128]);
        this.A0A = new C11939I4(this.A09.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    private void A00() {
        this.A09.A07(0);
        C11494AU A09 = AbstractC11495AV.A09(this.A09);
        if (this.A05 == null || A09.A00 != this.A05.A05 || A09.A03 != this.A05.A0C || A09.A05 != this.A05.A0O) {
            this.A05 = Format.A07(this.A07, A09.A05, null, -1, -1, A09.A00, A09.A03, null, null, 0, this.A0B);
            this.A06.A69(this.A05);
        }
        this.A01 = A09.A01;
        this.A03 = (A09.A02 * 1000000) / this.A05.A0C;
    }

    private boolean A01(C11939I4 c11939i4) {
        while (true) {
            if (c11939i4.A04() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = c11939i4.A0E() == 11;
            } else {
                int A0E = c11939i4.A0E();
                if (A0E == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = A0E == 11;
            }
        }
    }

    private boolean A02(C11939I4 c11939i4, byte[] bArr, int i) {
        int min = Math.min(c11939i4.A04(), i - this.A00);
        int bytesToRead = this.A00;
        c11939i4.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11651D3
    public final void A4n(C11939I4 c11939i4) {
        while (c11939i4.A04() > 0) {
            switch (this.A02) {
                case 0:
                    if (!A01(c11939i4)) {
                        break;
                    } else {
                        this.A02 = 1;
                        this.A0A.A00[0] = 11;
                        this.A0A.A00[1] = 119;
                        this.A00 = 2;
                        break;
                    }
                case 1:
                    byte[] bArr = this.A0A.A00;
                    String[] strArr = A0C;
                    if (strArr[0].length() == strArr[2].length()) {
                        String[] strArr2 = A0C;
                        strArr2[7] = "0SbbrZbiygrnA8KIjiYAllo3xZVtG9CY";
                        strArr2[6] = "3iWCKJ6X5JwOa";
                        if (!A02(c11939i4, bArr, 128)) {
                            break;
                        } else {
                            A00();
                            this.A0A.A0Y(0);
                            this.A06.AFv(this.A0A, 128);
                            this.A02 = 2;
                        }
                    } else if (!A02(c11939i4, bArr, 128)) {
                        break;
                    } else {
                        A00();
                        this.A0A.A0Y(0);
                        this.A06.AFv(this.A0A, 128);
                        this.A02 = 2;
                        break;
                    }
                case 2:
                    int min = Math.min(c11939i4.A04(), this.A01 - this.A00);
                    this.A06.AFv(c11939i4, min);
                    int bytesToRead = this.A00;
                    this.A00 = bytesToRead + min;
                    String[] strArr3 = A0C;
                    String str = strArr3[5];
                    String str2 = strArr3[4];
                    int charAt = str.charAt(30);
                    int bytesToRead2 = str2.charAt(30);
                    if (charAt != bytesToRead2) {
                        A0C[3] = "zjnaxiSB7LOeccAdxYsFw2TSMtFsjVwI";
                        int i = this.A00;
                        int bytesToRead3 = this.A01;
                        if (i != bytesToRead3) {
                            break;
                        } else {
                            this.A06.AFw(this.A04, 1, this.A01, 0, null);
                            this.A04 += this.A03;
                            this.A02 = 0;
                            break;
                        }
                    } else {
                        throw new RuntimeException();
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11651D3
    public final void A5B(InterfaceC11585Bz interfaceC11585Bz, C11665DH c11665dh) {
        c11665dh.A05();
        this.A07 = c11665dh.A04();
        this.A06 = interfaceC11585Bz.AHA(c11665dh.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11651D3
    public final void AEL() {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11651D3
    public final void AEM(long j, boolean z) {
        this.A04 = j;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11651D3
    public final void AG6() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}
