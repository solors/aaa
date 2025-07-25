package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.Q1 */
/* loaded from: classes9.dex */
public final class C34148Q1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: e */
    public static final AtomicBoolean f93378e = new AtomicBoolean();

    /* renamed from: a */
    public final InterfaceC33841Da f93379a;

    /* renamed from: b */
    public final C34277Vb f93380b = C34848r4.m21050i().m21047l();

    /* renamed from: c */
    public final C34850r6 f93381c = new C34850r6();

    /* renamed from: d */
    public final C33828Cm f93382d = new C33828Cm();

    public C34148Q1(C34770o6 c34770o6) {
        this.f93379a = c34770o6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            f93378e.set(true);
            InterfaceC33841Da interfaceC33841Da = this.f93379a;
            C34970vm apply = this.f93381c.apply(thread);
            C33828Cm c33828Cm = this.f93382d;
            Thread mo20706a = c33828Cm.f92680a.mo20706a();
            ArrayList m22727a = c33828Cm.m22727a(mo20706a, thread);
            if (thread != mo20706a) {
                try {
                    stackTraceElementArr = c33828Cm.f92680a.mo20705b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = mo20706a.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                m22727a.add(0, (C34970vm) c33828Cm.f92681b.apply(mo20706a, stackTraceElementArr));
            }
            interfaceC33841Da.mo21231a(th, new C34217T(apply, m22727a, this.f93380b.m22156b()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
