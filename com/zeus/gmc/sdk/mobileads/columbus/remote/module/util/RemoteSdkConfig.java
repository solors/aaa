package com.zeus.gmc.sdk.mobileads.columbus.remote.module.util;

/* loaded from: classes8.dex */
public class RemoteSdkConfig {
    public static boolean DEBUG = false;
    public static boolean USE_STAGING;

    public static void setDebug(boolean z) {
        DEBUG = z;
        if (z) {
            MLog.setDebugOn();
        } else {
            MLog.setDebugOff();
        }
    }
}
