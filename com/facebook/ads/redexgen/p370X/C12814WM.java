package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.WM */
/* loaded from: assets/audience_network.dex */
public class C12814WM implements InterfaceC12305O7 {
    public final /* synthetic */ C12811WJ A00;

    public C12814WM(C12811WJ c12811wj) {
        this.A00 = c12811wj;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12305O7
    public final void AC8(boolean z) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        InterfaceC12018JP interfaceC12018JP;
        InterfaceC12018JP interfaceC12018JP2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(z);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            interfaceC12018JP = this.A00.A02;
            if (interfaceC12018JP != null) {
                interfaceC12018JP2 = this.A00.A02;
                interfaceC12018JP2.AD0(z);
            }
        }
    }
}
