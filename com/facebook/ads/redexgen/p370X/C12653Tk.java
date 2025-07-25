package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Tk */
/* loaded from: assets/audience_network.dex */
public class C12653Tk implements InterfaceC12305O7 {
    public final /* synthetic */ C11468A4 A00;

    public C12653Tk(C11468A4 c11468a4) {
        this.A00 = c11468a4;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12305O7
    public final void AC8(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(z);
        this.A00.A05();
    }
}
