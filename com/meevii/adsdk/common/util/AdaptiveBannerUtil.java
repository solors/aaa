package com.meevii.adsdk.common.util;

/* loaded from: classes6.dex */
public class AdaptiveBannerUtil {
    private static volatile boolean isDisableAdaptiveBanner;

    public static void disableAdaptiveBanner() {
        isDisableAdaptiveBanner = true;
    }

    public static boolean isDisableAdaptiveBanner() {
        return isDisableAdaptiveBanner;
    }
}
