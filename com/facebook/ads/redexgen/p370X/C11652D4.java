package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.D4 */
/* loaded from: assets/audience_network.dex */
public final class C11652D4 {
    public static String[] A04 = {"2QTGoYMpfKLSzpVAlAXt3wO29bqk4RAA", "gIVLvkl7NjInzfAn9w", "LtzZXv6bjFNgAMVtXqfV0PMfXX50BMJx", "cWJguejgjTPrXLbmw", "RAr", "xZz", "IB4Qfid", "bOBzxUCB3cvUoI573SXQe51BlLqC0MhI"};
    public static final byte[] A05 = {0, 0, 1};
    public int A00;
    public int A01;
    public byte[] A02;
    public boolean A03;

    public C11652D4(int i) {
        this.A02 = new byte[i];
    }

    public final void A00() {
        this.A03 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public final void A01(byte[] bArr, int i, int i2) {
        if (!this.A03) {
            return;
        }
        int i3 = i2 - i;
        int length = this.A02.length;
        int readLength = this.A00;
        if (length < readLength + i3) {
            byte[] bArr2 = this.A02;
            int readLength2 = this.A00;
            byte[] copyOf = Arrays.copyOf(bArr2, (readLength2 + i3) * 2);
            if (A04[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "23XjLY44GlUE0KmRGTXDOChbYzVQi08X";
            strArr[7] = "Ggy0EBkUq5vQG10YsWXxjCC7KKoqUJqT";
            this.A02 = copyOf;
        }
        byte[] bArr3 = this.A02;
        int readLength3 = this.A00;
        System.arraycopy(bArr, i, bArr3, readLength3, i3);
        int readLength4 = this.A00;
        this.A00 = readLength4 + i3;
    }

    public final boolean A02(int i, int i2) {
        if (this.A03) {
            this.A00 -= i2;
            if (this.A01 == 0 && i == 181) {
                this.A01 = this.A00;
            } else {
                this.A03 = false;
                return true;
            }
        } else if (i == 179) {
            this.A03 = true;
        }
        A01(A05, 0, A05.length);
        return false;
    }
}
