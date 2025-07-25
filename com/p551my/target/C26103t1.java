package com.p551my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.my.target.t1 */
/* loaded from: classes7.dex */
public class C26103t1 extends RelativeLayout {

    /* renamed from: a */
    public final RelativeLayout f67879a;

    /* renamed from: b */
    public final ImageView f67880b;

    /* renamed from: c */
    public final ImageView f67881c;

    /* renamed from: d */
    public final C25869ka f67882d;

    /* renamed from: e */
    public final boolean f67883e;

    /* renamed from: f */
    public final View.OnClickListener f67884f;

    /* renamed from: com.my.target.t1$a */
    /* loaded from: classes7.dex */
    public static class View$OnClickListenerC26104a implements View.OnClickListener {

        /* renamed from: a */
        public final Context f67885a;

        public View$OnClickListenerC26104a(Context context) {
            this.f67885a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://target.my.com/"));
                if (!(this.f67885a instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                this.f67885a.startActivity(intent);
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("FooterView$GoToMyTargetClickListener: Error - " + th.getMessage());
            }
        }
    }

    public C26103t1(Context context, C25869ka c25869ka, boolean z) {
        super(context);
        this.f67879a = new RelativeLayout(context);
        ImageView imageView = new ImageView(context);
        this.f67880b = imageView;
        C25869ka.m43594b(imageView, "logo_image");
        ImageView imageView2 = new ImageView(context);
        this.f67881c = imageView2;
        C25869ka.m43594b(imageView2, "store_image");
        this.f67882d = c25869ka;
        this.f67883e = z;
        this.f67884f = new View$OnClickListenerC26104a(context);
    }

    /* renamed from: a */
    public void m42874a(int i, boolean z) {
        int m43598b;
        int m43598b2;
        int m43598b3;
        int m43598b4;
        int m43598b5;
        int m43598b6;
        int m43598b7;
        int i2 = i / 3;
        if (this.f67883e) {
            i2 = i / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, i2);
        int m43598b8 = this.f67882d.m43598b(24);
        C25869ka c25869ka = this.f67882d;
        if (z) {
            m43598b = c25869ka.m43598b(4);
            m43598b2 = this.f67882d.m43598b(24);
            m43598b3 = this.f67882d.m43598b(8);
        } else {
            m43598b = c25869ka.m43598b(16);
            m43598b2 = this.f67882d.m43598b(24);
            m43598b3 = this.f67882d.m43598b(16);
        }
        layoutParams.setMargins(m43598b8, m43598b, m43598b2, m43598b3);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(20);
        this.f67881c.setScaleType(ImageView.ScaleType.FIT_START);
        this.f67881c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, i2);
        if (z) {
            m43598b4 = this.f67882d.m43598b(8);
            m43598b5 = this.f67882d.m43598b(4);
            m43598b6 = this.f67882d.m43598b(8);
            m43598b7 = this.f67882d.m43598b(8);
        } else {
            m43598b4 = this.f67882d.m43598b(24);
            m43598b5 = this.f67882d.m43598b(16);
            m43598b6 = this.f67882d.m43598b(24);
            m43598b7 = this.f67882d.m43598b(16);
        }
        layoutParams2.setMargins(m43598b4, m43598b5, m43598b6, m43598b7);
        layoutParams2.addRule(15, -1);
        layoutParams2.addRule(21);
        this.f67880b.setScaleType(ImageView.ScaleType.FIT_END);
        this.f67880b.setLayoutParams(layoutParams2);
        this.f67880b.setOnClickListener(this.f67884f);
    }

    /* renamed from: a */
    public void m42875a() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.f67879a.setLayoutParams(layoutParams);
        this.f67880b.setImageBitmap(AbstractC25703d4.m44032a(getContext()));
        this.f67879a.addView(this.f67880b);
        this.f67879a.addView(this.f67881c);
        addView(this.f67879a);
    }
}
