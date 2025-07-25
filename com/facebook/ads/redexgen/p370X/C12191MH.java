package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.MH */
/* loaded from: assets/audience_network.dex */
public final class C12191MH {
    public static C12191MH A02;
    public final C12769Vd A00;
    public final C12193MJ A01;

    public C12191MH(C13029Zs c13029Zs, Executor executor, C113748W c113748w) {
        this.A01 = new C12193MJ(c13029Zs);
        this.A00 = new C12769Vd(executor, c113748w, c13029Zs);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C13029Zs c13029Zs, Executor executor, C113748W c113748w) {
        if (!C11979Im.A1S(c13029Zs)) {
            return;
        }
        if (A02 == null) {
            A02 = new C12191MH(c13029Zs, executor, c113748w);
            A02.A00();
            return;
        }
        A02.A02(c113748w);
    }

    private void A02(C113748W c113748w) {
        this.A00.A07(c113748w);
    }
}
