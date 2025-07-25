package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8g */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC113838g {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-74, -72, -85, -84, -59, -71, -86, -79, -59, -87, -89, -87, -82, -85, -35, -33, -46, -45, -20, -32, -47, -40, -20, -38, -50, -37, -50, -44, -46, -47, -20, -48, -50, -48, -43, -46, -54, -56, -54, -49, -52, -28, -31, -12, -27, -33, -13, -27, -12, 33, 52, 44, 37, 46, 33, 47, 27, 37, 42, -40, -61, -50, -41, -57};
    }

    public static String A01(C13028Zr c13028Zr) {
        return AbstractC12071KJ.A00(c13028Zr).getString(A00(0, 14, 37), null);
    }

    public static Map<String, String> A02(C13028Zr c13028Zr) {
        String sdkCache = AbstractC12071KJ.A00(c13028Zr).getString(A00(14, 22, 76), null);
        if (sdkCache == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(sdkCache);
            HashSet<String> hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2.getLong(A00(41, 8, 63)) + (jSONObject2.getInt(A00(49, 10, 123)) * 1000) < System.currentTimeMillis()) {
                    hashSet.add(next);
                } else {
                    hashMap.put(next, jSONObject2.getString(A00(59, 5, 33)));
                }
            }
            if (!hashSet.isEmpty()) {
                for (String sdkCache2 : hashSet) {
                    jSONObject.remove(sdkCache2);
                }
                A06(c13028Zr, jSONObject);
            }
            return hashMap;
        } catch (JSONException e) {
            c13028Zr.A07().AA0(A00(36, 5, 38), AbstractC113568E.A2U, new C113578F(e));
            return null;
        }
    }

    public static void A04(C13028Zr c13028Zr, String str) {
        AbstractC12071KJ.A00(c13028Zr).edit().putString(A00(0, 14, 37), str).apply();
    }

    public static void A05(C13028Zr c13028Zr, String str) {
        if (str == null) {
            return;
        }
        String sdkCache = AbstractC12071KJ.A00(c13028Zr).getString(A00(14, 22, 76), null);
        try {
            JSONObject jSONObject = sdkCache == null ? new JSONObject() : new JSONObject(sdkCache);
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(key);
                jSONObject3.put(A00(41, 8, 63), System.currentTimeMillis());
                jSONObject.put(key, jSONObject3);
            }
            A06(c13028Zr, jSONObject);
        } catch (JSONException e) {
            c13028Zr.A07().AA0(A00(36, 5, 38), AbstractC113568E.A2V, new C113578F(e));
        }
    }

    public static void A06(C13028Zr c13028Zr, JSONObject jSONObject) {
        AbstractC12071KJ.A00(c13028Zr).edit().putString(A00(14, 22, 76), jSONObject.toString()).apply();
    }
}
