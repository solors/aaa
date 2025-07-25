package io.appmetrica.analytics.impl;

import java.lang.Thread;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.xm */
/* loaded from: classes9.dex */
public final class C35022xm implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final CopyOnWriteArrayList f95621a = new CopyOnWriteArrayList();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        for (Thread.UncaughtExceptionHandler uncaughtExceptionHandler : this.f95621a) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
