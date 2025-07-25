package com.learnings.purchase;

import android.util.Log;

/* loaded from: classes6.dex */
public class PurchaseLogUtil {
    private static volatile boolean isShowLog;

    public static void log(String str, String str2) {
        if (isShowLog) {
            Log.d(str, str2);
        }
    }

    public static void setShowLog(boolean z) {
        isShowLog = z;
    }
}
