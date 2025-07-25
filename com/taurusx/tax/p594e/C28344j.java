package com.taurusx.tax.p594e;

import android.app.Activity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.taurusx.tax.mraid.MraidBrowser;

/* renamed from: com.taurusx.tax.e.j */
/* loaded from: classes7.dex */
public class C28344j extends WebChromeClient {
    public C28344j(MraidBrowser mraidBrowser) {
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        Activity activity = (Activity) webView.getContext();
        activity.setTitle("Loading...");
        activity.setProgress(i * 100);
        if (i == 100) {
            activity.setTitle(webView.getUrl());
        }
    }
}
