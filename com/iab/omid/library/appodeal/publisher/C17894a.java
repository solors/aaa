package com.iab.omid.library.appodeal.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.appodeal.publisher.a */
/* loaded from: classes6.dex */
public class C17894a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C17894a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m64830a(webView);
    }
}
