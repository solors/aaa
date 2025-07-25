package com.chartboost.sdk.impl;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.chartboost.sdk.impl.wb */
/* loaded from: classes3.dex */
public abstract class AbstractC10324wb {
    /* renamed from: a */
    public static final void m80146a(SurfaceView surfaceView, int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams;
        if (surfaceView != null) {
            float f = i3;
            float f2 = i;
            float f3 = f / f2;
            float f4 = i4;
            float f5 = i2;
            float f6 = f4 / f5;
            float f7 = f2 / f5;
            ViewGroup.LayoutParams layoutParams2 = surfaceView.getLayoutParams();
            FrameLayout.LayoutParams layoutParams3 = null;
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                if (f3 > f6) {
                    layoutParams.width = (int) (f4 * f7);
                    layoutParams.height = i4;
                } else {
                    layoutParams.width = i3;
                    layoutParams.height = (int) (f / f7);
                }
                layoutParams.gravity = 17;
                layoutParams3 = layoutParams;
            }
            surfaceView.setLayoutParams(layoutParams3);
        }
    }
}
