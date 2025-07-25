package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Gp */
/* loaded from: assets/audience_network.dex */
public final class C11862Gp {
    public final int A00;
    public final C11859Gm A01;
    public final Object A02;
    public final C11480AG[] A03;

    public C11862Gp(C11480AG[] c11480agArr, InterfaceC11858Gl[] interfaceC11858GlArr, Object obj) {
        this.A03 = c11480agArr;
        this.A01 = new C11859Gm(interfaceC11858GlArr);
        this.A02 = obj;
        this.A00 = c11480agArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C11862Gp c11862Gp) {
        if (c11862Gp == null || c11862Gp.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i = 0; i < this.A01.A01; i++) {
            if (!A02(c11862Gp, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(C11862Gp c11862Gp, int i) {
        return c11862Gp != null && AbstractC11953IK.A0g(this.A03[i], c11862Gp.A03[i]) && AbstractC11953IK.A0g(this.A01.A00(i), c11862Gp.A01.A00(i));
    }
}
