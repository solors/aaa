package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.5B */
/* loaded from: assets/audience_network.dex */
public final class C111815B {
    public C1117858 A00 = new C1117858();
    public final InterfaceC1117959 A01;

    public C111815B(InterfaceC1117959 interfaceC1117959) {
        this.A01 = interfaceC1117959;
    }

    public final View A00(int i, int i2, int i3, int i4) {
        int A7z = this.A01.A7z();
        int next = this.A01.A7y();
        int childEnd = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View A6k = this.A01.A6k(i);
            int A6n = this.A01.A6n(A6k);
            int i5 = this.A01.A6m(A6k);
            this.A00.A03(A7z, next, A6n, i5);
            if (i3 != 0) {
                this.A00.A01();
                this.A00.A02(i3);
                if (this.A00.A04()) {
                    return A6k;
                }
            }
            if (i4 != 0) {
                this.A00.A01();
                this.A00.A02(i4);
                if (this.A00.A04()) {
                    view = A6k;
                }
            }
            i += childEnd;
        }
        return view;
    }
}
