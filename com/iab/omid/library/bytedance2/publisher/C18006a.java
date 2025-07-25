package com.iab.omid.library.bytedance2.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.bytedance2.publisher.a */
/* loaded from: classes6.dex */
public class C18006a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C18006a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m64370a(webView);
    }
}
