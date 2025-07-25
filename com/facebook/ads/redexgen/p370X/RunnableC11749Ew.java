package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Ew */
/* loaded from: assets/audience_network.dex */
public class RunnableC11749Ew implements Runnable {
    public final /* synthetic */ C11759F6 A00;
    public final /* synthetic */ InterfaceC11762F9 A01;

    public RunnableC11749Ew(C11759F6 c11759f6, InterfaceC11762F9 interfaceC11762F9) {
        this.A00 = c11759f6;
        this.A01 = interfaceC11762F9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A01.ACh(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
