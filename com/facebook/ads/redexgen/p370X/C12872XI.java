package com.facebook.ads.redexgen.p370X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.XI */
/* loaded from: assets/audience_network.dex */
public final class C12872XI implements InterfaceC11806Ft {
    public final C11829GG A00;
    public final Map<String, C11835GM> A01;
    public final Map<String, C11830GH> A02;
    public final long[] A03;

    public C12872XI(C11829GG c11829gg, Map<String, C11835GM> map, Map<String, C11830GH> map2) {
        Map<String, C11835GM> emptyMap;
        this.A00 = c11829gg;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = c11829gg.A0F();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final List<C11805Fs> A6x(long j) {
        return this.A00.A0D(j, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final long A7O(int i) {
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final int A7P() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11806Ft
    public final int A7r(long j) {
        int A0A = AbstractC11953IK.A0A(this.A03, j, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
