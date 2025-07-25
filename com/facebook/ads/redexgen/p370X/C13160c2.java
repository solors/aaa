package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.c2 */
/* loaded from: assets/audience_network.dex */
public class C13160c2 implements InterfaceC109761p {
    public final /* synthetic */ C109681h A00;

    public C13160c2(C109681h c109681h) {
        this.A00 = c109681h;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109761p
    public final void AD2(AdError adError) {
        InterfaceC109671g interfaceC109671g;
        interfaceC109671g = this.A00.A04;
        interfaceC109671g.AB4(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109761p
    public final void AD3() {
        InterfaceC109671g interfaceC109671g;
        interfaceC109671g = this.A00.A04;
        interfaceC109671g.AB5();
    }
}
