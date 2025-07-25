package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.BJ */
/* loaded from: assets/audience_network.dex */
public class C11545BJ extends Thread {
    public final /* synthetic */ AbstractC12969Yu A00;

    public C11545BJ(AbstractC12969Yu abstractC12969Yu) {
        this.A00 = abstractC12969Yu;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
