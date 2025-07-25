package com.maticoo.sdk.p405ad.interstitial;

import com.maticoo.sdk.core.MaticooAdNetworkManager;
import com.maticoo.sdk.p405ad.IMcAd;
import java.util.Map;

/* renamed from: com.maticoo.sdk.ad.interstitial.InterstitialAd */
/* loaded from: classes6.dex */
public class InterstitialAd implements IMcAd {
    public static void destroy(String str) {
        MaticooAdNetworkManager.getInstance().destroy(str);
    }

    public static float getCachedAdPrice(String str) {
        return MaticooAdNetworkManager.getInstance().getCachedAdPrice(2, str);
    }

    public static boolean isReady(String str) {
        return MaticooAdNetworkManager.getInstance().isAdReady(2, str);
    }

    public static void loadAd(String str) {
        MaticooAdNetworkManager.getInstance().loadAd(2, str);
    }

    public static void setAdListener(String str, InterstitialAdListener interstitialAdListener) {
        MaticooAdNetworkManager.getInstance().setAdListener(2, str, interstitialAdListener);
    }

    public static void setLocalExtra(String str, Map<String, Object> map) {
        MaticooAdNetworkManager.getInstance().setLocalExtra(2, str, map);
    }

    public static void showAd(String str) {
        MaticooAdNetworkManager.getInstance().showAd(2, str);
    }

    public static void destroy() {
        MaticooAdNetworkManager.getInstance().destroy();
    }

    public static void loadAd(String str, String str2) {
        MaticooAdNetworkManager.getInstance().loadAd(2, str, str2);
    }
}
