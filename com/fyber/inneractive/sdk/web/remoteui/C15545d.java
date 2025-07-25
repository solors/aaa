package com.fyber.inneractive.sdk.web.remoteui;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.player.p376ui.remote.InterfaceC15201a;
import com.fyber.inneractive.sdk.util.AbstractC15415F;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import p978t3.WebViewRenderException;

/* renamed from: com.fyber.inneractive.sdk.web.remoteui.d */
/* loaded from: classes4.dex */
public final class C15545d extends WebViewClient {

    /* renamed from: a */
    public InterfaceC15543b f30823a;

    /* renamed from: b */
    public InterfaceC15201a f30824b;

    public C15545d(InterfaceC15543b interfaceC15543b, InterfaceC15201a interfaceC15201a) {
        this.f30823a = interfaceC15543b;
        this.f30824b = interfaceC15201a;
    }

    /* renamed from: a */
    public final void m76359a(String str, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        String str2 = "unknown";
        if (Build.VERSION.SDK_INT >= 26) {
            if (renderProcessGoneDetail != null) {
                didCrash = renderProcessGoneDetail.didCrash();
                str2 = String.valueOf(didCrash);
            }
            IAlog.m76529a("%s: onRenderProcessGone: handled, webview crashed: %s view: %s", "RemoteUiWebViewClient", str2, str);
        } else {
            IAlog.m76529a("%s: onRenderProcessGone: handled, view: %s", "RemoteUiWebViewClient", str);
        }
        m76360a(EnumC15542a.WEB_VIEW_CRASH_ERROR, "Webview did crash: " + str2 + " on webview: " + str, null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        IAlog.m76529a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "RemoteUiWebViewClient", str, Integer.valueOf(i), str2);
        m76360a(EnumC15542a.TEMPLATE_CONTENT_ERROR, str + " errCode: " + i, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i;
        String str;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceResponse != null) {
            i = webResourceResponse.getStatusCode();
        } else {
            i = -1;
        }
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            str = webResourceRequest.getUrl().toString();
        } else {
            str = "";
        }
        IAlog.m76529a("%s: onReceivedHttpError: errorCode: %d, failing url: %s", "RemoteUiWebViewClient", Integer.valueOf(i), str);
        m76360a(EnumC15542a.HTTP_ERROR, String.valueOf(i), str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        if (sslError != null) {
            str = sslError.getUrl();
        } else {
            str = "";
        }
        IAlog.m76529a("%s: onReceivedSslError: failing url: %s", "RemoteUiWebViewClient", str);
        m76360a(EnumC15542a.SSL_ERROR, null, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        if (webView != null) {
            m76359a(webView.toString(), renderProcessGoneDetail);
            webView.destroy();
            return true;
        }
        m76359a("unknown", renderProcessGoneDetail);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IAlog.m76529a("%s: shouldOverrideUrlLoading: url: %s", "RemoteUiWebViewClient", str);
        Uri parse = Uri.parse(str);
        if (parse != null && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && !TextUtils.isEmpty(parse.getHost()) && "FyRemote://".toLowerCase().contains(parse.getScheme())) {
            HashMap m76536a = AbstractC15415F.m76536a(parse);
            String host = parse.getHost();
            InterfaceC15201a interfaceC15201a = this.f30824b;
            if (interfaceC15201a != null) {
                interfaceC15201a.mo76361a(host, m76536a);
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        int i;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        str = "";
        if (webResourceError != null) {
            str = webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : "";
            i = webResourceError.getErrorCode();
        } else {
            i = -999;
        }
        String uri = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "unknown" : webResourceRequest.getUrl().toString();
        IAlog.m76529a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "RemoteUiWebViewClient", str, Integer.valueOf(i), uri);
        m76360a(EnumC15542a.TEMPLATE_CONTENT_ERROR, str + " errCode: " + i, uri);
    }

    /* renamed from: a */
    public final void m76360a(EnumC15542a enumC15542a, String str, String str2) {
        HashMap hashMap;
        if (this.f30823a != null) {
            if (TextUtils.isEmpty(str2)) {
                hashMap = null;
            } else {
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("failedURL", str2);
                hashMap = hashMap2;
            }
            this.f30823a.mo76362a(enumC15542a, str, true, hashMap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        String uri = url != null ? url.toString() : "unknown";
        if (url != null && !TextUtils.isEmpty(url.getScheme()) && !TextUtils.isEmpty(url.getAuthority()) && !TextUtils.isEmpty(url.getHost()) && "FyRemote://".toLowerCase().contains(url.getScheme())) {
            HashMap m76536a = AbstractC15415F.m76536a(url);
            String host = url.getHost();
            InterfaceC15201a interfaceC15201a = this.f30824b;
            if (interfaceC15201a != null) {
                interfaceC15201a.mo76361a(host, m76536a);
            }
        }
        IAlog.m76529a("%s: shouldOverrideUrlLoading: url: %s", "RemoteUiWebViewClient", uri);
        return true;
    }
}
