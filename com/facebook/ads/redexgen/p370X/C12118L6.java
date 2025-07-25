package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.L6 */
/* loaded from: assets/audience_network.dex */
public final class C12118L6 {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-92, -90, -103, -102, -77, -94, -87, -95, -77, -107, -104, -89, -77, -94, -93, -77, -105, -100, -107, -99, -94, -115, -117, -99, -115, -117, -114, -113, -114, -119, -117, -114, -68, -49, -53, -55, -72, -74, -69, -72, -53, -72, -15, -14, -9, -3, -4, -60, -59, -60, -71, -66, -73, -65, -60, -69, -70, -75, -73, -70, -55, -8, -6};
    }

    public static int A00(C13029Zs c13029Zs, int i) {
        return AbstractC12071KJ.A00(c13029Zs).getInt(A01(0, 21, 52), i);
    }

    public static String A02(C13029Zs c13029Zs, String str) {
        int A002 = A00(c13029Zs, -1);
        if (A002 == -1) {
            return null;
        }
        try {
            return new ExtraHints.Builder().extraData(A03(str, A01(47, 14, 54), Integer.valueOf(A002))).build().getHints();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String A03(String str, String str2, Object obj) throws JSONException {
        String A01 = A01(61, 2, 93);
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            String extraData = A01(42, 5, 105);
            JSONObject jSONObject2 = jSONObject.getJSONObject(extraData);
            String extraData2 = A01(32, 10, 55);
            A01 = jSONObject2.optString(extraData2, A01);
        }
        JSONObject jSONObject3 = new JSONObject(A01);
        jSONObject3.put(str2, obj);
        String extraData3 = jSONObject3.toString();
        return extraData3;
    }

    public static boolean A05(String str) throws JSONException {
        return str != null && new JSONObject(new JSONObject(str).getJSONObject(A01(42, 5, 105)).optString(A01(32, 10, 55), A01(61, 2, 93))).optBoolean(A01(21, 11, 10), false);
    }

    public final InterstitialAd A06(C13029Zs c13029Zs, String str, String str2) {
        if (c13029Zs == null) {
            return null;
        }
        try {
            InterstitialAd interstitialAd = new InterstitialAd(c13029Zs, str);
            interstitialAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 10), true)).build());
            return interstitialAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final RewardedVideoAd A07(C13029Zs c13029Zs, String str, String str2) {
        if (c13029Zs == null) {
            return null;
        }
        try {
            RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(c13029Zs, str);
            rewardedVideoAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 10), true)).build());
            return rewardedVideoAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void A08(C13029Zs c13029Zs, boolean z) {
        int i = 0;
        String A01 = A01(0, 21, 52);
        if (!z) {
            int lastNonChainedAds = AbstractC12071KJ.A00(c13029Zs).getInt(A01, 0);
            i = lastNonChainedAds + 1;
        }
        AbstractC12071KJ.A00(c13029Zs).edit().putInt(A01, i).apply();
    }

    public final boolean A09(C13029Zs c13029Zs, String str, int i) {
        if (i <= 0) {
            return false;
        }
        try {
            if (!A05(str)) {
                int lastNonChainedAds = A00(c13029Zs, i - 1);
                return lastNonChainedAds >= i + (-1);
            }
        } catch (JSONException unused) {
        }
        return false;
    }
}
