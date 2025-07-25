package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum A03 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.SD */
/* loaded from: assets/audience_network.dex */
public abstract class EnumC12559SD {
    public static byte[] A00;
    public static String[] A01 = {"tECI8EX1cuXhUwYvYft6TDcXrBYDxzmb", "U9lWMC", "VeFVBuimOKBZ6IhnkHNGVdQ2rus8nhqD", "5Ss9iINs1N203h8UwVdzTm0B7XXAo0aC", "SEbmC0K2IQ7flaHMYhUIDNtJoPD", "aE6Std6il1HEkTA4be5XQZw6wdO2x4l2", "Oc9eC60MpRTSk1JwhF2h3JFaDWGSLdec", "vmvIsg"};
    public static final /* synthetic */ EnumC12559SD[] A02;
    public static final EnumC12559SD A03;
    public static final EnumC12559SD A04;
    public static final EnumC12559SD A05;
    public static final EnumC12559SD A06;
    public static final EnumC12559SD A07;
    public static final EnumC12559SD A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{20, 39, 39, 52, 44, 71, 106, 106, 105, 96, 100, 107, 102, 77, 87, SignedBytes.MAX_POWER_OF_TWO, 78, 71, 105, 78, 84, 95, 114, 122, 117, 115, 100, 46, 9, 15, 20, 19, 26, 94, 101, 96, 101, 100, 124, 101, 43, Byte.MAX_VALUE, 114, 123, 110, 43, 100, 109, 43, 97, 120, 100, 101, 43, 100, 105, 97, 110, 104, Byte.MAX_VALUE, 43, 96, 110, 114};
    }

    public abstract boolean A05(JSONArray jSONArray, int i);

    public abstract boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i);

    public abstract boolean A07(JSONObject jSONObject, String str);

    public abstract boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String A022 = A02(0, 5, 26);
        A03 = new EnumC12559SD(A022, 0) { // from class: com.facebook.ads.redexgen.X.KK
            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A05(JSONArray jSONArray, int i) {
                return jSONArray.optJSONArray(i) != null;
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return AbstractC12560SE.A01(jSONArray.optJSONArray(i), jSONArray2.optJSONArray(i));
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC12560SE.A01(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        A04 = new EnumC12559SD(A02(5, 7, 74), 1) { // from class: com.facebook.ads.redexgen.X.KF
            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A05(JSONArray jSONArray, int i) {
                return jSONArray.optBoolean(i, true) == jSONArray.optBoolean(i, false);
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optBoolean(i) == jSONArray2.optBoolean(i);
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A05 = new EnumC12559SD(A02(12, 6, 109), 2) { // from class: com.facebook.ads.redexgen.X.K3
            public static String[] A00 = {"1ZkmGDQLr4HHzESqnZwtiaJskrCoCdgr", "ZuXKvCVbKiCO09p9pYqDyLAizJSm2C6Q", "nueEAEfgKP3aoalcvcV3IYW8uca", "ZSO21PM30lkMK5VtmFwCGRnC4HfRl6Ua", "ewMxBq6LlUCdKuikxzCZkjc2M9R", "JDKZd", "VKrSZQCGjlRNXLKdswkZgNPUMacPzyqz", "RC4irD47U"};

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A05(JSONArray jSONArray, int i) {
                return jSONArray.optInt(i, 0) == jSONArray.optInt(i, 1) && jSONArray.optDouble(i, 0.0d) == jSONArray.optDouble(i, 1.0d) && ((double) jSONArray.optInt(i, 0)) != jSONArray.optDouble(i, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optDouble(i) == jSONArray2.optDouble(i);
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A07(JSONObject jSONObject, String str) {
                if (jSONObject.optInt(str, 0) != jSONObject.optInt(str, 1)) {
                    return false;
                }
                double optDouble = jSONObject.optDouble(str, 0.0d);
                if (A00[0].charAt(28) != 'C') {
                    throw new RuntimeException();
                }
                String[] strArr = A00;
                strArr[2] = "ccqqHA83ZTWiIg3HPQbc0aiXb2J";
                strArr[4] = "9RASlEbgrOZWYduHYKXmEPevqLf";
                return optDouble == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A06 = new EnumC12559SD(A02(18, 3, 111), 3) { // from class: com.facebook.ads.redexgen.X.K2
            public static String[] A00 = {"n7SKlqK", "ov2fNltgQ2EAr85rcAXjQlotsfjsnjuH", "ovWB89LlYvQ4xO5HZfV2GFW4RL9XN4h2", "w8d2diIE5BdvGUn1gxyTHp0hEgENQTV7", "yQnpH44oXSx8ccz3NjdKCULhtA2Hxjvh", "86uwoduXnLYKbsdqFVwkHHSOZ5iH2tHE", "J0bksEA3Nc1mI6xnOvQtusRgBbL88ZUJ", "XzqVLub6oNjkAstpNhW0t4rN94XX0A8D"};

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A05(JSONArray jSONArray, int i) {
                if (jSONArray.optInt(i, 0) != jSONArray.optInt(i, 1) || jSONArray.optDouble(i, 0.0d) != jSONArray.optDouble(i, 1.0d)) {
                    return false;
                }
                int optInt = jSONArray.optInt(i, 0);
                if (A00[4].charAt(31) != 'h') {
                    throw new RuntimeException();
                }
                A00[4] = "ESUjQDK13szqjYK8RJAQddjghxYzdQOh";
                return ((double) optInt) == jSONArray.optDouble(i, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optInt(i) == jSONArray2.optInt(i);
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A07(JSONObject jSONObject, String str) {
                if (jSONObject.optInt(str, 0) != jSONObject.optInt(str, 1) || jSONObject.optDouble(str, 0.0d) != jSONObject.optDouble(str, 1.0d)) {
                    return false;
                }
                int optInt = jSONObject.optInt(str, 0);
                String[] strArr = A00;
                if (strArr[1].charAt(1) != strArr[2].charAt(1)) {
                    throw new RuntimeException();
                }
                A00[0] = "ksANhPg";
                return ((double) optInt) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        final String A023 = A02(21, 6, 95);
        A07 = new EnumC12559SD(A023, 4) { // from class: com.facebook.ads.redexgen.X.K1
            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A05(JSONArray jSONArray, int i) {
                return jSONArray.optJSONObject(i) != null;
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return AbstractC12560SE.A02(jSONArray.optJSONObject(i), jSONArray2.optJSONObject(i));
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC12560SE.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A08 = new EnumC12559SD(A02(27, 6, 50), 5) { // from class: com.facebook.ads.redexgen.X.K0
            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A05(JSONArray jSONArray, int i) {
                return jSONArray.optString(i) != null;
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optString(i).equals(jSONArray2.optString(i));
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.p370X.EnumC12559SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A02 = A04();
    }

    public EnumC12559SD(String str, int i) {
    }

    public static EnumC12559SD A00(JSONArray jSONArray, int i) {
        EnumC12559SD[] values;
        for (EnumC12559SD type : values()) {
            if (A01[0].charAt(25) != 'B') {
                throw new RuntimeException();
            }
            A01[0] = "tSTzibjLEZmnKLeJSBWWFmo8ABKhWaoK";
            if (type.A05(jSONArray, i)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC12559SD A01(JSONObject jSONObject, String str) {
        EnumC12559SD[] values;
        for (EnumC12559SD type : values()) {
            String[] strArr = A01;
            if (strArr[3].charAt(28) == strArr[6].charAt(28)) {
                throw new RuntimeException();
            }
            A01[0] = "zRruk8gFetbjQnDa2F20MljfYBQnm1P6";
            if (type.A07(jSONObject, str)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static /* synthetic */ EnumC12559SD[] A04() {
        return new EnumC12559SD[]{A03, A04, A05, A06, A07, A08};
    }

    public static EnumC12559SD valueOf(String str) {
        return (EnumC12559SD) Enum.valueOf(EnumC12559SD.class, str);
    }

    public static EnumC12559SD[] values() {
        return (EnumC12559SD[]) A02.clone();
    }
}
