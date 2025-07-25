package com.facebook.ads.redexgen.p370X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.O5 */
/* loaded from: assets/audience_network.dex */
public final class C12303O5 extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C12303O5(C13029Zs c13029Zs) {
        super(c13029Zs);
        this.A03 = new ImageView(c13029Zs);
        this.A02 = new ImageView(c13029Zs);
        A00();
    }

    public C12303O5(C13029Zs c13029Zs, AttributeSet attributeSet) {
        super(c13029Zs, attributeSet);
        this.A03 = new ImageView(c13029Zs, attributeSet);
        this.A02 = new ImageView(c13029Zs, attributeSet);
        A00();
    }

    public C12303O5(C13029Zs c13029Zs, AttributeSet attributeSet, int i) {
        super(c13029Zs, attributeSet, i);
        this.A03 = new ImageView(c13029Zs, attributeSet, i);
        this.A02 = new ImageView(c13029Zs, attributeSet, i);
        A00();
    }

    public C12303O5(C13029Zs c13029Zs, AttributeSet attributeSet, int i, int i2) {
        super(c13029Zs, attributeSet, i, i2);
        this.A03 = new ImageView(c13029Zs, attributeSet, i, i2);
        this.A02 = new ImageView(c13029Zs, attributeSet, i, i2);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        EnumC12142LU.A04(this.A03, EnumC12142LU.A0B);
        setId(AbstractC12177M3.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A01 <= 0 || this.A00 <= 0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        float min = Math.min(i5 / this.A01, i6 / this.A00);
        int i7 = (int) (this.A01 * min);
        int i8 = (int) (this.A00 * min);
        this.A02.layout(i, i2, i3, i4);
        int blurBorderViewHeight = (i5 / 2) + i;
        int blurBorderViewWidth = (i6 / 2) + i2;
        this.A03.layout(blurBorderViewHeight - (i7 / 2), blurBorderViewWidth - (i8 / 2), (i7 / 2) + blurBorderViewHeight, blurBorderViewWidth + (i8 / 2));
        this.A02.setVisibility(0);
    }

    public void setImage(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            AbstractC12177M3.A0S(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            AbstractC12177M3.A0M(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}
