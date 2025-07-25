package com.zeus.gmc.sdk.mobileads.columbus.analytics.util;

/* loaded from: classes8.dex */
public class AnalyticsSdkConfig {
    public static boolean DEBUG = false;
    public static boolean USE_STAGING = false;

    public static void setDebug(boolean z) {
        DEBUG = z;
        if (z) {
            MLog.setDebugOn();
        } else {
            MLog.setDebugOff();
        }
        com.zeus.gmc.sdk.mobileads.msa.analytics.util.AnalyticsSdkConfig.setDebug(z);
    }
}
