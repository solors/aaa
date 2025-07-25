package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.applovin.publisher.a */
/* loaded from: classes6.dex */
public class C17824a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C17824a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m65078a(webView);
    }
}
