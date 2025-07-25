package com.iab.omid.library.taurusx.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.taurusx.publisher.a */
/* loaded from: classes6.dex */
public class C18645a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C18645a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m61929a(webView);
    }
}
