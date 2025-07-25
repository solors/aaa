package com.maticoo.sdk.p405ad.video;

import com.maticoo.sdk.core.MaticooAdNetworkManager;
import com.maticoo.sdk.p405ad.IMcAd;
import java.util.Map;

/* renamed from: com.maticoo.sdk.ad.video.RewardedVideoAd */
/* loaded from: classes6.dex */
public final class RewardedVideoAd implements IMcAd {
    public static void destroy(String str) {
        MaticooAdNetworkManager.getInstance().destroy(str);
    }

    public static float getCachedAdPrice(String str) {
        return MaticooAdNetworkManager.getInstance().getCachedAdPrice(3, str);
    }

    public static boolean isReady(String str) {
        return MaticooAdNetworkManager.getInstance().isAdReady(3, str);
    }

    public static void loadAd(String str) {
        MaticooAdNetworkManager.getInstance().loadAd(3, str);
    }

    public static void setAdListener(String str, RewardedVideoListener rewardedVideoListener) {
        MaticooAdNetworkManager.getInstance().setAdListener(3, str, rewardedVideoListener);
    }

    public static void setLocalExtra(String str, Map<String, Object> map) {
        MaticooAdNetworkManager.getInstance().setLocalExtra(3, str, map);
    }

    public static void showAd(String str) {
        MaticooAdNetworkManager.getInstance().showAd(3, str);
    }

    public static void destroy() {
        MaticooAdNetworkManager.getInstance().destroy();
    }

    public static void loadAd(String str, String str2) {
        MaticooAdNetworkManager.getInstance().loadAd(3, str, str2);
    }
}
