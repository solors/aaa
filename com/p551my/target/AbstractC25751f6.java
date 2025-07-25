package com.p551my.target;

import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p1044xb.CertData;
import p1044xb.SslErrorVerifier;
import p978t3.WebViewRenderException;

/* renamed from: com.my.target.f6 */
/* loaded from: classes7.dex */
public abstract class AbstractC25751f6 extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        CertData m43566a = AbstractC25881l1.m43566a();
        if (m43566a == null) {
            str = "MyTargetWebViewClient: can't verify ssl Error – certData is null";
        } else if (SslErrorVerifier.m1227a(sslError, m43566a.f118301c)) {
            sslErrorHandler.proceed();
            return;
        } else {
            str = "MyTargetWebViewClient: ssl error not verified";
        }
        AbstractC25846ja.m43680a(str);
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        return true;
    }
}
