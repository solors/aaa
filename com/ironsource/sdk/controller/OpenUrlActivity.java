package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.C19776dj;
import com.ironsource.C20084i8;
import com.ironsource.C20086i9;
import com.ironsource.C20696qi;
import com.ironsource.C21114v8;
import com.ironsource.C21151vt;
import com.ironsource.C21277yq;
import com.ironsource.InterfaceC20020h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.jetbrains.annotations.NotNull;
import p978t3.WebViewRenderException;

/* loaded from: classes6.dex */
public class OpenUrlActivity extends Activity {

    /* renamed from: j */
    private static final String f52916j = "OpenUrlActivity";

    /* renamed from: k */
    private static final int f52917k = SDKUtils.generateViewId();

    /* renamed from: l */
    private static final int f52918l = SDKUtils.generateViewId();

    /* renamed from: b */
    private C20903v f52920b;

    /* renamed from: c */
    private ProgressBar f52921c;

    /* renamed from: d */
    boolean f52922d;

    /* renamed from: e */
    private RelativeLayout f52923e;

    /* renamed from: f */
    private String f52924f;

    /* renamed from: a */
    private WebView f52919a = null;

    /* renamed from: g */
    private final Handler f52925g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private boolean f52926h = false;

    /* renamed from: i */
    private final Runnable f52927i = new RunnableC20805b();

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$a */
    /* loaded from: classes6.dex */
    public class View$OnSystemUiVisibilityChangeListenerC20804a implements View.OnSystemUiVisibilityChangeListener {
        View$OnSystemUiVisibilityChangeListenerC20804a() {
            OpenUrlActivity.this = r1;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                OpenUrlActivity.this.f52925g.removeCallbacks(OpenUrlActivity.this.f52927i);
                OpenUrlActivity.this.f52925g.postDelayed(OpenUrlActivity.this.f52927i, 500L);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$b */
    /* loaded from: classes6.dex */
    class RunnableC20805b implements Runnable {
        RunnableC20805b() {
            OpenUrlActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f52926h));
        }
    }

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$c */
    /* loaded from: classes6.dex */
    public class C20806c extends WebViewClient {
        private C20806c() {
            OpenUrlActivity.this = r1;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f52921c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f52921c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            try {
                C20084i8 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.mo57647c()) {
                    if (featureFlagCatchUrlError.m58009e() && OpenUrlActivity.this.f52920b != null) {
                        OpenUrlActivity.this.f52920b.m55068d(str, str2);
                    }
                    if (featureFlagCatchUrlError.m58010d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th) {
                C20086i9.m57997d().m58003a(th);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean didCrash;
            WebViewRenderException.m3275a(this);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Chromium process crashed - detail.didCrash():");
            didCrash = renderProcessGoneDetail.didCrash();
            sb2.append(didCrash);
            Logger.m54972e(OpenUrlActivity.f52916j, sb2.toString());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            if (new C21277yq(str, C19776dj.m58877e().m58879d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().mo57647c()).m53941a()) {
                try {
                    C21151vt.m54391a(OpenUrlActivity.this, str);
                    OpenUrlActivity.this.f52920b.m55005z();
                } catch (Exception e) {
                    C20086i9.m57997d().m58003a(e);
                    StringBuilder sb2 = new StringBuilder();
                    if (e instanceof ActivityNotFoundException) {
                        str2 = C21114v8.C21117c.f53931x;
                    } else {
                        str2 = C21114v8.C21117c.f53932y;
                    }
                    sb2.append(str2);
                    if (OpenUrlActivity.this.f52920b != null) {
                        OpenUrlActivity.this.f52920b.m55068d(sb2.toString(), str);
                    }
                }
                OpenUrlActivity.this.finish();
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        /* synthetic */ C20806c(OpenUrlActivity openUrlActivity, View$OnSystemUiVisibilityChangeListenerC20804a view$OnSystemUiVisibilityChangeListenerC20804a) {
            this();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$d */
    /* loaded from: classes6.dex */
    static class C20807d {

        /* renamed from: a */
        static final String f52931a = "is_store";

        /* renamed from: b */
        static final String f52932b = "external_url";

        /* renamed from: c */
        static final String f52933c = "secondary_web_view";

        /* renamed from: d */
        static final String f52934d = "immersive";

        /* renamed from: e */
        static final String f52935e = "no activity to handle url";

        /* renamed from: f */
        static final String f52936f = "activity failed to open with unspecified reason";

        private C20807d() {
        }
    }

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$e */
    /* loaded from: classes6.dex */
    public static class C20808e {

        /* renamed from: a */
        private final InterfaceC20020h f52937a;

        /* renamed from: b */
        private int f52938b;

        /* renamed from: c */
        private String f52939c;

        /* renamed from: d */
        private boolean f52940d = false;

        /* renamed from: e */
        private boolean f52941e = false;

        /* renamed from: f */
        private boolean f52942f = false;

        public C20808e(InterfaceC20020h interfaceC20020h) {
            this.f52937a = interfaceC20020h;
        }

        /* renamed from: a */
        public Intent m55327a(Context context) {
            Intent mo55218a = this.f52937a.mo55218a(context);
            mo55218a.putExtra("external_url", this.f52939c);
            mo55218a.putExtra("secondary_web_view", this.f52940d);
            mo55218a.putExtra("is_store", this.f52941e);
            mo55218a.putExtra(C21114v8.C21122h.f54095v, this.f52942f);
            if (!(context instanceof Activity)) {
                mo55218a.setFlags(this.f52938b);
            }
            return mo55218a;
        }

        @NotNull
        /* renamed from: b */
        public C20808e m55324b(boolean z) {
            this.f52940d = z;
            return this;
        }

        @NotNull
        /* renamed from: c */
        public C20808e m55323c(boolean z) {
            this.f52941e = z;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public C20808e m55328a(int i) {
            this.f52938b = i;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public C20808e m55326a(String str) {
            this.f52939c = str;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public C20808e m55325a(boolean z) {
            this.f52942f = z;
            return this;
        }
    }

    /* renamed from: e */
    private void m55332e() {
        requestWindowFeature(1);
    }

    /* renamed from: f */
    private void m55330f() {
        getWindow().setFlags(1024, 1024);
    }

    /* renamed from: g */
    private void m55329g() {
        ViewGroup viewGroup;
        C20903v c20903v = this.f52920b;
        if (c20903v != null) {
            c20903v.m55103a(false, C21114v8.C21122h.f54052Y);
            if (this.f52923e != null && (viewGroup = (ViewGroup) this.f52919a.getParent()) != null) {
                if (viewGroup.findViewById(f52917k) != null) {
                    viewGroup.removeView(this.f52919a);
                }
                if (viewGroup.findViewById(f52918l) != null) {
                    viewGroup.removeView(this.f52921c);
                }
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        C20903v c20903v;
        if (this.f52922d && (c20903v = this.f52920b) != null) {
            c20903v.m55077c(C21114v8.C21122h.f54071j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f52919a.stopLoading();
        this.f52919a.clearHistory();
        try {
            this.f52919a.loadUrl(str);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            Logger.m54972e(f52916j, "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f52919a.canGoBack()) {
            this.f52919a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.m54970i(f52916j, "onCreate()");
        try {
            this.f52920b = (C20903v) C20696qi.m55649a((Context) this).mo54338a().m55263j();
            m55332e();
            m55330f();
            Bundle extras = getIntent().getExtras();
            this.f52924f = extras.getString("external_url");
            this.f52922d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(C21114v8.C21122h.f54095v, false);
            this.f52926h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View$OnSystemUiVisibilityChangeListenerC20804a());
                runOnUiThread(this.f52927i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f52923e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m55336c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f52926h && (i == 25 || i == 24)) {
            this.f52925g.postDelayed(this.f52927i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        m55329g();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        m55338b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f52926h && z) {
            runOnUiThread(this.f52927i);
        }
    }

    /* renamed from: a */
    private void m55340a() {
        if (this.f52921c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, 16973939));
            this.f52921c = progressBar;
            progressBar.setId(f52918l);
        }
        if (findViewById(f52918l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f52921c.setLayoutParams(layoutParams);
            this.f52921c.setVisibility(4);
            this.f52923e.addView(this.f52921c);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: b */
    private void m55338b() {
        if (this.f52919a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f52919a = webView;
            webView.setId(f52917k);
            this.f52919a.getSettings().setJavaScriptEnabled(true);
            this.f52919a.setWebViewClient(new C20806c(this, null));
            loadUrl(this.f52924f);
        }
        if (findViewById(f52917k) == null) {
            this.f52923e.addView(this.f52919a, new RelativeLayout.LayoutParams(-1, -1));
        }
        m55340a();
        C20903v c20903v = this.f52920b;
        if (c20903v != null) {
            c20903v.m55103a(true, C21114v8.C21122h.f54052Y);
        }
    }

    /* renamed from: c */
    private void m55336c() {
        WebView webView = this.f52919a;
        if (webView != null) {
            webView.destroy();
        }
    }

    /* renamed from: d */
    private void m55334d() {
        getWindow().addFlags(16);
    }
}
