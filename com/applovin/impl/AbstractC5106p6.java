package com.applovin.impl;

import android.os.Looper;

/* renamed from: com.applovin.impl.p6 */
/* loaded from: classes2.dex */
public abstract class AbstractC5106p6 {

    /* renamed from: a */
    private static final Thread f8994a = Looper.getMainLooper().getThread();

    /* renamed from: a */
    public static void m96592a(Throwable th) {
    }

    /* renamed from: a */
    public static void m96591a(Throwable th, String str, Object... objArr) {
    }

    /* renamed from: a */
    public static boolean m96590a(boolean z) {
        return m96589a(z, "Assertion failed", new Object[0]);
    }

    /* renamed from: a */
    public static boolean m96589a(boolean z, String str, Object... objArr) {
        if (!z) {
            m96593a(str, objArr);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m96595a(Object obj) {
        return m96594a(obj, "Null value not expected", new Object[0]);
    }

    /* renamed from: a */
    public static boolean m96594a(Object obj, String str, Object... objArr) {
        return m96589a(obj != null, str, objArr);
    }

    /* renamed from: a */
    public static void m96593a(String str, Object... objArr) {
        m96591a((Throwable) null, str, objArr);
    }
}
