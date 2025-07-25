package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6i */
/* loaded from: assets/audience_network.dex */
public final class C112756i {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, -40, -35, -38, -107, -39, -34, -24, -32, -107, -24, -22, -40, -40, -38, -24, -24, -93, -7, 23, 25, 30, 27, -42, 26, 37, 45, 36, 34, 37, 23, 26, -42, 28, 23, 31, 34, 43, 40, 27, -28, -80, -50, -48, -43, -46, -115, -43, -42, -31, -101, -63, -33, -31, -26, -29, -98, -21, -25, -15, -15, -84, 19, 22, 17, 21, 36, 23, 19, 38, 27, 40, 23, 17, 37, 27, 44, 23, 17, 20, 43, 38, 23, 37, -33, -30, -35, -31, -16, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, 29, 32, 27, 34, 43, 46, 41, 29, 48, 27, 48, 53, 44, 33, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, 67, 86, 86, 71, 79, 82, 86, 30, 28, 30, 35, 32, 63, 61, 63, 68, 65, 59, 63, 75, 74, 80, 65, 84, 80, -35, -40, -32, -29, -20, -23, -36, -42, -23, -36, -40, -22, -26, -27, 23, 27, 15, 21, 19, 28, 31, 17, 20, 15, 36, 25, 29, 21, 70, 67, 61};
    }

    static {
        A01();
        A09 = C112756i.class.getSimpleName();
        A05 = AbstractC113568E.A0o;
        A06 = AbstractC113568E.A0s;
        A02 = AbstractC113568E.A0l;
        A01 = AbstractC113568E.A0k;
        A03 = AbstractC113568E.A0m;
        A00 = AbstractC113568E.A0i;
        A04 = AbstractC113568E.A0n;
        A07 = AbstractC113568E.A0t;
    }

    public static void A02(C113257j c113257j, C112656Y c112656y, int i, String str, long j) {
        if (!A06(c113257j)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c112656y.A01);
            jSONObject.put(A00(134, 13, 46), c112656y.A02);
            if (j > 0) {
                jSONObject.put(A00(191, 9, 73), C12168Lu.A06(System.currentTimeMillis() - j));
            }
            C113578F c113578f = new C113578F(str);
            c113578f.A07(jSONObject);
            c113578f.A05(1);
            c113257j.A07().AA1(A00(154, 5, 84), i, c113578f);
        } catch (Throwable deLogException) {
            c113257j.A07().A3y(deLogException);
        }
    }

    public static void A03(C113257j c113257j, C112706d c112706d, String str, int i, String str2, Long l, Long l2) {
        if (A06(c113257j)) {
            A05(c113257j, c112706d.A05, c112706d.A06, c112706d.A07, A00(186, 5, 71), str, i, str2, l, l2, null);
        }
    }

    public static void A04(C113257j c113257j, C112746h c112746h, boolean z) {
        if (!A06(c113257j)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c112746h.A01);
            jSONObject.put(A00(134, 13, 46), c112746h.A03);
            jSONObject.put(A00(104, 16, 23), c112746h.A02);
            jSONObject.put(A00(159, 13, 117), c112746h.A00);
            if (C11979Im.A2I(c113257j)) {
                jSONObject.put(A00(200, 3, 106), c112746h.A04);
            }
            String A002 = z ? A00(61, 10, 6) : A00(71, 11, 23);
            int i = z ? A05 : A06;
            C113578F c113578f = new C113578F(A002);
            c113578f.A07(jSONObject);
            c113578f.A05(1);
            c113257j.A07().AA1(A00(154, 5, 84), i, c113578f);
        } catch (Throwable th) {
            c113257j.A07().A3y(th);
        }
    }

    public static void A05(C113257j c113257j, String str, String str2, String str3, String str4, String str5, int i, String str6, Long l, Long l2, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(134, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 16), str6);
            }
            if (l != null) {
                jSONObject.put(A00(82, 22, 75), String.valueOf(l));
            }
            if (l2 != null) {
                jSONObject.put(A00(191, 9, 73), String.valueOf(l2));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 123), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, 117), str5);
            if (C11979Im.A2I(c113257j)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            String A002 = A00(19, 19, 14);
            if (i == A03) {
                A002 = A00(38, 23, 79);
            } else if (i == A01) {
                A002 = A00(0, 19, 39);
            }
            C113578F c113578f = new C113578F(A002);
            c113578f.A07(jSONObject);
            c113578f.A05(1);
            c113257j.A07().AA1(A00(154, 5, 84), i, c113578f);
        } catch (Throwable th) {
            c113257j.A07().A3y(th);
        }
    }

    public static boolean A06(C113257j c113257j) {
        int A062;
        if (c113257j.A04().A9O()) {
            A062 = 1;
        } else {
            A062 = AbstractC11981Io.A06(c113257j);
        }
        if (A062 == 0) {
            return false;
        }
        return A062 <= 0 || c113257j.A08().A00() <= 1.0d / ((double) A062);
    }
}
