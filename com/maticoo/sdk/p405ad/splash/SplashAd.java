package com.maticoo.sdk.p405ad.splash;

import com.maticoo.sdk.core.MaticooAdNetworkManager;
import com.maticoo.sdk.p405ad.IMcAd;
import java.util.Map;

/* renamed from: com.maticoo.sdk.ad.splash.SplashAd */
/* loaded from: classes6.dex */
public class SplashAd implements IMcAd {
    public static void destroy(String str) {
        MaticooAdNetworkManager.getInstance().destroy(str);
    }

    public static float getCachedAdPrice(String str) {
        return MaticooAdNetworkManager.getInstance().getCachedAdPrice(6, str);
    }

    public static boolean isReady(String str) {
        return MaticooAdNetworkManager.getInstance().isAdReady(6, str);
    }

    public static void loadAd(String str) {
        MaticooAdNetworkManager.getInstance().loadAd(6, str);
    }

    public static void setAdListener(String str, SplashAdListener splashAdListener) {
        MaticooAdNetworkManager.getInstance().setAdListener(6, str, splashAdListener);
    }

    public static void setLocalExtra(String str, Map<String, Object> map) {
        MaticooAdNetworkManager.getInstance().setLocalExtra(6, str, map);
    }

    public static void showAd(String str) {
        MaticooAdNetworkManager.getInstance().showAd(6, str);
    }

    public static void destroy() {
        MaticooAdNetworkManager.getInstance().destroy();
    }

    public static void loadAd(String str, String str2) {
        MaticooAdNetworkManager.getInstance().loadAd(6, str, str2);
    }
}
