package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.yandex.div.core.widget.C29788l;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuperLineHeightEditText.kt */
@Metadata
/* loaded from: classes8.dex */
public class SuperLineHeightEditText extends AppCompatEditText implements FixedLineHeightView {

    /* renamed from: b */
    private boolean f76107b;
    @NotNull

    /* renamed from: c */
    private final FixedLineHeightHelper f76108c;

    /* renamed from: d */
    private int f76109d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuperLineHeightEditText(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m36384a() {
        int lineCount;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        boolean z = false;
        int i = 1;
        if (layoutParams != null && layoutParams.height == -3) {
            z = true;
        }
        if (!z) {
            if (getLineCount() != 0) {
                if (getLineCount() > getMaxLines()) {
                    i = getMaxLines();
                } else {
                    i = getLineCount();
                }
            }
            this.f76109d = i;
            return;
        }
        int i2 = this.f76109d;
        if (getLineCount() == 0) {
            lineCount = 1;
        } else if (getLineCount() > getMaxLines()) {
            lineCount = getMaxLines();
        } else {
            lineCount = getLineCount();
        }
        if (i2 != lineCount) {
            if (getLineCount() != 0) {
                if (getLineCount() > getMaxLines()) {
                    i = getMaxLines();
                } else {
                    i = getLineCount();
                }
            }
            this.f76109d = i;
            requestLayout();
        }
    }

    private final int getVisibleLineCount() {
        if (getLineCount() == 0) {
            return 1;
        }
        if (getLineCount() > getMaxLines()) {
            return getMaxLines();
        }
        return getLineCount();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.f76108c.m36519e();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.f76108c.m36518f();
    }

    public int getFixedLineHeight() {
        return this.f76108c.m36517g();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        int lineCount;
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
        FixedLineHeightHelper fixedLineHeightHelper = this.f76108c;
        if (getLineCount() == 0) {
            lineCount = 1;
        } else if (getLineCount() > getMaxLines()) {
            lineCount = getMaxLines();
        } else {
            lineCount = getLineCount();
        }
        if (fixedLineHeightHelper.m36517g() != -1 && !C29788l.m36501e(i2)) {
            textView = fixedLineHeightHelper.f76014a;
            if (lineCount >= textView.getLineCount()) {
                i4 = fixedLineHeightHelper.f76015b;
                i5 = fixedLineHeightHelper.f76016c;
                i3 = i4 + i5;
            } else {
                i3 = 0;
            }
            textView2 = fixedLineHeightHelper.f76014a;
            int m36347f = TextViews.m36347f(textView2, lineCount) + i3;
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

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.f76107b) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(event);
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i) {
        this.f76108c.m36513k(i);
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean z) {
        this.f76107b = !z;
        super.setHorizontallyScrolling(z);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.f76108c.m36516h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuperLineHeightEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SuperLineHeightEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLineHeightEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f76107b = true;
        this.f76108c = new FixedLineHeightHelper(this);
        if (Build.VERSION.SDK_INT < 28) {
            addTextChangedListener(new C29800a());
        }
    }

    /* compiled from: TextView.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.SuperLineHeightEditText$a */
    /* loaded from: classes8.dex */
    public static final class C29800a implements TextWatcher {
        public C29800a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
            SuperLineHeightEditText.this.m36384a();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
