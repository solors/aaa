package com.taurusx.tax.p594e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.taurusx.tax.mraid.MraidVideoPlayerActivity;
import com.taurusx.tax.p578b.C28207b;

/* renamed from: com.taurusx.tax.e.d */
/* loaded from: classes7.dex */
public abstract class AbstractActivityC28328d extends Activity {

    /* renamed from: a */
    public ImageView f73557a;

    /* renamed from: b */
    public RelativeLayout f73558b;

    /* renamed from: c */
    public int f73559c;

    /* renamed from: d */
    public int f73560d;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taurusx.action.interstitial.fail");
        intentFilter.addAction("com.taurusx.action.interstitial.show");
        intentFilter.addAction("com.taurusx.action.interstitial.dismiss");
        intentFilter.addAction("com.taurusx.action.interstitial.click");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC28330e c28357p0;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        this.f73559c = C28207b.m38466a(50.0f, (Context) this);
        this.f73560d = C28207b.m38466a(8.0f, (Context) this);
        this.f73558b = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        RelativeLayout relativeLayout = this.f73558b;
        MraidVideoPlayerActivity mraidVideoPlayerActivity = (MraidVideoPlayerActivity) this;
        if ("mraid".equals(mraidVideoPlayerActivity.getIntent().getStringExtra("video_view_class_name"))) {
            c28357p0 = new C28359q0(mraidVideoPlayerActivity, mraidVideoPlayerActivity.getIntent(), mraidVideoPlayerActivity);
        } else {
            mraidVideoPlayerActivity.sendBroadcast(new Intent("com.taurusx.action.interstitial.fail"));
            mraidVideoPlayerActivity.finish();
            c28357p0 = new C28357p0(mraidVideoPlayerActivity, mraidVideoPlayerActivity);
        }
        mraidVideoPlayerActivity.f74071e = c28357p0;
        relativeLayout.addView(c28357p0, layoutParams);
        setContentView(this.f73558b);
        this.f73557a = new ImageButton(this);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842919}, EnumC28333f.INTERSTITIAL_CLOSE_BUTTON_NORMAL.decodeImage(this));
        stateListDrawable.addState(new int[]{16842919}, EnumC28333f.INTERSTITIAL_CLOSE_BUTTON_PRESSED.decodeImage(this));
        this.f73557a.setImageDrawable(stateListDrawable);
        this.f73557a.setBackgroundDrawable(null);
        this.f73557a.setOnClickListener(new View$OnClickListenerC28326c(this));
        int i = this.f73559c;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(11);
        int i2 = this.f73560d;
        layoutParams2.setMargins(i2, 0, i2, 0);
        this.f73558b.addView(this.f73557a, layoutParams2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f73558b.removeAllViews();
        super.onDestroy();
    }
}
