package com.bykv.p135vk.openvk.preload.geckox.logger;

/* renamed from: com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger */
/* loaded from: classes3.dex */
public class GeckoLogger {
    private static boolean DEBUG;
    private static Logger sLogger = new DefaultLogger();

    /* renamed from: d */
    public static void m91263d(String str, Object... objArr) {
        Logger logger;
        if (DEBUG && (logger = sLogger) != null) {
            logger.mo91259d(str, objArr);
        }
    }

    public static void disable() {
        DEBUG = false;
    }

    /* renamed from: e */
    public static void m91262e(String str, String str2, Throwable th) {
        Logger logger;
        if (DEBUG && (logger = sLogger) != null) {
            logger.mo91258e(str, str2, th);
        }
    }

    public static void enable() {
        DEBUG = true;
    }

    public static boolean isDebug() {
        return DEBUG;
    }

    public static void redirect(Logger logger) {
        sLogger = logger;
    }

    /* renamed from: w */
    public static void m91260w(String str, String str2, Throwable th) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.mo91256w(str, str2, th);
    }

    /* renamed from: w */
    public static void m91261w(String str, String str2) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.mo91257w(str, str2);
    }
}
