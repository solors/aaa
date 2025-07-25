package com.learnings.luid;

import android.util.Log;

/* loaded from: classes6.dex */
public class LUIDLog {
    public static boolean showLog = false;

    public static void log(String str) {
        if (showLog) {
            Log.i("luid-lib", str);
        }
    }
}
