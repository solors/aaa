package com.maticoo.sdk.utils.log;

import android.util.Log;

/* loaded from: classes6.dex */
public class DeveloperLog {
    private static final String TAG = "DeveloperLog";
    private static boolean debug = false;
    private static boolean innerDebug = false;

    public static void LogD(String str) {
        if (debug) {
            Log.d(TAG, str);
        }
    }

    public static void LogE(String str) {
        if (debug) {
            Log.e(TAG, str);
        }
    }

    public static void LogW(String str) {
        if (!debug) {
            return;
        }
        Log.w(TAG, str);
    }

    public static void enableDebug(boolean z) {
        if (innerDebug) {
            return;
        }
        debug = z;
    }

    public static void innerDebug(boolean z) {
        innerDebug = z;
        debug = z;
    }

    public static void LogD(String str, String str2) {
        if (debug) {
            Log.d("DeveloperLog:" + str, str2);
        }
    }

    public static void LogE(String str, Throwable th) {
        if (debug) {
            Log.e(TAG, str, th);
        }
    }

    public static void LogD(String str, Throwable th) {
        if (debug) {
            Log.d(TAG, str, th);
        }
    }
}
