package com.amazon.p047a.p048a.p071o;

import android.util.Log;

/* renamed from: com.amazon.a.a.o.c */
/* loaded from: classes2.dex */
public class KiwiLogger {

    /* renamed from: a */
    public static boolean f2770a = true;

    /* renamed from: b */
    public static boolean f2771b = true;

    /* renamed from: c */
    private static boolean f2772c = false;

    /* renamed from: d */
    private static final String f2773d = "Kiwi";

    /* renamed from: e */
    private String f2774e;

    public KiwiLogger(String str) {
        this.f2774e = str;
    }

    /* renamed from: d */
    private String m102823d(String str) {
        return this.f2774e + ": " + str;
    }

    /* renamed from: a */
    public void m102829a(String str) {
        if (f2770a) {
            Log.d(f2773d, m102823d(str));
        }
    }

    /* renamed from: b */
    public void m102826b(String str) {
        if (f2771b) {
            Log.e(f2773d, m102823d(str));
        }
    }

    /* renamed from: c */
    public void m102824c(String str) {
        if (f2772c) {
            Log.e(f2773d, "TEST-" + m102823d(str));
        }
    }

    /* renamed from: a */
    public void m102828a(String str, Throwable th) {
        if (f2770a) {
            Log.d(f2773d, m102823d(str), th);
        }
    }

    /* renamed from: b */
    public void m102825b(String str, Throwable th) {
        if (f2771b) {
            Log.e(f2773d, m102823d(str), th);
        }
    }

    /* renamed from: a */
    public static void m102830a() {
        f2772c = true;
    }

    /* renamed from: b */
    public static boolean m102827b() {
        return f2772c;
    }
}
