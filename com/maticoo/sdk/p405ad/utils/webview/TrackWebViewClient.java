package com.maticoo.sdk.p405ad.utils.webview;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.maticoo.sdk.p405ad.utils.GpUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import p978t3.WebViewRenderException;

/* renamed from: com.maticoo.sdk.ad.utils.webview.TrackWebViewClient */
/* loaded from: classes6.dex */
public class TrackWebViewClient extends WebViewClient {
    private static final String EMPTY_CONTENT = "about:blank";

    public TrackWebViewClient() {
        DeveloperLog.LogD("TrackWebViewClient:: Init");
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        DeveloperLog.LogD(String.format("TrackWebViewClient::onPageFinished %s", str));
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        DeveloperLog.LogD(String.format("TrackWebViewClient::onPageStarted %s", str));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        if (webView != null && webView.getParent() != null && (webView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) webView.getParent()).removeView(webView);
            webView.destroy();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        DeveloperLog.LogD(String.format("TrackWebViewClient::shouldOverrideUrlLoading %s", str));
        if (TextUtils.equals("about:blank", str)) {
            webView.stopLoading();
            webView.destroy();
            return true;
        } else if (GpUtil.isGp(str)) {
            DeveloperLog.LogD(String.format("TrackWebViewClient::beforeOpen isGp %s", str));
            return true;
        } else if (GpUtil.isDeepLinkUrl(str)) {
            DeveloperLog.LogD(hashCode() + "   " + String.format("TrackWebViewClient::beforeOpen isDeeplink %s", str));
            return true;
        } else {
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
