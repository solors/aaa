package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xm */
/* loaded from: assets/audience_network.dex */
public class C12899Xm implements InterfaceC11685Dd {
    public static byte[] A00;
    public static String[] A01 = {"wk8oh2v4CuoEz91Q8ddyD4vW4OkPIqhz", "TrnvrzX", "avvRCVNMMCxdLH2GcUGi3f", "9N2kSsE3lVRujQ8aZphxKZ15", "6oAq20NcGdPAdIGxLKdGW0uH0QkLBftR", "pUHCrP55Ymm0t5Q", "CGpYVsyVcgyLsLvhkYxzWTdg", "6TV83KfgcjdGc5chuG3yAE2DLzpv0l0a"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{60, 9, 9, 24, 16, 13, 9, 24, 25, 93, 9, 18, 93, 30, 15, 24, 28, 9, 24, 93, 25, 24, 30, 18, 25, 24, 15, 93, 27, 18, 15, 93, 8, 19, 14, 8, 13, 13, 18, 15, 9, 24, 25, 93, 27, 18, 15, 16, 28, 9, 24, 9, 9, 21, 16, 26, 24, 13, 16, 22, 23, 86, 16, 29, 74, 20, 5, 5, 25, 28, 22, 20, 1, 28, 26, 27, 90, 13, 88, 16, 24, 6, 18, 14, 31, 31, 3, 6, 12, 14, 27, 6, 0, 1, SignedBytes.MAX_POWER_OF_TWO, 23, 66, 28, 12, 27, 10, 92, 90};
    }

    static {
        A01();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11685Dd
    public final InterfaceC11683Db A4u(Format format) {
        char c;
        String str = format.A0O;
        switch (str.hashCode()) {
            case -1248341703:
                if (str.equals(A00(50, 15, 44))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1154383568:
                String[] strArr = A01;
                if (strArr[3].length() == strArr[6].length()) {
                    String[] strArr2 = A01;
                    strArr2[3] = "8oGlDfhTgiX4kZXrmDxnswR6";
                    strArr2[6] = "sPUpEdfrXW7HqAznk87fzPk6";
                    if (str.equals(A00(65, 18, 32))) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 1652648887:
                if (str.equals(A00(83, 20, 58))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new C12896Xi();
            case 1:
                return new C12898Xk();
            case 2:
                return new C12895Xf();
            default:
                throw new IllegalArgumentException(A00(0, 50, 40));
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11685Dd
    public final boolean AH7(Format format) {
        String str = format.A0O;
        String mimeType = A00(50, 15, 44);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(65, 18, 32);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(83, 20, 58);
                boolean equals = mimeType3.equals(str);
                String mimeType4 = A01[5];
                if (mimeType4.length() == 16) {
                    throw new RuntimeException();
                }
                A01[5] = "g8nn2mhnPz";
                if (!equals) {
                    return false;
                }
            }
        }
        return true;
    }
}
