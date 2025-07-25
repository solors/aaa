package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p978t3.WebViewRenderException;

/* renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.b */
/* loaded from: classes6.dex */
public final class CommonWebViewClient extends WebViewClient {

    /* renamed from: a */
    private CopyOnWriteArrayList<WebViewClient> f57693a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public final void m51124a(WebViewClient webViewClient) {
        this.f57693a.add(webViewClient);
    }

    /* renamed from: b */
    public final void m51123b(WebViewClient webViewClient) {
        this.f57693a.remove(webViewClient);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().doUpdateVisitedHistory(webView, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        try {
            Iterator<WebViewClient> it = this.f57693a.iterator();
            while (it.hasNext()) {
                it.next().onPageCommitVisible(webView, str);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("CommonWebViewClient", e.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        try {
            Iterator<WebViewClient> it = this.f57693a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedClientCertRequest(webView, clientCertRequest);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("CommonWebViewClient", e.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            Iterator<WebViewClient> it = this.f57693a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("CommonWebViewClient", e.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<WebViewClient> it = this.f57693a.iterator();
                while (it.hasNext()) {
                    z = it.next().onRenderProcessGone(webView, renderProcessGoneDetail);
                }
            }
        } catch (Exception e) {
            SameLogTool.m51824b("CommonWebViewClient", e.getMessage());
        }
        return z;
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                Iterator<WebViewClient> it = this.f57693a.iterator();
                while (it.hasNext()) {
                    it.next().onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                }
            }
        } catch (Exception e) {
            SameLogTool.m51824b("CommonWebViewClient", e.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        while (it.hasNext()) {
            it.next().onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        WebResourceResponse webResourceResponse = null;
        while (it.hasNext()) {
            webResourceResponse = it.next().shouldInterceptRequest(webView, str);
        }
        return webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = it.next().shouldOverrideKeyEvent(webView, keyEvent);
        }
        return z;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f57693a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            boolean shouldOverrideUrlLoading = it.next().shouldOverrideUrlLoading(webView, str);
            if (shouldOverrideUrlLoading) {
                z = shouldOverrideUrlLoading;
            }
        }
        return z;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            Iterator<WebViewClient> it = this.f57693a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedError(webView, webResourceRequest, webResourceError);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("CommonWebViewClient", e.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse = null;
        try {
            Iterator<WebViewClient> it = this.f57693a.iterator();
            while (it.hasNext()) {
                webResourceResponse = it.next().shouldInterceptRequest(webView, webResourceRequest);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("CommonWebViewClient", e.getMessage());
        }
        return webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z = false;
        try {
            Iterator<WebViewClient> it = this.f57693a.iterator();
            while (it.hasNext()) {
                boolean shouldOverrideUrlLoading = it.next().shouldOverrideUrlLoading(webView, webResourceRequest);
                if (shouldOverrideUrlLoading) {
                    z = shouldOverrideUrlLoading;
                }
            }
        } catch (Exception e) {
            SameLogTool.m51824b("CommonWebViewClient", e.getMessage());
        }
        return z;
    }
}
