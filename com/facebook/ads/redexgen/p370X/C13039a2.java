package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.a2 */
/* loaded from: assets/audience_network.dex */
public final class C13039a2 implements InterfaceC112446C {
    public static byte[] A02;
    public static String[] A03 = {"frztuTbk90jgHBlm3zQJyLa", "1t5yWCu7Rr8GJSKN0jLr3suU4yLwpLao", "qy8Ulx", "lpakeOCplwfUbPlWH1mKRjN93sjJNeLK", "9U38xP8piwyhajLb0oPtN8g0SrDQbMul", "5doBkCOudtbbit2jQfjyLRk0HEXNCLN", "an6q6r3Pxi3Yd1Uxl34WEMAekK7mvAv", "C2viYzQ805EsgOX4y3n8lLHcCQmdv4Bq"};
    public final EnumC112456D A00;
    public final String A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[7].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            A03[1] = "szQ1vN1s54Hk3y1OQ1NRUBnkClWieIjw";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
            i4++;
        }
    }

    public static void A02() {
        A02 = new byte[]{-1, 4, -5, -16, -69, -72, -78};
    }

    static {
        A02();
    }

    public C13039a2(EnumC112456D enumC112456D, String str) {
        this.A00 = enumC112456D;
        this.A01 = str;
    }

    public static C13039a2 A00(JSONObject jSONObject) {
        EnumC112456D A00 = EnumC112456D.A00(jSONObject.optString(A01(0, 4, 77)));
        String url = jSONObject.optString(A01(4, 3, 8));
        if (A00 == null || url == null) {
            return null;
        }
        return new C13039a2(A00, url);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC112446C
    public final EnumC112456D A8b() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            if (A03[1].charAt(30) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "4HA6u4Nz4keiLa8sOcHfyEhD3wtH4bT";
            strArr[5] = "zctnvSkfK8HVemf9ezG6OofbW6HL5VM";
            if (cls == obj.getClass()) {
                C13039a2 c13039a2 = (C13039a2) obj;
                if (this.A00 != c13039a2.A00) {
                    return false;
                }
                return this.A01.equals(c13039a2.A01);
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC112446C
    public final String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        int result = this.A00.hashCode();
        int i = result * 31;
        int result2 = this.A01.hashCode();
        return i + result2;
    }
}
