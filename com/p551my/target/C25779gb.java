package com.p551my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.net.URI;
import p978t3.WebViewRenderException;

/* renamed from: com.my.target.gb */
/* loaded from: classes7.dex */
public class C25779gb extends LinearLayout {

    /* renamed from: n */
    public static final int f66895n = C25869ka.m43593c();

    /* renamed from: o */
    public static final int f66896o = C25869ka.m43593c();

    /* renamed from: a */
    public final C25869ka f66897a;

    /* renamed from: b */
    public final ImageButton f66898b;

    /* renamed from: c */
    public final LinearLayout f66899c;

    /* renamed from: d */
    public final TextView f66900d;

    /* renamed from: e */
    public final TextView f66901e;

    /* renamed from: f */
    public final FrameLayout f66902f;

    /* renamed from: g */
    public final View f66903g;

    /* renamed from: h */
    public final FrameLayout f66904h;

    /* renamed from: i */
    public final ImageButton f66905i;

    /* renamed from: j */
    public final RelativeLayout f66906j;

    /* renamed from: k */
    public final C25789h0 f66907k;

    /* renamed from: l */
    public final ProgressBar f66908l;

    /* renamed from: m */
    public InterfaceC25783d f66909m;

    /* renamed from: com.my.target.gb$a */
    /* loaded from: classes7.dex */
    public class C25780a extends WebViewClient {
        public C25780a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewRenderException.m3275a(this);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            C25779gb c25779gb = C25779gb.this;
            c25779gb.f66900d.setText(c25779gb.m43838a(str));
            return true;
        }
    }

    /* renamed from: com.my.target.gb$b */
    /* loaded from: classes7.dex */
    public class C25781b extends WebChromeClient {
        public C25781b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i < 100 && C25779gb.this.f66908l.getVisibility() == 8) {
                C25779gb.this.f66908l.setVisibility(0);
                C25779gb.this.f66903g.setVisibility(8);
            }
            C25779gb.this.f66908l.setProgress(i);
            if (i >= 100) {
                C25779gb.this.f66908l.setVisibility(8);
                C25779gb.this.f66903g.setVisibility(0);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            C25779gb.this.f66901e.setText(webView.getTitle());
            C25779gb.this.f66901e.setVisibility(0);
        }
    }

    /* renamed from: com.my.target.gb$c */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC25782c implements View.OnClickListener {
        public View$OnClickListenerC25782c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C25779gb c25779gb = C25779gb.this;
            if (view == c25779gb.f66898b) {
                InterfaceC25783d interfaceC25783d = c25779gb.f66909m;
                if (interfaceC25783d != null) {
                    interfaceC25783d.mo43308a();
                }
            } else if (view == c25779gb.f66905i) {
                c25779gb.m43834e();
            }
        }
    }

    /* renamed from: com.my.target.gb$d */
    /* loaded from: classes7.dex */
    public interface InterfaceC25783d {
        /* renamed from: a */
        void mo43308a();
    }

    public C25779gb(Context context) {
        super(context);
        this.f66906j = new RelativeLayout(context);
        this.f66907k = new C25789h0(context);
        this.f66898b = new ImageButton(context);
        this.f66899c = new LinearLayout(context);
        this.f66900d = new TextView(context);
        this.f66901e = new TextView(context);
        this.f66902f = new FrameLayout(context);
        this.f66904h = new FrameLayout(context);
        this.f66905i = new ImageButton(context);
        this.f66908l = new ProgressBar(context, null, 16842872);
        this.f66903g = new View(context);
        this.f66897a = C25869ka.m43585e(context);
    }

    /* renamed from: a */
    public boolean m43839a() {
        return this.f66907k.m43819a();
    }

    /* renamed from: b */
    public void m43837b() {
        this.f66907k.setWebChromeClient(null);
        this.f66907k.m43818a(0);
    }

    /* renamed from: c */
    public void m43836c() {
        this.f66907k.m43812b();
    }

    /* renamed from: d */
    public void m43835d() {
        WebSettings settings = this.f66907k.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setDomStorageEnabled(true);
        }
        this.f66907k.setWebViewClient(new C25780a());
        this.f66907k.setWebChromeClient(new C25781b());
        m43833f();
    }

    /* renamed from: e */
    public final void m43834e() {
        String url = this.f66907k.getUrl();
        if (!TextUtils.isEmpty(url)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                if (!(getContext() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                getContext().startActivity(intent);
            } catch (Throwable unused) {
                AbstractC25846ja.m43680a("WebViewBrowser: Unable to open url " + url);
            }
        }
    }

    /* renamed from: f */
    public final void m43833f() {
        setOrientation(1);
        setGravity(16);
        View$OnClickListenerC25782c view$OnClickListenerC25782c = new View$OnClickListenerC25782c();
        this.f66907k.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TypedValue typedValue = new TypedValue();
        int m43598b = this.f66897a.m43598b(50);
        if (getContext().getTheme().resolveAttribute(16843499, typedValue, true)) {
            m43598b = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        this.f66906j.setLayoutParams(new LinearLayout.LayoutParams(-1, m43598b));
        this.f66902f.setLayoutParams(new LinearLayout.LayoutParams(m43598b, m43598b));
        FrameLayout frameLayout = this.f66902f;
        int i = f66895n;
        frameLayout.setId(i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f66898b.setLayoutParams(layoutParams);
        this.f66898b.setImageBitmap(AbstractC25764g0.m43886a(m43598b / 4, this.f66897a.m43598b(2)));
        this.f66898b.setContentDescription("Close");
        this.f66898b.setOnClickListener(view$OnClickListenerC25782c);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(m43598b, m43598b);
        layoutParams2.addRule(21);
        this.f66904h.setLayoutParams(layoutParams2);
        FrameLayout frameLayout2 = this.f66904h;
        int i2 = f66896o;
        frameLayout2.setId(i2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f66905i.setLayoutParams(layoutParams3);
        this.f66905i.setImageBitmap(AbstractC25764g0.m43884b(getContext()));
        this.f66905i.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f66905i.setContentDescription("Open outside");
        this.f66905i.setOnClickListener(view$OnClickListenerC25782c);
        C25869ka.m43605a(this.f66898b, 0, -3355444);
        C25869ka.m43605a(this.f66905i, 0, -3355444);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15, -1);
        layoutParams4.addRule(1, i);
        layoutParams4.addRule(0, i2);
        this.f66899c.setLayoutParams(layoutParams4);
        this.f66899c.setOrientation(1);
        this.f66899c.setPadding(this.f66897a.m43598b(4), this.f66897a.m43598b(4), this.f66897a.m43598b(4), this.f66897a.m43598b(4));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        this.f66901e.setVisibility(8);
        this.f66901e.setLayoutParams(layoutParams5);
        this.f66901e.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f66901e.setTextSize(2, 18.0f);
        this.f66901e.setSingleLine();
        TextView textView = this.f66901e;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
        textView.setEllipsize(truncateAt);
        this.f66900d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f66900d.setSingleLine();
        this.f66900d.setTextSize(2, 12.0f);
        this.f66900d.setEllipsize(truncateAt);
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(-16537100), GravityCompat.START, 1);
        ColorDrawable colorDrawable = new ColorDrawable(-1968642);
        LayerDrawable layerDrawable = (LayerDrawable) this.f66908l.getProgressDrawable();
        layerDrawable.setDrawableByLayerId(16908288, colorDrawable);
        layerDrawable.setDrawableByLayerId(16908301, clipDrawable);
        this.f66908l.setProgressDrawable(layerDrawable);
        this.f66908l.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f66897a.m43598b(2)));
        this.f66908l.setProgress(0);
        this.f66899c.addView(this.f66901e);
        this.f66899c.addView(this.f66900d);
        this.f66902f.addView(this.f66898b);
        this.f66904h.addView(this.f66905i);
        this.f66906j.addView(this.f66902f);
        this.f66906j.addView(this.f66899c);
        this.f66906j.addView(this.f66904h);
        addView(this.f66906j);
        this.f66903g.setBackgroundColor(-5592406);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, 1);
        this.f66903g.setVisibility(8);
        this.f66903g.setLayoutParams(layoutParams6);
        addView(this.f66908l);
        addView(this.f66903g);
        addView(this.f66907k);
    }

    public void setListener(@Nullable InterfaceC25783d interfaceC25783d) {
        this.f66909m = interfaceC25783d;
    }

    public void setUrl(@NonNull String str) {
        this.f66907k.m43815a(str);
        this.f66900d.setText(m43838a(str));
    }

    /* renamed from: a */
    public final String m43838a(String str) {
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }
}
