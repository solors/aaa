package com.maticoo.sdk.p405ad.utils.webview;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p978t3.WebViewRenderException;

/* renamed from: com.maticoo.sdk.ad.utils.webview.DefaultWebViewClient */
/* loaded from: classes6.dex */
public class DefaultWebViewClient extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        if (webView != null && webView.getParent() != null && (webView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) webView.getParent()).removeView(webView);
            webView.destroy();
            return true;
        }
        return true;
    }
}
