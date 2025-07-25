package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.fyber.inneractive.sdk.renderers.i */
/* loaded from: classes4.dex */
public final class C15368i extends RelativeLayout {

    /* renamed from: a */
    public final float f30368a;

    public C15368i(Context context, float f) {
        super(context);
        this.f30368a = f;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        View.MeasureSpec.getMode(i);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 0 && (mode != Integer.MIN_VALUE || View.MeasureSpec.getSize(i2) <= 0)) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            i3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        } else {
            int size3 = View.MeasureSpec.getSize(i);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            float f = this.f30368a;
            if (f != 0.0f) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (size3 * f), 1073741824);
            }
            i3 = makeMeasureSpec;
        }
        super.onMeasure(i3, i2);
    }
}
