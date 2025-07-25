package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ic */
/* loaded from: assets/audience_network.dex */
public class RunnableC11969Ic implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C11974Ih A01;

    public RunnableC11969Ic(C11974Ih c11974Ih, Format format) {
        this.A01 = c11974Ih;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11975Ii interfaceC11975Ii;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC11975Ii = this.A01.A01;
            interfaceC11975Ii.AE3(this.A00);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
