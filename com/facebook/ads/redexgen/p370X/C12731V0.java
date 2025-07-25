package com.facebook.ads.redexgen.p370X;

import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.V0 */
/* loaded from: assets/audience_network.dex */
public class C12731V0 implements InterfaceC12291Nt {
    public final /* synthetic */ C12281Nj A00;

    public C12731V0(C12281Nj c12281Nj) {
        this.A00 = c12281Nj;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12291Nt
    public final void ABL(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A08;
        if (z2) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12291Nt
    public final void AC0(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A08;
        if (z2) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }
}
