package com.iab.omid.library.xiaomi.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.xiaomi.publisher.coo2iico */
/* loaded from: classes6.dex */
public class C18801coo2iico extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C18801coo2iico(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        coo2iico(webView);
    }
}
