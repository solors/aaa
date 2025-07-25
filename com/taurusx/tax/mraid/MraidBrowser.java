package com.taurusx.tax.mraid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.taurusx.tax.p594e.C28342i;
import com.taurusx.tax.p594e.C28344j;
import com.taurusx.tax.p594e.EnumC28333f;
import com.taurusx.tax.p594e.View$OnClickListenerC28346k;
import com.taurusx.tax.p594e.View$OnClickListenerC28348l;
import com.taurusx.tax.p594e.View$OnClickListenerC28350m;
import com.taurusx.tax.p594e.View$OnClickListenerC28352n;

/* loaded from: classes7.dex */
public class MraidBrowser extends Activity {

    /* renamed from: a */
    public WebView f74066a;

    /* renamed from: b */
    public ImageButton f74067b;

    /* renamed from: c */
    public ImageButton f74068c;

    /* renamed from: d */
    public ImageButton f74069d;

    /* renamed from: e */
    public ImageButton f74070e;

    /* renamed from: a */
    public final ImageButton m37898a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(relativeLayout);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setBackgroundDrawable(EnumC28333f.BACKGROUND.decodeImage(this));
        relativeLayout.addView(linearLayout2);
        this.f74067b = m37898a(EnumC28333f.LEFT_ARROW.decodeImage(this));
        this.f74068c = m37898a(EnumC28333f.RIGHT_ARROW.decodeImage(this));
        this.f74069d = m37898a(EnumC28333f.REFRESH.decodeImage(this));
        this.f74070e = m37898a(EnumC28333f.CLOSE.decodeImage(this));
        linearLayout2.addView(this.f74067b);
        linearLayout2.addView(this.f74068c);
        linearLayout2.addView(this.f74069d);
        linearLayout2.addView(this.f74070e);
        this.f74066a = new WebView(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.f74066a.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f74066a);
        setContentView(linearLayout);
        Intent intent = getIntent();
        WebSettings settings = this.f74066a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        this.f74066a.loadUrl(intent.getStringExtra(InneractiveInternalBrowserActivity.URL_EXTRA));
        this.f74066a.setWebViewClient(new C28342i(this));
        this.f74066a.setWebChromeClient(new C28344j(this));
        this.f74067b.setBackgroundColor(0);
        this.f74067b.setOnClickListener(new View$OnClickListenerC28346k(this));
        this.f74068c.setBackgroundColor(0);
        this.f74068c.setOnClickListener(new View$OnClickListenerC28348l(this));
        this.f74069d.setBackgroundColor(0);
        this.f74069d.setOnClickListener(new View$OnClickListenerC28350m(this));
        this.f74070e.setBackgroundColor(0);
        this.f74070e.setOnClickListener(new View$OnClickListenerC28352n(this));
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
    }
}
