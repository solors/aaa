package com.facebook.ads.redexgen.p370X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Cl */
/* loaded from: assets/audience_network.dex */
public final class C11633Cl {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C11616CU A07;
    public C11632Ck A08;
    public C11939I4 A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public long[] A0F;
    public long[] A0G;
    public boolean[] A0H;
    public boolean[] A0I;

    public final long A00(int i) {
        return this.A0F[i] + this.A0C[i];
    }

    public final void A01() {
        this.A02 = 0;
        this.A06 = 0L;
        this.A0A = false;
        this.A0B = false;
        this.A08 = null;
    }

    public final void A02(int i) {
        if (this.A09 == null || this.A09.A07() < i) {
            this.A09 = new C11939I4(i);
        }
        this.A01 = i;
        this.A0A = true;
        this.A0B = true;
    }

    public final void A03(int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
        if (this.A0E == null || this.A0E.length < i) {
            this.A0G = new long[i];
            this.A0E = new int[i];
        }
        if (this.A0D == null || this.A0D.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.A0D = new int[i3];
            this.A0C = new int[i3];
            this.A0F = new long[i3];
            this.A0I = new boolean[i3];
            this.A0H = new boolean[i3];
        }
    }

    public final void A04(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        interfaceC11584By.readFully(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }

    public final void A05(C11939I4 c11939i4) {
        c11939i4.A0c(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }
}
