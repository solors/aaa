package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C20688qf;

/* loaded from: classes6.dex */
public class Logger {

    /* renamed from: a */
    private static boolean f53465a;

    /* renamed from: d */
    public static void m54974d(String str, String str2) {
        if (f53465a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m54972e(String str, String str2) {
        if (f53465a) {
            Log.e(str, str2);
        }
    }

    public static void enableLogging(int i) {
        boolean z;
        if (C20688qf.EnumC20692d.MODE_0.m55650a() != i) {
            z = true;
        } else {
            z = false;
        }
        f53465a = z;
    }

    /* renamed from: i */
    public static void m54970i(String str, String str2) {
        if (f53465a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: v */
    public static void m54968v(String str, String str2) {
        if (f53465a) {
            Log.v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m54966w(String str, String str2) {
        if (f53465a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: d */
    public static void m54973d(String str, String str2, Throwable th) {
        if (f53465a) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m54971e(String str, String str2, Throwable th) {
        if (f53465a) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m54969i(String str, String str2, Throwable th) {
        if (!f53465a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th);
    }

    /* renamed from: v */
    public static void m54967v(String str, String str2, Throwable th) {
        if (f53465a) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m54965w(String str, String str2, Throwable th) {
        if (f53465a) {
            Log.w(str, str2, th);
        }
    }
}
