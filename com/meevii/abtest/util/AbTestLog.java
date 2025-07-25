package com.meevii.abtest.util;

import android.util.Log;

/* loaded from: classes6.dex */
public class AbTestLog {
    private static boolean showLog = false;

    public static boolean isShowLog() {
        return showLog;
    }

    public static void log(String str) {
        if (!showLog) {
            return;
        }
        Log.i("AbTestLog", str);
    }

    public static void setShowLog(boolean z) {
        showLog = z;
    }
}
