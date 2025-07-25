package com.fyber.inneractive.sdk.config;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.config.H */
/* loaded from: classes4.dex */
public final class RunnableC14315H implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.f27060O;
        WebView webView2 = iAConfigManager.f27074L;
        if (webView2 != null && iAConfigManager.f27082f != null) {
            webView2.destroy();
            try {
                webView = new WebView(iAConfigManager.f27082f);
                webView.setWebViewClient(new C14418z());
            } catch (Throwable unused) {
                IAlog.m76529a("failed to create a new webview", new Object[0]);
                webView = null;
            }
            iAConfigManager.f27074L = webView;
        }
    }
}
