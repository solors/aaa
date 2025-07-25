package com.bytedance.sdk.openadsdk.p297bX;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.p297bX.C8126eo;
import com.bytedance.sdk.openadsdk.utils.ZQc;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.bX.Kg */
/* loaded from: classes3.dex */
public class C8106Kg extends ViewGroup implements C8126eo.InterfaceC8131bX {

    /* renamed from: bg */
    private final C8126eo f17756bg;

    public C8106Kg(Context context, C8126eo c8126eo) {
        super(context);
        this.f17756bg = c8126eo;
        c8126eo.m86958bg(this);
    }

    /* renamed from: IL */
    private View m87006IL(FilterWord filterWord) {
        TextView textView = new TextView(getContext());
        textView.setTag(filterWord);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int m82537bX = ZQc.m82537bX(getContext(), 8.0f);
        marginLayoutParams.leftMargin = m82537bX;
        marginLayoutParams.bottomMargin = m82537bX;
        textView.setTextColor(m87005bg());
        textView.setText(filterWord.getName());
        textView.setPadding(m82537bX, m82537bX, m82537bX, m82537bX);
        textView.setBackground(m87007IL());
        textView.setSelected(false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bX.Kg.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C8106Kg.this.f17756bg != null) {
                    if (view.isSelected()) {
                        C8106Kg.this.f17756bg.m86960bg(C8126eo.f17798bg);
                        return;
                    }
                    Object tag = view.getTag();
                    if (tag instanceof FilterWord) {
                        C8106Kg.this.f17756bg.m86960bg((FilterWord) tag);
                    }
                }
            }
        });
        textView.setSelected(false);
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i10 != 0) {
                i5 = marginLayoutParams.leftMargin;
            } else {
                i5 = 0;
            }
            if (measuredWidth + i5 + i8 < i7) {
                i6 = i8 + i5;
            } else {
                i9 += marginLayoutParams.bottomMargin + measuredHeight;
                i6 = 0;
            }
            childAt.layout(i6, marginLayoutParams.topMargin + i9, i6 + measuredWidth, measuredHeight + i9);
            i8 = i6 + measuredWidth + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        View.MeasureSpec.getMode(i);
        View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i, i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i7 != 0) {
                i3 = marginLayoutParams.leftMargin;
            } else {
                i3 = 0;
            }
            if (measuredWidth + i3 + i6 < size) {
                i4 = i6 + i3;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                i5 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i6 = i4 + measuredWidth + marginLayoutParams.rightMargin;
        }
        setMeasuredDimension(size, i5);
    }

    /* renamed from: bg */
    public void m87003bg(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                addView(m87006IL(filterWord));
            }
        }
    }

    /* renamed from: bg */
    private ColorStateList m87005bg() {
        return new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{Color.rgb(255, 44, 85), ViewCompat.MEASURED_STATE_MASK});
    }

    @Override // com.bytedance.sdk.openadsdk.p297bX.C8126eo.InterfaceC8131bX
    /* renamed from: bg */
    public void mo86928bg(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                if (C8126eo.f17798bg.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }

    /* renamed from: IL */
    private Drawable m87007IL() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float m82537bX = ZQc.m82537bX(getContext(), 5.0f);
        gradientDrawable.setCornerRadius(m82537bX);
        gradientDrawable.setColor(Color.parseColor("#0D000000"));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(ZQc.m82537bX(getContext(), 1.0f), Color.parseColor("#FE2C55"));
        gradientDrawable2.setCornerRadius(m82537bX);
        gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }
}
