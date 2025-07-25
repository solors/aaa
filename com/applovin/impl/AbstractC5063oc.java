package com.applovin.impl;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: com.applovin.impl.oc */
/* loaded from: classes2.dex */
public abstract class AbstractC5063oc {

    /* renamed from: a */
    private static int f8784a = 0;

    /* renamed from: b */
    private static boolean f8785b = true;

    /* renamed from: a */
    private static String m96807a(String str, Throwable th) {
        String m96806a = m96806a(th);
        if (TextUtils.isEmpty(m96806a)) {
            return str;
        }
        return str + "\n  " + m96806a.replace("\n", "\n  ") + '\n';
    }

    /* renamed from: b */
    public static void m96804b(String str, String str2, Throwable th) {
        m96802c(str, m96807a(str2, th));
    }

    /* renamed from: c */
    public static void m96801c(String str, String str2, Throwable th) {
        m96800d(str, m96807a(str2, th));
    }

    /* renamed from: d */
    public static void m96800d(String str, String str2) {
        if (f8784a <= 2) {
            Log.w(str, str2);
        }
    }

    /* renamed from: b */
    private static boolean m96803b(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: c */
    public static void m96802c(String str, String str2) {
        if (f8784a <= 1) {
            Log.i(str, str2);
        }
    }

    /* renamed from: a */
    public static void m96808a(String str, String str2, Throwable th) {
        m96805b(str, m96807a(str2, th));
    }

    /* renamed from: b */
    public static void m96805b(String str, String str2) {
        if (f8784a <= 3) {
            Log.e(str, str2);
        }
    }

    /* renamed from: a */
    public static String m96806a(Throwable th) {
        if (th == null) {
            return null;
        }
        if (m96803b(th)) {
            return "UnknownHostException (no network)";
        }
        if (!f8785b) {
            return th.getMessage();
        }
        return Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    /* renamed from: a */
    public static void m96809a(String str, String str2) {
        if (f8784a == 0) {
            Log.d(str, str2);
        }
    }
}
