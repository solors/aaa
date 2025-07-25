package com.amazon.device.ads;

import android.util.Log;

/* loaded from: classes2.dex */
public class DtbLog {
    private static final String DEBUG_ERROR = "DTBERROR::";
    private static boolean androidLogAvailable = false;
    private static boolean isCallerInfoEnabled = false;
    private static final Object listenerLock;
    private static DTBLogLevel logLevel = null;
    private static DtbLogListener logListener = null;
    private static final String sdkName = "Amazon DTB Ads API";

    static {
        try {
            Log.isLoggable("1234", 7);
            androidLogAvailable = true;
        } catch (Throwable unused) {
            androidLogAvailable = false;
        }
        listenerLock = new Object();
        isCallerInfoEnabled = false;
        logLevel = DTBLogLevel.Warn;
    }

    public static void debug(String str) {
        if (logLevel.intValue() > DTBLogLevel.Debug.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(getTag(), str);
    }

    public static void debugError(String str) {
        if (logLevel.intValue() > DTBLogLevel.Debug.intValue() || !androidLogAvailable) {
            return;
        }
        String tag = getTag();
        Log.d(tag, DEBUG_ERROR + str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void enableCallerInfo(boolean z) {
        isCallerInfoEnabled = z;
    }

    public static void error(String str) {
        if (logLevel.intValue() > DTBLogLevel.Error.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str);
    }

    public static void fatal(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Fatal;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getCallerInfo() {
        /*
            boolean r0 = com.amazon.device.ads.DtbLog.isCallerInfoEnabled
            java.lang.String r1 = "Amazon DTB Ads API"
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            if (r0 == 0) goto L37
            r2 = 0
        L12:
            int r3 = r0.length
            if (r2 >= r3) goto L37
            r3 = r0[r2]
            java.lang.String r3 = r3.getClassName()
            java.lang.String r4 = "dalvik"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L34
            java.lang.String r4 = "java"
            boolean r3 = r3.startsWith(r4)
            if (r3 != 0) goto L34
            int r3 = r2 + 2
            int r4 = r0.length
            if (r3 >= r4) goto L31
            r2 = r3
        L31:
            r0 = r0[r2]
            goto L38
        L34:
            int r2 = r2 + 1
            goto L12
        L37:
            r0 = 0
        L38:
            if (r0 == 0) goto L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.getClassName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            java.lang.String r3 = r0.getMethodName()
            r1.append(r3)
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DtbLog.getCallerInfo():java.lang.String");
    }

    private static String getTag() {
        if (isCallerInfoEnabled) {
            return getCallerInfo();
        }
        return sdkName;
    }

    public static void info(String str) {
        if (logLevel.intValue() > DTBLogLevel.Info.intValue() || !androidLogAvailable) {
            return;
        }
        Log.i(getTag(), str);
    }

    private static void postMessageToListener(String str, DTBLogLevel dTBLogLevel, String str2) {
        if (logListener == null) {
            return;
        }
        synchronized (listenerLock) {
            DtbLogListener dtbLogListener = logListener;
            if (dtbLogListener != null && str.equals(dtbLogListener.getTag())) {
                logListener.postMessage(dTBLogLevel, str2);
            }
        }
    }

    public static void setLogLevel(DTBLogLevel dTBLogLevel) {
        logLevel = dTBLogLevel;
    }

    public static void warn(String str) {
        if (logLevel.intValue() > DTBLogLevel.Warn.intValue() || !androidLogAvailable) {
            return;
        }
        Log.w(getTag(), str);
    }

    public static void debug(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Debug;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void debugError(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Debug;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(str, DEBUG_ERROR + str2);
        postMessageToListener(str, dTBLogLevel, DEBUG_ERROR + str2);
    }

    public static void error(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Error;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void info(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Info;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.i(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void warn(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Warn;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.w(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void fatal(String str) {
        if (logLevel.intValue() > DTBLogLevel.Fatal.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str);
    }

    public static void fatal(String str, Exception exc) {
        if (logLevel.intValue() > DTBLogLevel.Fatal.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str, exc);
    }

    public static void fatal(String str, String str2, Exception exc) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Fatal;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2, exc);
        postMessageToListener(str, dTBLogLevel, str2);
    }
}
