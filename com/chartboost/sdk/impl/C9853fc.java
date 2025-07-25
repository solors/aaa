package com.chartboost.sdk.impl;

import android.webkit.WebView;

/* renamed from: com.chartboost.sdk.impl.fc */
/* loaded from: classes3.dex */
public class C9853fc extends AbstractC10207t {
    public C9853fc(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m80584a(webView);
    }
}
