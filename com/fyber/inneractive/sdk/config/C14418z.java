package com.fyber.inneractive.sdk.config;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import p978t3.WebViewRenderException;

/* renamed from: com.fyber.inneractive.sdk.config.z */
/* loaded from: classes4.dex */
public final class C14418z extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        IAConfigManager iAConfigManager = IAConfigManager.f27060O;
        if (iAConfigManager.f27074L == webView) {
            iAConfigManager.f27074L = null;
        }
        if (webView != null) {
            AbstractC15471s.m76465a(webView);
            webView.destroy();
            return true;
        }
        return true;
    }
}
