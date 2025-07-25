package com.mbridge.msdk.mbsignalcommon.p474b;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener;

/* renamed from: com.mbridge.msdk.mbsignalcommon.b.b */
/* loaded from: classes6.dex */
public class DefaultWebViewListener implements IWebViewListener {
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public void mo51073a(WebView webView, String str, Bitmap bitmap) {
        SameLogTool.m51827a("WindVaneWebView", "onPageStarted");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: b */
    public boolean mo51071b(WebView webView, String str) {
        SameLogTool.m51827a("WindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: c */
    public void mo48800c(WebView webView, int i) {
        SameLogTool.m51827a("WindVaneWebView", "loadingResourceStatus");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public void mo48802a(WebView webView, int i, String str, String str2) {
        SameLogTool.m51827a("WindVaneWebView", "onReceivedError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: b */
    public void mo51072b(WebView webView, int i) {
        SameLogTool.m51827a("WindVaneWebView", "onProgressChanged");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public void mo49079a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        SameLogTool.m51827a("WindVaneWebView", "onReceivedSslError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public void mo48801a(WebView webView, String str) {
        SameLogTool.m51827a("WindVaneWebView", "onPageFinished");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public void mo48803a(WebView webView, int i) {
        SameLogTool.m51827a("WindVaneWebView", "readyState");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public void mo48804a(WebView webView) {
        SameLogTool.m51827a("WindVaneWebView", "onRenderProcessGone");
    }
}
