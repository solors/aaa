package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h0 */
/* loaded from: classes9.dex */
public final class RunnableC34575h0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C34629j0 f94486a;

    public RunnableC34575h0(C34629j0 c34629j0) {
        this.f94486a = c34629j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34629j0 c34629j0 = this.f94486a;
        synchronized (c34629j0) {
            if (c34629j0.f94647a != null && c34629j0.m21532a()) {
                try {
                    c34629j0.f94650d = null;
                    c34629j0.f94647a.unbindService(c34629j0.f94655i);
                } catch (Throwable unused) {
                }
            }
            c34629j0.f94650d = null;
        }
    }
}
