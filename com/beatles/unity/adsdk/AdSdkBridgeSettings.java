package com.beatles.unity.adsdk;

/* loaded from: classes3.dex */
public class AdSdkBridgeSettings {
    private static boolean isDebug;
    private static boolean isShowLog;
    private static boolean isSwitchConfig;
    private static boolean isTestMode;
    private static String sDefaultConfigFileName;
    private static String sInitListenerCallback;
    private static String sProductionId;

    public static String getDefaultConfigFileName() {
        return sDefaultConfigFileName;
    }

    public static String getInitListenerCallback() {
        return sInitListenerCallback;
    }

    public static String getProductionId() {
        return sProductionId;
    }

    public static boolean isDebug() {
        return isDebug;
    }

    public static boolean isShowLog() {
        return isShowLog;
    }

    public static boolean isSwitchConfig() {
        return isSwitchConfig;
    }

    public static boolean isTestMode() {
        return isTestMode;
    }

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    public static void setDefaultConfigFileName(String str) {
        sDefaultConfigFileName = str;
    }

    public static void setInitListenerCallback(String str) {
        sInitListenerCallback = str;
    }

    public static void setProductionId(String str) {
        sProductionId = str;
    }

    public static void setShowLog(boolean z) {
        isShowLog = z;
    }

    public static void setSwitchConfig(boolean z) {
        isSwitchConfig = z;
    }

    public static void setTestMode(boolean z) {
        isTestMode = z;
    }
}
