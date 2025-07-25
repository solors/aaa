package com.facebook.ads.redexgen.p370X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8q */
/* loaded from: assets/audience_network.dex */
public final class C113938q {
    public static C113938q A00 = new C113938q();

    public static C113938q A00() {
        return A00;
    }

    public final C12998ZN A01(C113257j c113257j, boolean z) {
        return new C12998ZN(c113257j, z, new C112626V());
    }

    public final Map<String, String> A02(C113257j c113257j) {
        try {
            return A01(c113257j, false).A05();
        } catch (Throwable th) {
            c113257j.A07().A3y(th);
            return C113858i.A01(c113257j);
        }
    }
}
