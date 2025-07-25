package com.p551my.target;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.v */
/* loaded from: classes7.dex */
public class C26152v extends RelativeLayout {

    /* renamed from: a */
    public final TextView f68032a;

    /* renamed from: b */
    public final View f68033b;

    /* renamed from: c */
    public String f68034c;

    /* renamed from: d */
    public InterfaceC26153a f68035d;

    /* renamed from: com.my.target.v$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26153a {
        /* renamed from: a */
        void mo42738a();
    }

    public C26152v(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f68032a = textView;
        textView.setTextColor(-1);
        textView.setTypeface(null, 1);
        textView.setTextSize(2, 20.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics());
        layoutParams.addRule(15);
        layoutParams.addRule(1, 256);
        addView(textView, layoutParams);
        setBackgroundColor(-7829368);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (C25869ka.m43615a() + 0.5f));
        layoutParams2.addRule(12);
        View view = new View(context);
        this.f68033b = view;
        view.setBackgroundColor(-10066330);
        addView(view, layoutParams2);
        C25905m2 c25905m2 = new C25905m2(context);
        c25905m2.m43472a(AbstractC25624a0.m44255a(), false);
        c25905m2.setId(256);
        c25905m2.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.cf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C26152v.this.m42739a(view2);
            }
        });
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics());
        layoutParams3.addRule(15);
        layoutParams3.addRule(9);
        c25905m2.setLayoutParams(layoutParams3);
        addView(c25905m2);
    }

    /* renamed from: a */
    public final /* synthetic */ void m42739a(View view) {
        InterfaceC26153a interfaceC26153a = this.f68035d;
        if (interfaceC26153a != null) {
            interfaceC26153a.mo42738a();
        }
    }

    @Nullable
    public String getTitle() {
        return this.f68034c;
    }

    public void setMainColor(int i) {
        setBackgroundColor(i);
    }

    public void setOnCloseClickListener(@Nullable InterfaceC26153a interfaceC26153a) {
        this.f68035d = interfaceC26153a;
    }

    public void setStripeColor(int i) {
        this.f68033b.setBackgroundColor(i);
    }

    public void setTitle(@Nullable String str) {
        this.f68034c = str;
        this.f68032a.setText(str);
    }

    public void setTitleColor(int i) {
        this.f68032a.setTextColor(i);
    }
}
