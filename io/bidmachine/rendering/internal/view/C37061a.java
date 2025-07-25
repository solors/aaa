package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.view.TextureView;
import android.view.View;

/* renamed from: io.bidmachine.rendering.internal.view.a */
/* loaded from: classes9.dex */
public class C37061a extends TextureView {

    /* renamed from: a */
    private float f97767a;

    public C37061a(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f97767a <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = measuredWidth;
        float f2 = measuredHeight;
        float f3 = this.f97767a;
        if ((f3 / (f / f2)) - 1.0f > 0.0f) {
            measuredHeight = (int) (f / f3);
        } else {
            measuredWidth = (int) (f2 * f3);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setVideoAspectRatio(float f) {
        if (f != 0.0f && this.f97767a != f) {
            this.f97767a = f;
            requestLayout();
        }
    }
}
