package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;

/* loaded from: classes4.dex */
public final class Logging {
    private Logging() {
    }

    /* renamed from: a */
    private static String m76293a(String str, String str2) {
        String str3 = str + str2;
        if (str3.length() > 23) {
            return str3.substring(0, 23);
        }
        return str3;
    }

    /* renamed from: b */
    private static String m76292b(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m76293a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: d */
    public static void m76291d(String str, String str2) {
        String m76292b = m76292b(str);
        if (Log.isLoggable(m76292b, 3)) {
            Log.d(m76292b, str2);
        }
    }

    /* renamed from: e */
    public static void m76287e(String str, String str2, Throwable th) {
        String m76292b = m76292b(str);
        if (Log.isLoggable(m76292b, 6)) {
            Log.e(m76292b, str2, th);
        }
    }

    /* renamed from: i */
    public static void m76286i(String str, String str2, Object obj) {
        String m76292b = m76292b(str);
        if (Log.isLoggable(m76292b, 4)) {
            Log.i(m76292b, String.format(str2, obj));
        }
    }

    /* renamed from: w */
    public static void m76285w(String str, String str2, Object obj) {
        String m76292b = m76292b(str);
        if (Log.isLoggable(m76292b, 5)) {
            Log.w(m76292b, String.format(str2, obj));
        }
    }

    /* renamed from: d */
    public static void m76290d(String str, String str2, Object obj) {
        String m76292b = m76292b(str);
        if (Log.isLoggable(m76292b, 3)) {
            Log.d(m76292b, String.format(str2, obj));
        }
    }

    /* renamed from: d */
    public static void m76289d(String str, String str2, Object obj, Object obj2) {
        String m76292b = m76292b(str);
        if (Log.isLoggable(m76292b, 3)) {
            Log.d(m76292b, String.format(str2, obj, obj2));
        }
    }

    /* renamed from: d */
    public static void m76288d(String str, String str2, Object... objArr) {
        String m76292b = m76292b(str);
        if (Log.isLoggable(m76292b, 3)) {
            Log.d(m76292b, String.format(str2, objArr));
        }
    }
}
