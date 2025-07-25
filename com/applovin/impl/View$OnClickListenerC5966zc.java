package com.applovin.impl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.adview.C4038i;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.zc */
/* loaded from: classes2.dex */
public class View$OnClickListenerC5966zc extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private InterfaceC5967a f12544a;

    /* renamed from: com.applovin.impl.zc$a */
    /* loaded from: classes2.dex */
    interface InterfaceC5967a {
        /* renamed from: a */
        void mo92451a(View$OnClickListenerC5966zc view$OnClickListenerC5966zc);
    }

    public View$OnClickListenerC5966zc(C4117bd c4117bd, Context context) {
        super(context);
        setOnClickListener(this);
        C4038i c4038i = new C4038i(context);
        int dpToPx = AppLovinSdkUtils.dpToPx(context, c4117bd.m100470e());
        c4038i.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, 17));
        c4038i.mo100836a(dpToPx);
        addView(c4038i);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(context, c4117bd.m100470e() + (c4117bd.m100472c() * 2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx2, dpToPx2, 8388661);
        int dpToPx3 = AppLovinSdkUtils.dpToPx(context, c4117bd.m100469f());
        int dpToPx4 = AppLovinSdkUtils.dpToPx(context, c4117bd.m100471d());
        layoutParams.setMargins(dpToPx4, dpToPx3, dpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f12544a.mo92451a(this);
    }

    public void setListener(InterfaceC5967a interfaceC5967a) {
        this.f12544a = interfaceC5967a;
    }
}
