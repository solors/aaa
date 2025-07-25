package com.mbridge.msdk.tracker.network;

import android.util.Log;
import java.util.List;
import java.util.Locale;

/* compiled from: VolleyLog.java */
/* renamed from: com.mbridge.msdk.tracker.network.ae */
/* loaded from: classes6.dex */
public class C22899ae {

    /* renamed from: a */
    public static String f59727a = "TrackManager_Volley";

    /* renamed from: b */
    private static final String f59728b = "com.mbridge.msdk.tracker.network.ae";

    /* compiled from: VolleyLog.java */
    /* renamed from: com.mbridge.msdk.tracker.network.ae$a */
    /* loaded from: classes6.dex */
    static class C22900a {

        /* renamed from: a */
        private final List<C22901a> f59729a;

        /* renamed from: b */
        private boolean f59730b;

        /* compiled from: VolleyLog.java */
        /* renamed from: com.mbridge.msdk.tracker.network.ae$a$a */
        /* loaded from: classes6.dex */
        private static class C22901a {

            /* renamed from: a */
            public final String f59731a;

            /* renamed from: b */
            public final long f59732b;

            /* renamed from: c */
            public final long f59733c;
        }

        protected final void finalize() throws Throwable {
            long j;
            if (!this.f59730b) {
                this.f59730b = true;
                if (this.f59729a.size() == 0) {
                    j = 0;
                } else {
                    long j2 = this.f59729a.get(0).f59733c;
                    List<C22901a> list = this.f59729a;
                    j = list.get(list.size() - 1).f59733c - j2;
                }
                if (j > 0) {
                    long j3 = this.f59729a.get(0).f59733c;
                    C22899ae.m49515b("(%-4d ms) %s", Long.valueOf(j), "Request on the loose");
                    for (C22901a c22901a : this.f59729a) {
                        long j4 = c22901a.f59733c;
                        C22899ae.m49515b("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(c22901a.f59732b), c22901a.f59731a);
                        j3 = j4;
                    }
                }
                C22899ae.m49514c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m49517a(String str, Object... objArr) {
    }

    /* renamed from: b */
    public static void m49515b(String str, Object... objArr) {
        Log.d(f59727a, m49513d(str, objArr));
    }

    /* renamed from: c */
    public static void m49514c(String str, Object... objArr) {
        Log.e(f59727a, m49513d(str, objArr));
    }

    /* renamed from: d */
    private static String m49513d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i < stackTrace.length) {
                if (!stackTrace[i].getClassName().equals(f59728b)) {
                    String className = stackTrace[i].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                    break;
                }
                i++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* renamed from: a */
    public static void m49516a(Throwable th, String str, Object... objArr) {
        Log.e(f59727a, m49513d(str, objArr), th);
    }
}
