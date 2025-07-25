package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Hr */
/* loaded from: assets/audience_network.dex */
public final class C11926Hr {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;

    public C11926Hr(byte[] bArr, int i) {
        C11938I3 c11938i3 = new C11938I3(bArr);
        c11938i3.A07(i * 8);
        this.A04 = c11938i3.A04(16);
        this.A02 = c11938i3.A04(16);
        this.A05 = c11938i3.A04(24);
        this.A03 = c11938i3.A04(24);
        this.A06 = c11938i3.A04(20);
        this.A01 = c11938i3.A04(3) + 1;
        this.A00 = c11938i3.A04(5) + 1;
        this.A07 = ((c11938i3.A04(4) & 15) << 32) | (c11938i3.A04(32) & 4294967295L);
    }

    public final int A00() {
        return this.A00 * this.A06;
    }

    public final long A01() {
        return (this.A07 * 1000000) / this.A06;
    }
}
