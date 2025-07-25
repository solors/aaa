package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.QE */
/* loaded from: assets/audience_network.dex */
public final class C12436QE {
    public final int[] A00(View view, int i, int i2) {
        C111594p c111594p = (C111594p) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), c111594p.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i2, childWidthSpec + view.getPaddingBottom(), c111594p.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c111594p.leftMargin + c111594p.rightMargin, childWidthSpec3 + c111594p.bottomMargin + c111594p.topMargin};
    }
}
