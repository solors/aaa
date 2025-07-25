package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vl */
/* loaded from: assets/audience_network.dex */
public class C12777Vl implements InterfaceC12157Lj {
    public static byte[] A03;
    public int A00;
    public String A01;
    public final InterfaceC12157Lj A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-93, -93, -107, -104};
    }

    public C12777Vl(InterfaceC12157Lj interfaceC12157Lj) {
        this.A02 = interfaceC12157Lj;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.AEb(this.A01 + A00(0, 4, 67) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12157Lj
    public final void AEb(String str) {
        boolean A0A;
        String A04;
        A0A = AbstractC12159Ll.A0A(str);
        if (!A0A) {
            A04 = AbstractC12159Ll.A04(str);
            String filtered = this.A01;
            if (A04.equals(filtered)) {
                this.A00++;
                return;
            }
            A01();
            this.A01 = A04;
            this.A00 = 1;
            return;
        }
        A01();
        this.A02.AEb(str);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12157Lj
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
