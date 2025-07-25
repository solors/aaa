package com.facebook.ads.redexgen.p370X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.DJ */
/* loaded from: assets/audience_network.dex */
public final class C11667DJ {
    public final int A00;
    public final long A01;

    public C11667DJ(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C11667DJ A00(InterfaceC11584By interfaceC11584By, C11939I4 c11939i4) throws IOException, InterruptedException {
        interfaceC11584By.AEO(c11939i4.A00, 0, 8);
        c11939i4.A0Y(0);
        int A08 = c11939i4.A08();
        long size = c11939i4.A0K();
        return new C11667DJ(A08, size);
    }
}
