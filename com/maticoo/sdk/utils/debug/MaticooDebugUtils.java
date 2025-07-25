package com.maticoo.sdk.utils.debug;

/* loaded from: classes6.dex */
public class MaticooDebugUtils {
    private static String debugAdUrl = "";
    public static boolean debugMode = false;
    public static String finalUrl = "";
    public static int ladingType = -1;
    private static boolean preloadResource = true;
    public static boolean testEnv = false;
    public static boolean testOnlyShowConvertAd = false;

    public static String getDebugAdUrl() {
        return debugAdUrl;
    }

    public static boolean isPreloadResource() {
        return preloadResource;
    }

    public static boolean isTestOnlyShowConvertAd() {
        return testOnlyShowConvertAd;
    }

    public static void setDebugAdUrl(String str) {
        if (!debugMode) {
            return;
        }
        debugAdUrl = str;
    }

    public static void setPreloadResource(boolean z) {
        if (!debugMode) {
            return;
        }
        preloadResource = z;
    }

    public static void setTestOnlyShowConvertAd(boolean z) {
        testOnlyShowConvertAd = z;
    }
}
