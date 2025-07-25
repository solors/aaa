package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.p340zx.C9103bX;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.PX */
/* loaded from: classes3.dex */
public class C9054PX extends C9103bX {

    /* renamed from: bg */
    public float f20189bg;

    public C9054PX(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.p340zx.C9103bX, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = getLayoutParams().width;
        int i4 = getLayoutParams().height;
        float f = this.f20189bg;
        if (f > 0.0f) {
            if (i3 == -2) {
                size = (int) (size2 * f);
                mode = 1073741824;
            } else if (i4 == -2) {
                size2 = (int) (size / f);
                mode2 = 1073741824;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f) {
        this.f20189bg = f;
    }

    public C9054PX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9054PX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20189bg = 0.0f;
    }
}
