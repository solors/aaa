package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xx */
/* loaded from: assets/audience_network.dex */
public final class C12910Xx implements InterfaceC11659DB {
    public static byte[] A03;
    public InterfaceC11595C9 A00;
    public C11950IG A01;
    public boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{39, 54, 54, 42, 47, 37, 39, 50, 47, 41, 40, 105, 62, 107, 53, 37, 50, 35, 117, 115};
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11659DB
    public final void A4n(C11939I4 c11939i4) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A69(Format.A02(null, A00(0, 20, 118), this.A01.A05()));
            this.A02 = true;
        }
        int A04 = c11939i4.A04();
        this.A00.AFv(c11939i4, A04);
        this.A00.AFw(this.A01.A04(), 1, A04, 0, null);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11659DB
    public final void A9F(C11950IG c11950ig, InterfaceC11585Bz interfaceC11585Bz, C11665DH c11665dh) {
        this.A01 = c11950ig;
        c11665dh.A05();
        this.A00 = interfaceC11585Bz.AHA(c11665dh.A03(), 4);
        this.A00.A69(Format.A0B(c11665dh.A04(), A00(0, 20, 118), null, -1, null));
    }
}
