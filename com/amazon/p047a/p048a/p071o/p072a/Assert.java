package com.amazon.p047a.p048a.p071o.p072a;

import android.os.Looper;

/* renamed from: com.amazon.a.a.o.a.a */
/* loaded from: classes2.dex */
public class Assert {

    /* renamed from: a */
    public static final boolean f2667a = true;

    /* renamed from: a */
    public static void m102876a() {
        m102875a(Looper.getMainLooper().getThread().getId());
    }

    /* renamed from: b */
    public static void m102868b(Object obj, String str) {
        m102869a(obj != null, str);
    }

    /* renamed from: c */
    public static void m102866c(Object obj, String str) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        m102869a(z, str);
    }

    /* renamed from: b */
    public static void m102867b(boolean z, String str) {
        if (z) {
            m102871a(str);
        }
    }

    /* renamed from: a */
    public static void m102875a(long j) {
        if (Thread.currentThread().getId() != j) {
            m102871a("Executing thread must be thread: " + j + ", was: " + Thread.currentThread().getId());
        }
    }

    /* renamed from: a */
    public static void m102871a(String str) {
        throw new AssertionFailureException(str);
    }

    /* renamed from: a */
    public static void m102870a(String str, Throwable th) {
        throw new AssertionFailureException(str, th);
    }

    /* renamed from: a */
    public static void m102872a(Object obj, String str) {
        if (obj == null) {
            m102871a("Argument: " + str + " cannot be null");
        }
    }

    /* renamed from: a */
    public static void m102873a(Object obj, Object obj2, String str) {
        m102869a(m102874a(obj, obj2), str);
    }

    /* renamed from: a */
    private static boolean m102874a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static void m102869a(boolean z, String str) {
        if (z) {
            return;
        }
        m102871a(str);
    }
}
