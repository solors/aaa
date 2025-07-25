package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Yq */
/* loaded from: assets/audience_network.dex */
public final class C12965Yq implements InterfaceC11595C9 {
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11595C9
    public final void A69(Format format) {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11595C9
    public final int AFu(InterfaceC11584By interfaceC11584By, int i, boolean z) throws IOException, InterruptedException {
        int AGn = interfaceC11584By.AGn(i);
        if (AGn == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return AGn;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11595C9
    public final void AFv(C11939I4 c11939i4, int i) {
        c11939i4.A0Z(i);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11595C9
    public final void AFw(long j, int i, int i2, int i3, C11594C8 c11594c8) {
    }
}
