package com.zeus.gmc.sdk.mobileads.msa.analytics.util;

import android.util.Log;
import android.util.Patterns;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.util.atntntntanaan */
/* loaded from: classes8.dex */
public class C32821atntntntanaan {
    private static final int atnaaata = 2;
    private static int atnananannnt = 0;
    private static final int atnattat = 4;
    private static final int atnntnannta = 3000;
    private static final int atntaanaa = 1;
    private static final int atntatt = 3;
    private static final int atntntntanaan = 0;

    static {
        int i;
        if (AnalyticsSdkConfig.DEBUG) {
            i = 4;
        } else {
            i = 1;
        }
        atnananannnt = i;
    }

    private C32821atntntntanaan() {
    }

    public static void atnaaata() {
        atnananannnt = 1000;
    }

    public static void atnntnannta(int i) {
        atnananannnt = i;
    }

    public static void atntaanaa() {
        atnananannnt = 1;
    }

    public static void atntatt(String str, String str2) {
        if (atnananannnt >= 1) {
            atnntnannta(atnntnannta(str), str2, 1);
        }
    }

    public static boolean atntntntanaan() {
        return atnananannnt == 1000;
    }

    public static void atnaaata(String str, String str2) {
        if (atnananannnt >= 4) {
            atnntnannta(atnntnannta(str), str2, 4);
        }
    }

    public static int atnntnannta() {
        return atnananannnt;
    }

    public static void atntaanaa(String str, String str2) {
        if (atnananannnt >= 2) {
            atnntnannta(atnntnannta(str), str2, 2);
        }
    }

    public static void atntntntanaan(String str, String str2) {
        if (atnananannnt >= 0) {
            atnntnannta(atnntnannta(str), str2, 0);
        }
    }

    public static void atnntnannta(String str, String... strArr) {
        if (atnananannnt < 3 || strArr == null) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArr) {
            stringBuffer.append(str2);
        }
        atnntnannta(atnntnannta(str), stringBuffer.toString(), 3);
    }

    public static void atntatt(String str, String str2, Throwable th) {
        if (atnananannnt >= 1) {
            Log.w(atnntnannta(str), atnntnannta(str2, th));
        }
    }

    public static void atnaaata(String str, String str2, Throwable th) {
        if (atnananannnt >= 4) {
            Log.v(atnntnannta(str), atnntnannta(str2, th));
        }
    }

    public static void atntaanaa(String str, String str2, Throwable th) {
        if (atnananannnt >= 2) {
            Log.i(atnntnannta(str), atnntnannta(str2, th));
        }
    }

    public static void atntntntanaan(String str, String str2, Throwable th) {
        if (atnananannnt >= 0) {
            Log.e(atnntnannta(str), atnntnannta(str2, th));
        }
    }

    public static void atnntnannta(String str, String str2) {
        if (atnananannnt >= 2) {
            atnntnannta(atnntnannta(str), str2, 2);
        }
    }

    public static void atnntnannta(String str, String str2, Throwable th) {
        if (atnananannnt >= 3) {
            Log.d(atnntnannta(str), atnntnannta(str2, th));
        }
    }

    private static void atnntnannta(String str, String str2, int i) {
        int i2 = 0;
        while (i2 <= str2.length() / 3000) {
            int i3 = i2 * 3000;
            i2++;
            int min = Math.min(str2.length(), i2 * 3000);
            if (i3 < min) {
                String substring = str2.substring(i3, min);
                if (i == 0) {
                    Log.e(str, substring);
                } else if (i == 1) {
                    Log.w(str, substring);
                } else if (i == 2) {
                    Log.i(str, substring);
                } else if (i == 3) {
                    Log.d(str, substring);
                } else if (i == 4) {
                    Log.v(str, substring);
                }
            }
        }
    }

    public static String atnntnannta(String str) {
        return "ANALYTICS-AD-SDK-" + str;
    }

    private static String atnntnannta(String str, Throwable th) {
        String replaceAll = Patterns.IP_ADDRESS.matcher(Log.getStackTraceString(th)).replaceAll("*.*.*.*");
        return str + "\n" + replaceAll;
    }
}
