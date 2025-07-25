package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.o */
/* loaded from: classes2.dex */
public class C5038o extends RelativeLayout {

    /* renamed from: a */
    private final ProgressBar f8690a;

    public C5038o(Context context, int i, int i2) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i2);
        this.f8690a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i != -2 && i != -1) {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, i);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    /* renamed from: a */
    public void m96904a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public void m96903b() {
        setVisibility(8);
    }

    public void setColor(int i) {
        this.f8690a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
