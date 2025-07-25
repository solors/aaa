package com.facebook.ads.redexgen.p370X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.XK */
/* loaded from: assets/audience_network.dex */
public final class C12874XK implements InterfaceC11806Ft {
    public final long[] A00;
    public final C11805Fs[] A01;

    public C12874XK(C11805Fs[] c11805FsArr, long[] jArr) {
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
        if (i >= this.A00.length) {
            z = false;
        }
        AbstractC11914Hf.A03(z);
        return this.A00[i];
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
