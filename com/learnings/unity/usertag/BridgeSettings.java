package com.learnings.unity.usertag;

/* loaded from: classes6.dex */
public class BridgeSettings {
    private static boolean isDebug;
    private static boolean isShowLog;
    private static long sInstallTime;
    private static String sLearningsId;
    private static String sProductionId;

    public static long getInstallTime() {
        return sInstallTime;
    }

    public static String getLearningsId() {
        return sLearningsId;
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

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    public static void setInstallTime(long j) {
        sInstallTime = j;
    }

    public static void setLearningsId(String str) {
        sLearningsId = str;
    }

    public static void setProductionId(String str) {
        sProductionId = str;
    }

    public static void setShowLog(boolean z) {
        isShowLog = z;
    }
}
