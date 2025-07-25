package com.facebook.ads.redexgen.p370X;

import android.text.Layout;

/* renamed from: com.facebook.ads.redexgen.X.XO */
/* loaded from: assets/audience_network.dex */
public final class C12878XO extends C11805Fs implements Comparable<C12878XO> {
    public final int A00;

    public C12878XO(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.A00 = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C12878XO c12878xo) {
        if (c12878xo.A00 < this.A00) {
            return -1;
        }
        if (c12878xo.A00 > this.A00) {
            return 1;
        }
        return 0;
    }
}
