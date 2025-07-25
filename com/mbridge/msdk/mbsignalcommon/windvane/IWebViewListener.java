package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.d */
/* loaded from: classes6.dex */
public interface IWebViewListener {
    /* renamed from: a */
    void mo48804a(WebView webView);

    /* renamed from: a */
    void mo48803a(WebView webView, int i);

    /* renamed from: a */
    void mo48802a(WebView webView, int i, String str, String str2);

    /* renamed from: a */
    void mo49079a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo48801a(WebView webView, String str);

    /* renamed from: a */
    void mo51073a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: b */
    void mo51072b(WebView webView, int i);

    /* renamed from: b */
    boolean mo51071b(WebView webView, String str);

    /* renamed from: c */
    void mo48800c(WebView webView, int i);
}
