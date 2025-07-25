package com.meevii.soniclib.util;

import android.os.Build;

/* loaded from: classes5.dex */
public class Utils {
    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static String getOsBuildId() {
        return "Build/" + Build.ID;
    }

    public static String getOsVersion() {
        return "Android " + Build.VERSION.RELEASE;
    }
}
