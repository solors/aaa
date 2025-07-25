package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.net.UnknownHostException;

/* loaded from: classes8.dex */
public final class gq0 {

    /* renamed from: a */
    private static final Object f79742a = new Object();

    /* renamed from: a */
    private static String m33796a(String str, @Nullable Throwable th) {
        String replace;
        synchronized (f79742a) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 != null) {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } else {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
    }

    /* renamed from: b */
    public static void m33794b(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m33792d(str, m33796a(str2, th));
    }

    /* renamed from: c */
    public static void m33793c(@Size(max = 23) String str, String str2) {
        synchronized (f79742a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: d */
    public static void m33792d(@Size(max = 23) String str, String str2) {
        synchronized (f79742a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: b */
    public static void m33795b(@Size(max = 23) String str, String str2) {
        synchronized (f79742a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: a */
    public static void m33797a(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m33795b(str, m33796a(str2, th));
    }

    /* renamed from: a */
    public static void m33799a(String str, @Nullable Exception exc) {
        m33793c("BundleUtil", m33796a(str, (Throwable) exc));
    }

    /* renamed from: a */
    public static void m33798a(@Size(max = 23) String str, String str2) {
        synchronized (f79742a) {
            Log.d(str, str2);
        }
    }
}
