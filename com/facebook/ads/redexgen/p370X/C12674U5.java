package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.U5 */
/* loaded from: assets/audience_network.dex */
public class C12674U5 implements InterfaceC12305O7 {
    public final /* synthetic */ C11534B8 A00;

    public C12674U5(C11534B8 c11534b8) {
        this.A00 = c11534b8;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12305O7
    public final void AC8(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(z);
        this.A00.A04();
    }
}
