package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.F4 */
/* loaded from: assets/audience_network.dex */
public class RunnableC11757F4 implements Runnable {
    public final /* synthetic */ C11759F6 A00;
    public final /* synthetic */ C11761F8 A01;
    public final /* synthetic */ InterfaceC11762F9 A02;

    public RunnableC11757F4(C11759F6 c11759f6, InterfaceC11762F9 interfaceC11762F9, C11761F8 c11761f8) {
        this.A00 = c11759f6;
        this.A02 = interfaceC11762F9;
        this.A01 = c11761f8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A02.ABn(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
