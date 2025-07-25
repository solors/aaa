package com.iab.omid.library.bigosg.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.bigosg.publisher.a */
/* loaded from: classes6.dex */
public class C17960a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C17960a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m64554a(webView);
    }
}
