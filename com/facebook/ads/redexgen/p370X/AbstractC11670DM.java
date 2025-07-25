package com.facebook.ads.redexgen.p370X;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.DM */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11670DM extends AbstractC12970Yv implements InterfaceC11806Ft {
    public long A00;
    public InterfaceC11806Ft A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11538BC
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j, InterfaceC11806Ft interfaceC11806Ft, long j2) {
        super.A01 = j;
        this.A01 = interfaceC11806Ft;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final List<C11805Fs> A6x(long j) {
        return this.A01.A6x(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final long A7O(int i) {
        return this.A01.A7O(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final int A7P() {
        return this.A01.A7P();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final int A7r(long j) {
        return this.A01.A7r(j - this.A00);
    }
}
