package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.div.core.widget.C29788l;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuperLineHeightTextView.kt */
@Metadata
/* loaded from: classes8.dex */
public class SuperLineHeightTextView extends AppCompatTextView implements FixedLineHeightView {
    @NotNull

    /* renamed from: b */
    private final FixedLineHeightHelper f76111b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuperLineHeightTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getVisibleLineCount() {
        return Math.min(getLineCount(), getMaxLines());
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.f76111b.m36519e();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.f76111b.m36518f();
    }

    public int getFixedLineHeight() {
        return this.f76111b.m36517g();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        TextView textView;
        int i3;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        int m16917e;
        int m36498h;
        int i4;
        int i5;
        super.onMeasure(i, i2);
        FixedLineHeightHelper fixedLineHeightHelper = this.f76111b;
        int min = Math.min(getLineCount(), getMaxLines());
        if (fixedLineHeightHelper.m36517g() != -1 && !C29788l.m36501e(i2)) {
            textView = fixedLineHeightHelper.f76014a;
            if (min >= textView.getLineCount()) {
                i4 = fixedLineHeightHelper.f76015b;
                i5 = fixedLineHeightHelper.f76016c;
                i3 = i4 + i5;
            } else {
                i3 = 0;
            }
            textView2 = fixedLineHeightHelper.f76014a;
            int m36347f = TextViews.m36347f(textView2, min) + i3;
            textView3 = fixedLineHeightHelper.f76014a;
            int paddingTop = m36347f + textView3.getPaddingTop();
            textView4 = fixedLineHeightHelper.f76014a;
            textView5 = fixedLineHeightHelper.f76014a;
            m16917e = _Ranges.m16917e(paddingTop + textView4.getPaddingBottom(), textView5.getMinimumHeight());
            if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
                m36498h = C29788l.m36499g(Math.min(m16917e, View.MeasureSpec.getSize(i2)));
            } else {
                m36498h = C29788l.m36498h(m16917e);
            }
            super.setMeasuredDimension(getMeasuredWidthAndState(), m36498h);
        }
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i) {
        this.f76111b.m36513k(i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.f76111b.m36516h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuperLineHeightTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SuperLineHeightTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLineHeightTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f76111b = new FixedLineHeightHelper(this);
    }
}
