package com.meevii.abtest.util;

/* loaded from: classes6.dex */
public class AbDebugUtil {
    private static boolean isForceLocal;
    private static boolean isRemoteStage;

    public static boolean isIsForceLocal() {
        return isForceLocal;
    }

    public static boolean isIsRemoteStage() {
        return isRemoteStage;
    }

    public static void setIsForceLocal(boolean z) {
        isForceLocal = z;
    }

    public static void setIsRemoteStage(boolean z) {
        isRemoteStage = z;
    }
}
