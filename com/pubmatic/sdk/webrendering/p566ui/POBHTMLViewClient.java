package com.pubmatic.sdk.webrendering.p566ui;

import android.annotation.TargetApi;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import p978t3.WebViewRenderException;

/* renamed from: com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient */
/* loaded from: classes7.dex */
public class POBHTMLViewClient extends WebViewClient {
    @Nullable

    /* renamed from: a */
    private HTMLViewClientListener f71286a;

    /* renamed from: b */
    private boolean f71287b;

    /* renamed from: c */
    private boolean f71288c;
    @NonNull

    /* renamed from: d */
    private final OnRenderProcessGoneListener f71289d;

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient$HTMLViewClientListener */
    /* loaded from: classes7.dex */
    public interface HTMLViewClientListener {
        void onPageFinished(@NonNull WebView webView);

        void onReceivedError(@NonNull POBError pOBError);

        boolean shouldOverrideUrlLoading(@Nullable String str);
    }

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient$OnRenderProcessGoneListener */
    /* loaded from: classes7.dex */
    public interface OnRenderProcessGoneListener {
        void onRenderProcessGone();
    }

    public POBHTMLViewClient(@NonNull OnRenderProcessGoneListener onRenderProcessGoneListener) {
        this.f71289d = onRenderProcessGoneListener;
    }

    /* renamed from: a */
    private void m39830a(String str) {
        POBLog.error("POBHTMLViewClient", str, new Object[0]);
        HTMLViewClientListener hTMLViewClientListener = this.f71286a;
        if (hTMLViewClientListener != null) {
            hTMLViewClientListener.onReceivedError(new POBError(1009, str));
        }
    }

    public void disableMultipleOnPageFinished(boolean z) {
        this.f71287b = z;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        HTMLViewClientListener hTMLViewClientListener;
        super.onPageFinished(webView, str);
        POBLog.debug("POBHTMLViewClient", "WebView creative loading finished.", new Object[0]);
        if (!this.f71288c && (hTMLViewClientListener = this.f71286a) != null) {
            hTMLViewClientListener.onPageFinished(webView);
            this.f71288c = this.f71287b;
        }
        webView.setFocusableInTouchMode(true);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        WebViewRenderException.m3275a(this);
        if (renderProcessGoneDetail != null) {
            didCrash = renderProcessGoneDetail.didCrash();
            rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
            POBLog.error("POBHTMLViewClient", "WebView Render process gone, did it crash? :-> %s, reason: %s", Boolean.valueOf(didCrash), Integer.valueOf(rendererPriorityAtExit));
        }
        this.f71289d.onRenderProcessGone();
        return true;
    }

    public void setHTMLClientListener(@Nullable HTMLViewClientListener hTMLViewClientListener) {
        this.f71286a = hTMLViewClientListener;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            Object[] objArr = new Object[1];
            objArr[0] = webResourceError != null ? webResourceError.toString() : " Not defined";
            m39830a(String.format("WebView received error on page loading. Error : %s", objArr));
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, webResourceRequest);
        POBLog.debug("POBHTMLViewClient", "WebView shouldOverrideUrlLoading.. Request redirect = " + webResourceRequest.isRedirect(), new Object[0]);
        if (webResourceRequest.isRedirect() || webResourceRequest.getUrl() == null) {
            return shouldOverrideUrlLoading;
        }
        String uri = webResourceRequest.getUrl().toString();
        HTMLViewClientListener hTMLViewClientListener = this.f71286a;
        return hTMLViewClientListener != null ? hTMLViewClientListener.shouldOverrideUrlLoading(uri) : shouldOverrideUrlLoading;
    }
}
