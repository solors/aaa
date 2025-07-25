package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.KE */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12067KE {
    public static byte[] A00;
    public static final AtomicReference<String> A01;
    public static final AtomicReference<String> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{31, 34, 59, 52, 62, 52, 56, 62, 52, 57, 61, 52, 52, 58, 52, 61, 60, 34, 111, 120, 106, 126, 11, 69, SignedBytes.MAX_POWER_OF_TWO, 74, 83, 123, 72, 75, 67, 67, 77, 74, 67, 11, 114, 60, 57, 51, 42, 2, 46, 36, 51, 62, 111, 44, 109, 102, 119, 116, 108, 113, 104, 92, 98, 103, 112, 92, 96, 108, 110, 110, 108, 109, 37, 57, 57, 61, 62, 119, 98, 98, 42, 63, 44, 61, 37, 104, 62, 99, 43, 44, 46, 40, 47, 34, 34, 38, 99, 46, 34, 32, 81, 77, 77, 73, 74, 3, 22, 22, 78, 78, 78, 28, 74, 23, 95, 88, 90, 92, 91, 86, 86, 82, 23, 90, 86, 84, 14, 14, 14};
    }

    static {
        A09();
        A01 = new AtomicReference<>();
        A02 = new AtomicReference<>();
    }

    public static String A01(C113257j c113257j) {
        return A05(c113257j) + A00(47, 19, 53);
    }

    public static String A02(C113257j c113257j) {
        String loggingEndpointPrefix = C11979Im.A0V(c113257j);
        StringBuilder append = new StringBuilder().append(A07(c113257j, loggingEndpointPrefix));
        String loggingEndpointPrefix2 = A00(22, 14, 18);
        return append.append(loggingEndpointPrefix2).toString();
    }

    public static String A03(C113257j c113257j) {
        return A05(c113257j) + A00(1, 21, 59);
    }

    public static String A04(C113257j c113257j) {
        String syncEndpointPrefix = C11979Im.A0W(c113257j);
        StringBuilder append = new StringBuilder().append(A07(c113257j, syncEndpointPrefix));
        String syncEndpointPrefix2 = A00(36, 11, 107);
        return append.append(syncEndpointPrefix2).toString();
    }

    public static String A05(C113257j c113257j) {
        String str = A01.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String urlOverride = A00(66, 28, 123);
        return A06(c113257j, urlOverride);
    }

    public static String A06(C113257j c113257j, String str) {
        String sb2;
        String A8d = c113257j.A04().A8d();
        Locale locale = Locale.US;
        if (TextUtils.isEmpty(A8d)) {
            sb2 = A00(0, 0, 61);
        } else {
            StringBuilder sb3 = new StringBuilder();
            String prefix = A00(0, 1, 7);
            sb2 = sb3.append(prefix).append(A8d).toString();
        }
        String prefix2 = String.format(locale, str, sb2);
        return prefix2;
    }

    public static String A07(C113257j c113257j, String str) {
        String str2 = A02.get();
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String urlOverride = A00(94, 26, 15);
        return A08(A06(c113257j, urlOverride), str);
    }

    public static String A08(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(A00(120, 3, 79), str2);
    }
}
