package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.d7 */
/* loaded from: classes6.dex */
public class C19244d7 extends ViewGroup {
    public C19244d7(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        Intrinsics.checkNotNullParameter(p, "p");
        return p instanceof C19230c7;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        Intrinsics.checkNotNullParameter(p, "p");
        return new C19230c7(p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.m17073h(layoutParams, "null cannot be cast to non-null type com.inmobi.ads.viewsv2.NativeContainerLayout.LayoutParams");
                C19230c7 c19230c7 = (C19230c7) layoutParams;
                int i6 = c19230c7.f48128a;
                childAt.layout(i6, c19230c7.f48129b, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + c19230c7.f48129b);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.m17073h(layoutParams, "null cannot be cast to non-null type com.inmobi.ads.viewsv2.NativeContainerLayout.LayoutParams");
                C19230c7 c19230c7 = (C19230c7) layoutParams;
                int i6 = c19230c7.f48128a;
                int i7 = c19230c7.f48129b;
                i4 = Math.max(i4, childAt.getMeasuredWidth() + i6);
                i3 = Math.max(i3, childAt.getMeasuredHeight() + i7);
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }
}
