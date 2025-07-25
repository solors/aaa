package com.iab.omid.library.ironsrc.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.ironsrc.publisher.a */
/* loaded from: classes6.dex */
public class C18252a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C18252a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m63429a(webView);
    }
}
