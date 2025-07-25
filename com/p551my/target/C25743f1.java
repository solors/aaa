package com.p551my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* renamed from: com.my.target.f1 */
/* loaded from: classes7.dex */
public final class C25743f1 extends FrameLayout {

    /* renamed from: a */
    public final C25809i f66832a;

    /* renamed from: b */
    public int f66833b;

    /* renamed from: c */
    public int f66834c;

    public C25743f1(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m43944a(int i, int i2) {
        this.f66833b = i;
        this.f66834c = i2;
    }

    @NonNull
    public C25809i getAdChoicesView() {
        return this.f66832a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f66833b;
        if (i3 > 0 && this.f66834c > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            i2 = View.MeasureSpec.makeMeasureSpec(this.f66834c, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public C25743f1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C25743f1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C25809i c25809i = new C25809i(context);
        this.f66832a = c25809i;
        int m43610a = C25869ka.m43610a(2, context);
        c25809i.setPadding(m43610a, m43610a, m43610a, m43610a);
        c25809i.setFixedHeight(C25869ka.m43610a(17, context));
        addView(c25809i);
    }
}
