package p872s2;

import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.helpshift.log.HSLogger;
import p752k3.ResourceCacheUtil;
import p840q2.WebviewAttachmentCallbackProxy;
import p856r2.HelpshiftResourceCacheManager;
import p978t3.WebViewRenderException;

/* renamed from: s2.d */
/* loaded from: classes5.dex */
public class HSChatWebViewClient extends WebViewClient {

    /* renamed from: a */
    private final HelpshiftResourceCacheManager f104053a;

    /* renamed from: b */
    private boolean f104054b;

    /* renamed from: c */
    private final WebviewAttachmentCallbackProxy f104055c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HSChatWebViewClient(HelpshiftResourceCacheManager helpshiftResourceCacheManager, WebviewAttachmentCallbackProxy webviewAttachmentCallbackProxy) {
        this.f104053a = helpshiftResourceCacheManager;
        this.f104055c = webviewAttachmentCallbackProxy;
    }

    /* renamed from: a */
    private void m12165a() {
        if (!this.f104054b) {
            this.f104053a.m12699c();
            this.f104054b = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (!"GET".equalsIgnoreCase(webResourceRequest.getMethod())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        m12165a();
        if (!this.f104053a.m12684r(webResourceRequest.getUrl().getPath())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        WebResourceResponse m18244a = ResourceCacheUtil.m18244a(this.f104053a, webResourceRequest);
        if (m18244a != null) {
            return m18244a;
        }
        WebResourceResponse shouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        if (shouldInterceptRequest != null) {
            HSLogger.m65441d("ChatWebClient", "Webview response received for request-" + webResourceRequest.toString() + " status:" + shouldInterceptRequest.getStatusCode() + " MimeType:" + shouldInterceptRequest.getMimeType());
        } else {
            HSLogger.m65439e("ChatWebClient", "Webview response error for request-" + webResourceRequest.getUrl());
        }
        return shouldInterceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f104055c.m12997d(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return true;
    }
}
