package com.zeus.gmc.sdk.mobileads.msa.adjump.common;

/* loaded from: classes8.dex */
public class SDKConfig {
    public static boolean DEBUG = false;
    public static final String SDK_VERSION = "3.0.7.0";
    public static boolean USE_STAGING = false;
    private static volatile boolean jujujpjjp = false;

    private SDKConfig() {
    }

    public static boolean isLite() {
        return jujujpjjp;
    }

    public static void setDebug(boolean z) {
        DEBUG = z;
        if (z) {
            MLog.setDebugOn();
        } else {
            MLog.setDebugOff();
        }
    }

    public static void setIsLite(boolean z) {
        jujujpjjp = z;
    }
}
