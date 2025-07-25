package com.facebook.ads.redexgen.p370X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Co */
/* loaded from: assets/audience_network.dex */
public final class C11636Co {
    public int A01;
    public boolean A02;
    public final C11637Cp A03 = new C11637Cp();
    public final C11939I4 A04 = new C11939I4(new byte[65025], 0);
    public int A00 = -1;

    /* JADX WARN: Incorrect condition in loop: B:4:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A00(int r5) {
        /*
            r4 = this;
            r0 = 0
            r4.A01 = r0
            r3 = 0
        L4:
            int r1 = r4.A01
            int r1 = r1 + r5
            com.facebook.ads.redexgen.X.Cp r0 = r4.A03
            int r0 = r0.A02
            if (r1 >= r0) goto L1f
            com.facebook.ads.redexgen.X.Cp r0 = r4.A03
            int[] r2 = r0.A09
            int r1 = r4.A01
            int r0 = r1 + 1
            r4.A01 = r0
            int r1 = r1 + r5
            r1 = r2[r1]
            int r3 = r3 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L4
        L1f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11636Co.A00(int):int");
    }

    public final C11637Cp A01() {
        return this.A03;
    }

    public final C11939I4 A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0V();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        this.A04.A00 = Arrays.copyOf(this.A04.A00, Math.max(65025, this.A04.A07()));
    }

    public final boolean A05(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        AbstractC11914Hf.A04(interfaceC11584By != null);
        if (this.A02) {
            this.A02 = false;
            this.A04.A0V();
        }
        while (!this.A02) {
            if (this.A00 < 0) {
                if (!this.A03.A03(interfaceC11584By, true)) {
                    return false;
                }
                int segmentIndex = 0;
                int i = this.A03.A01;
                if ((this.A03.A04 & 1) == 1 && this.A04.A07() == 0) {
                    i += A00(0);
                    segmentIndex = 0 + this.A01;
                }
                interfaceC11584By.AGq(i);
                this.A00 = segmentIndex;
            }
            int A00 = A00(this.A00);
            int size = this.A00 + this.A01;
            if (A00 > 0) {
                if (this.A04.A05() < this.A04.A07() + A00) {
                    this.A04.A00 = Arrays.copyOf(this.A04.A00, this.A04.A07() + A00);
                }
                interfaceC11584By.readFully(this.A04.A00, this.A04.A07(), A00);
                this.A04.A0X(this.A04.A07() + A00);
                this.A02 = this.A03.A09[size + (-1)] != 255;
            }
            if (size == this.A03.A02) {
                size = -1;
            }
            this.A00 = size;
        }
        return true;
    }
}
