package com.iab.omid.library.amazon.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.amazon.publisher.a */
/* loaded from: classes6.dex */
public class C17763a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C17763a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m65319a(webView);
    }
}
