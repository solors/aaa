package com.maticoo.sdk.p405ad.utils.webview;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.maticoo.sdk.bean.AdBean;
import com.maticoo.sdk.p405ad.utils.GpUtil;
import com.maticoo.sdk.utils.SdkUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import p978t3.WebViewRenderException;

/* renamed from: com.maticoo.sdk.ad.utils.webview.BaseWebViewClient */
/* loaded from: classes6.dex */
public class BaseWebViewClient extends WebViewClient {
    private long lastClickTime = 0;

    public boolean handleUrlLoading(WebView webView, String str, AdBean adBean) {
        DeveloperLog.LogE("shouldOverrideUrlLoading url = " + str);
        boolean isInternalHost = SdkUtil.isInternalHost(str);
        boolean isAcceptedScheme = SdkUtil.isAcceptedScheme(str);
        DeveloperLog.LogE("shouldOverrideUrlLoading isInternalHost = " + isInternalHost + "  isAcceptedScheme = " + isAcceptedScheme);
        if (isInternalHost && isAcceptedScheme) {
            webView.loadUrl(str);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastClickTime < 1000) {
            return false;
        }
        this.lastClickTime = currentTimeMillis;
        if (WebUtil.checkRedirectAndReport(webView, adBean, str)) {
            return false;
        }
        GpUtil.openUrl(webView.getContext().getApplicationContext(), str, adBean);
        return true;
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
        DeveloperLog.LogD("BaseWebViewClient shouldOverrideUrlLoading url = " + str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAttachedToWindow(WebView webView) {
    }
}
