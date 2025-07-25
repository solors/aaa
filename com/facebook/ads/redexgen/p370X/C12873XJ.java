package com.facebook.ads.redexgen.p370X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.XJ */
/* loaded from: assets/audience_network.dex */
public final class C12873XJ implements InterfaceC11806Ft {
    public static String[] A02 = {"pMqUa9o7Pi66iIAdHCcRgosi01w9m70J", "Q2G372PcR6NMCVFvdcIWGsw1VZvsvBxL", "takPUQkqcpNUfrjqvXAHCClvvzFp9sVl", "sc2LAmWPEOLKwCn1cUGTm9GqpAxLjn6x", "0iuUPmPOuolgxX336Fp1RztEIaFVtl7B", "UIHaiW6PpH4n5K9ho2tO2KaA8p8iJpTT", "BRUnQfYxuNAflpssI75kRVaGcWKGRvnk", "WnVwCRA7kxyxt0uxdSw7o9PQn1BHlAo9"};
    public final long[] A00;
    public final C11805Fs[] A01;

    public C12873XJ(C11805Fs[] c11805FsArr, long[] jArr) {
        this.A01 = c11805FsArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final List<C11805Fs> A6x(long j) {
        int A0B = AbstractC11953IK.A0B(this.A00, j, true, false);
        if (A0B == -1 || this.A01[A0B] == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[A0B]);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final long A7O(int i) {
        boolean z = true;
        AbstractC11914Hf.A03(i >= 0);
        int length = this.A00.length;
        String[] strArr = A02;
        if (strArr[7].charAt(8) != strArr[1].charAt(8)) {
            String[] strArr2 = A02;
            strArr2[7] = "pxSCprQoaQPuhJK6PZvvssuH3BzR25Ek";
            strArr2[1] = "rqpdBLPbnhQEqPyMFAPmP5MUlG4FhBak";
            if (i >= length) {
                z = false;
            }
            AbstractC11914Hf.A03(z);
            return this.A00[i];
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final int A7P() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final int A7r(long j) {
        int A0A = AbstractC11953IK.A0A(this.A00, j, false, false);
        int index = this.A00.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
