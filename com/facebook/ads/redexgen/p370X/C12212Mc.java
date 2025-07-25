package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.Mc */
/* loaded from: assets/audience_network.dex */
public final class C12212Mc extends AdNativeComponentView {
    public static final int A01 = (int) (AbstractC12137LP.A02 * 1.0f);
    public final ImageView A00;

    public C12212Mc(C13029Zs c13029Zs) {
        super(c13029Zs);
        this.A00 = new C12235Mz(c13029Zs);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC12142LU.A04(this.A00, EnumC12142LU.A0B);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        AbstractC12177M3.A0M(this.A00, -2130706433);
        setPadding(A01, A01, A01, A01);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
