package com.facebook.ads.redexgen.p370X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.XG */
/* loaded from: assets/audience_network.dex */
public final class C12870XG implements InterfaceC11806Ft {
    public final List<C11805Fs> A00;

    public C12870XG(List<C11805Fs> list) {
        this.A00 = Collections.unmodifiableList(list);
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
