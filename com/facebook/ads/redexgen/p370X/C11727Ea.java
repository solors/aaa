package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Ea */
/* loaded from: assets/audience_network.dex */
public final class C11727Ea implements InterfaceC12949Ya {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C11727Ea(long j, long j2, C11589C3 c11589c3) {
        this.A04 = j2;
        this.A01 = c11589c3.A02;
        this.A00 = c11589c3.A00;
        if (j == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
            return;
        }
        this.A02 = j - j2;
        this.A03 = A8W(j);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final long A7F() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final C11591C5 A8H(long j) {
        if (this.A02 == -1) {
            return new C11591C5(new C11593C7(0L, this.A04));
        }
        long positionOffset = this.A01;
        long j2 = ((this.A00 * j) / 8000000) / positionOffset;
        long positionOffset2 = this.A01;
        long A0E = AbstractC11953IK.A0E(j2 * positionOffset2, 0L, this.A02 - this.A01);
        long j3 = this.A04 + A0E;
        long A8W = A8W(j3);
        C11593C7 seekPoint = new C11593C7(A8W, j3);
        if (A8W >= j || A0E == this.A02 - this.A01) {
            return new C11591C5(seekPoint);
        }
        long seekTimeUs = this.A01 + j3;
        long seekPosition = A8W(seekTimeUs);
        return new C11591C5(seekPoint, new C11593C7(seekPosition, seekTimeUs));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12949Ya
    public final long A8W(long j) {
        return ((Math.max(0L, j - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final boolean A9h() {
        return this.A02 != -1;
    }
}
