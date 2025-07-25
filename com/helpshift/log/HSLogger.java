package com.helpshift.log;

/* loaded from: classes5.dex */
public class HSLogger {
    private static ILogger logger;

    /* renamed from: d */
    public static void m65441d(String str, String str2) {
        m65440d(str, str2, null);
    }

    /* renamed from: e */
    public static void m65439e(String str, String str2) {
        m65438e(str, str2, null);
    }

    public static void initLogger(ILogger iLogger) {
        logger = iLogger;
    }

    /* renamed from: w */
    public static void m65437w(String str, String str2) {
        m65436w(str, str2, null);
    }

    /* renamed from: d */
    public static void m65440d(String str, String str2, Throwable th) {
        ILogger iLogger = logger;
        if (iLogger == null) {
            return;
        }
        iLogger.mo65434d(str, str2, th);
    }

    /* renamed from: e */
    public static void m65438e(String str, String str2, Throwable th) {
        ILogger iLogger = logger;
        if (iLogger == null) {
            return;
        }
        iLogger.mo65432e(str, str2, th);
    }

    /* renamed from: w */
    public static void m65436w(String str, String str2, Throwable th) {
        ILogger iLogger = logger;
        if (iLogger == null) {
            return;
        }
        iLogger.mo65430w(str, str2, th);
    }
}
