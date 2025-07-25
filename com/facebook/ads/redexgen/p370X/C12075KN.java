package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.KN */
/* loaded from: assets/audience_network.dex */
public final class C12075KN implements InterfaceC12572SQ {
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12572SQ
    public final long A5L() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12572SQ
    public final void AGr(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
