package com.applovin.impl;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C6200R;

/* renamed from: com.applovin.impl.d0 */
/* loaded from: classes2.dex */
public class DialogC4221d0 extends Dialog {

    /* renamed from: a */
    private ViewGroup f5431a;

    /* renamed from: b */
    private AppLovinSdkUtils.Size f5432b;

    /* renamed from: c */
    private Activity f5433c;

    /* renamed from: d */
    private RelativeLayout f5434d;

    public DialogC4221d0(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, 16973840);
        this.f5431a = viewGroup;
        this.f5432b = size;
        this.f5433c = activity;
        requestWindowFeature(1);
    }

    /* renamed from: a */
    public static /* synthetic */ void m100044a(DialogC4221d0 dialogC4221d0, View view) {
        dialogC4221d0.m100043b(view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m100042b(DialogC4221d0 dialogC4221d0, View view) {
        dialogC4221d0.m100045a(view);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f5434d.removeView(this.f5431a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f5433c, this.f5432b.getWidth()), AppLovinSdkUtils.dpToPx(this.f5433c, this.f5432b.getHeight()));
        layoutParams.addRule(13);
        this.f5431a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f5433c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f5433c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f5433c.getResources().getDrawable(C6200R.C6203drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.nu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC4221d0.m100042b(DialogC4221d0.this, view);
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f5433c);
        this.f5434d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f5434d.setBackgroundColor(Integer.MIN_VALUE);
        this.f5434d.addView(imageButton);
        this.f5434d.addView(this.f5431a);
        this.f5434d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.ou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC4221d0.m100044a(DialogC4221d0.this, view);
            }
        });
        setContentView(this.f5434d);
    }

    /* renamed from: a */
    public /* synthetic */ void m100045a(View view) {
        dismiss();
    }

    /* renamed from: b */
    public /* synthetic */ void m100043b(View view) {
        dismiss();
    }
}
