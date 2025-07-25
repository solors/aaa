package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.CN */
/* loaded from: assets/audience_network.dex */
public final class C11609CN implements InterfaceC12798W6 {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C11609CN(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12015JM
    public final void AB2() {
        AbstractC12077KP.A00(new C12794W2(this));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12015JM
    public final void AB6() {
        AbstractC12077KP.A00(new C12795W3(this));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12015JM
    public final void ABs(C12034Jg c12034Jg) {
        AbstractC12077KP.A00(new C12797W5(this, c12034Jg));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12015JM
    public final void ACb() {
        AbstractC12077KP.A00(new C12793W1(this));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12798W6
    public final void ACg() {
        AbstractC12077KP.A00(new C12796W4(this));
    }
}
