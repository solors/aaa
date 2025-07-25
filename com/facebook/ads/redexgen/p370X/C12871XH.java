package com.facebook.ads.redexgen.p370X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.XH */
/* loaded from: assets/audience_network.dex */
public final class C12871XH implements InterfaceC11806Ft {
    public static final C12871XH A01 = new C12871XH();
    public final List<C11805Fs> A00;

    public C12871XH() {
        this.A00 = Collections.emptyList();
    }

    public C12871XH(C11805Fs c11805Fs) {
        this.A00 = Collections.singletonList(c11805Fs);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final List<C11805Fs> A6x(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final long A7O(int i) {
        AbstractC11914Hf.A03(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final int A7P() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final int A7r(long j) {
        return j < 0 ? 0 : -1;
    }
}
