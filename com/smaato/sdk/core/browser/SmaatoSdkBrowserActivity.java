package com.smaato.sdk.core.browser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.C26996R;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.webview.WebViewHelperUtil;

/* loaded from: classes7.dex */
public class SmaatoSdkBrowserActivity extends Activity implements BrowserView {
    private static final String LOG_TAG = "com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity";
    @Nullable
    @Inject
    private BrowserPresenter browserPresenter;
    @Nullable
    private View btnNavigationBackward;
    @Nullable
    private View btnNavigationForward;
    @Nullable
    @Inject
    private Logger logger;
    @Nullable
    private ProgressBar progressBar;
    @Nullable
    private TextView tvHostname;
    @Nullable
    private WebView webView;

    /* renamed from: com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity$a */
    /* loaded from: classes7.dex */
    public class C27021a extends DoubleClickPreventionListener {
        C27021a() {
            SmaatoSdkBrowserActivity.this = r1;
        }

        @Override // com.smaato.sdk.core.browser.DoubleClickPreventionListener
        protected void processClick() {
            SmaatoSdkBrowserActivity.this.finish();
        }
    }

    /* renamed from: com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity$b */
    /* loaded from: classes7.dex */
    public class C27022b extends DoubleClickPreventionListener {
        C27022b() {
            SmaatoSdkBrowserActivity.this = r1;
        }

        @Override // com.smaato.sdk.core.browser.DoubleClickPreventionListener
        protected void processClick() {
            Objects.onNotNull(SmaatoSdkBrowserActivity.this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.h0
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((BrowserPresenter) obj).m39673n();
                }
            });
        }
    }

    /* renamed from: com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity$c */
    /* loaded from: classes7.dex */
    public class C27023c extends DoubleClickPreventionListener {
        C27023c() {
            SmaatoSdkBrowserActivity.this = r1;
        }

        @Override // com.smaato.sdk.core.browser.DoubleClickPreventionListener
        protected void processClick() {
            Objects.onNotNull(SmaatoSdkBrowserActivity.this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.i0
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((BrowserPresenter) obj).m39676k();
                }
            });
        }
    }

    /* renamed from: com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity$d */
    /* loaded from: classes7.dex */
    public class C27024d extends DoubleClickPreventionListener {
        C27024d() {
            SmaatoSdkBrowserActivity.this = r1;
        }

        @Override // com.smaato.sdk.core.browser.DoubleClickPreventionListener
        protected void processClick() {
            Objects.onNotNull(SmaatoSdkBrowserActivity.this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.j0
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((BrowserPresenter) obj).m39675l();
                }
            });
        }
    }

    /* renamed from: com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity$e */
    /* loaded from: classes7.dex */
    public class C27025e extends DoubleClickPreventionListener {
        C27025e() {
            SmaatoSdkBrowserActivity.this = r1;
        }

        @Override // com.smaato.sdk.core.browser.DoubleClickPreventionListener
        protected void processClick() {
            Objects.onNotNull(SmaatoSdkBrowserActivity.this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.k0
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((BrowserPresenter) obj).m39677j();
                }
            });
        }
    }

    public static Intent createIntent(@NonNull Context context, @NonNull String str) {
        Objects.requireNonNull(context, "Parameter context cannot be null for SmaatoSdkBrowserActivity::createIntent");
        Objects.requireNonNull(str, "Parameter url cannot be null for SmaatoSdkBrowserActivity::createIntent");
        Intent intent = new Intent(context, SmaatoSdkBrowserActivity.class);
        intent.addFlags(536870912);
        intent.putExtra("KEY_CTA_URL", str);
        return intent;
    }

    private void initLogic() {
        if (this.webView != null) {
            Objects.onNotNull(this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.b0
                {
                    SmaatoSdkBrowserActivity.this = this;
                }

                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    SmaatoSdkBrowserActivity.this.lambda$initLogic$1((BrowserPresenter) obj);
                }
            });
        }
        final String stringExtra = getIntent().getStringExtra("KEY_CTA_URL");
        Objects.onNotNull(this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.c0
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((BrowserPresenter) obj).m39679h(stringExtra);
            }
        });
    }

    private void initViews() {
        this.webView = (WebView) findViewById(C26996R.C26999id.webView);
        this.progressBar = (ProgressBar) findViewById(C26996R.C26999id.progressBar);
        findViewById(C26996R.C26999id.btnClose).setOnClickListener(new C27021a());
        findViewById(C26996R.C26999id.btnRefresh).setOnClickListener(new C27022b());
        View findViewById = findViewById(C26996R.C26999id.btnBackward);
        this.btnNavigationBackward = findViewById;
        findViewById.setOnClickListener(new C27023c());
        View findViewById2 = findViewById(C26996R.C26999id.btnForward);
        this.btnNavigationForward = findViewById2;
        findViewById2.setOnClickListener(new C27024d());
        findViewById(C26996R.C26999id.btnOpenExternal).setOnClickListener(new C27025e());
        TextView textView = (TextView) findViewById(C26996R.C26999id.tvHostname);
        this.tvHostname = textView;
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.smaato.sdk.core.browser.d0
            {
                SmaatoSdkBrowserActivity.this = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$initViews$0;
                lambda$initViews$0 = SmaatoSdkBrowserActivity.this.lambda$initViews$0(view);
                return lambda$initViews$0;
            }
        });
    }

    private void initWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            settings.setUseWideViewPort(true);
            settings.setSupportZoom(true);
            settings.setDomStorageEnabled(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
        }
    }

    public /* synthetic */ void lambda$initLogic$1(BrowserPresenter browserPresenter) {
        browserPresenter.m39680g(this, this.webView);
    }

    public /* synthetic */ boolean lambda$initViews$0(View view) {
        Objects.onNotNull(this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.v
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((BrowserPresenter) obj).m39678i();
            }
        });
        return true;
    }

    @Override // com.smaato.sdk.core.browser.BrowserView
    public void closeBrowser() {
        finish();
    }

    @Override // com.smaato.sdk.core.browser.BrowserView
    public void hideProgressIndicator() {
        Objects.onNotNull(this.progressBar, new Consumer() { // from class: com.smaato.sdk.core.browser.q
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((ProgressBar) obj).setVisibility(4);
            }
        });
    }

    @Override // com.smaato.sdk.core.browser.BrowserView
    public void launchExternalBrowser(@NonNull Intent intent) {
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            if (this.logger != null) {
                this.logger.error(LogDomain.AD, "The url seems to be invalid", new Object[0]);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        AndroidsInjector.inject(this);
        if (this.browserPresenter == null) {
            Log.e(LOG_TAG, "SmaatoSdk is not initialized.");
            finish();
            return;
        }
        setContentView(C26996R.C27000layout.smaato_sdk_core_activity_internal_browser);
        initViews();
        initWebView();
        initLogic();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Objects.onNotNull(this.webView, new Consumer() { // from class: com.smaato.sdk.core.browser.f0
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                WebViewHelperUtil.resetAndDestroyWebViewSafely((WebView) obj);
            }
        });
        Objects.onNotNull(this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.g0
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((BrowserPresenter) obj).m39681f();
            }
        });
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        Objects.onNotNull(this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.r
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((BrowserPresenter) obj).m39674m();
            }
        });
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Objects.onNotNull(this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.e0
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((BrowserPresenter) obj).m39672o();
            }
        });
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Objects.onNotNull(this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.t
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((BrowserPresenter) obj).m39671p();
            }
        });
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Objects.onNotNull(this.browserPresenter, new Consumer() { // from class: com.smaato.sdk.core.browser.x
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((BrowserPresenter) obj).m39670q();
            }
        });
    }

    @Override // com.smaato.sdk.core.browser.BrowserView
    public void redirectToExternalApp(@NonNull Intent intent) {
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            if (this.logger != null) {
                this.logger.error(LogDomain.AD, "The url seems to be invalid", new Object[0]);
            }
        }
    }

    @Override // com.smaato.sdk.core.browser.BrowserView
    public void setPageNavigationBackEnabled(final boolean z) {
        Objects.onNotNull(this.btnNavigationBackward, new Consumer() { // from class: com.smaato.sdk.core.browser.y
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((View) obj).setEnabled(z);
            }
        });
    }

    @Override // com.smaato.sdk.core.browser.BrowserView
    public void setPageNavigationForwardEnabled(final boolean z) {
        Objects.onNotNull(this.btnNavigationForward, new Consumer() { // from class: com.smaato.sdk.core.browser.w
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((View) obj).setEnabled(z);
            }
        });
    }

    @Override // com.smaato.sdk.core.browser.BrowserView
    public void showConnectionSecure(boolean z) {
        final int i;
        if (z) {
            i = C26996R.C26998drawable.smaato_sdk_core_ic_browser_secure_connection;
        } else {
            i = 0;
        }
        Objects.onNotNull(this.tvHostname, new Consumer() { // from class: com.smaato.sdk.core.browser.u
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((TextView) obj).setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            }
        });
    }

    @Override // com.smaato.sdk.core.browser.BrowserView
    public void showHostname(@Nullable final String str) {
        Objects.onNotNull(this.tvHostname, new Consumer() { // from class: com.smaato.sdk.core.browser.s
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((TextView) obj).setText(str);
            }
        });
    }

    @Override // com.smaato.sdk.core.browser.BrowserView
    public void showProgressIndicator() {
        Objects.onNotNull(this.progressBar, new Consumer() { // from class: com.smaato.sdk.core.browser.z
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((ProgressBar) obj).setVisibility(0);
            }
        });
    }

    @Override // com.smaato.sdk.core.browser.BrowserView
    public void updateProgressIndicator(final int i) {
        Objects.onNotNull(this.progressBar, new Consumer() { // from class: com.smaato.sdk.core.browser.a0
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((ProgressBar) obj).setProgress(i);
            }
        });
    }
}
