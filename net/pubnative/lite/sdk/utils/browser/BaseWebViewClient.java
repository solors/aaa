package net.pubnative.lite.sdk.utils.browser;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Locale;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.browser.BrowserActivity;
import p978t3.WebViewRenderException;

/* loaded from: classes10.dex */
public class BaseWebViewClient extends WebViewClient {
    private static final String TAG = "net.pubnative.lite.sdk.utils.browser.BaseWebViewClient";
    private WebViewClientCallback webViewClientCallback;
    private final BrowserActivity.WebViewCloseListener webViewCloseListener;

    /* loaded from: classes10.dex */
    public interface WebViewClientCallback {
        void onGeneralError(int i, String str, String str2);

        @TargetApi(23)
        void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

        void onPageFinishedLoading(String str);

        void onPageStartedLoading(String str);

        @TargetApi(26)
        void onRenderProcessGone();

        boolean shouldOverrideUrlLoading(String str);
    }

    public BaseWebViewClient(BrowserActivity.WebViewCloseListener webViewCloseListener) {
        this.webViewCloseListener = webViewCloseListener;
    }

    private boolean shouldOverrideUrlLoadingInternal(String str) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback == null) {
            return false;
        }
        return webViewClientCallback.shouldOverrideUrlLoading(str);
    }

    public boolean forceHandleDeepLink(Uri uri, WebView webView) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        try {
            webView.getContext().startActivity(intent);
            return true;
        } catch (RuntimeException e) {
            Logger.m14227e(TAG, e.getMessage());
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback != null) {
            webViewClientCallback.onPageFinishedLoading(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback != null) {
            webViewClientCallback.onPageStartedLoading(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback != null) {
            webViewClientCallback.onGeneralError(i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback != null) {
            webViewClientCallback.onHttpError(webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback != null) {
            webViewClientCallback.onRenderProcessGone();
            return true;
        }
        return false;
    }

    public void setWebViewClientCallback(WebViewClientCallback webViewClientCallback) {
        this.webViewClientCallback = webViewClientCallback;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return shouldOverrideUrlLoadingInternal(str);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        BrowserActivity.WebViewCloseListener webViewCloseListener;
        BrowserActivity.WebViewCloseListener webViewCloseListener2;
        Uri parse = Uri.parse(webResourceRequest.getUrl().toString());
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String lowerCase = parse.toString().toLowerCase(Locale.ROOT);
        if (SDKConstants.PARAM_INTENT.equalsIgnoreCase(scheme)) {
            return true;
        }
        if (!"play.google.com".equalsIgnoreCase(host) && !"market.android.com".equalsIgnoreCase(host) && !ApsAdWebViewSupportClient.MARKET_SCHEME.equalsIgnoreCase(scheme) && !lowerCase.startsWith("play.google.com") && !lowerCase.startsWith("market.android.com/")) {
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                if (forceHandleDeepLink(parse, webView) && (webViewCloseListener2 = this.webViewCloseListener) != null) {
                    webViewCloseListener2.onWebViewCloseRequested();
                }
                return true;
            }
            return shouldOverrideUrlLoadingInternal(webResourceRequest.getUrl().toString());
        }
        String queryParameter = parse.getQueryParameter("id");
        if (queryParameter != null) {
            boolean forceHandleDeepLink = forceHandleDeepLink(Uri.parse("market://details?id=" + queryParameter), webView);
            if (forceHandleDeepLink && (webViewCloseListener = this.webViewCloseListener) != null) {
                webViewCloseListener.onWebViewCloseRequested();
            }
            return forceHandleDeepLink;
        }
        return forceHandleDeepLink(parse, webView);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClientCallback webViewClientCallback = this.webViewClientCallback;
        if (webViewClientCallback != null) {
            webViewClientCallback.onGeneralError(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }
}
