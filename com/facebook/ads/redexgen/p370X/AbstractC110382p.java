package com.facebook.ads.redexgen.p370X;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2p */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC110382p {
    public static byte[] A00;
    public static String[] A01 = {"OxqqmxACKcMb9rgd4flgeoqO4FLkDXK8", "hO921EE08Z5YovLaOXzv", "4KPhJxryuqZouci8ltOnoaa6GepMOFR6", "Qaf3Cf9SMgDDqCFg3avrhgzCiMtnLJnE", "vZFktEahG3bWOXRkYAMaCi8nGdaO1v3Q", "tZHqmUfqpLYo8cwpqndw", "zlaA7TXYCJ", "adeIrckSIlUrZ7yW4ZooAIUWBthMSkAF"};
    public static final ThreadLocal<double[]> A02;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{26, 23, 11, 19, 26, 91, 22, 14, 8, 15, 91, 25, 30, 91, 25, 30, 15, 12, 30, 30, 21, 91, 75, 91, 26, 21, 31, 91, 73, 78, 78, 85, 54, 44, 45, 1, 32, 35, 121, 52, 44, 42, 45, 121, 49, 56, 47, 60, 121, 56, 121, 53, 60, 55, 62, 45, 49, 121, 54, 63, 121, 106, 119};
    }

    static {
        A04();
        A02 = new ThreadLocal<>();
    }

    public static double A00(int i) {
        double[] A07 = A07();
        A06(i, A07);
        return A07[1] / 100.0d;
    }

    public static int A01(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException(A03(0, 32, 67));
        }
        String[] strArr = A01;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A01[0] = "DAqAm14HDJv7tSHiVIRuluRO44d0lStM";
        return (16777215 & i) | (i2 << 24);
    }

    public static int A02(int i, int i2, float f) {
        float f2 = 1.0f - f;
        float inverseRatio = Color.alpha(i2);
        float g = (Color.alpha(i) * f2) + (inverseRatio * f);
        float inverseRatio2 = Color.red(i2);
        float r = (Color.red(i) * f2) + (inverseRatio2 * f);
        float a = Color.green(i);
        float inverseRatio3 = Color.green(i2);
        float a2 = (a * f2) + (inverseRatio3 * f);
        float inverseRatio4 = Color.blue(i2);
        float b = (Color.blue(i) * f2) + (inverseRatio4 * f);
        return Color.argb((int) g, (int) r, (int) a2, (int) b);
    }

    public static void A05(int i, int i2, int i3, double[] dArr) {
        double sb2;
        double sr;
        double sb3;
        if (dArr.length == 3) {
            double sb4 = i / 255.0d;
            if (sb4 < 0.04045d) {
                sb2 = sb4 / 12.92d;
            } else {
                sb2 = Math.pow((sb4 + 0.055d) / 1.055d, 2.4d);
            }
            double sr2 = i2 / 255.0d;
            if (sr2 < 0.04045d) {
                sr = sr2 / 12.92d;
            } else {
                double sr3 = sr2 + 0.055d;
                if (A01[2].charAt(0) != 'Y') {
                    String[] strArr = A01;
                    strArr[3] = "aAOO9yx7jRsDtZ33Oh1YUTlwgCOJU7qQ";
                    strArr[4] = "tiIjGPCneBcQleUKUeg5FNX5aBHKyIuK";
                    sr = Math.pow(sr3 / 1.055d, 2.4d);
                }
                throw new RuntimeException();
            }
            double sb5 = i3 / 255.0d;
            if (sb5 >= 0.04045d) {
                String[] strArr2 = A01;
                if (strArr2[5].length() == strArr2[1].length()) {
                    String[] strArr3 = A01;
                    strArr3[5] = "axgx58ekBr3JsKBSYEIr";
                    strArr3[1] = "AyWuGeE7FNinezs3svxh";
                    double sg2 = 0.055d + sb5;
                    sb3 = Math.pow(sg2 / 1.055d, 2.4d);
                }
                throw new RuntimeException();
            }
            sb3 = sb5 / 12.92d;
            double sg3 = 0.4124d * sb2;
            dArr[0] = (sg3 + (0.3576d * sr) + (0.1805d * sb3)) * 100.0d;
            double sg4 = 0.2126d * sb2;
            dArr[1] = (sg4 + (0.7152d * sr) + (0.0722d * sb3)) * 100.0d;
            double sg5 = 0.0193d * sb2;
            dArr[2] = (sg5 + (0.1192d * sr) + (0.9505d * sb3)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException(A03(32, 31, 97));
    }

    public static void A06(int i, double[] dArr) {
        A05(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static double[] A07() {
        double[] dArr = A02.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            A02.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
