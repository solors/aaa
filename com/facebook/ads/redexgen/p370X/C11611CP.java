package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.CP */
/* loaded from: assets/audience_network.dex */
public final class C11611CP {
    public static byte[] A09;
    public static String[] A0A = {"xMNext", "zlzEwhsQC3FpKQNfU72ignmkxEXGlEWQ", "hTVEjk3rNFsg66RRpHStC4yCUn29H2cK", "lb2Z9KtgGwzkm6WUebOJTSliuGJIKPxa", "NDBSvjeraksgouCWowC9mNbakqVzapXj", "jkP3sVUJry8UgHuLS2r02X6f", "lSPidmQgGebPlfolmgnIPeXjLgEThElM", "Xkj28o"};
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C11939I4 A06;
    public final C11939I4 A07;
    public final boolean A08;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 30;
            if (A0A[1].charAt(28) == 'R') {
                throw new RuntimeException();
            }
            A0A[2] = "7TPgv6JzmOMJusvdxeRCHMdlPjF1ygj3";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-92, -89, -80, -79, -78, -99, -95, -90, -77, -84, -87, 94, -85, -77, -79, -78, 94, -96, -93, 94, 111};
    }

    static {
        A01();
    }

    public C11611CP(C11939I4 c11939i4, C11939I4 c11939i42, boolean z) {
        this.A07 = c11939i4;
        this.A06 = c11939i42;
        this.A08 = z;
        c11939i42.A0Y(12);
        this.A05 = c11939i42.A0H();
        c11939i4.A0Y(12);
        this.A04 = c11939i4.A0H();
        AbstractC11914Hf.A06(c11939i4.A08() == 1, A00(0, 21, 32));
        this.A00 = -1;
    }

    public final boolean A02() {
        long A0M;
        int i;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == this.A05) {
            if (A0A[4].charAt(18) != 'C') {
                throw new RuntimeException();
            }
            A0A[5] = "9rTTdGUS3";
            return false;
        }
        if (this.A08) {
            A0M = this.A06.A0N();
        } else {
            C11939I4 c11939i4 = this.A06;
            String[] strArr = A0A;
            if (strArr[6].charAt(8) != strArr[3].charAt(8)) {
                A0A[4] = "IGdwwTQI2iFuokxRsKC9HYA9e5TBmMKA";
                A0M = c11939i4.A0M();
            } else {
                String[] strArr2 = A0A;
                strArr2[0] = "DD1qjj";
                strArr2[7] = "zmmxaf";
                A0M = c11939i4.A0M();
            }
        }
        this.A02 = A0M;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0H();
            this.A07.A0Z(4);
            int i3 = this.A04 - 1;
            this.A04 = i3;
            if (i3 > 0) {
                i = this.A07.A0H() - 1;
            } else {
                i = -1;
            }
            this.A03 = i;
        }
        return true;
    }
}
