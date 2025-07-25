package com.mbridge.msdk.newreward.player.view.hybrid.client;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.ironsource.C20517nb;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.same.p438c.CommonBitmapUtil;
import com.mbridge.msdk.foundation.same.p438c.CommonImageLoader;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.newreward.player.view.hybrid.MBWebView;
import com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MBHybridUtil;
import p978t3.WebViewRenderException;

/* loaded from: classes6.dex */
public class MBWebViewClient extends WebViewClient {
    private final String TAG = "MBWebViewClient";
    private WebViewEventListener mEventListener;

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        WebViewEventListener webViewEventListener = this.mEventListener;
        if (webViewEventListener != null) {
            webViewEventListener.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        WebViewEventListener webViewEventListener = this.mEventListener;
        if (webViewEventListener != null) {
            webViewEventListener.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        WebViewEventListener webViewEventListener = this.mEventListener;
        if (webViewEventListener != null) {
            webViewEventListener.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        SameLogTool.m51824b("MBWebViewClient", "WebView called onRenderProcessGone");
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof MBWebView) {
                    MBWebView mBWebView = (MBWebView) webView;
                    if (!mBWebView.isDestroyed()) {
                        mBWebView.destroy();
                    }
                } else {
                    webView.destroy();
                }
            } catch (Throwable th) {
                SameLogTool.m51824b("MBWebViewClient", th.getMessage());
                return true;
            }
        }
        WebViewEventListener webViewEventListener = this.mEventListener;
        if (webViewEventListener != null) {
            webViewEventListener.onRenderProcessGone(webView);
        }
        return true;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.mEventListener = webViewEventListener;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Bitmap m52262a;
        try {
            if (!TextUtils.isEmpty(str)) {
                String imageMimeType = MBHybridUtil.getImageMimeType(str);
                if (!TextUtils.isEmpty(imageMimeType) && (m52262a = CommonImageLoader.m52263a(MBSDKContext.m52746m().m52792c()).m52262a(str)) != null && !m52262a.isRecycled()) {
                    return new WebResourceResponse(imageMimeType, C20517nb.f52167N, CommonBitmapUtil.m52264a(m52262a));
                }
            }
        } catch (Throwable th) {
            SameLogTool.m51824b("MBWebViewClient", th.getMessage());
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewEventListener webViewEventListener = this.mEventListener;
        if (webViewEventListener != null) {
            return webViewEventListener.shouldOverrideUrlLoading(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        WebViewEventListener webViewEventListener = this.mEventListener;
        if (webViewEventListener != null) {
            webViewEventListener.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewEventListener webViewEventListener = this.mEventListener;
        if (webViewEventListener != null) {
            return webViewEventListener.shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
