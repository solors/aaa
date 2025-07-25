package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.KA */
/* loaded from: assets/audience_network.dex */
public final class C12063KA {
    public static C12063KA A00;
    public static byte[] A01;
    public static String[] A02 = {"1xbaBrS", "A5o8L0K", "NCBBTtQ91bL4qNkC9", "VOiFjhrLKrSiOl", "IzdWV2mN1IZOPy8q", "dzpcam", "yMP3JjbsUfzn40YA", "FhpQzKItQmfQ6pj5K9dUgRwf2x"};

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{118, 115, 72, 101, 114, 103, 120, 101, 99, 126, 121, 112, 72, 116, 120, 121, 113, 126, 112, 77, 72, 77, 92, 88, 73, 94, 24, 29, 10, 100, 107, 90, 115, 100, 105, 108, 97, 100, 113, 108, 106, 107, 90, 112, 112, 108, 97, 44, 46, 44, 39, 42, 105, 98, 107, 99, 100, 85, 122, 107, 120, 107, 103, 121, 39, 43, 32, 33, 122, Byte.MAX_VALUE, 106, Byte.MAX_VALUE, 16, 21, 0, 21, 59, 22, 30, 17, 23, 0, 84, 29, 7, 84, 26, 1, 24, 24, 108, 105, 124, 105, 87, 101, 103, 108, 109, 100, 87, 124, 113, 120, 109, 120, 121, 122, 117, 114, 117, 104, 117, 115, 114, 27, 12, 12, 17, 12, 27, 24, 28, 9, 8, 15, 24, 34, 30, 18, 19, 27, 20, 26, 75, 65, 76, 94, 69, 114, 78, 66, 67, 75, 68, 74, 89, 81, 71, 71, 85, 83, 81, 50, 46, 35, 33, 39, 47, 39, 44, 54, 49, 71, 80, 95, 107, 87, 85, 87, 92, 81, 125, 123, 104, 106, 98, 108, 123, 122, 116, 121, 112, 101};
    }

    static {
        A05();
        A00 = new C12063KA();
    }

    public static synchronized C12063KA A00() {
        C12063KA c12063ka;
        synchronized (C12063KA.class) {
            c12063ka = A00;
        }
        return c12063ka;
    }

    private C12786Vu A01(C13029Zs c13029Zs, JSONObject ad2, long j) throws JSONException {
        JSONArray placements = ad2.getJSONArray(A04(153, 10, 102));
        JSONObject jSONObject = placements.getJSONObject(0);
        C113758X A002 = C113758X.A00(jSONObject.getJSONObject(A04(105, 10, 56)));
        String adReportingConfig = jSONObject.optString(A04(120, 14, 89));
        String A04 = A04(47, 5, 107);
        String str = null;
        String flashConfig = jSONObject.has(A04) ? jSONObject.optString(A04) : null;
        String A042 = A04(163, 9, 16);
        String optString = jSONObject.has(A042) ? jSONObject.optString(A042) : null;
        String optString2 = jSONObject.optString(A04(0, 19, 51));
        String A043 = A04(134, 12, 9);
        String cache = jSONObject.has(A043) ? jSONObject.optString(A043) : null;
        C113748W c113748w = new C113748W(A002, adReportingConfig, optString2, cache, flashConfig, optString);
        String A044 = A04(26, 3, 93);
        if (jSONObject.has(A044)) {
            JSONArray jSONArray = jSONObject.getJSONArray(A044);
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                AbstractC12010JH.A06(c13029Zs, jSONObject2, j, str);
                String optString3 = jSONObject2.optString(A04(19, 7, 8));
                String optString4 = jSONObject2.optString(A04(90, 15, 44));
                JSONObject ad3 = jSONObject2.optJSONObject(A04(68, 4, 58));
                JSONArray optJSONArray = jSONObject2.optJSONArray(A04(172, 8, 45));
                if (ad3 != null) {
                    c113748w.A0F(new C113728U(optString3, optString4, ad3, optJSONArray));
                } else {
                    InterfaceC108920S A0E = c13029Zs.A0E();
                    int errorCode = AdErrorType.UNKNOWN_ERROR.getErrorCode();
                    String[] strArr = A02;
                    if (strArr[0].length() != strArr[1].length()) {
                        throw new RuntimeException();
                    }
                    A02[7] = "vhqatTRLHh1uNEmkPYajEb8nOj";
                    A0E.A5F(errorCode, A04(72, 18, 80));
                }
                i++;
                str = null;
            }
        }
        String A045 = A04(52, 12, 46);
        if (jSONObject.has(A045)) {
            c113748w.A0G(jSONObject.getJSONObject(A045));
        }
        String anValidationUuid = ad2.optString(A04(29, 18, 33));
        return new C12786Vu(c113748w, anValidationUuid);
    }

    private C12785Vt A02(JSONObject jSONObject) {
        return new C12785Vt(jSONObject.optString(A04(146, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), null);
    }

    private C12785Vt A03(JSONObject jSONObject) {
        String A04 = A04(163, 9, 16);
        String A042 = A04(47, 5, 107);
        try {
            JSONObject placement = jSONObject.getJSONArray(A04(153, 10, 102)).getJSONObject(0);
            C113758X placementDefinition = C113758X.A00(placement.getJSONObject(A04(105, 10, 56)));
            String featureConfig = placement.optString(A04(120, 14, 89));
            String cache = placement.has(A042) ? placement.optString(A042) : null;
            String sdkManagedCache = placement.has(A04) ? placement.optString(A04) : null;
            String adReportingConfig = placement.optString(A04(0, 19, 51));
            return new C12785Vt(jSONObject.optString(A04(146, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), new C113748W(placementDefinition, featureConfig, adReportingConfig, null, cache, sdkManagedCache));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C12065KC A06(C13029Zs c13029Zs, String str, long j) throws JSONException {
        char c;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(A04(180, 4, 36));
            int hashCode = optString.hashCode();
            String A04 = A04(115, 5, 90);
            switch (hashCode) {
                case 96432:
                    if (optString.equals(A04(26, 3, 93))) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 96784904:
                    if (optString.equals(A04)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return A01(c13029Zs, jSONObject, j);
                case 1:
                    return A03(jSONObject);
                default:
                    JSONObject jsonResponse = jSONObject.optJSONObject(A04);
                    if (jsonResponse != null) {
                        return A02(jsonResponse);
                    }
                    break;
            }
        }
        return new C12065KC(EnumC12064KB.A04);
    }
}
