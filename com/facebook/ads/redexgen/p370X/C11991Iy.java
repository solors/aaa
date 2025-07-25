package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Iy */
/* loaded from: assets/audience_network.dex */
public final class C11991Iy {
    public static String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", "n", "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public EnumC11988Iv A01 = EnumC11988Iv.A03;
    public EnumC11989Iw A02 = EnumC11989Iw.A06;
    public EnumC11990Ix A03 = EnumC11990Ix.A02;
    public EnumC11987Iu A00 = EnumC11987Iu.A02;

    public final void A00() {
        this.A00 = EnumC11987Iu.A03;
    }

    public final void A01() {
        this.A02 = EnumC11989Iw.A04;
    }

    public final void A02() {
        this.A02 = EnumC11989Iw.A05;
    }

    public final void A03() {
        this.A03 = EnumC11990Ix.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC11989Iw.A06) {
            EnumC11989Iw enumC11989Iw = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (enumC11989Iw != EnumC11989Iw.A02 && this.A02 != EnumC11989Iw.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC11989Iw.A06 || this.A02 == EnumC11989Iw.A02;
    }

    public final boolean A06() {
        return this.A03 == EnumC11990Ix.A03;
    }

    public final boolean A07() {
        return this.A00 == EnumC11987Iu.A03;
    }
}
