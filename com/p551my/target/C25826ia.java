package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* renamed from: com.my.target.ia */
/* loaded from: classes7.dex */
public class C25826ia extends ViewGroup {

    /* renamed from: a */
    public final TextView f67012a;

    /* renamed from: b */
    public final C25880l0 f67013b;

    /* renamed from: c */
    public final int f67014c;

    /* renamed from: d */
    public final int f67015d;

    public C25826ia(Context context) {
        super(context);
        C25869ka m43585e = C25869ka.m43585e(context);
        TextView textView = new TextView(context);
        this.f67012a = textView;
        C25880l0 c25880l0 = new C25880l0(context);
        this.f67013b = c25880l0;
        c25880l0.setLines(1);
        textView.setTextSize(2, 18.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(-1);
        this.f67014c = m43585e.m43598b(4);
        this.f67015d = m43585e.m43598b(2);
        C25869ka.m43594b(textView, "title_text");
        C25869ka.m43594b(c25880l0, "age_bordering");
        addView(textView);
        addView(c25880l0);
    }

    @NonNull
    public TextView getLeftText() {
        return this.f67012a;
    }

    @NonNull
    public C25880l0 getRightBorderedView() {
        return this.f67013b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f67012a.getMeasuredWidth();
        int measuredHeight = this.f67012a.getMeasuredHeight();
        int measuredWidth2 = this.f67013b.getMeasuredWidth();
        int measuredHeight2 = this.f67013b.getMeasuredHeight();
        int measuredHeight3 = getMeasuredHeight();
        int i5 = (measuredHeight3 - measuredHeight) / 2;
        int i6 = (measuredHeight3 - measuredHeight2) / 2;
        int i7 = this.f67014c + measuredWidth;
        this.f67012a.layout(0, i5, measuredWidth, measuredHeight + i5);
        this.f67013b.layout(i7, i6, measuredWidth2 + i7, measuredHeight2 + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f67013b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f67015d * 2), Integer.MIN_VALUE));
        int i3 = size / 2;
        if (this.f67013b.getMeasuredWidth() > i3) {
            this.f67013b.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f67015d * 2), Integer.MIN_VALUE));
        }
        this.f67012a.measure(View.MeasureSpec.makeMeasureSpec((size - this.f67013b.getMeasuredWidth()) - this.f67014c, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f67015d * 2), Integer.MIN_VALUE));
        setMeasuredDimension(this.f67012a.getMeasuredWidth() + this.f67013b.getMeasuredWidth() + this.f67014c, Math.max(this.f67012a.getMeasuredHeight(), this.f67013b.getMeasuredHeight()));
    }
}
