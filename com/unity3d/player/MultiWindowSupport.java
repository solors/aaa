package com.unity3d.player;

import android.app.Activity;

/* loaded from: classes7.dex */
public class MultiWindowSupport {
    private static boolean s_LastMultiWindowMode = false;

    public static boolean isInMultiWindowMode(Activity activity) {
        if (PlatformSupport.NOUGAT_SUPPORT) {
            return activity.isInMultiWindowMode();
        }
        return false;
    }

    public static boolean isMultiWindowModeChangedToTrue(Activity activity) {
        if (!s_LastMultiWindowMode && isInMultiWindowMode(activity)) {
            return true;
        }
        return false;
    }

    public static void saveMultiWindowMode(Activity activity) {
        s_LastMultiWindowMode = isInMultiWindowMode(activity);
    }
}
