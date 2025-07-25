package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Hashtable;

/* loaded from: classes10.dex */
public class AutoNextLineLinearLayout extends LinearLayout {

    /* renamed from: a */
    int f114704a;

    /* renamed from: b */
    int f114705b;

    /* renamed from: c */
    int f114706c;

    /* renamed from: d */
    int f114707d;

    /* renamed from: e */
    Hashtable f114708e;

    /* renamed from: sg.bigo.ads.common.view.AutoNextLineLinearLayout$a */
    /* loaded from: classes10.dex */
    static class C43848a {

        /* renamed from: a */
        int f114709a;

        /* renamed from: b */
        int f114710b;

        /* renamed from: c */
        int f114711c;

        /* renamed from: d */
        int f114712d;

        private C43848a() {
        }

        /* synthetic */ C43848a(byte b) {
            this();
        }
    }

    public AutoNextLineLinearLayout(Context context) {
        super(context);
        this.f114708e = new Hashtable();
    }

    /* renamed from: a */
    private int m4783a(int i, int i2) {
        if (i > 0) {
            int i3 = i2 - 1;
            return m4783a(i - 1, i3) + getChildAt(i3).getMeasuredWidth() + 30;
        }
        return getPaddingLeft();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C43848a c43848a = (C43848a) this.f114708e.get(childAt);
            if (c43848a != null) {
                childAt.layout(c43848a.f114709a, c43848a.f114710b, c43848a.f114711c, c43848a.f114712d);
            } else {
                Log.i("MyLayout", "error");
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        this.f114704a = 0;
        this.f114705b = 0;
        this.f114706c = 5;
        this.f114707d = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            childAt.measure(0, 0);
            int measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight();
            i4 += measuredWidth;
            C43848a c43848a = new C43848a((byte) 0);
            int m4783a = m4783a(i3 - i5, i3);
            this.f114704a = m4783a;
            this.f114705b = m4783a + childAt.getMeasuredWidth();
            if (i4 >= size) {
                this.f114704a = 0;
                this.f114705b = childAt.getMeasuredWidth() + 0;
                this.f114706c = i6 + measuredHeight + layoutParams.topMargin;
                i5 = i3;
                i4 = measuredWidth;
            }
            int measuredHeight2 = this.f114706c + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
            this.f114707d = measuredHeight2;
            int i7 = this.f114706c;
            c43848a.f114709a = this.f114704a;
            c43848a.f114710b = i7 + 3;
            c43848a.f114711c = this.f114705b;
            c43848a.f114712d = measuredHeight2;
            this.f114708e.put(childAt, c43848a);
            i3++;
            i6 = i7;
        }
        setMeasuredDimension(size, this.f114707d);
    }

    public AutoNextLineLinearLayout(Context context, int i, int i2) {
        super(context);
        this.f114708e = new Hashtable();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(0, 0);
    }

    public AutoNextLineLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114708e = new Hashtable();
    }
}
