package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.D2 */
/* loaded from: assets/audience_network.dex */
public final class C11650D2 extends AbstractC12866XC {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final InterfaceC11867Gu A0A;
    public final InterfaceC11917Hi A0B;

    public C11650D2(TrackGroup trackGroup, int[] iArr, InterfaceC11867Gu interfaceC11867Gu, long j, long j2, long j3, float f, float f2, long j4, InterfaceC11917Hi interfaceC11917Hi) {
        super(trackGroup, iArr);
        this.A0A = interfaceC11867Gu;
        this.A07 = j * 1000;
        this.A06 = j2 * 1000;
        this.A08 = 1000 * j3;
        this.A04 = f;
        this.A05 = f2;
        this.A09 = j4;
        this.A0B = interfaceC11917Hi;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j) {
        long A6V = ((float) this.A0A.A6V()) * this.A04;
        int i = 0;
        for (int i2 = 0; i2 < super.A03; i2++) {
            if (j == Long.MIN_VALUE || !A00(i2, j)) {
                if (Math.round(A7U(i2).A04 * this.A00) <= A6V) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12866XC, com.facebook.ads.redexgen.p370X.InterfaceC11858Gl
    public final void A5q() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11858Gl
    public final int A8J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12866XC, com.facebook.ads.redexgen.p370X.InterfaceC11858Gl
    public final void AD5(float f) {
        this.A00 = f;
    }
}
