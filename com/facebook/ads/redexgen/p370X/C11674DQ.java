package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.DQ */
/* loaded from: assets/audience_network.dex */
public final class C11674DQ extends AbstractC12891Xb implements InterfaceC11743Eq {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC11586C0 A05;
    public final InterfaceC11871Gy A06;
    public final Object A07;
    public final String A08;

    public C11674DQ(Uri uri, InterfaceC11871Gy interfaceC11871Gy, InterfaceC11586C0 interfaceC11586C0, int i, String str, int i2, Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC11871Gy;
        this.A05 = interfaceC11586C0;
        this.A03 = i;
        this.A08 = str;
        this.A02 = i2;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
        A01(new C12882XS(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12891Xb
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12891Xb
    public final void A03(InterfaceC12986ZB interfaceC12986ZB, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11748Ev
    public final InterfaceC12884XU A56(C11746Et c11746Et, InterfaceC11864Gr interfaceC11864Gr) {
        AbstractC11914Hf.A03(c11746Et.A02 == 0);
        return new C11688Dg(this.A04, this.A06.A4t(), this.A05.A4x(), this.A03, A00(c11746Et), this, interfaceC11864Gr, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11748Ev
    public final void AAo() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11743Eq
    public final void ADc(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 == j && this.A01 == z) {
            return;
        }
        A00(j, z);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11748Ev
    public final void AF3(InterfaceC12884XU interfaceC12884XU) {
        ((C11688Dg) interfaceC12884XU).A0R();
    }
}
