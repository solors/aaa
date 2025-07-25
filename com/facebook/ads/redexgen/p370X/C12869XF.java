package com.facebook.ads.redexgen.p370X;

import android.text.Layout;

/* renamed from: com.facebook.ads.redexgen.X.XF */
/* loaded from: assets/audience_network.dex */
public final class C12869XF extends C11805Fs {
    public final long A00;
    public final long A01;

    public C12869XF(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C12869XF(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.A01 = j;
        this.A00 = j2;
    }

    public C12869XF(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public final boolean A00() {
        return super.A01 == Float.MIN_VALUE && this.A02 == Float.MIN_VALUE;
    }
}
