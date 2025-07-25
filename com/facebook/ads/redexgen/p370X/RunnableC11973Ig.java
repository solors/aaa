package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Ig */
/* loaded from: assets/audience_network.dex */
public class RunnableC11973Ig implements Runnable {
    public final /* synthetic */ C11543BH A00;
    public final /* synthetic */ C11974Ih A01;

    public RunnableC11973Ig(C11974Ih c11974Ih, C11543BH c11543bh) {
        this.A01 = c11974Ih;
        this.A00 = c11543bh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11975Ii interfaceC11975Ii;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            interfaceC11975Ii = this.A01.A01;
            interfaceC11975Ii.ADy(this.A00);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
