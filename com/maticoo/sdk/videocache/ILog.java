package com.maticoo.sdk.videocache;

import android.util.Log;

/* loaded from: classes6.dex */
public class ILog {
    private static boolean DEBUG = false;
    private static final int STACK_TRACE_INDEX_5 = 5;
    private static final String SUFFIX = ".java";
    public static String TAG = "zMaticooPreload";

    private static String buildMessage(String str) {
        return wrapperContent(5, str);
    }

    /* renamed from: d */
    public static void m53551d(Object obj) {
        if (DEBUG) {
            Log.d(TAG, buildMessage(String.valueOf(obj)));
        }
    }

    /* renamed from: e */
    public static void m53550e(Object obj) {
        if (DEBUG) {
            Log.e(TAG, buildMessage(String.valueOf(obj)));
        }
    }

    public static String getSimpleClassName(String str) throws Exception {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = str.lastIndexOf(36);
        if (lastIndexOf2 != -1) {
            return str.substring(0, lastIndexOf2);
        }
        return str;
    }

    /* renamed from: i */
    public static void m53547i(Object obj) {
        if (DEBUG) {
            Log.i(TAG, buildMessage(String.valueOf(obj)));
        }
    }

    public static void setTag(String str) {
        m53551d("Changing log tag to " + str);
        TAG = str;
        DEBUG = Log.isLoggable(str, 2);
    }

    /* renamed from: v */
    public static void m53545v(Object obj) {
        if (DEBUG) {
            Log.v(TAG, buildMessage(String.valueOf(obj)));
        }
    }

    /* renamed from: w */
    public static void m53544w(Object obj) {
        if (DEBUG) {
            Log.w(TAG, buildMessage(String.valueOf(obj)));
        }
    }

    private static String wrapperContent(int i, String str) {
        String[] split;
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[i];
        String className = stackTraceElement.getClassName();
        if (className.split("\\.").length > 0) {
            className = split[split.length - 1] + SUFFIX;
        }
        int i2 = 0;
        if (className.contains("$")) {
            className = className.split("\\$")[0] + SUFFIX;
        }
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        if (lineNumber >= 0) {
            i2 = lineNumber;
        }
        return ("[ (" + className + ":" + i2 + ")#" + methodName + " ] ") + str;
    }

    /* renamed from: e */
    public static void m53548e(String str, String str2) {
        if (DEBUG) {
            Log.e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m53546i(String str, String str2) {
        if (DEBUG) {
            Log.i(str, str2);
        }
    }

    /* renamed from: w */
    public static void m53543w(Object obj, Throwable th) {
        if (DEBUG) {
            Log.w(TAG, buildMessage(String.valueOf(obj)), th);
        }
    }

    /* renamed from: e */
    public static void m53549e(Object obj, Throwable th) {
        if (DEBUG) {
            Log.e(TAG, buildMessage(String.valueOf(obj)), th);
        }
    }
}
