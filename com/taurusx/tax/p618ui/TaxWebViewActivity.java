package com.taurusx.tax.p618ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.taurusx.tax.C28154R;
import com.taurusx.tax.p578b.p579c.C28210c;
import com.taurusx.tax.p578b.p581e.C28236i;
import com.taurusx.tax.p606j.p615y.C28560d;
import com.taurusx.tax.p618ui.TaxWebViewActivity;
import java.lang.reflect.Method;
import p978t3.WebViewRenderException;

/* renamed from: com.taurusx.tax.ui.TaxWebViewActivity */
/* loaded from: classes7.dex */
public class TaxWebViewActivity extends Activity {

    /* renamed from: a */
    public boolean f74281a = false;

    /* renamed from: b */
    public boolean f74282b = false;

    /* renamed from: c */
    public C28236i f74283c = null;

    /* renamed from: com.taurusx.tax.ui.TaxWebViewActivity$a */
    /* loaded from: classes7.dex */
    public class C28595a extends WebViewClient {

        /* renamed from: a */
        public int f74284a = 0;

        public C28595a() {
            TaxWebViewActivity.this = r1;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            int i = this.f74284a - 1;
            this.f74284a = i;
            if (i == 0) {
                TaxWebViewActivity taxWebViewActivity = TaxWebViewActivity.this;
                if (!taxWebViewActivity.f74281a) {
                    taxWebViewActivity.f74281a = true;
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f74284a = Math.max(this.f74284a, 1);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewRenderException.m3275a(this);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:133:0x0238  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r32, java.lang.String r33) {
            /*
                Method dump skipped, instructions count: 869
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p618ui.TaxWebViewActivity.C28595a.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = (WebView) findViewById(C28154R.C28157id.inner_activity_webview);
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        requestWindowFeature(1);
        window.setFlags(1024, 1024);
        setContentView(C28154R.C28158layout.taurusx_activity_web_view);
        Intent intent = getIntent();
        String str = "";
        if (intent != null) {
            try {
                str = intent.getStringExtra("url");
                C28210c m37821a = m37821a(intent);
                String stringExtra = intent.getStringExtra("ad_pid_key");
                if (m37821a != null && !TextUtils.isEmpty(stringExtra)) {
                    this.f74283c = C28236i.m38370a(m37821a);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(str)) {
            finish();
            return;
        }
        WebView webView = (WebView) findViewById(C28154R.C28157id.inner_activity_webview);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setHorizontalScrollbarOverlay(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setVerticalScrollbarOverlay(false);
        webView.requestFocus();
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT < 33) {
            settings.setAppCacheEnabled(true);
            settings.setAppCacheMaxSize(1048576L);
            settings.setAppCachePath(getCacheDir().getAbsolutePath());
        }
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setAllowFileAccessFromFileURLs(false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception unused) {
        }
        webView.loadUrl(str);
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: c8.a
            {
                TaxWebViewActivity.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m37820a;
                m37820a = TaxWebViewActivity.this.m37820a(view, motionEvent);
                return m37820a;
            }
        });
        webView.setWebViewClient(new C28595a());
    }

    /* renamed from: a */
    public /* synthetic */ boolean m37820a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.f74282b = true;
        return false;
    }

    /* renamed from: a */
    public final C28210c m37821a(Intent intent) {
        Object obj;
        try {
            String stringExtra = intent.getStringExtra("ad_response_cache_key");
            if (!TextUtils.isEmpty(stringExtra)) {
                C28560d m37928a = C28560d.m37928a();
                m37928a.getClass();
                try {
                    obj = m37928a.f74047a.get(stringExtra);
                } catch (Exception e) {
                    e.printStackTrace();
                    obj = null;
                }
                C28560d m37928a2 = C28560d.m37928a();
                m37928a2.getClass();
                try {
                    m37928a2.f74047a.remove(stringExtra);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (obj instanceof C28210c) {
                    return (C28210c) obj;
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }
}
