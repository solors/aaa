package com.smaato.sdk.core.webview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.webview.BaseWebViewClient;
import p978t3.WebViewRenderException;

/* loaded from: classes7.dex */
public class BaseWebViewClient extends WebViewClient {
    @Nullable
    private WebViewClientCallback webViewClientCallback;

    /* loaded from: classes7.dex */
    public interface WebViewClientCallback {
        void onGeneralError(int i, @NonNull String str, @NonNull String str2);

        @TargetApi(23)
        void onHttpError(@NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse);

        void onPageFinishedLoading(@NonNull String str);

        void onPageStartedLoading(@NonNull String str);

        @TargetApi(26)
        void onRenderProcessGone();

        boolean shouldOverrideUrlLoading(@NonNull String str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39296a(String str, WebViewClientCallback webViewClientCallback) {
        webViewClientCallback.onPageFinishedLoading(str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39295b(int i, String str, String str2, WebViewClientCallback webViewClientCallback) {
        webViewClientCallback.onGeneralError(i, str, str2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39294c(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, WebViewClientCallback webViewClientCallback) {
        webViewClientCallback.onHttpError(webResourceRequest, webResourceResponse);
    }

    /* renamed from: d */
    public static /* synthetic */ void m39293d(String str, WebViewClientCallback webViewClientCallback) {
        webViewClientCallback.onPageStartedLoading(str);
    }

    /* renamed from: e */
    public static /* synthetic */ void m39292e(WebResourceError webResourceError, WebResourceRequest webResourceRequest, WebViewClientCallback webViewClientCallback) {
        lambda$onReceivedError$4(webResourceError, webResourceRequest, webViewClientCallback);
    }

    public static /* synthetic */ void lambda$onReceivedError$4(WebResourceError webResourceError, WebResourceRequest webResourceRequest, WebViewClientCallback webViewClientCallback) {
        webViewClientCallback.onGeneralError(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    private boolean shouldOverrideUrlLoadingInternal(@NonNull String str) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback == null) {
            return false;
        }
        return webViewClientCallback.shouldOverrideUrlLoading(str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@NonNull WebView webView, @NonNull final String str) {
        Objects.onNotNull(this.webViewClientCallback, new Consumer() { // from class: com.smaato.sdk.core.webview.b
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                BaseWebViewClient.m39296a(str, (BaseWebViewClient.WebViewClientCallback) obj);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(@NonNull WebView webView, @NonNull final String str, @Nullable Bitmap bitmap) {
        Objects.onNotNull(this.webViewClientCallback, new Consumer() { // from class: com.smaato.sdk.core.webview.d
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                BaseWebViewClient.m39293d(str, (BaseWebViewClient.WebViewClientCallback) obj);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@NonNull WebView webView, final int i, @NonNull final String str, @NonNull final String str2) {
        Objects.onNotNull(this.webViewClientCallback, new Consumer() { // from class: com.smaato.sdk.core.webview.g
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                BaseWebViewClient.m39295b(i, str, str2, (BaseWebViewClient.WebViewClientCallback) obj);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedHttpError(@NonNull WebView webView, @NonNull final WebResourceRequest webResourceRequest, @NonNull final WebResourceResponse webResourceResponse) {
        Objects.onNotNull(this.webViewClientCallback, new Consumer() { // from class: com.smaato.sdk.core.webview.c
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                BaseWebViewClient.m39294c(webResourceRequest, webResourceResponse, (BaseWebViewClient.WebViewClientCallback) obj);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        Objects.onNotNull(this.webViewClientCallback, new Consumer() { // from class: com.smaato.sdk.core.webview.f
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((BaseWebViewClient.WebViewClientCallback) obj).onRenderProcessGone();
            }
        });
        return true;
    }

    public void setWebViewClientCallback(@Nullable WebViewClientCallback webViewClientCallback) {
        this.webViewClientCallback = webViewClientCallback;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull String str) {
        return shouldOverrideUrlLoadingInternal(str);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(@NonNull WebView webView, @NonNull final WebResourceRequest webResourceRequest, @NonNull final WebResourceError webResourceError) {
        Objects.onNotNull(this.webViewClientCallback, new Consumer() { // from class: com.smaato.sdk.core.webview.e
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                BaseWebViewClient.m39292e(webResourceError, webResourceRequest, (BaseWebViewClient.WebViewClientCallback) obj);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoadingInternal(webResourceRequest.getUrl().toString());
    }
}
