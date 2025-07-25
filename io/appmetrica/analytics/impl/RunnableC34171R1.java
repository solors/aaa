package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.R1 */
/* loaded from: classes9.dex */
public final class RunnableC34171R1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC34987wd f93425a;

    /* renamed from: b */
    public final /* synthetic */ C33763A7 f93426b;

    public RunnableC34171R1(C34219T1 c34219t1, C33763A7 c33763a7) {
        this.f93425a = c34219t1;
        this.f93426b = c33763a7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f93425a.consume(this.f93426b);
    }
}
