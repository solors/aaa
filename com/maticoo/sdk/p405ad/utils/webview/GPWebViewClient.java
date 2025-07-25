package com.maticoo.sdk.p405ad.utils.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.maticoo.sdk.p405ad.utils.GpUtil;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.countdown.Countdown;
import com.maticoo.sdk.utils.countdown.CountdownListener;
import com.maticoo.sdk.utils.log.DeveloperLog;
import p978t3.WebViewRenderException;

/* renamed from: com.maticoo.sdk.ad.utils.webview.GPWebViewClient */
/* loaded from: classes6.dex */
public class GPWebViewClient extends WebViewClient implements CountdownListener {
    private String current302Url;
    private final FinishListener finishListener;
    private boolean isFinished = false;
    private WebViewUrlMonitor monitor;
    private long startTime;
    private final Countdown timeOutUtils;

    /* renamed from: com.maticoo.sdk.ad.utils.webview.GPWebViewClient$FinishListener */
    /* loaded from: classes6.dex */
    public interface FinishListener {
        void finish(boolean z);
    }

    public GPWebViewClient(String str, FinishListener finishListener) {
        Countdown countdown = new Countdown();
        this.timeOutUtils = countdown;
        this.startTime = System.currentTimeMillis();
        this.current302Url = str;
        this.finishListener = finishListener;
        countdown.setListener(this);
    }

    private void over(boolean z) {
        DeveloperLog.LogD("GPWebViewClient::over,intervalTime=" + (System.currentTimeMillis() - this.startTime));
        this.isFinished = true;
        this.timeOutUtils.pauseCountDown();
        FinishListener finishListener = this.finishListener;
        if (finishListener != null) {
            finishListener.finish(z);
        }
        WebViewUrlMonitor webViewUrlMonitor = this.monitor;
        if (webViewUrlMonitor != null) {
            if (z) {
                webViewUrlMonitor.loadSuccess();
            } else {
                webViewUrlMonitor.timeOut();
            }
        }
        if (!z) {
            GpUtil.startWithExternalBrowser(ApplicationUtil.getInstance().getApplicationContext(), this.current302Url);
        }
    }

    private boolean tryHandleClick(WebView webView, String str) {
        if (GpUtil.isGp(str)) {
            DeveloperLog.LogD(String.format("GPWebViewClient::beforeOpen isGp %s", str));
            WebViewUrlMonitor webViewUrlMonitor = this.monitor;
            if (webViewUrlMonitor != null) {
                webViewUrlMonitor.setUrl200(str);
            }
            over(GpUtil.openGooglePlay(webView.getContext(), str));
            return true;
        } else if (!GpUtil.isDeepLinkUrl(str)) {
            return false;
        } else {
            DeveloperLog.LogD(String.format("GPWebViewClient::beforeOpen isDeeplink %s", str));
            WebViewUrlMonitor webViewUrlMonitor2 = this.monitor;
            if (webViewUrlMonitor2 != null) {
                webViewUrlMonitor2.setUrl200(str);
            }
            over(GpUtil.openDeepLink(webView.getContext(), str));
            return true;
        }
    }

    @Override // com.maticoo.sdk.utils.countdown.CountdownListener
    public void onCountdown(int i, long j) {
        if (i == 3 && !this.isFinished) {
            over(false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        DeveloperLog.LogD(String.format("GPWebViewClient::onPageFinished webViewId=%s,url=%s", String.valueOf(hashCode()), str));
        WebViewUrlMonitor webViewUrlMonitor = this.monitor;
        if (webViewUrlMonitor != null) {
            webViewUrlMonitor.setUrl200(str);
        }
        if (!tryHandleClick(webView, str)) {
            GpUtil.startWithExternalBrowser(ApplicationUtil.getInstance().getApplicationContext(), str);
            over(true);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        DeveloperLog.LogD(String.format("GPWebViewClient::onPageStarted,webViewId=%s,url=%s", String.valueOf(hashCode()), str));
        if (this.isFinished) {
            return;
        }
        WebViewUrlMonitor webViewUrlMonitor = this.monitor;
        if (webViewUrlMonitor != null) {
            webViewUrlMonitor.setUrl302(str);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.cancel();
        over(false);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        if (webView != null && webView.getParent() != null && (webView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) webView.getParent()).removeView(webView);
            webView.destroy();
        }
        over(false);
        return true;
    }

    public void setMonitor(WebViewUrlMonitor webViewUrlMonitor) {
        this.monitor = webViewUrlMonitor;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        DeveloperLog.LogD(String.format("GPWebViewClient::shouldOverrideUrlLoading %s", str));
        if (this.isFinished || tryHandleClick(webView, str)) {
            return true;
        }
        this.current302Url = str;
        return false;
    }

    public void startTimer(int i) {
        this.timeOutUtils.starCountDown(i);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        DeveloperLog.LogD(String.format("GPWebViewClient::shouldOverrideUrlLoading,222 %s", webResourceRequest));
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
