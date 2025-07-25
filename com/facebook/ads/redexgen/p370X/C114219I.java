package com.facebook.ads.redexgen.p370X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9I */
/* loaded from: assets/audience_network.dex */
public class C114219I {
    public final int A00;
    public final C114189F A01;

    public C114219I(int i, C114189F c114189f) {
        this.A00 = i;
        this.A01 = c114189f;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() throws IOException {
        return this.A01.A05();
    }

    public final C1140996 A02(int i, byte[] bArr, int i2, int[] iArr, int i3) throws IOException {
        return this.A01.A06(i, bArr, i2, iArr, i3);
    }

    public final void A03() throws IOException {
        this.A01.A07();
    }

    public final void A04() throws IOException {
        this.A01.A08();
    }

    public final boolean A05(byte[] bArr) throws IOException {
        return this.A01.A09(bArr);
    }
}
