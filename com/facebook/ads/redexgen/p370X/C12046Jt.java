package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Jt */
/* loaded from: assets/audience_network.dex */
public class C12046Jt implements InterfaceC12537Rr {
    public final /* synthetic */ C1129071 A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public C12046Jt(C1129071 c1129071, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c1129071;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12537Rr
    public final void ABa(InterfaceC12535Rp interfaceC12535Rp) {
        C1129071.A06(interfaceC12535Rp.A6X(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12537Rr
    public final void ABt(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
