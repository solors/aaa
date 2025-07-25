package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.D0 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11648D0 {
    public static byte[] A00;
    public static String[] A01 = {"qTZEp", "4FC", "GVjMT7IO", "idgz8GTtDxXm2DT6Q4W8HIp0oNrYHYmb", "FbpHKh3QT1SdWaw7OeCQFPuoblxH9zoB", "jQTmnshEA3vQhZuIt4EWQ9mfUiSmLT6K", "Lm0", "luRz3eSIkgTHKYiDYnp1YmzqTFiN9rHv"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C11647Cz A04(C11939I4 c11939i4) throws C11464A0 {
        A0A(1, c11939i4, false);
        long A0K = c11939i4.A0K();
        int A0E = c11939i4.A0E();
        long A0K2 = c11939i4.A0K();
        int A0A = c11939i4.A0A();
        int A0A2 = c11939i4.A0A();
        int A0A3 = c11939i4.A0A();
        int A0E2 = c11939i4.A0E();
        return new C11647Cz(A0K, A0E, A0K2, A0A, A0A2, A0A3, (int) Math.pow(2.0d, A0E2 & 15), (int) Math.pow(2.0d, (A0E2 & 240) >> 4), (c11939i4.A0E() & 1) > 0, Arrays.copyOf(c11939i4.A00, c11939i4.A07()));
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{82, 107, 118, 102, 109, 119, 81, 112, 109, 104, 35, 62, 54, 35, 37, 50, 35, 34, 102, 37, 46, 39, 52, 39, 37, 50, 35, 52, 53, 102, 97, 48, 41, 52, 36, 47, 53, 97, 37, 56, 48, 37, 35, 52, 37, 36, 96, 35, 47, 36, 37, 96, 34, 47, 47, 43, 96, 52, 47, 96, 51, 52, 33, 50, 52, 96, 55, 41, 52, 40, 96, 27, 112, 56, 117, 118, 108, 96, 112, 56, 116, 115, 108, 96, 112, 56, 116, 114, 29, 96, 33, 52, 96, 122, 103, 111, 122, 124, 107, 122, 123, 63, 119, 122, 126, 123, 122, 109, 63, 107, 102, 111, 122, 63, 59, 49, 50, 50, 47, 125, 41, 36, 45, 56, 125, 58, 47, 56, 60, 41, 56, 47, 125, 41, 53, 60, 51, 125, 108, 125, 51, 50, 41, 125, 57, 56, 62, 50, 57, 60, 63, 49, 56, 103, 125, 123, 111, 124, 112, 116, 115, 122, 61, Byte.MAX_VALUE, 116, 105, 61, 124, 123, 105, 120, 111, 61, 112, 114, 121, 120, 110, 61, 115, 114, 105, 61, 110, 120, 105, 61, 124, 110, 61, 120, 101, 109, 120, 126, 105, 120, 121, 32, 52, 39, 43, 47, 40, 33, 102, 36, 47, 50, 102, 35, 62, 54, 35, 37, 50, 35, 34, 102, 50, 41, 102, 36, 35, 102, 53, 35, 50, 77, 78, 78, 74, 84, 81, 1, 85, 88, 81, 68, 1, 70, 83, 68, SignedBytes.MAX_POWER_OF_TWO, 85, 68, 83, 1, 85, 73, SignedBytes.MAX_POWER_OF_TWO, 79, 1, 19, 1, 79, 78, 85, 1, 69, 68, 66, 78, 69, SignedBytes.MAX_POWER_OF_TWO, 67, 77, 68, 27, 1, 114, 126, 111, 111, 118, 113, 120, 63, 107, 102, 111, 122, 63, 112, 107, 119, 122, 109, 63, 107, 119, 126, 113, 63, 47, 63, 113, 112, 107, 63, 108, 106, 111, 111, 112, 109, 107, 122, 123, 37, 63, 76, 80, 93, 95, 89, 84, 83, 80, 88, 89, 78, 28, 83, 90, 28, 72, 85, 81, 89, 28, 88, 83, 81, 93, 85, 82, 28, 72, 78, 93, 82, 79, 90, 83, 78, 81, 79, 28, 82, 83, 72, 28, 70, 89, 78, 83, 89, 88, 28, 83, 73, 72, 48, 39, 49, 43, 38, 55, 39, 22, 59, 50, 39, 98, 37, 48, 39, 35, 54, 39, 48, 98, 54, 42, 35, 44, 98, 112, 98, 43, 49, 98, 44, 45, 54, 98, 38, 39, 33, 45, 38, 35, 32, 46, 39, 48, 43, 100, 54, 33, 55, 33, 54, 50, 33, 32, 100, 38, 45, 48, 55, 100, 41, 49, 55, 48, 100, 38, 33, 100, 62, 33, 54, 43, 100, 37, 34, 48, 33, 54, 100, 41, 37, 52, 52, 45, 42, 35, 100, 39, 43, 49, 52, 40, 45, 42, 35, 100, 55, 48, 33, 52, 55, 4, 31, 31, 80, 3, 24, 31, 2, 4, 80, 24, 21, 17, 20, 21, 2, 74, 80};
    }

    static {
        A06();
    }

    public static int A00(int i) {
        int val = 0;
        while (i > 0) {
            val++;
            i >>>= 1;
        }
        return val;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x006d */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0025 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p370X.C11644Cw A02(com.facebook.ads.redexgen.p370X.C11642Cu r14) throws com.facebook.ads.redexgen.p370X.C11464A0 {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.AbstractC11648D0.A02(com.facebook.ads.redexgen.X.Cu):com.facebook.ads.redexgen.X.Cw");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0023 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p370X.C11645Cx A03(com.facebook.ads.redexgen.p370X.C11939I4 r9) throws com.facebook.ads.redexgen.p370X.C11464A0 {
        /*
            r1 = 3
            r0 = 0
            A0A(r1, r9, r0)
            r3 = 7
            long r1 = r9.A0K()
            int r0 = (int) r1
            int r1 = r3 + 4
            java.lang.String r7 = r9.A0S(r0)
            int r0 = r7.length()
            int r1 = r1 + r0
            long r2 = r9.A0K()
            int r0 = (int) r2
            java.lang.String[] r6 = new java.lang.String[r0]
            int r1 = r1 + 4
            r8 = 0
        L20:
            long r4 = (long) r8
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3c
            long r4 = r9.A0K()
            int r0 = (int) r4
            int r1 = r1 + 4
            java.lang.String r0 = r9.A0S(r0)
            r6[r8] = r0
            r0 = r6[r8]
            int r0 = r0.length()
            int r1 = r1 + r0
            int r8 = r8 + 1
            goto L20
        L3c:
            int r0 = r9.A0E()
            r0 = r0 & 1
            if (r0 == 0) goto L4c
            int r1 = r1 + 1
            com.facebook.ads.redexgen.X.Cx r0 = new com.facebook.ads.redexgen.X.Cx
            r0.<init>(r7, r6, r1)
            return r0
        L4c:
            r2 = 198(0xc6, float:2.77E-43)
            r1 = 30
            r0 = 57
            java.lang.String r1 = A05(r2, r1, r0)
            com.facebook.ads.redexgen.X.A0 r0 = new com.facebook.ads.redexgen.X.A0
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.AbstractC11648D0.A03(com.facebook.ads.redexgen.X.I4):com.facebook.ads.redexgen.X.Cx");
    }

    public static void A07(int i, C11642Cu c11642Cu) throws C11464A0 {
        int submaps;
        int A02 = c11642Cu.A02(6) + 1;
        for (int i2 = 0; i2 < A02; i2++) {
            int A022 = c11642Cu.A02(16);
            switch (A022) {
                case 0:
                    if (c11642Cu.A04()) {
                        submaps = c11642Cu.A02(4) + 1;
                    } else {
                        submaps = 1;
                    }
                    if (c11642Cu.A04()) {
                        int i3 = c11642Cu.A02(8);
                        int i4 = i3 + 1;
                        for (int i5 = 0; i5 < i4; i5++) {
                            int mappingsCount = i - 1;
                            c11642Cu.A03(A00(mappingsCount));
                            int mappingsCount2 = i - 1;
                            c11642Cu.A03(A00(mappingsCount2));
                        }
                    }
                    if (A01[6].length() != 3) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[5] = "JOEGydLRZ18FabkiFWUulairw0GZ2Gkh";
                    strArr[7] = "5Wral0wZEQZa4E9pz2QUd29KUvRb4rco";
                    int mappingsCount3 = c11642Cu.A02(2);
                    if (mappingsCount3 == 0) {
                        if (submaps > 1) {
                            for (int mappingsCount4 = 0; mappingsCount4 < i; mappingsCount4++) {
                                c11642Cu.A03(4);
                            }
                        }
                        for (int mappingsCount5 = 0; mappingsCount5 < submaps; mappingsCount5++) {
                            c11642Cu.A03(8);
                            c11642Cu.A03(8);
                            c11642Cu.A03(8);
                        }
                        break;
                    } else {
                        throw new C11464A0(A05(406, 58, 59));
                    }
                default:
                    Log.e(A05(0, 10, 123), A05(270, 41, 96) + A022);
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A08(com.facebook.ads.redexgen.p370X.C11642Cu r16) throws com.facebook.ads.redexgen.p370X.C11464A0 {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.AbstractC11648D0.A08(com.facebook.ads.redexgen.X.Cu):void");
    }

    public static void A09(C11642Cu c11642Cu) throws C11464A0 {
        int A02 = c11642Cu.A02(6) + 1;
        for (int i = 0; i < A02; i++) {
            int residueCount = c11642Cu.A02(16);
            if (residueCount <= 2) {
                c11642Cu.A03(24);
                c11642Cu.A03(24);
                c11642Cu.A03(24);
                int A022 = c11642Cu.A02(6) + 1;
                c11642Cu.A03(8);
                int[] iArr = new int[A022];
                for (int i2 = 0; i2 < A022; i2++) {
                    int i3 = 0;
                    int lowBits = c11642Cu.A02(3);
                    String[] strArr = A01;
                    String str = strArr[5];
                    String str2 = strArr[7];
                    int residueCount2 = str.charAt(15);
                    if (residueCount2 == str2.charAt(15)) {
                        throw new RuntimeException();
                    }
                    A01[1] = "Fzm";
                    if (c11642Cu.A04()) {
                        i3 = c11642Cu.A02(5);
                    }
                    iArr[i2] = (i3 * 8) + lowBits;
                }
                for (int i4 = 0; i4 < A022; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        int residueCount3 = iArr[i4];
                        if ((residueCount3 & (1 << i5)) != 0) {
                            c11642Cu.A03(8);
                        }
                    }
                }
            } else {
                throw new C11464A0(A05(363, 43, 61));
            }
        }
    }

    public static boolean A0A(int i, C11939I4 c11939i4, boolean z) throws C11464A0 {
        if (c11939i4.A04() < 7) {
            if (z) {
                return false;
            }
            throw new C11464A0(A05(464, 18, 15) + c11939i4.A04());
        } else if (c11939i4.A0E() != i) {
            if (z) {
                return false;
            }
            throw new C11464A0(A05(93, 21, 96) + Integer.toHexString(i));
        } else {
            if (c11939i4.A0E() == 118 && c11939i4.A0E() == 111 && c11939i4.A0E() == 114 && c11939i4.A0E() == 98 && c11939i4.A0E() == 105) {
                int A0E = c11939i4.A0E();
                if (A01[0].length() == 3) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[3] = "cEFw80voMQ3YbzzTADHjyBYd9BAt2Eq9";
                strArr[4] = "t97577fmCTvKx9PENiZekz1qhGw5m7zB";
                if (A0E == 115) {
                    return true;
                }
            }
            if (z) {
                return false;
            }
            throw new C11464A0(A05(10, 28, 57));
        }
    }

    public static C11646Cy[] A0B(C11642Cu c11642Cu) {
        int A02 = c11642Cu.A02(6) + 1;
        C11646Cy[] c11646CyArr = new C11646Cy[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            boolean A04 = c11642Cu.A04();
            int A022 = c11642Cu.A02(16);
            int i = c11642Cu.A02(16);
            c11646CyArr[windowType] = new C11646Cy(A04, A022, i, c11642Cu.A02(8));
        }
        return c11646CyArr;
    }

    public static C11646Cy[] A0C(C11939I4 c11939i4, int i) throws C11464A0 {
        A0A(5, c11939i4, false);
        int A0E = c11939i4.A0E() + 1;
        C11642Cu c11642Cu = new C11642Cu(c11939i4.A00);
        int numberOfBooks = c11939i4.A06();
        c11642Cu.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < A0E; numberOfBooks2++) {
            A02(c11642Cu);
        }
        int numberOfBooks3 = c11642Cu.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i2 = 0; i2 < timeCount; i2++) {
            int numberOfBooks4 = c11642Cu.A02(16);
            if (numberOfBooks4 != 0) {
                throw new C11464A0(A05(311, 52, 67));
            }
        }
        A08(c11642Cu);
        A09(c11642Cu);
        A07(i, c11642Cu);
        C11646Cy[] A0B = A0B(c11642Cu);
        if (c11642Cu.A04()) {
            return A0B;
        }
        throw new C11464A0(A05(155, 43, 98));
    }
}
