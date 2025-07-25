package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.zx */
/* loaded from: classes3.dex */
public class C8493zx extends C9105eqN {

    /* renamed from: bg */
    private float f18665bg;

    public C8493zx(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = getLayoutParams().width;
        int i4 = getLayoutParams().height;
        float f = this.f18665bg;
        if (f > 0.0f) {
            if (i3 == -2) {
                size = (int) (size2 * f);
                mode = 1073741824;
            } else if (i4 == -2) {
                size2 = (int) (size / f);
                mode2 = 1073741824;
            }
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f) {
        this.f18665bg = f;
    }

    public C8493zx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
