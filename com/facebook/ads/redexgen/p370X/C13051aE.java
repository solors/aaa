package com.facebook.ads.redexgen.p370X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.aE */
/* loaded from: assets/audience_network.dex */
public class C13051aE implements InterfaceC112225q {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C112245s A01;
    public final /* synthetic */ C12799W7 A02;

    public C13051aE(C112245s c112245s, ImageView imageView, C12799W7 c12799w7) {
        this.A01 = c112245s;
        this.A00 = imageView;
        this.A02 = c12799w7;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC112225q
    public final void AC9(Drawable drawable) {
        C12799W7.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
