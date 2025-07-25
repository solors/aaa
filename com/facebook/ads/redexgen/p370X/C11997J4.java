package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.J4 */
/* loaded from: assets/audience_network.dex */
public final class C11997J4 {
    public static byte[] A07;
    public final double A00;
    public final double A01 = System.currentTimeMillis() / 1000.0d;
    public final EnumC12002J9 A02;
    public final EnumC12003JA A03;
    public final String A04;
    public final String A05;
    public final Map<String, String> A06;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Map<String, String> A01(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public static void A02() {
        A07 = new byte[]{36, 43, 36, 41, 42, 34, 107, 118, 109, 99, 109, 106, 101, 104, 91, 103, 104, 109, 97, 106, 112, 91, 112, 107, 111, 97, 106, 75, 80, 87, 77, 84, 92, 103, 81, 86, 91, 84, 77, 92, 93, 103, 81, 86, 103, 94, 77, 86, 86, 93, 84};
    }

    public C11997J4(C113257j c113257j, String str, double d, String str2, Map<String, String> map, EnumC12002J9 enumC12002J9, EnumC12003JA enumC12003JA, boolean z) {
        this.A05 = str;
        this.A00 = d;
        this.A04 = str2;
        this.A02 = enumC12002J9;
        this.A03 = enumC12003JA;
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        if (z) {
            hashMap.put(A00(27, 24, 18), String.valueOf(z));
        }
        String A01 = AbstractC12010JH.A01(str);
        if (!TextUtils.isEmpty(A01) && (z || enumC12003JA == EnumC12003JA.A0C)) {
            hashMap.put(A00(6, 21, 46), A01);
        }
        if (A0B()) {
            Map<String, String> extraData = c113257j.A03().A6P();
            hashMap.put(A00(0, 6, 111), AbstractC12143LV.A01(extraData));
        }
        Map<String, String> extraData2 = A01(hashMap);
        this.A06 = extraData2;
    }

    public final double A03() {
        return this.A00;
    }

    public final double A04() {
        return this.A01;
    }

    public final EnumC12002J9 A05() {
        return this.A02;
    }

    public final EnumC12003JA A06() {
        return this.A03;
    }

    public final String A07() {
        return this.A04;
    }

    public final String A08() {
        return this.A05;
    }

    public final Map<String, String> A09() {
        return this.A06;
    }

    public final boolean A0A() {
        return !TextUtils.isEmpty(this.A05);
    }

    public final boolean A0B() {
        return this.A02 == EnumC12002J9.A05;
    }
}
