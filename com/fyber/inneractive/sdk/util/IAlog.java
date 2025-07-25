package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.logger.C14581a;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.ironsource.C21114v8;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class IAlog {

    /* renamed from: a */
    public static int f30554a = 4;

    /* renamed from: b */
    public static final C14581a f30555b = new C14581a();

    /* renamed from: c */
    public static final C15431W f30556c = new C15431W();

    /* renamed from: a */
    public static void m76529a(String str, Object... objArr) {
        Iterator it = f30556c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).debug(str, objArr);
        }
    }

    /* renamed from: b */
    public static void m76528b(String str, Object... objArr) {
        Iterator it = f30556c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, null, objArr);
        }
    }

    /* renamed from: c */
    public static void m76527c(String str, Object... objArr) {
        Iterator it = f30556c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).info(str, objArr);
        }
    }

    /* renamed from: d */
    public static void m76526d(String str, Object... objArr) {
        Iterator it = f30556c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).log(1, null, str, objArr);
        }
    }

    /* renamed from: e */
    public static void m76525e(String str, Object... objArr) {
        Iterator it = f30556c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).verbose(str, objArr);
        }
    }

    /* renamed from: f */
    public static void m76524f(String str, Object... objArr) {
        Iterator it = f30556c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).warning(str, objArr);
        }
    }

    /* renamed from: a */
    public static void m76530a(String str, Throwable th, Object... objArr) {
        Iterator it = f30556c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, th, objArr);
        }
    }

    /* renamed from: a */
    public static String m76531a(Object obj) {
        return "(" + Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + C21114v8.C21123i.f54137d + Integer.toHexString(System.identityHashCode(obj)) + "] ";
    }

    /* renamed from: a */
    public static String m76532a(Class cls) {
        return "(" + Thread.currentThread().getName() + "): " + cls.getSimpleName() + C21114v8.C21123i.f54137d + Integer.toHexString(System.identityHashCode(cls)) + "] ";
    }
}
