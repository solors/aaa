package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* renamed from: com.mbridge.msdk.foundation.tools.af */
/* loaded from: classes6.dex */
public final class SameLogTool {

    /* renamed from: a */
    public static boolean f56890a = true;

    /* renamed from: b */
    public static boolean f56891b = true;

    /* renamed from: c */
    public static boolean f56892c = true;

    /* renamed from: d */
    public static boolean f56893d = false;

    /* renamed from: e */
    public static boolean f56894e = true;

    /* renamed from: f */
    public static boolean f56895f = false;

    /* renamed from: g */
    public static boolean f56896g = true;

    /* renamed from: h */
    public static boolean f56897h = true;

    static {
        if (!MBridgeConstans.DEBUG) {
            f56896g = false;
            f56890a = false;
            f56892c = false;
            f56897h = false;
            f56891b = false;
            f56895f = false;
            f56894e = false;
            f56893d = false;
        }
    }

    /* renamed from: a */
    public static void m51827a(String str, String str2) {
        if (!f56890a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(m51828a(str), str2);
    }

    /* renamed from: b */
    public static void m51824b(String str, String str2) {
        if (!f56891b || str2 == null) {
            return;
        }
        Log.e(m51828a(str), str2);
    }

    /* renamed from: c */
    public static void m51822c(String str, String str2) {
        if (!f56892c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(m51828a(str), str2);
    }

    /* renamed from: d */
    public static void m51820d(String str, String str2) {
        if (f56897h && !TextUtils.isEmpty(str2)) {
            Log.w(m51828a(str), str2);
        }
    }

    /* renamed from: b */
    public static void m51823b(String str, String str2, Throwable th) {
        if (!f56891b || str2 == null || th == null) {
            return;
        }
        Log.e(m51828a(str), str2, th);
    }

    /* renamed from: a */
    private static String m51828a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    /* renamed from: c */
    public static void m51821c(String str, String str2, Throwable th) {
        if (!f56897h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(m51828a(str), str2, th);
    }

    /* renamed from: a */
    public static void m51826a(String str, String str2, Throwable th) {
        if (!f56890a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(m51828a(str), str2, th);
    }

    /* renamed from: a */
    public static void m51825a(String str, Throwable th) {
        if (!f56897h || th == null) {
            return;
        }
        Log.w(m51828a(str), th);
    }
}
