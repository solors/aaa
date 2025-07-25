package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xr */
/* loaded from: assets/audience_network.dex */
public final class C12904Xr implements InterfaceC11583Bx {
    public static byte[] A05;
    public static final InterfaceC11586C0 A06;
    public int A00;
    public int A01;
    public InterfaceC11585Bz A02;
    public InterfaceC11595C9 A03;
    public C12903Xq A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-97, -72, -67, -65, -70, -70, -71, -68, -66, -81, -82, 106, -71, -68, 106, -65, -72, -68, -81, -83, -71, -79, -72, -77, -60, -81, -82, 106, -63, -85, -64, 106, -78, -81, -85, -82, -81, -68, 120, -33, -13, -30, -25, -19, -83, -16, -33, -11};
    }

    static {
        A01();
        A06 = new C12905Xs();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void A9D(InterfaceC11585Bz interfaceC11585Bz) {
        this.A02 = interfaceC11585Bz;
        this.A03 = interfaceC11585Bz.AHA(0, 1);
        this.A04 = null;
        interfaceC11585Bz.A5u();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final int AEk(InterfaceC11584By interfaceC11584By, C11590C4 c11590c4) throws IOException, InterruptedException {
        if (this.A04 == null) {
            this.A04 = AbstractC11668DK.A00(interfaceC11584By);
            if (this.A04 != null) {
                this.A03.A69(Format.A06(null, A00(39, 9, 62), null, this.A04.A00(), 32768, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
                this.A00 = this.A04.A01();
            } else {
                throw new C11464A0(A00(0, 39, 10));
            }
        }
        if (!this.A04.A07()) {
            AbstractC11668DK.A03(interfaceC11584By, this.A04);
            this.A02.AG8(this.A04);
        }
        int AFu = this.A03.AFu(interfaceC11584By, 32768 - this.A01, true);
        if (AFu != -1) {
            this.A01 += AFu;
        }
        int i = this.A01 / this.A00;
        if (i > 0) {
            long A052 = this.A04.A05(interfaceC11584By.A86() - this.A01);
            int i2 = this.A00 * i;
            this.A01 -= i2;
            this.A03.AFw(A052, 1, i2, this.A01, null);
        }
        return AFu == -1 ? -1 : 0;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void AG7(long j, long j2) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final boolean AGs(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        return AbstractC11668DK.A00(interfaceC11584By) != null;
    }
}
