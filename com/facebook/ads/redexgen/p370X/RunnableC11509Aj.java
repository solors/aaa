package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Aj */
/* loaded from: assets/audience_network.dex */
public class RunnableC11509Aj implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C11513An A01;

    public RunnableC11509Aj(C11513An c11513An, Format format) {
        this.A01 = c11513An;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11514Ao interfaceC11514Ao;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC11514Ao = this.A01.A01;
            interfaceC11514Ao.ABH(this.A00);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
