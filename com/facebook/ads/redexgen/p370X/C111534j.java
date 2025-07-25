package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4j */
/* loaded from: assets/audience_network.dex */
public class C111534j {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C111534j A00(AbstractC1117656 abstractC1117656, int i) {
        View view = abstractC1117656.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C111534j A01(AbstractC1117656 abstractC1117656) {
        return A00(abstractC1117656, 0);
    }
}
