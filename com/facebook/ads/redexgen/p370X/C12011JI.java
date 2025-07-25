package com.facebook.ads.redexgen.p370X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.JI */
/* loaded from: assets/audience_network.dex */
public final class C12011JI {
    public static byte[] A00;
    public static final String A01;
    public static final Map<String, Integer> A02;
    public static final AtomicInteger A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-82, -96, -50, -27, -9, -96, -10, -31, -20, -11, -27, -70, -96, -111, -88, -124, -87, -77, -80, -95, -76, -93, -88, -87, -82, -89, 96, -84, -81, -93, -95, -84, 96, -93, -81, -75, -82, -76, -91, -78, -77, 122, 96, -4, 33, 22, 37, 24, 32, 24, 33, 39, 28, 33, 26, -45, 22, 34, 40, 33, 39, 24, 37, -19, -45, -7, 28, 16, 14, 25, -16, 28, 34, 27, 33, 18, 31, 32, -99, -96, -96, -91, -80, -91, -85, -86, -99, -88, -101, -91, -86, -94, -85, -35, -16, -16, -31, -23, -20, -16, -84, -86, -66, -80, -79, -67, -88, -82, -63, -84, -82, -71, -67, -78, -72, -73, -17, -5, -7, -70, -14, -19, -17, -15, -18, -5, -5, -9, -70, -19, -16, -1, -70, -40, -37, -49, -51, -40, -21, -49, -37, -31, -38, -32, -47, -34, -33, -87, -90, -71, -90, -95, -78, -95, -86, -80, -81, 24, 27, 15, 13, 24, 11, 15, 27, 33, 26, 32, 17, 30, 31, -47, -62, -38, -51, -48, -62, -59, -10, -9, -28, -26, -18, -9, -11, -28, -26, -24, -48, -46, -65, -47, -42, -51, -62, -47, -45, -64, -46, -41, -50, -61, -67, -63, -51, -62, -61};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A06(C113257j c113257j, InterfaceC12536Rq interfaceC12536Rq, Map<String, ?> map) throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put(A01(93, 7, 67), A01(13, 1, 40));
        A09(c113257j, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(A01(188, 7, 36), A01(157, 14, 115));
        hashMap2.put(A01(195, 12, 37), String.valueOf((int) IronSourceConstants.BN_AUCTION_FAILED));
        hashMap2.put(A01(100, 16, 16), A01(14, 1, 62));
        hashMap2.put(A01(178, 10, 74), A01(65, 13, 116));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        if (c113257j.A04().A9O()) {
            String str = A01(15, 28, 7) + jSONObject.toString(2);
        }
        hashMap2.put(A01(78, 15, 3), jSONObject.toString());
        A09(c113257j, hashMap2);
        C113848h A08 = c113257j.A08();
        JSONObject A05 = C113588G.A05(new C113608I(A08.A01(), A08.A02(), hashMap2));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(A05);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(147, 4, 12), new JSONObject(hashMap));
        jSONObject2.put(A01(ErrorCode.CODE_INIT_UNKNOWN_ERROR, 6, 3), jSONArray);
        C12550S4 c12550s4 = new C12550S4();
        c12550s4.put(A01(171, 7, 40), jSONObject2.toString());
        interfaceC12536Rq.AET(c113257j.A04().A7R(), c12550s4.A08(), new C12820WS(c113257j));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A09(C113257j c113257j, Map<String, String> map) {
        map.putAll(c113257j.A03().A59());
    }

    static {
        A04();
        A01 = C12011JI.class.getSimpleName();
        A03 = new AtomicInteger(0);
        A02 = new HashMap();
    }

    public static void A05(C113257j c113257j) {
        if (A0B(c113257j)) {
            return;
        }
        synchronized (C12011JI.class) {
            if (A03.get() != 0) {
                return;
            }
            A03.set(1);
            ExecutorC12182M8.A06.execute(new C12821WT(c113257j));
        }
    }

    public static void A08(C113257j c113257j, String str) {
        int value;
        int i;
        if (A0B(c113257j)) {
            return;
        }
        synchronized (C12011JI.class) {
            if (A03.get() != 2) {
                if (A02.containsKey(str)) {
                    i = A02.get(str).intValue();
                } else {
                    i = 0;
                }
                value = i + 1;
                A02.put(str, Integer.valueOf(value));
            } else {
                SharedPreferences sharedPreferences = c113257j.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(116, 31, 83), c113257j), 0);
                value = sharedPreferences.getInt(str, 0) + 1;
                sharedPreferences.edit().putInt(str, value).apply();
            }
            if (c113257j.A04().A9O()) {
                String str2 = A01(43, 22, 122) + str + A01(0, 13, 71) + value;
            }
        }
    }

    public static boolean A0A(double d, int i) {
        return i <= 0 || d >= 1.0d / ((double) i);
    }

    public static boolean A0B(C113257j c113257j) {
        if (c113257j.A04().A9O()) {
            return false;
        }
        if (!AbstractC11981Io.A0U(c113257j)) {
            return true;
        }
        return A0A(c113257j.A08().A00(), AbstractC11981Io.A0C(c113257j));
    }
}
