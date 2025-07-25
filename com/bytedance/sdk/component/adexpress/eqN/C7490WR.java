package com.bytedance.sdk.component.adexpress.eqN;

import android.graphics.drawable.GradientDrawable;

/* renamed from: com.bytedance.sdk.component.adexpress.eqN.WR */
/* loaded from: classes3.dex */
public class C7490WR {
    /* renamed from: bg */
    public static GradientDrawable m88673bg(int i, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        int i2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        if (iArr != null) {
            i2 = iArr.length;
        } else {
            i2 = 0;
        }
        if (i2 == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (i2 == 4) {
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i3, i3, i4, i4, i5, i5, i6, i6});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }
}
