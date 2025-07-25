package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.FE */
/* loaded from: assets/audience_network.dex */
public final class C11767FE {
    public C11767FE A00;
    public C11863Gq A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C11767FE(long j, int i) {
        this.A04 = j;
        this.A03 = i + j;
    }

    public final int A00(long j) {
        return ((int) (j - this.A04)) + this.A01.A00;
    }

    public final C11767FE A01() {
        this.A01 = null;
        C11767FE c11767fe = this.A00;
        this.A00 = null;
        return c11767fe;
    }

    public final void A02(C11863Gq c11863Gq, C11767FE c11767fe) {
        this.A01 = c11863Gq;
        this.A00 = c11767fe;
        this.A02 = true;
    }
}
