package com.facebook.ads.redexgen.p370X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.YN */
/* loaded from: assets/audience_network.dex */
public class C12936YN implements InterfaceC11638Cq, InterfaceC11592C6 {
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ C12935YM A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final C11591C5 A8H(long j) {
        int A0B = AbstractC11953IK.A0B(this.A02, this.A04.A04(j), true, true);
        long A03 = this.A04.A03(this.A02[A0B]);
        C11593C7 c11593c7 = new C11593C7(A03, this.A00 + this.A03[A0B]);
        return (A03 >= j || A0B == this.A02.length - 1) ? new C11591C5(c11593c7) : new C11591C5(c11593c7, new C11593C7(this.A04.A03(this.A02[A0B + 1]), this.A00 + this.A03[A0B + 1]));
    }

    public C12936YN(C12935YM c12935ym) {
        this.A04 = c12935ym;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    public final void A01(C11939I4 c11939i4) {
        c11939i4.A0Z(1);
        int length = c11939i4.A0G();
        int i = length / 18;
        this.A02 = new long[i];
        this.A03 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A02[i2] = c11939i4.A0L();
            this.A03[i2] = c11939i4.A0L();
            c11939i4.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11638Cq
    public final InterfaceC11592C6 A58() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final long A7F() {
        C11926Hr c11926Hr;
        c11926Hr = this.A04.A01;
        return c11926Hr.A01();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final boolean A9h() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11638Cq
    public final long AEl(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        if (this.A01 >= 0) {
            long result = -(this.A01 + 2);
            this.A01 = -1L;
            return result;
        }
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11638Cq
    public final long AGy(long j) {
        long A04 = this.A04.A04(j);
        long granule = this.A02[AbstractC11953IK.A0B(this.A02, A04, true, true)];
        this.A01 = granule;
        return A04;
    }
}
