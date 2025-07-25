package com.meevii.adsdk.common;

/* loaded from: classes6.dex */
public class BaseMeeviiAd {
    private static volatile boolean isShowLog;
    private static volatile boolean isTestMode;

    public static boolean isShowLog() {
        return isShowLog;
    }

    public static boolean isTestMode() {
        return isTestMode;
    }

    public static void setIsShowLog(boolean z) {
        isShowLog = z;
    }

    public static void setIsTestMode(boolean z) {
        isTestMode = z;
    }
}
