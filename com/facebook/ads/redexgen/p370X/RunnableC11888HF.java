package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.HF */
/* loaded from: assets/audience_network.dex */
public final class RunnableC11888HF implements Runnable {
    public final InterfaceC11887HE A00;

    public RunnableC11888HF(InterfaceC11887HE interfaceC11887HE) {
        this.A00 = interfaceC11887HE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.ACX();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
