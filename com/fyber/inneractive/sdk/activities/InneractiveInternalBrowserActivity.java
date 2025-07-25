package com.fyber.inneractive.sdk.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C14169R;
import com.fyber.inneractive.sdk.click.C14291b;
import com.fyber.inneractive.sdk.click.C14299j;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.AbstractC14552x;
import com.fyber.inneractive.sdk.network.C14740w;
import com.fyber.inneractive.sdk.network.EnumC14738u;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.AbstractC15415F;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.EnumC15447g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.RunnableC15422M;
import com.ironsource.C20517nb;
import java.net.URLDecoder;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class InneractiveInternalBrowserActivity extends InneractiveBaseActivity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public static final String URL_EXTRA = "extra_url";

    /* renamed from: j */
    public static String f26865j;

    /* renamed from: k */
    public static InternalBrowserListener f26866k;

    /* renamed from: b */
    public AbstractC14552x f26867b;

    /* renamed from: c */
    public String f26868c;

    /* renamed from: d */
    public LinearLayout f26869d;

    /* renamed from: e */
    public WebView f26870e;

    /* renamed from: f */
    public ImageButton f26871f;

    /* renamed from: g */
    public ImageButton f26872g;

    /* renamed from: h */
    public ImageButton f26873h;

    /* renamed from: i */
    public ImageButton f26874i;

    /* loaded from: classes4.dex */
    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    /* renamed from: a */
    public static void m78030a(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity, C14291b c14291b) {
        C14388r c14388r;
        AbstractC14552x abstractC14552x = inneractiveInternalBrowserActivity.f26867b;
        InneractiveAdRequest inneractiveAdRequest = abstractC14552x != null ? abstractC14552x.f27572a : null;
        AbstractC15386e mo77807c = abstractC14552x != null ? abstractC14552x.mo77807c() : null;
        AbstractC14552x abstractC14552x2 = inneractiveInternalBrowserActivity.f26867b;
        JSONArray m77925b = (abstractC14552x2 == null || (c14388r = abstractC14552x2.f27574c) == null) ? null : c14388r.m77925b();
        EnumC14738u enumC14738u = EnumC14738u.FYBER_SUCCESS_CLICK;
        C14740w c14740w = new C14740w(mo77807c);
        c14740w.f27931c = enumC14738u;
        c14740w.f27929a = inneractiveAdRequest;
        c14740w.f27932d = m77925b;
        JSONObject jSONObject = new JSONObject();
        long j = c14291b.f27003e;
        if (j != 0) {
            Object valueOf = Long.valueOf(j);
            try {
                jSONObject.put("time_passed", valueOf);
            } catch (Exception unused) {
                IAlog.m76524f("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = c14291b.f27004f.iterator();
        while (it.hasNext()) {
            C14299j c14299j = (C14299j) it.next();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("url", c14299j.f27021a);
                jSONObject2.put("success", c14299j.f27022b);
                jSONObject2.put("opened_by", c14299j.f27023c);
                jSONObject2.put("reason", c14299j.f27024d);
            } catch (Exception unused2) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("urls", jSONArray);
        } catch (Exception unused3) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "urls", jSONArray);
        }
        Object obj = EnumC15447g.VIDEO_CTA;
        try {
            jSONObject.put("origin", obj);
        } catch (Exception unused4) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "origin", obj);
        }
        c14740w.f27934f.put(jSONObject);
        c14740w.m77658a((String) null);
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new RunnableC15422M(webView).run();
    }

    public static void setHtmlExtra(String str) {
        f26865j = str;
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        f26866k = internalBrowserListener;
    }

    @Override // android.app.Activity
    public void finish() {
        InternalBrowserListener internalBrowserListener = f26866k;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InneractiveAdSpot spot;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            setContentView(m78032a());
            String stringExtra = getIntent().getStringExtra("spotId");
            this.f26868c = stringExtra;
            if (!TextUtils.isEmpty(stringExtra) && (spot = InneractiveAdSpotManager.get().getSpot(this.f26868c)) != null) {
                this.f26867b = spot.getAdContent();
            }
            Intent intent = getIntent();
            WebSettings settings = this.f26870e.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.f26870e);
            this.f26870e.setWebChromeClient(new C14182e(this));
            String stringExtra2 = intent.getStringExtra(URL_EXTRA);
            if (!TextUtils.isEmpty(f26865j)) {
                String str = f26865j + "<title>DigitalTurbine Internal Browser</title>";
                f26865j = str;
                this.f26870e.loadDataWithBaseURL(stringExtra2, str, "text/html", "UTF-8", null);
            } else if (!TextUtils.isEmpty(stringExtra2)) {
                if (AbstractC15415F.m76534d(stringExtra2)) {
                    if (AbstractC15415F.m76535c(stringExtra2)) {
                        try {
                            stringExtra2 = URLDecoder.decode(stringExtra2, C20517nb.f52167N);
                            this.f26870e.loadUrl(stringExtra2);
                        } catch (Exception unused) {
                            IAlog.m76524f("Failed to open Url: %s", stringExtra2);
                            finish();
                        }
                    } else {
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra2));
                        intent2.addFlags(268435456);
                        try {
                            startActivity(intent2);
                            InternalBrowserListener internalBrowserListener = f26866k;
                            if (internalBrowserListener != null) {
                                internalBrowserListener.onApplicationInBackground();
                            }
                        } catch (ActivityNotFoundException unused2) {
                            IAlog.m76524f("Failed to start activity for %s. Please ensure that your phone can handle this intent.", stringExtra2);
                        }
                        finish();
                    }
                } else {
                    this.f26870e.loadUrl(stringExtra2);
                }
            } else {
                IAlog.m76524f("Empty url", new Object[0]);
                finish();
            }
            this.f26871f.setBackgroundColor(0);
            this.f26871f.setOnClickListener(new View$OnClickListenerC14186i(this));
            this.f26871f.setContentDescription("IABackButton");
            this.f26872g.setBackgroundColor(0);
            this.f26872g.setOnClickListener(new View$OnClickListenerC14187j(this));
            this.f26872g.setContentDescription("IAForwardButton");
            this.f26873h.setBackgroundColor(0);
            this.f26873h.setOnClickListener(new View$OnClickListenerC14188k(this));
            this.f26873h.setContentDescription("IARefreshButton");
            this.f26874i.setBackgroundColor(0);
            this.f26874i.setOnClickListener(new View$OnClickListenerC14189l(this));
            this.f26874i.setContentDescription("IACloseButton");
            AbstractC15459m.m76493a();
            AbstractC15459m.m76475g();
        } catch (Exception unused3) {
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        LinearLayout linearLayout = this.f26869d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.f26870e;
        if (webView != null) {
            webView.removeAllViews();
            AbstractC15471s.m76465a(this.f26870e);
            this.f26870e.destroy();
            this.f26870e = null;
        }
        super.onDestroy();
        setHtmlExtra(null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        AbstractC15459m.m76474h();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        AbstractC15459m.m76475g();
    }

    /* renamed from: a */
    public final LinearLayout m78032a() {
        this.f26869d = new LinearLayout(this);
        this.f26869d.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f26869d.setOrientation(1);
        this.f26869d.setContentDescription("IAInternalBrowserView");
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f26869d.addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC15459m.m76491a(getResources().getInteger(C14169R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        AbstractC15459m.m76486a(linearLayout, AbstractC15459m.m76479c(C14169R.C14171drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f26871f = m78031a(AbstractC15459m.m76479c(C14169R.C14171drawable.ia_ib_left_arrow));
        this.f26872g = m78031a(AbstractC15459m.m76479c(C14169R.C14171drawable.ia_ib_right_arrow));
        this.f26873h = m78031a(AbstractC15459m.m76479c(C14169R.C14171drawable.ia_ib_refresh));
        this.f26874i = m78031a(AbstractC15459m.m76479c(C14169R.C14171drawable.ia_ib_close));
        linearLayout.addView(this.f26871f);
        linearLayout.addView(this.f26872g);
        linearLayout.addView(this.f26873h);
        linearLayout.addView(this.f26874i);
        WebView webView = new WebView(IAConfigManager.f27060O.f27098v.m77924a());
        this.f26870e = webView;
        webView.setWebViewClient(new C14183f(this));
        this.f26870e.setId(C14169R.C14172id.ia_inneractive_webview_internal_browser);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.f26870e.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f26870e);
        return this.f26869d;
    }

    /* renamed from: a */
    public final ImageButton m78031a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        Resources resources = getResources();
        int i = C14169R.integer.ia_ib_button_size_dp;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC15459m.m76491a(resources.getInteger(i)), AbstractC15459m.m76491a(getResources().getInteger(i)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
