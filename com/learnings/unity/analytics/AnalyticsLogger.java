package com.learnings.unity.analytics;

import android.util.Log;

/* loaded from: classes6.dex */
public final class AnalyticsLogger {
    public static final int DEBUG = 4;
    public static final int ERROR = 1;
    public static final int INFO = 3;
    public static final int SILENCE = 0;
    public static final int WARN = 2;
    private static int logLevel = 3;

    public static void debug(String str, String str2) {
        printLog(4, str, str2);
    }

    public static void error(String str, String str2) {
        printLog(1, str, str2);
    }

    public static boolean getVerbose() {
        if (logLevel != 0) {
            return true;
        }
        return false;
    }

    public static void info(String str, String str2) {
        printLog(3, str, str2);
    }

    private static void printLog(int i, String str, String str2) {
        if (i > logLevel) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Log.d(str, str2);
                        return;
                    }
                    return;
                }
                Log.i(str, str2);
                return;
            }
            Log.w(str, str2);
            return;
        }
        Log.e(str, str2);
    }

    public static void setLogLevel(int i) {
        logLevel = i;
    }

    public static void warning(String str, String str2) {
        printLog(2, str, str2);
    }
}
