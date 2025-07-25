package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Ki */
/* loaded from: classes9.dex */
public final class C34021Ki implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ Throwable f93156a;

    public C34021Ki(Throwable th) {
        this.f93156a = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.reportUnhandledException(this.f93156a);
    }
}
