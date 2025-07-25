package com.iab.omid.library.corpmailru.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.corpmailru.publisher.a */
/* loaded from: classes6.dex */
public class C18071a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C18071a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m64104a(webView);
    }
}
