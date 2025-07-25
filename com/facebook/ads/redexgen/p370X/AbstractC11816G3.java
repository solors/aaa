package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.G3 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11816G3 {
    public static byte[] A00;
    public static final int A01;
    public static final int A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{9, 43, 39, 27, 58, 47, 50, -8, 8, -5, -27, -5, -11, -19, -24, -29, -5, -7, 0, 0, -7, -2, -9, -80, 2, -11, -3, -15, -7, -2, -12, -11, 2, -80, -1, -10, -80, -3, -15, -4, -10, -1, 2, -3, -11, -12, -80, -29, -43, -39, -80, -34, -47, -36, -80, 5, -2, -7, 4, -66};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A03(long j, C11939I4 c11939i4, InterfaceC11595C9[] interfaceC11595C9Arr) {
        while (c11939i4.A04() > 1) {
            int A002 = A00(c11939i4);
            int A003 = A00(c11939i4);
            int A06 = c11939i4.A06() + A003;
            if (A003 == -1 || A003 > c11939i4.A04()) {
                Log.w(A01(0, 7, 126), A01(15, 45, 72));
                A06 = c11939i4.A07();
            } else if (A002 == 4 && A003 >= 8) {
                int A0E = c11939i4.A0E();
                int A0I = c11939i4.A0I();
                int A08 = A0I == 49 ? c11939i4.A08() : 0;
                int A0E2 = c11939i4.A0E();
                if (A0I == 47) {
                    c11939i4.A0Z(1);
                }
                boolean z = A0E == 181 && (A0I == 49 || A0I == 47) && A0E2 == 3;
                if (A0I == 49) {
                    z &= A08 == A02 || A08 == A01;
                }
                if (z) {
                    c11939i4.A0Z(1);
                    int A0E3 = (c11939i4.A0E() & 31) * 3;
                    int A062 = c11939i4.A06();
                    for (InterfaceC11595C9 interfaceC11595C9 : interfaceC11595C9Arr) {
                        c11939i4.A0Y(A062);
                        interfaceC11595C9.AFv(c11939i4, A0E3);
                        interfaceC11595C9.AFw(j, 1, A0E3, 0, null);
                    }
                }
            }
            c11939i4.A0Y(A06);
        }
    }

    static {
        A02();
        A02 = AbstractC11953IK.A08(A01(11, 4, 108));
        A01 = AbstractC11953IK.A08(A01(7, 4, 108));
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(com.facebook.ads.redexgen.p370X.C11939I4 r3) {
        /*
            r2 = 0
        L1:
            int r0 = r3.A04()
            if (r0 != 0) goto L9
            r0 = -1
            return r0
        L9:
            int r1 = r3.A0E()
            int r2 = r2 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.AbstractC11816G3.A00(com.facebook.ads.redexgen.X.I4):int");
    }
}
