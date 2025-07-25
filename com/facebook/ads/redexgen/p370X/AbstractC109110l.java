package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0l */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC109110l {
    public static byte[] A00;
    public static String[] A01 = {"jSoy8XspXCFqO9NWG0uega5zyBcMMpnv", "8I941vkvBihlhZSR3", "E0n4xhy7f55RdYtJKKgnHTy6BEjDvFXE", "Oow628hlFtykEPzM3xMW0Wh", "gjSfO6YGNNbsKn6TLZq3stDSfq2Vbbu6", "XJoMwGgC8l1BSQaiX90ZQnicuTGj509z", "JK4GcCSwzapE3gOVlVNykyUw2lU6lT6d", "8BqJ2MeWpSgEuyxwl"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {86, 115, 55, 126, 100, 55, 126, 121, 97, 118, 123, 126, 115, 118, 99, 114, 115, 55, 96, 126, 99, Byte.MAX_VALUE, 120, 98, 99, 55, 99, 120, 124, 114, 121, 57, 27, 10, 19, 117, 116, 101, 116, 114, 101, 120, 126, Byte.MAX_VALUE, 78, 98, 101, 99, 120, Byte.MAX_VALUE, 118, 98, 39, 32, 56, 47, 34, 39, 42, 47, 58, 39, 33, 32, 17, 44, 43, 38, 47, 56, 39, 33, 60, 45, 60, 47, 46, 52, 51, 58};
        if (A01[6].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "4DtSv1ItoT1AnjNkW";
        strArr[1] = "xsdhzuZMhKe1kPAxh";
        A00 = bArr;
    }

    static {
        A05();
    }

    public static EnumC109090j A00(JSONObject jSONObject) {
        return EnumC109090j.A00(jSONObject.optString(A02(52, 21, 9)));
    }

    public static C13207cn A01(C13029Zs c13029Zs, JSONObject jSONObject, String str) {
        return new C13207cn(jSONObject, c13029Zs, str);
    }

    public static Collection<String> A03(C13029Zs c13029Zs, JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            String detectionStringJSON = jSONObject.optString(A02(35, 17, 86));
            if (!TextUtils.isEmpty(detectionStringJSON)) {
                JSONArray detectionStringsArray = new JSONArray(detectionStringJSON);
                jSONArray = detectionStringsArray;
            }
        } catch (JSONException e) {
            c13029Zs.A07().AA0(A02(73, 7, 26), AbstractC113568E.A2C, new C113578F(e));
        }
        return A04(jSONArray);
    }

    public static Collection<String> A04(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    public static boolean A06(C13029Zs c13029Zs, InterfaceC109100k interfaceC109100k, InterfaceC12000J7 interfaceC12000J7) {
        EnumC109090j A7c = interfaceC109100k.A7c();
        if (A7c != null) {
            EnumC109090j invalidationBehavior = EnumC109090j.A03;
            if (A7c != invalidationBehavior) {
                boolean packageInstalled = false;
                Collection<String> A7B = interfaceC109100k.A7B();
                if (A7B == null || A7B.isEmpty()) {
                    return false;
                }
                Iterator<String> it = A7B.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (AbstractC12148La.A04(c13029Zs, it.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                EnumC109090j invalidationBehavior2 = EnumC109090j.A02;
                if (packageInstalled != (A7c == invalidationBehavior2)) {
                    return false;
                }
                String clientToken = interfaceC109100k.A6r();
                if (!TextUtils.isEmpty(clientToken)) {
                    interfaceC12000J7.AA7(clientToken, null);
                    return true;
                }
                c13029Zs.A07().AA0(A02(32, 3, 61), AbstractC113568E.A0Z, new C113578F(A02(0, 32, 80)));
                return true;
            }
        }
        return false;
    }
}
