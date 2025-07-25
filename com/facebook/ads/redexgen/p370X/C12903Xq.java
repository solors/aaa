package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Xq */
/* loaded from: assets/audience_network.dex */
public final class C12903Xq implements InterfaceC11592C6 {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C12903Xq(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A06 = i;
        this.A07 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = i6;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j) {
        long positionOffset = Math.max(0L, j - this.A01);
        long j2 = 1000000 * positionOffset;
        long positionOffset2 = this.A02;
        return j2 / positionOffset2;
    }

    public final void A06(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final long A7F() {
        long numFrames = this.A07;
        return (1000000 * (this.A00 / this.A04)) / numFrames;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final C11591C5 A8H(long j) {
        long positionOffset = this.A04;
        long j2 = ((this.A02 * j) / 1000000) / positionOffset;
        long positionOffset2 = this.A04;
        long A0E = AbstractC11953IK.A0E(j2 * positionOffset2, 0L, this.A00 - this.A04);
        long j3 = this.A01 + A0E;
        long A05 = A05(j3);
        C11593C7 seekPoint = new C11593C7(A05, j3);
        if (A05 >= j || A0E == this.A00 - this.A04) {
            return new C11591C5(seekPoint);
        }
        long seekTimeUs = this.A04 + j3;
        long seekPosition = A05(seekTimeUs);
        return new C11591C5(seekPoint, new C11593C7(seekPosition, seekTimeUs));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final boolean A9h() {
        return true;
    }
}
