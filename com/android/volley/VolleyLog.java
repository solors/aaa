package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzapy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.android.volley.v */
/* loaded from: classes2.dex */
public class VolleyLog {

    /* renamed from: a */
    public static String f3551a = "Volley";

    /* renamed from: b */
    public static boolean f3552b = Log.isLoggable(zzapy.zza, 2);

    /* renamed from: c */
    private static final String f3553c = VolleyLog.class.getName();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VolleyLog.java */
    /* renamed from: com.android.volley.v$a */
    /* loaded from: classes2.dex */
    public static class C3767a {

        /* renamed from: c */
        public static final boolean f3554c = VolleyLog.f3552b;

        /* renamed from: a */
        private final List<C3768a> f3555a = new ArrayList();

        /* renamed from: b */
        private boolean f3556b = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: VolleyLog.java */
        /* renamed from: com.android.volley.v$a$a */
        /* loaded from: classes2.dex */
        public static class C3768a {

            /* renamed from: a */
            public final String f3557a;

            /* renamed from: b */
            public final long f3558b;

            /* renamed from: c */
            public final long f3559c;

            public C3768a(String str, long j, long j2) {
                this.f3557a = str;
                this.f3558b = j;
                this.f3559c = j2;
            }
        }

        /* renamed from: c */
        private long m102190c() {
            if (this.f3555a.size() == 0) {
                return 0L;
            }
            long j = this.f3555a.get(0).f3559c;
            List<C3768a> list = this.f3555a;
            return list.get(list.size() - 1).f3559c - j;
        }

        /* renamed from: a */
        public synchronized void m102192a(String str, long j) {
            if (!this.f3556b) {
                this.f3555a.add(new C3768a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* renamed from: b */
        public synchronized void m102191b(String str) {
            this.f3556b = true;
            long m102190c = m102190c();
            if (m102190c <= 0) {
                return;
            }
            long j = this.f3555a.get(0).f3559c;
            VolleyLog.m102197b("(%-4d ms) %s", Long.valueOf(m102190c), str);
            for (C3768a c3768a : this.f3555a) {
                long j2 = c3768a.f3559c;
                VolleyLog.m102197b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(c3768a.f3558b), c3768a.f3557a);
                j = j2;
            }
        }

        protected void finalize() throws Throwable {
            if (!this.f3556b) {
                m102191b("Request on the loose");
                VolleyLog.m102196c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private static String m102198a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i < stackTrace.length) {
                if (!stackTrace[i].getClassName().equals(f3553c)) {
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

    /* renamed from: b */
    public static void m102197b(String str, Object... objArr) {
        Log.d(f3551a, m102198a(str, objArr));
    }

    /* renamed from: c */
    public static void m102196c(String str, Object... objArr) {
        Log.e(f3551a, m102198a(str, objArr));
    }

    /* renamed from: d */
    public static void m102195d(Throwable th, String str, Object... objArr) {
        Log.e(f3551a, m102198a(str, objArr), th);
    }

    /* renamed from: e */
    public static void m102194e(String str, Object... objArr) {
        if (f3552b) {
            Log.v(f3551a, m102198a(str, objArr));
        }
    }

    /* renamed from: f */
    public static void m102193f(String str, Object... objArr) {
        Log.wtf(f3551a, m102198a(str, objArr));
    }
}
