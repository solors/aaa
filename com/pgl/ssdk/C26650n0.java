package com.pgl.ssdk;

import java.lang.Thread;

/* renamed from: com.pgl.ssdk.n0 */
/* loaded from: classes7.dex */
public class C26650n0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static volatile C26650n0 f69939a;

    /* renamed from: c */
    private volatile boolean f69941c = false;

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f69940b = Thread.getDefaultUncaughtExceptionHandler();

    private C26650n0() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: b */
    public static C26650n0 m40807b() {
        if (f69939a == null) {
            synchronized (C26650n0.class) {
                if (f69939a == null) {
                    f69939a = new C26650n0();
                }
            }
        }
        return f69939a;
    }

    /* renamed from: a */
    public boolean m40808a() {
        return this.f69941c;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f69941c = true;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f69940b;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
