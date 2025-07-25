package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes8.dex */
public final class ci2 extends AbstractC31638v8 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public ci2(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m28508a(webView);
    }
}
