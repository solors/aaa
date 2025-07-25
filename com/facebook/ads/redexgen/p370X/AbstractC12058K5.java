package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.redexgen.X.K5 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12058K5 {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    public static boolean A03;
    public static byte[] A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{96, 54, Byte.MAX_VALUE, 96, 54, Byte.MAX_VALUE, 96, 33, Byte.MAX_VALUE, 96, 33, Byte.MAX_VALUE, 96, 33, 80, 81, 83, 83, 3, 0, 85, 85, 11, 45, 55, 48, 57, 126, 50, 63, 45, 42, 126, 63, 58, 126, 44, 59, 45, 46, 49, 48, 45, 59, 65, 67, 82, 106, 71, 85, 82, 116, 67, 85, 86, 73, 72, 85, 67};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(String str, EnumC12038Jl enumC12038Jl) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        switch (enumC12038Jl) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return 15000L;
            default:
                return -1000L;
        }
    }

    public static String A02(C12059K6 c12059k6) {
        AbstractC12047Ju.A05(A01(44, 15, 126), A01(22, 22, 6), A01(14, 8, 61));
        return A02.get(A03(c12059k6));
    }

    public static String A03(C12059K6 c12059k6) {
        return String.format(Locale.US, A01(0, 14, 29), c12059k6.A09(), c12059k6.A07(), Integer.valueOf(c12059k6.A08() == null ? 0 : c12059k6.A08().A00()), Integer.valueOf(c12059k6.A08() == null ? 0 : c12059k6.A08().A01()), Integer.valueOf(c12059k6.A04()));
    }

    public static void A05(long j, C12059K6 c12059k6) {
        A01.put(A03(c12059k6), Long.valueOf(j));
    }

    public static void A06(C12059K6 c12059k6) {
        A00.put(A03(c12059k6), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, C12059K6 c12059k6) {
        A02.put(A03(c12059k6), str);
    }

    public static boolean A08(C12059K6 c12059k6) {
        if (A03) {
            return false;
        }
        String A032 = A03(c12059k6);
        if (A00.containsKey(A032)) {
            return System.currentTimeMillis() - A00.get(A032).longValue() < A00(A032, c12059k6.A07());
        }
        return false;
    }
}
