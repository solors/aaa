package com.zeus.gmc.sdk.mobileads.columbus.analytics.util;

import android.util.Log;
import android.util.Patterns;

/* loaded from: classes8.dex */
public class MLog {
    private static final int DEBUG = 3;
    private static final int ERROR = 0;
    private static final int INFO = 2;
    private static final int MAX_CHAR_SIZE_PER_LOG = 3000;
    private static final int VERBOSE = 4;
    private static final int WARN = 1;
    private static int sLogLevel;

    static {
        int i;
        if (AnalyticsSdkConfig.DEBUG) {
            i = 4;
        } else {
            i = 1;
        }
        sLogLevel = i;
    }

    public static String addAdPrefix(String str) {
        return "COLUMBUS-AD-SDK-" + str;
    }

    /* renamed from: d */
    public static void m25913d(String str, String str2) {
        if (sLogLevel >= 2) {
            log(addAdPrefix(str), str2, 2);
        }
    }

    /* renamed from: e */
    public static void m25911e(String str, String str2) {
        if (sLogLevel >= 0) {
            log(addAdPrefix(str), str2, 0);
        }
    }

    public static int getLogLevel() {
        return sLogLevel;
    }

    private static String getPatternedMsg(String str, Throwable th) {
        String replaceAll = Patterns.IP_ADDRESS.matcher(Log.getStackTraceString(th)).replaceAll("*.*.*.*");
        return str + "\n" + replaceAll;
    }

    /* renamed from: i */
    public static void m25909i(String str, String str2) {
        if (sLogLevel >= 2) {
            log(addAdPrefix(str), str2, 2);
        }
    }

    private static void log(String str, String str2, int i) {
        int i2 = 0;
        while (i2 <= str2.length() / 3000) {
            int i3 = i2 * 3000;
            i2++;
            int min = Math.min(str2.length(), i2 * 3000);
            if (i3 < min) {
                String substring = str2.substring(i3, min);
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    Log.v(str, substring);
                                }
                            } else {
                                Log.d(str, substring);
                            }
                        } else {
                            Log.i(str, substring);
                        }
                    } else {
                        Log.w(str, substring);
                    }
                } else {
                    Log.e(str, substring);
                }
            }
        }
    }

    public static void setDebugOff() {
        sLogLevel = 1;
    }

    public static void setDebugOn() {
        sLogLevel = 1000;
    }

    public static void setLogLevel(int i) {
        sLogLevel = i;
    }

    /* renamed from: v */
    public static void m25907v(String str, String str2) {
        if (sLogLevel >= 4) {
            log(addAdPrefix(str), str2, 4);
        }
    }

    /* renamed from: w */
    public static void m25905w(String str, String str2) {
        if (sLogLevel >= 1) {
            log(addAdPrefix(str), str2, 1);
        }
    }

    /* renamed from: d */
    public static void m25912d(String str, String str2, Throwable th) {
        if (sLogLevel >= 3) {
            Log.d(addAdPrefix(str), getPatternedMsg(str2, th));
        }
    }

    /* renamed from: e */
    public static void m25910e(String str, String str2, Throwable th) {
        if (sLogLevel >= 0) {
            Log.e(addAdPrefix(str), getPatternedMsg(str2, th));
        }
    }

    /* renamed from: i */
    public static void m25908i(String str, String str2, Throwable th) {
        if (sLogLevel >= 2) {
            Log.i(addAdPrefix(str), getPatternedMsg(str2, th));
        }
    }

    /* renamed from: v */
    public static void m25906v(String str, String str2, Throwable th) {
        if (sLogLevel >= 4) {
            Log.v(addAdPrefix(str), getPatternedMsg(str2, th));
        }
    }

    /* renamed from: w */
    public static void m25904w(String str, String str2, Throwable th) {
        if (sLogLevel >= 1) {
            Log.w(addAdPrefix(str), getPatternedMsg(str2, th));
        }
    }
}
