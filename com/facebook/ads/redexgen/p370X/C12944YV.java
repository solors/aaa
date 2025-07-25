package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.YV */
/* loaded from: assets/audience_network.dex */
public final class C12944YV implements InterfaceC11612CQ {
    public static String[] A05 = {"H8DZxZg0P9MFCvur7W3rQA1KNyeBpUa4", "kBasQTsOhKFuSIN665P5n65EsSFxE2tn", "JxOvKTSKlNEkhUnh8wyI9NTodbLbyMe3", "JVQ78sQMRVJmUHsNCZ", "TsLIL25bHT1fMFDlj", "PtC8C6Az64Ix4yiVh", "SqVe7zamj5uHBY9dXNHGQ3Qd7KSgTA2W", "b7dV8OUkEJKZ"};
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C11939I4 A04;

    public C12944YV(C12946YX c12946yx) {
        this.A04 = c12946yx.A00;
        this.A04.A0Y(12);
        this.A02 = this.A04.A0H() & 255;
        this.A03 = this.A04.A0H();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11612CQ
    public final int A8C() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11612CQ
    public final boolean A9S() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11612CQ
    public final int AEq() {
        if (this.A02 == 8) {
            C11939I4 c11939i4 = this.A04;
            String[] strArr = A05;
            if (strArr[2].charAt(5) == strArr[1].charAt(5)) {
                String[] strArr2 = A05;
                strArr2[2] = "r9lAcTT6c7KpUPZJwjswQw6vGf8cfx9K";
                strArr2[1] = "h0emITNVyHPC7rvjgGvXLhCkRflG1h5g";
                return c11939i4.A0E();
            }
        } else if (this.A02 == 16) {
            return this.A04.A0I();
        } else {
            int i = this.A01;
            this.A01 = i + 1;
            int i2 = i % 2;
            String[] strArr3 = A05;
            if (strArr3[3].length() != strArr3[7].length()) {
                String[] strArr4 = A05;
                strArr4[3] = "D3KcOoJQg0O5kxA1pn";
                strArr4[7] = "1gJPUX4ukYsx";
                if (i2 == 0) {
                    this.A00 = this.A04.A0E();
                    return (this.A00 & 240) >> 4;
                }
                int i3 = this.A00;
                String[] strArr5 = A05;
                if (strArr5[4].length() != strArr5[5].length()) {
                    return i3 & 15;
                }
                String[] strArr6 = A05;
                strArr6[2] = "D7nsCTu4WHZcq0yvD5tpLnwpHqZucvgG";
                strArr6[1] = "2sbQwT73EZw2kTLUi8M2jStfSnxhE6eL";
                return i3 & 15;
            }
        }
        throw new RuntimeException();
    }
}
