package com.iab.omid.library.mmadbridge.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.mmadbridge.publisher.a */
/* loaded from: classes6.dex */
public class C18313a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C18313a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m63184a(webView);
    }
}
