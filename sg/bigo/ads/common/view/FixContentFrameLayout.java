package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.C43746p;

/* loaded from: classes10.dex */
public class FixContentFrameLayout extends RoundedFrameLayout {

    /* renamed from: a */
    private boolean f114713a;

    /* renamed from: sg.bigo.ads.common.view.FixContentFrameLayout$a */
    /* loaded from: classes10.dex */
    public static class C43849a extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public int f114714a;

        /* renamed from: b */
        public int f114715b;

        public C43849a() {
            super(-1, -1);
        }
    }

    public FixContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C43849a) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C43849a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C43849a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        C43746p c43746p;
        if (!this.f114713a) {
            super.onMeasure(i, i2);
            return;
        }
        int defaultSize = View.getDefaultSize(Integer.MIN_VALUE, i);
        int defaultSize2 = View.getDefaultSize(Integer.MIN_VALUE, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C43849a c43849a = (C43849a) childAt.getLayoutParams();
                if (c43849a.f114714a > 0 && c43849a.f114715b > 0) {
                    c43849a.setMargins(0, 0, 0, 0);
                    c43746p = C43746p.m5066a(c43849a.f114714a, c43849a.f114715b, defaultSize, defaultSize2);
                } else {
                    c43746p = new C43746p(defaultSize, defaultSize2);
                }
                i3 = Math.max(i3, c43746p.f114477a);
                i4 = Math.max(i4, c43746p.f114478b);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, c43746p.f114477a), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, c43746p.f114478b), 1073741824));
            }
        }
        setMeasuredDimension(i3, i4);
    }

    public void setFixContent(boolean z) {
        if (z) {
            setPadding(0, 0, 0, 0);
        }
        if (z != this.f114713a) {
            this.f114713a = z;
            requestLayout();
        }
    }

    public FixContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new C43849a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C43849a();
    }

    public FixContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFixContent(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C43849a();
    }
}
