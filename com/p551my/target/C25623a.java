package com.p551my.target;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p551my.target.common.models.ImageData;

/* renamed from: com.my.target.a */
/* loaded from: classes7.dex */
public class C25623a extends LinearLayout {

    /* renamed from: a */
    public final TextView f66587a;

    /* renamed from: b */
    public final C26038q9 f66588b;

    public C25623a(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f66587a = textView;
        C26038q9 c26038q9 = new C26038q9(context);
        this.f66588b = c26038q9;
        C25869ka m43585e = C25869ka.m43585e(context);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1157627904, -1157627904});
        gradientDrawable.setStroke(m43585e.m43614a(1.0f), -1157627904);
        gradientDrawable.setCornerRadius(m43585e.m43614a(10.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{-1157627904, -1157627904});
        gradientDrawable2.setStroke(m43585e.m43614a(1.0f), -1157627904);
        gradientDrawable2.setCornerRadius(m43585e.m43614a(10.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        int m43598b = m43585e.m43598b(6);
        int m43598b2 = m43585e.m43598b(12);
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int m43610a = C25869ka.m43610a(32, context);
        setPadding(m43598b2, m43598b, m43598b2, m43598b);
        setBackgroundDrawable(stateListDrawable);
        setGravity(16);
        setOrientation(0);
        C25869ka.m43594b(c26038q9, "ctc_icon");
        addView(c26038q9, m43610a, m43610a);
        C25869ka.m43594b(textView, "ctc_text");
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
    }

    /* renamed from: a */
    public void m44256a(String str, ImageData imageData) {
        int m43610a;
        this.f66587a.setText(str);
        this.f66588b.setImageData(imageData);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f66587a.getLayoutParams();
        if (imageData == null) {
            m43610a = 0;
        } else {
            m43610a = C25869ka.m43610a(4, getContext()) * 2;
        }
        layoutParams.leftMargin = m43610a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
