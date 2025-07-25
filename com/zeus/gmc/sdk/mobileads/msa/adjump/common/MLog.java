package com.zeus.gmc.sdk.mobileads.msa.adjump.common;

import android.util.Log;
import android.util.Patterns;

/* loaded from: classes8.dex */
public class MLog {
    private static int jjppjjupu = 0;
    private static final int jjuuju = 1;
    private static final int jpjjjjp = 4;
    private static final int jujujpjjp = 3000;
    private static final int jupppjuju = 3;
    private static final int puujujuupp = 2;
    private static boolean ujjuupp = false;
    private static final int uppjpjj = 0;

    static {
        int i;
        if (SDKConfig.DEBUG) {
            i = 4;
        } else {
            i = 1;
        }
        jjppjjupu = i;
    }

    public static String addAdPrefix(String str) {
        if (ujjuupp) {
            return "AD-SDK-" + str;
        }
        return "AD-PLUGIN-" + str;
    }

    /* renamed from: d */
    public static void m25881d(String str, String str2) {
        if (jjppjjupu >= 2) {
            jujujpjjp(addAdPrefix(str), str2, 2);
        }
    }

    /* renamed from: e */
    public static void m25879e(String str, String str2) {
        if (jjppjjupu >= 0) {
            jujujpjjp(addAdPrefix(str), str2, 0);
        }
    }

    public static int getLogLevel() {
        return jjppjjupu;
    }

    /* renamed from: i */
    public static void m25877i(String str, String str2) {
        if (jjppjjupu >= 2) {
            jujujpjjp(addAdPrefix(str), str2, 2);
        }
    }

    private static void jujujpjjp(String str, String str2, int i) {
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

    public static void setDebugOff() {
        jjppjjupu = 1;
    }

    public static void setDebugOn() {
        jjppjjupu = 1000;
    }

    public static void setLogLevel(int i) {
        jjppjjupu = i;
    }

    public static void setSdk(boolean z) {
        ujjuupp = z;
    }

    /* renamed from: v */
    public static void m25875v(String str, String str2) {
        if (jjppjjupu >= 4) {
            jujujpjjp(addAdPrefix(str), str2, 4);
        }
    }

    /* renamed from: w */
    public static void m25873w(String str, String str2) {
        if (jjppjjupu >= 1) {
            jujujpjjp(addAdPrefix(str), str2, 1);
        }
    }

    /* renamed from: d */
    public static void m25880d(String str, String str2, Throwable th) {
        if (jjppjjupu >= 3) {
            Log.d(addAdPrefix(str), jujujpjjp(str2, th));
        }
    }

    /* renamed from: e */
    public static void m25878e(String str, String str2, Throwable th) {
        if (jjppjjupu >= 0) {
            Log.e(addAdPrefix(str), jujujpjjp(str2, th));
        }
    }

    /* renamed from: i */
    public static void m25876i(String str, String str2, Throwable th) {
        if (jjppjjupu >= 2) {
            Log.i(addAdPrefix(str), jujujpjjp(str2, th));
        }
    }

    /* renamed from: v */
    public static void m25874v(String str, String str2, Throwable th) {
        if (jjppjjupu >= 4) {
            Log.v(addAdPrefix(str), jujujpjjp(str2, th));
        }
    }

    /* renamed from: w */
    public static void m25872w(String str, String str2, Throwable th) {
        if (jjppjjupu >= 1) {
            Log.w(addAdPrefix(str), jujujpjjp(str2, th));
        }
    }

    private static String jujujpjjp(String str, Throwable th) {
        String replaceAll = Patterns.IP_ADDRESS.matcher(Log.getStackTraceString(th)).replaceAll("*.*.*.*");
        return str + "\n" + replaceAll;
    }
}
