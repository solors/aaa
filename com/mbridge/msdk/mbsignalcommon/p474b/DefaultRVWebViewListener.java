package com.mbridge.msdk.mbsignalcommon.p474b;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC22232b;

/* renamed from: com.mbridge.msdk.mbsignalcommon.b.a */
/* loaded from: classes6.dex */
public class DefaultRVWebViewListener implements InterfaceC22232b {
    /* renamed from: a */
    public void mo49078a(Object obj) {
        SameLogTool.m51827a("RVWindVaneWebView", "getEndScreenInfo");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: b */
    public final boolean mo51071b(WebView webView, String str) {
        SameLogTool.m51827a("RVWindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: c */
    public final void mo48800c(WebView webView, int i) {
        SameLogTool.m51827a("RVWindVaneWebView", "loadingResourceStatus");
    }

    /* renamed from: a */
    public void mo50221a(WebView webView, String str, String str2, int i, int i2) {
        SameLogTool.m51827a("RVWindVaneWebView", "loadAds");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: b */
    public final void mo51072b(WebView webView, int i) {
        SameLogTool.m51827a("RVWindVaneWebView", "onProgressChanged");
    }

    /* renamed from: a */
    public void mo50220a(Object obj, String str) {
        SameLogTool.m51827a("RVWindVaneWebView", "operateComponent");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public final void mo51073a(WebView webView, String str, Bitmap bitmap) {
        SameLogTool.m51827a("RVWindVaneWebView", "onPageStarted");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public void mo48802a(WebView webView, int i, String str, String str2) {
        SameLogTool.m51827a("RVWindVaneWebView", "onReceivedError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public void mo49079a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        SameLogTool.m51827a("RVWindVaneWebView", "onReceivedSslError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public void mo48801a(WebView webView, String str) {
        SameLogTool.m51827a("RVWindVaneWebView", "onPageFinished");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public void mo48803a(WebView webView, int i) {
        SameLogTool.m51827a("RVWindVaneWebView", "readyState");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener
    /* renamed from: a */
    public void mo48804a(WebView webView) {
        SameLogTool.m51827a("RVWindVaneWebView", "onRenderProcessGone");
    }
}
