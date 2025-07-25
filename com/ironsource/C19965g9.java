package com.ironsource;

import java.lang.Thread;

/* renamed from: com.ironsource.g9 */
/* loaded from: classes6.dex */
public class C19965g9 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f50197a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19965g9(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f50197a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C20038h9 c20038h9 = new C20038h9(th);
        if (c20038h9.m58218d()) {
            String m58220b = c20038h9.m58220b();
            new C21173wb(m58220b, "" + System.currentTimeMillis(), "Crash").m54359a();
        }
        this.f50197a.uncaughtException(thread, th);
    }
}
