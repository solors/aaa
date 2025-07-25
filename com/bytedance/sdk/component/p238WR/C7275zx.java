package com.bytedance.sdk.component.p238WR;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.p238WR.View$OnTouchListenerC7263bg;
import java.util.List;
import p978t3.WebViewRenderException;

/* renamed from: com.bytedance.sdk.component.WR.zx */
/* loaded from: classes3.dex */
public class C7275zx extends WebViewClient {

    /* renamed from: IL */
    private final View$OnTouchListenerC7263bg.InterfaceC7265bg f15720IL;

    /* renamed from: bX */
    private final List<String> f15721bX;

    /* renamed from: bg */
    private final WebViewClient f15722bg;

    public C7275zx(View$OnTouchListenerC7263bg.InterfaceC7265bg interfaceC7265bg, WebViewClient webViewClient, List<String> list) {
        this.f15720IL = interfaceC7265bg;
        this.f15722bg = webViewClient;
        this.f15721bX = list;
    }

    /* renamed from: bg */
    private int m89382bg(WebView webView) {
        try {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            if (copyBackForwardList == null) {
                return -1;
            }
            return copyBackForwardList.getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f15722bg.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        View$OnTouchListenerC7263bg.InterfaceC7265bg interfaceC7265bg = this.f15720IL;
        if (interfaceC7265bg != null) {
            interfaceC7265bg.mo89412bg(m89382bg(webView));
        }
        this.f15722bg.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f15722bg.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f15722bg.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f15722bg.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        WebViewRenderException.m3275a(this);
        if (Build.VERSION.SDK_INT >= 26) {
            onRenderProcessGone = this.f15722bg.onRenderProcessGone(webView, renderProcessGoneDetail);
            return onRenderProcessGone;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f15722bg.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        View$OnTouchListenerC7263bg.InterfaceC7265bg interfaceC7265bg = this.f15720IL;
        if (interfaceC7265bg != null) {
            interfaceC7265bg.mo89413bg();
        }
        return this.f15722bg.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f15722bg.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        View$OnTouchListenerC7263bg.InterfaceC7265bg interfaceC7265bg;
        if (C7259IL.m89442bg(this.f15721bX, webResourceRequest.getUrl().toString()) && (interfaceC7265bg = this.f15720IL) != null) {
            interfaceC7265bg.mo89413bg();
        }
        return this.f15722bg.shouldInterceptRequest(webView, webResourceRequest);
    }
}
