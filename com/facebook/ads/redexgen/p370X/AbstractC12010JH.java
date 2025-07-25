package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.JH */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12010JH {
    public static byte[] A00;
    public static String[] A01 = {"U6KVOTsvyFGORVsRScrnzIfC22jYBwjX", "ILJfzAM", "mSXQ0Ybvz22qP9FTERotykvccOsLfkLX", "hexg7lZyOyIoqc3cfx0LJrY0JzPheGn9", "QO0W7SjBIJExYoWj8d5V4ATeE22xBdxq", "XgtJCrs", "K8cPCeEyVHoG5OOYDkeX6MTEK7uusLdi", "HRkIYlhxQwIghQfQLwcjnPshoo50TCUq"};
    public static final Map<String, String> A02;
    public static final Map<String, List<String>> A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[7].charAt(20) != 'n') {
                throw new RuntimeException();
            }
            A01[7] = "VCgIGVaZR6LUurcUp8PRnu67FREgo2FS";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            int i5 = (copyOfRange[i4] - i3) - 84;
            String[] strArr = A01;
            if (strArr[6].charAt(18) != strArr[4].charAt(18)) {
                String[] strArr2 = A01;
                strArr2[6] = "QUKDQrMYYXqh8JHMTaWZV6Ed8Qh6Q2ZU";
                strArr2[4] = "Ahd0Yp7BAsSR93JTUpDMLzcJNLS2OMnc";
                copyOfRange[i4] = (byte) i5;
                i4++;
            } else {
                copyOfRange[i4] = (byte) i5;
                i4++;
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{33, 50, -25, -28, -9, -28, 20, 35, 28, 28, 19, 26, 7, 10, -4, -1, -6, 15, 4, 8, 0, -6, 8, 14, 9, -4, 8, 12, -4, 10, 11, -10, 11, 0, 4, -4, -10, 4, 10, 21, 24, -1, 6, 21, 14, 14, 5, 12, -1, 12, 15, 7, 7, 9, 14, 7};
    }

    static {
        A03();
        A03 = new HashMap();
        A02 = new HashMap();
    }

    public static String A01(String str) {
        return A02.get(str);
    }

    public static List<String> A02(C13029Zs c13029Zs, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int eventIndex = 0; eventIndex < jSONArray.length(); eventIndex++) {
            try {
                arrayList.add(jSONArray.getString(eventIndex));
            } catch (JSONException e) {
                c13029Zs.A07().AA0(A00(39, 17, 76), AbstractC113568E.A1C, new C113578F(e));
            }
        }
        return arrayList;
    }

    public static void A04(View view, C12008JF c12008jf, EnumC12007JE enumC12007JE) {
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC12009JG(c12008jf, enumC12007JE));
    }

    public static void A05(C13029Zs c13029Zs, String str, long j) {
        InterfaceC12000J7 adEventManager = c13029Zs.A09();
        C12008JF c12008jf = new C12008JF(str, adEventManager);
        HashMap hashMap = new HashMap();
        hashMap.put(A00(24, 15, 67), C12168Lu.A06(j));
        hashMap.put(A00(12, 12, 71), C12168Lu.A04(j));
        c12008jf.A04(EnumC12007JE.A0D, hashMap);
    }

    public static void A06(C13029Zs c13029Zs, JSONObject jSONObject, long j, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A00(2, 4, 47));
        if (optJSONObject == null) {
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(6, 6, 90));
        if (TextUtils.isEmpty(str) && optJSONArray != null) {
            A07(c13029Zs, optJSONObject, A02(c13029Zs, optJSONArray), j, null);
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Map<String, List<String>> map = A03;
            if (A01[7].charAt(20) != 'n') {
                throw new RuntimeException();
            }
            A01[2] = "eRhlxr4ZIl29VB3yVqBFuzgoGteA2pMR";
            if (!map.containsKey(str)) {
                return;
            }
            A07(c13029Zs, optJSONObject, A03.get(str), j, str);
        }
    }

    public static void A07(C13029Zs c13029Zs, JSONObject jSONObject, List<String> list, long j, String str) {
        String A002 = A00(0, 2, 106);
        if (jSONObject.has(A002)) {
            String clientToken = jSONObject.optString(A002);
            A08(clientToken, str);
            A09(clientToken, list);
            A05(c13029Zs, clientToken, j);
        }
    }

    public static void A08(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        A02.put(str, str2);
    }

    public static void A09(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean isEmpty = list.isEmpty();
        if (A01[7].charAt(20) != 'n') {
            throw new RuntimeException();
        }
        A01[2] = "Iv9PzV9ggO2VP5nzFrt9V6UHZMtP3qc2";
        if (isEmpty) {
            return;
        }
        A03.put(str, list);
    }

    public static boolean A0A(String str, EnumC12007JE enumC12007JE) {
        return A0B(str, enumC12007JE.A03());
    }

    public static boolean A0B(String str, String str2) {
        return A03.containsKey(str) && A03.get(str).contains(str2);
    }
}
