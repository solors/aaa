package com.meevii.adsdk.common.util;

/* loaded from: classes6.dex */
public class PangleAdRevenueUtil {
    private static volatile boolean isAdRevenue;

    public static boolean isAdRevenue() {
        return isAdRevenue;
    }

    public static void sendAdRevenue() {
        isAdRevenue = true;
    }
}
