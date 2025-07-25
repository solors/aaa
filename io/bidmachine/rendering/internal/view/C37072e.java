package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import io.bidmachine.rendering.internal.AbstractC37026e;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.model.SideBindParams;
import io.bidmachine.rendering.model.SideType;
import java.util.List;

/* renamed from: io.bidmachine.rendering.internal.view.e */
/* loaded from: classes9.dex */
public class C37072e extends RelativeLayout {

    /* renamed from: io.bidmachine.rendering.internal.view.e$a */
    /* loaded from: classes9.dex */
    public static class C37073a extends RelativeLayout.LayoutParams {

        /* renamed from: a */
        private final int f97796a;

        /* renamed from: b */
        private final int f97797b;

        /* renamed from: c */
        private float f97798c;

        /* renamed from: d */
        private float f97799d;

        public C37073a(int i, int i2) {
            super(i, i2);
            this.f97798c = 1.0f;
            this.f97799d = 1.0f;
            this.f97796a = i;
            this.f97797b = i2;
        }

        /* renamed from: a */
        private boolean m19080a(SideBindParams sideBindParams, SideBindParams sideBindParams2, int i, int i2) {
            if (i2 <= 0 || sideBindParams == null || sideBindParams2 == null) {
                return false;
            }
            addRule(i);
            return true;
        }

        /* renamed from: b */
        private void m19075b(SideBindParams sideBindParams, SideBindParams sideBindParams2, List list) {
            m19078a(sideBindParams, SideType.Top, 6, 3, 10, list);
            m19078a(sideBindParams2, SideType.Bottom, 8, 2, 12, list);
        }

        /* renamed from: a */
        private void m19079a(SideBindParams sideBindParams, SideBindParams sideBindParams2, List list) {
            m19078a(sideBindParams, SideType.Left, 5, 1, 9, list);
            m19078a(sideBindParams2, SideType.Right, 7, 0, 11, list);
        }

        /* renamed from: b */
        public void m19077b(float f) {
            this.f97798c = f;
        }

        /* renamed from: a */
        private void m19078a(SideBindParams sideBindParams, SideType sideType, int i, int i2, int i3, List list) {
            if (sideBindParams == null) {
                return;
            }
            View m19215a = AbstractC37026e.m19215a(list, sideBindParams.getTargetName());
            if (m19215a == null) {
                addRule(i3);
                return;
            }
            if (sideBindParams.getTargetSideType() != sideType) {
                i = i2;
            }
            addRule(i, m19215a.getId());
        }

        /* renamed from: a */
        public void m19083a(float f) {
            this.f97799d = f;
        }

        /* renamed from: a */
        public void m19082a(Context context, ElementLayoutParams elementLayoutParams, List list) {
            m19077b(elementLayoutParams.getWidthPercent());
            m19083a(elementLayoutParams.getHeightPercent());
            setMargins(elementLayoutParams.getMarginLeftPx(context), elementLayoutParams.getMarginTopPx(context), -elementLayoutParams.getMarginRightPx(context), -elementLayoutParams.getMarginBottomPx(context));
            SideBindParams topSideBindParams = elementLayoutParams.getTopSideBindParams();
            SideBindParams bottomSideBindParams = elementLayoutParams.getBottomSideBindParams();
            if (!m19080a(topSideBindParams, bottomSideBindParams, 15, elementLayoutParams.getWidthPx(context))) {
                m19075b(topSideBindParams, bottomSideBindParams, list);
            }
            SideBindParams leftSideBindParams = elementLayoutParams.getLeftSideBindParams();
            SideBindParams rightSideBindParams = elementLayoutParams.getRightSideBindParams();
            if (m19080a(leftSideBindParams, rightSideBindParams, 14, elementLayoutParams.getHeightPx(context))) {
                return;
            }
            m19079a(leftSideBindParams, rightSideBindParams, list);
        }
    }

    public C37072e(Context context) {
        super(context);
    }

    /* renamed from: a */
    void m19086a(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof C37073a) {
                m19084a(size, size2, childAt, (C37073a) layoutParams);
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        m19086a(i, i2);
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private void m19084a(int i, int i2, View view, C37073a c37073a) {
        Integer m19085a;
        Integer m19085a2;
        float f = c37073a.f97798c;
        if (f > 0.0f && f < 1.0f && (m19085a2 = m19085a(c37073a.f97796a, i, view.getMeasuredWidth(), f)) != null) {
            ((RelativeLayout.LayoutParams) c37073a).width = m19085a2.intValue();
        }
        float f2 = c37073a.f97799d;
        if (f2 <= 0.0f || f2 >= 1.0f || (m19085a = m19085a(c37073a.f97797b, i2, view.getMeasuredHeight(), f2)) == null) {
            return;
        }
        ((RelativeLayout.LayoutParams) c37073a).height = m19085a.intValue();
    }

    /* renamed from: a */
    Integer m19085a(int i, int i2, int i3, float f) {
        if (i <= 0) {
            if (i == -1) {
                i = i2;
            } else if (i != -2 || i3 == 0) {
                return null;
            } else {
                i = i3;
            }
        }
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(Math.round(i * f));
    }
}
