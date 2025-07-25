package com.mbridge.msdk.video.dynview.p524i.p526b;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.mbridge.msdk.foundation.tools.SameTool;

/* renamed from: com.mbridge.msdk.video.dynview.i.b.a */
/* loaded from: classes6.dex */
public final class UIDrawableUtil {
    /* renamed from: a */
    public static void m48932a(View view, float f, float f2, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view != null && strArr != null) {
            int[] iArr = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                iArr[i] = Color.parseColor(strArr[i]);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            gradientDrawable.setCornerRadius(SameTool.m51772a(view.getContext(), f2));
            gradientDrawable.setStroke(SameTool.m51772a(view.getContext(), f), Color.parseColor(str));
            view.setBackground(gradientDrawable);
        }
    }
}
