package com.chartboost.sdk.impl;

/* renamed from: com.chartboost.sdk.impl.e1 */
/* loaded from: classes3.dex */
public class RunnableC9823e1 implements Runnable {

    /* renamed from: b */
    public final InterfaceC9799d1 f21937b;

    /* renamed from: c */
    public final boolean f21938c;

    public RunnableC9823e1(InterfaceC9799d1 interfaceC9799d1, boolean z, int i) {
        this.f21937b = interfaceC9799d1;
        this.f21938c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f21937b.mo13997a(this.f21938c);
    }
}
