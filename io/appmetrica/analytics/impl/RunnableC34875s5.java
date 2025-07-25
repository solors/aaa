package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s5 */
/* loaded from: classes9.dex */
public final class RunnableC34875s5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC34987wd f95320a;

    /* renamed from: b */
    public final /* synthetic */ C34901t5 f95321b;

    public RunnableC34875s5(C34901t5 c34901t5, InterfaceC34987wd interfaceC34987wd) {
        this.f95321b = c34901t5;
        this.f95320a = interfaceC34987wd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f95321b) {
            C34901t5 c34901t5 = this.f95321b;
            Object obj = c34901t5.f95371a;
            if (obj == null) {
                c34901t5.f95372b.add(this.f95320a);
            } else {
                this.f95320a.consume(obj);
            }
        }
    }
}
