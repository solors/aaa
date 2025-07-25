package com.facebook.ads.redexgen.p370X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.RT */
/* loaded from: assets/audience_network.dex */
public class RunnableC12513RT implements Runnable {
    public final /* synthetic */ C12516RW A00;

    public RunnableC12513RT(C12516RW c12516rw) {
        this.A00 = c12516rw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            handler = this.A00.A04;
            handler.removeCallbacks(this);
            handler2 = this.A00.A04;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
