package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.WP */
/* loaded from: assets/audience_network.dex */
public class C12817WP implements InterfaceC12472Qo {
    public final /* synthetic */ C12811WJ A00;

    public C12817WP(C12811WJ c12811wj) {
        this.A00 = c12811wj;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12472Qo
    public final void AE2() {
        AtomicBoolean atomicBoolean;
        InterfaceC12018JP interfaceC12018JP;
        InterfaceC12018JP interfaceC12018JP2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        interfaceC12018JP = this.A00.A02;
        if (interfaceC12018JP != null) {
            interfaceC12018JP2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            interfaceC12018JP2.AD0(atomicBoolean2.get());
        }
    }
}
