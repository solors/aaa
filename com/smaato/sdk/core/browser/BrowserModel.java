package com.smaato.sdk.core.browser;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.browser.BrowserModel;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.webview.BaseWebChromeClient;
import com.smaato.sdk.core.webview.BaseWebViewClient;
import com.smaato.sdk.core.webview.WebViewClientCallbackAdapter;

/* loaded from: classes7.dex */
public class BrowserModel {
    @NonNull

    /* renamed from: a */
    private final Logger f71396a;
    @NonNull

    /* renamed from: b */
    private final BaseWebViewClient f71397b;
    @NonNull

    /* renamed from: c */
    private final BaseWebChromeClient f71398c;
    @NonNull

    /* renamed from: d */
    private final SmaatoCookieManager f71399d;
    @Nullable

    /* renamed from: e */
    private WebView f71400e;
    @Nullable

    /* renamed from: f */
    private Callback f71401f;
    @NonNull

    /* renamed from: g */
    private final BaseWebChromeClient.WebChromeClientCallback f71402g;
    @Nullable

    /* renamed from: h */
    private String f71403h;
    @NonNull

    /* renamed from: i */
    private final BaseWebViewClient.WebViewClientCallback f71404i;

    /* loaded from: classes7.dex */
    public interface Callback {
        void onGeneralError(int i, @NonNull String str, @NonNull String str2);

        @TargetApi(23)
        void onHttpError(@NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse);

        void onPageNavigationStackChanged(boolean z, boolean z2);

        void onProgressChanged(@IntRange(from = 0, m105510to = 100) int i);

        @TargetApi(26)
        void onRenderProcessGone();

        void onUrlLoadingStarted(@NonNull String str);

        boolean shouldOverrideUrlLoading(@NonNull String str);
    }

    /* renamed from: com.smaato.sdk.core.browser.BrowserModel$a */
    /* loaded from: classes7.dex */
    public class C27019a implements BaseWebChromeClient.WebChromeClientCallback {
        C27019a() {
            BrowserModel.this = r1;
        }

        @Override // com.smaato.sdk.core.webview.BaseWebChromeClient.WebChromeClientCallback
        public void onProgressChanged(int i) {
            if (BrowserModel.this.f71401f != null) {
                BrowserModel.this.f71401f.onProgressChanged(i);
                if (BrowserModel.this.f71400e != null) {
                    BrowserModel.this.f71401f.onPageNavigationStackChanged(BrowserModel.this.f71400e.canGoBack(), BrowserModel.this.f71400e.canGoForward());
                }
            }
        }
    }

    /* renamed from: com.smaato.sdk.core.browser.BrowserModel$b */
    /* loaded from: classes7.dex */
    public class C27020b extends WebViewClientCallbackAdapter {
        C27020b() {
            BrowserModel.this = r1;
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onGeneralError(final int i, @NonNull final String str, @NonNull final String str2) {
            BrowserModel.this.f71396a.debug(LogDomain.BROWSER, "BrowserModel.onGeneralError errorCode=%d, description=%s, url=%s", Integer.valueOf(i), str, str2);
            Objects.onNotNull(BrowserModel.this.f71401f, new Consumer() { // from class: com.smaato.sdk.core.browser.c
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((BrowserModel.Callback) obj).onGeneralError(i, str, str2);
                }
            });
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onHttpError(@NonNull final WebResourceRequest webResourceRequest, @NonNull final WebResourceResponse webResourceResponse) {
            BrowserModel.this.f71396a.debug(LogDomain.BROWSER, "BrowserModel.onHttpError statusCode=%d", Integer.valueOf(webResourceResponse.getStatusCode()));
            Objects.onNotNull(BrowserModel.this.f71401f, new Consumer() { // from class: com.smaato.sdk.core.browser.a
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((BrowserModel.Callback) obj).onHttpError(webResourceRequest, webResourceResponse);
                }
            });
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onPageFinishedLoading(@NonNull String str) {
            BrowserModel.this.f71399d.forceCookieSync();
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onPageStartedLoading(@NonNull String str) {
            BrowserModel.this.f71403h = str;
            if (BrowserModel.this.f71401f != null) {
                BrowserModel.this.f71401f.onUrlLoadingStarted(str);
            }
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onRenderProcessGone() {
            BrowserModel.this.f71396a.error(LogDomain.BROWSER, "WebView's render process has exited", new Object[0]);
            Objects.onNotNull(BrowserModel.this.f71401f, new Consumer() { // from class: com.smaato.sdk.core.browser.b
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((BrowserModel.Callback) obj).onRenderProcessGone();
                }
            });
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public boolean shouldOverrideUrlLoading(@NonNull String str) {
            if (BrowserModel.this.f71401f != null) {
                return BrowserModel.this.f71401f.shouldOverrideUrlLoading(str);
            }
            return false;
        }
    }

    public BrowserModel(@NonNull Logger logger, @NonNull BaseWebViewClient baseWebViewClient, @NonNull BaseWebChromeClient baseWebChromeClient, @NonNull SmaatoCookieManager smaatoCookieManager) {
        C27019a c27019a = new C27019a();
        this.f71402g = c27019a;
        C27020b c27020b = new C27020b();
        this.f71404i = c27020b;
        this.f71396a = (Logger) Objects.requireNonNull(logger, "Parameter logger cannot be null for BrowserModel::new");
        this.f71397b = (BaseWebViewClient) Objects.requireNonNull(baseWebViewClient, "Parameter webViewClient cannot be null for BrowserModel::new");
        this.f71398c = (BaseWebChromeClient) Objects.requireNonNull(baseWebChromeClient, "Parameter webChromeClient cannot be null for BrowserModel::new");
        this.f71399d = (SmaatoCookieManager) Objects.requireNonNull(smaatoCookieManager, "Parameter smaatoCookieManager cannot be null for BrowserModel::BrowserModel");
        baseWebViewClient.setWebViewClientCallback(c27020b);
        baseWebChromeClient.setWebChromeClientCallback(c27019a);
    }

    @Nullable
    /* renamed from: f */
    public String m39718f() {
        if (this.f71403h == null) {
            this.f71396a.error(LogDomain.BROWSER, "Internal error: loadUrl() was not called", new Object[0]);
        }
        return this.f71403h;
    }

    /* renamed from: g */
    public void m39717g() {
        ((WebView) Objects.requireNonNull(this.f71400e)).goBack();
    }

    /* renamed from: h */
    public void m39716h() {
        ((WebView) Objects.requireNonNull(this.f71400e)).goForward();
    }

    /* renamed from: i */
    public void m39715i(@NonNull String str) {
        Objects.requireNonNull(str, "Parameter url cannot be null for BrowserModel::load");
        this.f71403h = str;
        ((WebView) Objects.requireNonNull(this.f71400e)).loadUrl(str);
    }

    /* renamed from: j */
    public void m39714j() {
        ((WebView) Objects.requireNonNull(this.f71400e)).onPause();
    }

    /* renamed from: k */
    public void m39713k() {
        ((WebView) Objects.requireNonNull(this.f71400e)).reload();
    }

    /* renamed from: l */
    public void m39712l() {
        ((WebView) Objects.requireNonNull(this.f71400e)).onResume();
    }

    /* renamed from: m */
    public void m39711m(@Nullable Callback callback) {
        this.f71401f = callback;
    }

    /* renamed from: n */
    public void m39710n(@NonNull WebView webView) {
        this.f71400e = (WebView) Objects.requireNonNull(webView, "Parameter webView cannot be null for BrowserModel::setWebView");
        webView.setWebViewClient(this.f71397b);
        webView.setWebChromeClient(this.f71398c);
        this.f71399d.setupCookiePolicy(webView);
    }

    /* renamed from: o */
    public void m39709o() {
        this.f71399d.startSync();
    }

    /* renamed from: p */
    public void m39708p() {
        this.f71399d.stopSync();
        this.f71399d.forceCookieSync();
    }
}
