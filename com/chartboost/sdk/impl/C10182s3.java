package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.chartboost.sdk.impl.InterfaceC10068na;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import p978t3.WebViewRenderException;

/* renamed from: com.chartboost.sdk.impl.s3 */
/* loaded from: classes3.dex */
public class C10182s3 extends WebViewClient {

    /* renamed from: a */
    public final InterfaceC10212t3 f23093a;

    /* renamed from: b */
    public final InterfaceC10045m4 f23094b;

    public C10182s3(InterfaceC10212t3 interfaceC10212t3, InterfaceC10045m4 interfaceC10045m4) {
        this.f23093a = interfaceC10212t3;
        this.f23094b = interfaceC10045m4;
    }

    /* renamed from: a */
    public final void m80631a(String str) {
        InterfaceC10212t3 interfaceC10212t3 = this.f23093a;
        if (interfaceC10212t3 != null) {
            interfaceC10212t3.mo80556a(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC10212t3 interfaceC10212t3 = this.f23093a;
        if (interfaceC10212t3 != null) {
            interfaceC10212t3.mo80553d();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        PackageInfo currentWebViewPackage;
        super.onPageStarted(webView, str, bitmap);
        if (Build.VERSION.SDK_INT >= 26) {
            currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                C9763c7.m81923a("WebView version: " + currentWebViewPackage.versionName, null);
            } else {
                m80631a("Device was not set up correctly.");
            }
        }
        this.f23093a.mo80554c();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        m80631a("Error loading " + str2 + ": " + str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String reasonPhrase;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error loading ");
        sb2.append(webResourceRequest.getUrl().toString());
        sb2.append(": ");
        if (webResourceResponse == null) {
            reasonPhrase = MBridgeError.ERROR_MESSAGE_UN_KNOWN;
        } else {
            reasonPhrase = webResourceResponse.getReasonPhrase();
        }
        sb2.append(reasonPhrase);
        C9763c7.m81923a(sb2.toString(), null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f23094b.mo110021track(C9997k4.m81227a(InterfaceC10068na.EnumC10078i.f22730i, sslError.toString()));
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        String str;
        WebViewRenderException.m3275a(this);
        didCrash = renderProcessGoneDetail.didCrash();
        if (didCrash) {
            str = "Webview crashed: " + renderProcessGoneDetail;
        } else {
            str = "Webview killed, likely due to low memory";
        }
        m80631a(str);
        if (webView != null && (webView.getContext() instanceof Activity)) {
            ((Activity) webView.getContext()).finish();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            m80631a("Error loading " + webResourceRequest.getUrl().toString() + ": " + ((Object) webResourceError.getDescription()));
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
