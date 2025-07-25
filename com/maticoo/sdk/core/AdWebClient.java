package com.maticoo.sdk.core;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import com.maticoo.sdk.bean.AdBean;
import com.maticoo.sdk.p405ad.utils.webview.BaseWebViewClient;
import com.maticoo.sdk.p405ad.utils.webview.JsBridge;
import com.maticoo.sdk.p405ad.utils.webview.WebUtil;
import com.maticoo.sdk.utils.HandlerUtil;
import com.maticoo.sdk.utils.ResUtil;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;

/* loaded from: classes6.dex */
public class AdWebClient extends BaseWebViewClient {
    private static final String TAG = "AdWebClient";
    private AdBean mAdBean;
    private final Handler mHandler;

    @MainThread
    /* loaded from: classes6.dex */
    public interface Handler {
        void webViewBigFailed(WebView webView, String str);

        void webViewExposureChange(WebView webView, boolean z);

        void webViewOnClick(WebView webView);

        void webViewPageFinished(WebView webView);

        void webViewPageStarted(WebView webView);

        void webViewReceivedError(WebView webView, int i, String str, String str2);
    }

    public AdWebClient(Handler handler, AdBean adBean) {
        this.mHandler = handler;
        this.mAdBean = adBean;
    }

    private void callbackH5Click(WebView webView) {
        webViewOnClick(webView);
    }

    private void webViewExposureChange(final WebView webView, final boolean z) {
        if (this.mHandler == null) {
            return;
        }
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.core.AdWebClient.4
            @Override // java.lang.Runnable
            public void run() {
                AdWebClient.this.mHandler.webViewExposureChange(webView, z);
            }
        });
    }

    private void webViewOnClick(final WebView webView) {
        if (this.mHandler == null) {
            return;
        }
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.core.AdWebClient.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdWebClient.this.mHandler.webViewOnClick(webView);
                } catch (Exception e) {
                    CrashUtil.getSingleton().reportSDKException(e, "callbackH5Click");
                }
            }
        });
    }

    private void webViewPageFinished(final WebView webView) {
        if (this.mHandler == null) {
            return;
        }
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.core.AdWebClient.2
            @Override // java.lang.Runnable
            public void run() {
                AdWebClient.this.mHandler.webViewPageFinished(webView);
            }
        });
    }

    private void webViewPageStarted(final WebView webView) {
        if (this.mHandler == null) {
            return;
        }
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.core.AdWebClient.1
            @Override // java.lang.Runnable
            public void run() {
                AdWebClient.this.mHandler.webViewPageStarted(webView);
            }
        });
    }

    private void webViewReceivedError(final WebView webView, final int i, final String str, final String str2) {
        if (this.mHandler == null) {
            return;
        }
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.core.AdWebClient.3
            @Override // java.lang.Runnable
            public void run() {
                AdWebClient.this.mHandler.webViewReceivedError(webView, i, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.maticoo.sdk.p405ad.utils.webview.BaseWebViewClient
    public void onAttachedToWindow(WebView webView) {
        super.onAttachedToWindow(webView);
        webViewExposureChange(webView, webView.isShown());
        webView.requestFocus();
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        webViewPageFinished(webView);
        WebUtil.loadJsCode(JsBridge.JS_ON_LOAD, webView);
        webView.setFocusableInTouchMode(true);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        WebUtil.loadJsCode(JsBridge.JS_ON_LOAD, webView);
        webViewPageStarted(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        DeveloperLog.LogD(TAG, "onReceivedError  description=" + str);
        webViewReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String uri = webResourceRequest.getUrl().toString();
        int statusCode = webResourceResponse.getStatusCode();
        if (webResourceRequest.isForMainFrame() && statusCode == 431) {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.webViewBigFailed(webView, uri);
        }
        DeveloperLog.LogD(TAG, "onReceivedHttpError, 2 errorResponse = " + webResourceResponse.toString() + ", url" + uri);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        if (sslError != null) {
            str = sslError.toString();
        } else {
            str = "";
        }
        DeveloperLog.LogD("onReceivedSslError error" + str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        WebResourceResponse shouldInterceptRequest = ResUtil.shouldInterceptRequest(webView, str);
        if (shouldInterceptRequest != null) {
            DeveloperLog.LogD("1shouldInterceptRequest result url:" + str + " cost " + (System.currentTimeMillis() - currentTimeMillis) + "   response = " + shouldInterceptRequest);
        }
        if (shouldInterceptRequest == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        return shouldInterceptRequest;
    }

    @Override // com.maticoo.sdk.p405ad.utils.webview.BaseWebViewClient, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        DeveloperLog.LogE("shouldOverrideUrlLoading url = " + str);
        if (super.shouldOverrideUrlLoading(webView, str)) {
            return true;
        }
        try {
            if (handleUrlLoading(webView, str, this.mAdBean)) {
                callbackH5Click(webView);
            }
        } catch (Exception e) {
            DeveloperLog.LogE("shouldOverrideUrlLoading error: ", e);
            CrashUtil.getSingleton().reportSDKException(e, "AdsActivity_AdWebClient");
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }
}
