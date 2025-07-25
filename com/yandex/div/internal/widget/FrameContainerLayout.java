package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import be.MathJVM;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.C29788l;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MutableCollections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.InterfaceC37618e;
import kotlin.ranges._Ranges;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FrameContainerLayout.kt */
@Metadata
/* loaded from: classes8.dex */
public class FrameContainerLayout extends DivViewGroup implements AspectView {

    /* renamed from: o */
    static final /* synthetic */ KProperty<Object>[] f76082o = {Reflection.m17039e(new MutablePropertyReference1Impl(FrameContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};
    @NotNull

    /* renamed from: c */
    private final Rect f76083c;

    /* renamed from: d */
    private boolean f76084d;
    @NotNull

    /* renamed from: f */
    private final Set<View> f76085f;
    @NotNull

    /* renamed from: g */
    private final Set<View> f76086g;
    @NotNull

    /* renamed from: h */
    private final Set<View> f76087h;

    /* renamed from: i */
    private int f76088i;

    /* renamed from: j */
    private int f76089j;

    /* renamed from: k */
    private int f76090k;

    /* renamed from: l */
    private boolean f76091l;

    /* renamed from: m */
    private boolean f76092m;
    @NotNull

    /* renamed from: n */
    private final InterfaceC37618e f76093n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameContainerLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    private final void m36413a(int i, int i2) {
        boolean z;
        if (this.f76087h.isEmpty()) {
            return;
        }
        boolean m36501e = C29788l.m36501e(i);
        boolean m36501e2 = C29788l.m36501e(i2);
        boolean z2 = false;
        if (!m36501e && this.f76088i == 0) {
            z = false;
        } else {
            z = true;
        }
        this.f76091l = z;
        z2 = (m36501e2 || getUseAspect() || this.f76089j != 0) ? true : true;
        this.f76092m = z2;
        if (m36501e && m36501e2) {
            return;
        }
        if (this.f76091l && z2) {
            for (View view : this.f76087h) {
                m36412b(view, m36501e, m36501e2);
            }
            return;
        }
        for (View view2 : this.f76087h) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Intrinsics.m17073h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (this.f76086g.contains(view2) && ((((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1 && !this.f76091l) || (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 && !this.f76092m))) {
                measureChildWithMargins(view2, i, 0, i2, 0);
                this.f76090k = View.combineMeasuredStates(this.f76090k, view2.getMeasuredState());
                this.f76086g.remove(view2);
            }
            if (!this.f76091l) {
                m36399o(view2.getMeasuredWidth() + divLayoutParams.m36372c());
            }
            if (!this.f76092m) {
                m36400n(view2.getMeasuredHeight() + divLayoutParams.m36367h());
            }
        }
    }

    /* renamed from: b */
    private final void m36412b(View view, boolean z, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.m17073h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (m36405i(divLayoutParams, z)) {
            m36399o(divLayoutParams.m36372c());
        }
        if (m36407g(divLayoutParams, z2)) {
            m36400n(divLayoutParams.m36367h());
        }
    }

    /* renamed from: c */
    private final int m36411c(int i, int i2, int i3) {
        int m16917e;
        int m16917e2;
        int m103791d;
        if (C29788l.m36501e(i2)) {
            return 0;
        }
        if (m36409e(i)) {
            m103791d = MathJVM.m103791d(i3 / getAspectRatio());
            return m103791d;
        }
        m16917e = _Ranges.m16917e(this.f76089j + getVerticalPadding(), getSuggestedMinimumHeight());
        Drawable foreground = getForeground();
        if (foreground != null) {
            m16917e2 = _Ranges.m16917e(m16917e, foreground.getMinimumHeight());
            return m16917e2;
        }
        return m16917e;
    }

    /* renamed from: d */
    private final int m36410d(int i) {
        int m16917e;
        int m16917e2;
        if (!C29788l.m36501e(i)) {
            m16917e = _Ranges.m16917e(this.f76088i + getHorizontalPadding(), getSuggestedMinimumWidth());
            Drawable foreground = getForeground();
            if (foreground != null) {
                m16917e2 = _Ranges.m16917e(m16917e, foreground.getMinimumWidth());
                return m16917e2;
            }
            return m16917e;
        }
        return 0;
    }

    /* renamed from: e */
    private final boolean m36409e(int i) {
        if (getUseAspect() && !C29788l.m36501e(i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m36408f(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getPaddingLeftWithForeground()
            int r12 = r12 - r10
            int r10 = r9.getPaddingRightWithForeground()
            int r12 = r12 - r10
            int r10 = r9.getPaddingTopWithForeground()
            int r13 = r13 - r11
            int r11 = r9.getPaddingBottomWithForeground()
            int r13 = r13 - r11
            int r11 = r9.getChildCount()
            r1 = 0
        L19:
            if (r1 >= r11) goto L96
            android.view.View r2 = r9.getChildAt(r1)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L93
            java.lang.String r3 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams"
            kotlin.jvm.internal.Intrinsics.m17073h(r3, r4)
            com.yandex.div.internal.widget.c r3 = (com.yandex.div.internal.widget.DivLayoutParams) r3
            int r4 = r2.getMeasuredWidth()
            int r5 = r2.getMeasuredHeight()
            int r6 = r3.m36373b()
            int r7 = r9.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            int r7 = r3.m36373b()
            r7 = r7 & 112(0x70, float:1.57E-43)
            r6 = r6 & 7
            r8 = 1
            if (r6 == r8) goto L62
            r8 = 5
            if (r6 == r8) goto L5c
            int r6 = r3.leftMargin
            goto L6d
        L5c:
            int r6 = r12 - r4
            int r8 = r3.rightMargin
            int r6 = r6 - r8
            goto L6e
        L62:
            int r6 = r12 - r0
            int r6 = r6 - r4
            int r8 = r3.leftMargin
            int r6 = r6 + r8
            int r8 = r3.rightMargin
            int r6 = r6 - r8
            int r6 = r6 / 2
        L6d:
            int r6 = r6 + r0
        L6e:
            r8 = 16
            if (r7 == r8) goto L81
            r8 = 80
            if (r7 == r8) goto L7a
            int r3 = r3.topMargin
            int r3 = r3 + r10
            goto L8e
        L7a:
            int r7 = r13 - r5
            int r3 = r3.bottomMargin
            int r3 = r7 - r3
            goto L8e
        L81:
            int r7 = r13 - r10
            int r7 = r7 - r5
            int r8 = r3.topMargin
            int r7 = r7 + r8
            int r3 = r3.bottomMargin
            int r7 = r7 - r3
            int r7 = r7 / 2
            int r3 = r10 + r7
        L8e:
            int r4 = r4 + r6
            int r5 = r5 + r3
            r2.layout(r6, r3, r4, r5)
        L93:
            int r1 = r1 + 1
            goto L19
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.FrameContainerLayout.m36408f(int, int, int, int):void");
    }

    /* renamed from: g */
    private final boolean m36407g(DivLayoutParams divLayoutParams, boolean z) {
        if (!z && ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
            return true;
        }
        return false;
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.f76083c.bottom);
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.f76083c.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.f76083c.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.f76083c.top);
    }

    private final boolean getUseAspect() {
        boolean z;
        if (getAspectRatio() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    /* renamed from: h */
    private final boolean m36406h(DivLayoutParams divLayoutParams, boolean z, boolean z2) {
        if (!m36405i(divLayoutParams, z) && !m36407g(divLayoutParams, z2)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private final boolean m36405i(DivLayoutParams divLayoutParams, boolean z) {
        if (!z && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final void m36404j(View view, int i, int i2) {
        boolean z;
        boolean z2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.m17073h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        boolean m36501e = C29788l.m36501e(i);
        boolean m36501e2 = C29788l.m36501e(i2);
        boolean z3 = false;
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
            z = true;
        } else {
            z = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        if (i3 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((m36501e && m36501e2) || (!m36501e2 ? !(!m36501e ? z && (z2 || (i3 == -3 && getUseAspect())) : z2) : !z)) {
            z3 = true;
        }
        if (!z3) {
            if (m36406h(divLayoutParams, m36501e, m36501e2)) {
                this.f76086g.add(view);
                return;
            }
            return;
        }
        measureChildWithMargins(view, i, 0, i2, 0);
        this.f76090k = View.combineMeasuredStates(this.f76090k, view.getMeasuredState());
        if (m36406h(divLayoutParams, m36501e, m36501e2)) {
            this.f76085f.add(view);
        }
        if (!m36501e && !z) {
            m36399o(view.getMeasuredWidth() + divLayoutParams.m36372c());
        }
        if (!m36501e2 && !z2 && !getUseAspect()) {
            m36400n(view.getMeasuredHeight() + divLayoutParams.m36367h());
        }
    }

    /* renamed from: k */
    private final void m36403k(View view, int i, int i2) {
        int m36434a;
        int m36434a2;
        int m16917e;
        int m16917e2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.m17073h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int horizontalPadding = getHorizontalPadding() + divLayoutParams.m36372c();
        int verticalPadding = getVerticalPadding() + divLayoutParams.m36367h();
        if (this.f76091l && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
            m16917e2 = _Ranges.m16917e(getMeasuredWidth() - horizontalPadding, 0);
            m36434a = C29788l.m36498h(m16917e2);
        } else {
            m36434a = DivViewGroup.Companion.m36434a(i, horizontalPadding, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.m36369f());
        }
        if (this.f76092m && ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
            m16917e = _Ranges.m16917e(getMeasuredHeight() - verticalPadding, 0);
            m36434a2 = C29788l.m36498h(m16917e);
        } else {
            m36434a2 = DivViewGroup.Companion.m36434a(i2, verticalPadding, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.m36370e());
        }
        view.measure(m36434a, m36434a2);
        if (this.f76086g.contains(view)) {
            this.f76090k = View.combineMeasuredStates(this.f76090k, view.getMeasuredState());
        }
    }

    /* renamed from: l */
    private final void m36402l(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.m17073h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        if (((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height == -3) {
            measureChildWithMargins(view, i, 0, i2, 0);
            this.f76087h.remove(view);
        }
    }

    /* renamed from: m */
    private final void m36401m(int i, int i2) {
        if (!m36409e(i)) {
            return;
        }
        boolean z = !this.f76084d;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View child = getChildAt(i3);
            if (!z || child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                m36402l(child, i, i2);
            }
        }
    }

    /* renamed from: n */
    private final void m36400n(int i) {
        this.f76089j = Math.max(this.f76089j, i);
    }

    /* renamed from: o */
    private final void m36399o(int i) {
        this.f76088i = Math.max(this.f76088i, i);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-1, -1);
    }

    public float getAspectRatio() {
        return ((Number) this.f76093n.getValue(this, f76082o[0])).floatValue();
    }

    public final boolean getMeasureAllChildren() {
        return this.f76084d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m36408f(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int m103791d;
        this.f76088i = 0;
        this.f76089j = 0;
        this.f76090k = 0;
        this.f76091l = false;
        this.f76092m = false;
        boolean m36501e = C29788l.m36501e(i);
        if (getUseAspect()) {
            if (m36501e) {
                m103791d = MathJVM.m103791d(View.MeasureSpec.getSize(i) / getAspectRatio());
                i2 = C29788l.m36498h(m103791d);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        boolean z = !this.f76084d;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View child = getChildAt(i3);
            if (!z || child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                m36404j(child, i, i2);
            }
        }
        MutableCollections.m17624D(this.f76087h, this.f76085f);
        MutableCollections.m17624D(this.f76087h, this.f76086g);
        m36413a(i, i2);
        int resolveSizeAndState = View.resolveSizeAndState(m36410d(i), i, this.f76090k);
        int m36411c = m36411c(i, i2, 16777215 & resolveSizeAndState);
        if (this.f76092m && C29788l.m36500f(i2)) {
            i2 = C29788l.m36498h(m36411c);
            m36401m(i, i2);
        }
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(m36411c, i2, this.f76090k << 16));
        for (View view : this.f76087h) {
            m36403k(view, i, i2);
        }
        this.f76085f.clear();
        this.f76086g.clear();
        this.f76087h.clear();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f) {
        this.f76093n.setValue(this, f76082o[0], Float.valueOf(f));
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (getForegroundGravity() == i) {
            return;
        }
        super.setForegroundGravity(i);
        if (getForegroundGravity() == 119 && getForeground() != null) {
            getForeground().getPadding(this.f76083c);
        } else {
            this.f76083c.setEmpty();
        }
        requestLayout();
    }

    public final void setMeasureAllChildren(boolean z) {
        this.f76084d = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FrameContainerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f76083c = new Rect();
        this.f76085f = new LinkedHashSet();
        this.f76086g = new LinkedHashSet();
        this.f76087h = new LinkedHashSet();
        this.f76093n = AspectView.f76009X7.m36529a();
    }

    public static /* synthetic */ void getMeasureAllChildren$annotations() {
    }
}
