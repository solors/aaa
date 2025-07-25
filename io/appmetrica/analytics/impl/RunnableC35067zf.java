package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zf */
/* loaded from: classes9.dex */
public final class RunnableC35067zf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC34018Kf f95692a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f95693b;

    public RunnableC35067zf(InterfaceC34018Kf interfaceC34018Kf, Throwable th) {
        this.f95692a = interfaceC34018Kf;
        this.f95693b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f95692a.mo20973a(this.f95693b);
    }
}
