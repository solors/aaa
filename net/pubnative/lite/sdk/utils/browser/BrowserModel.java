package net.pubnative.lite.sdk.utils.browser;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.browser.BaseWebChromeClient;
import net.pubnative.lite.sdk.utils.browser.BaseWebViewClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public class BrowserModel {
    private static final String TAG = "BrowserModel";
    private Callback browserModelCallback;
    private final BrowserCookieManager cookieManager;
    private String lastKnownUrl;
    private final BaseWebChromeClient webChromeClient;
    private final BaseWebChromeClient.WebChromeClientCallback webChromeClientCallback;
    private WebView webView;
    private final BaseWebViewClient webViewClient;
    private final BaseWebViewClient.WebViewClientCallback webViewClientCallback;

    /* loaded from: classes10.dex */
    public interface Callback {
        void onGeneralError(int i, String str, String str2);

        @TargetApi(23)
        void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

        void onPageNavigationStackChanged(boolean z, boolean z2);

        void onProgressChanged(int i);

        @TargetApi(26)
        void onRenderProcessGone();

        void onUrlLoadingStarted(String str);

        boolean shouldOverrideUrlLoading(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BrowserModel(BaseWebViewClient baseWebViewClient, BaseWebChromeClient baseWebChromeClient, BrowserCookieManager browserCookieManager) {
        BaseWebChromeClient.WebChromeClientCallback webChromeClientCallback = new BaseWebChromeClient.WebChromeClientCallback() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserModel.1
            @Override // net.pubnative.lite.sdk.utils.browser.BaseWebChromeClient.WebChromeClientCallback
            public void onProgressChanged(int i) {
                if (BrowserModel.this.browserModelCallback != null) {
                    BrowserModel.this.browserModelCallback.onProgressChanged(i);
                    if (BrowserModel.this.webView != null) {
                        BrowserModel.this.browserModelCallback.onPageNavigationStackChanged(BrowserModel.this.webView.canGoBack(), BrowserModel.this.webView.canGoForward());
                    }
                }
            }
        };
        this.webChromeClientCallback = webChromeClientCallback;
        WebViewClientCallbackAdapter webViewClientCallbackAdapter = new WebViewClientCallbackAdapter() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserModel.2
            @Override // net.pubnative.lite.sdk.utils.browser.WebViewClientCallbackAdapter, net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
            public void onGeneralError(int i, String str, String str2) {
                String str3 = BrowserModel.TAG;
                Logger.m14227e(str3, "onGeneralError. Errorcode " + i + " Description: " + str);
                if (BrowserModel.this.browserModelCallback != null) {
                    BrowserModel.this.browserModelCallback.onGeneralError(i, str, str2);
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.WebViewClientCallbackAdapter, net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
            public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                String str = BrowserModel.TAG;
                Logger.m14227e(str, "onHttpError: " + webResourceResponse.toString());
                if (BrowserModel.this.browserModelCallback != null) {
                    BrowserModel.this.browserModelCallback.onHttpError(webResourceRequest, webResourceResponse);
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.WebViewClientCallbackAdapter, net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
            public void onPageStartedLoading(String str) {
                BrowserModel.this.lastKnownUrl = str;
                if (BrowserModel.this.browserModelCallback != null) {
                    BrowserModel.this.browserModelCallback.onUrlLoadingStarted(str);
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.WebViewClientCallbackAdapter, net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
            public void onRenderProcessGone() {
                Logger.m14227e(BrowserModel.TAG, "WebView's render process has exited");
                if (BrowserModel.this.browserModelCallback != null) {
                    BrowserModel.this.browserModelCallback.onRenderProcessGone();
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.WebViewClientCallbackAdapter, net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
            public boolean shouldOverrideUrlLoading(String str) {
                if (BrowserModel.this.browserModelCallback != null) {
                    return BrowserModel.this.browserModelCallback.shouldOverrideUrlLoading(str);
                }
                return false;
            }
        };
        this.webViewClientCallback = webViewClientCallbackAdapter;
        if (baseWebViewClient != null) {
            this.webViewClient = baseWebViewClient;
            if (baseWebChromeClient != null) {
                this.webChromeClient = baseWebChromeClient;
                if (browserCookieManager != null) {
                    this.cookieManager = browserCookieManager;
                    baseWebViewClient.setWebViewClientCallback(webViewClientCallbackAdapter);
                    baseWebChromeClient.setWebChromeClientCallback(webChromeClientCallback);
                    return;
                }
                throw new NullPointerException("BrowserModel: cookieManager can not be null");
            }
            throw new NullPointerException("BrowserModel: webChromeClient can not be null");
        }
        throw new NullPointerException("BrowserModel: webViewClient can not be null");
    }

    public String getCurrentUrl() {
        if (this.lastKnownUrl == null) {
            Logger.m14227e(TAG, "Internal error: loadUrl() was not called");
        }
        return this.lastKnownUrl;
    }

    public void goBack() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.goBack();
        }
    }

    public void goForward() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.goForward();
        }
    }

    public void load(String str) {
        if (str != null) {
            this.lastKnownUrl = str;
            WebView webView = this.webView;
            if (webView != null) {
                webView.loadUrl(str);
            }
        }
        this.lastKnownUrl = str;
    }

    public void pause() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public void reload() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.reload();
        }
    }

    public void resume() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
    }

    public void setBrowserModelCallback(Callback callback) {
        this.browserModelCallback = callback;
    }

    public void setWebView(WebView webView) {
        if (webView != null) {
            this.webView = webView;
            webView.setWebViewClient(this.webViewClient);
            webView.setWebChromeClient(this.webChromeClient);
            this.cookieManager.setupCookiePolicy(webView);
            return;
        }
        throw new NullPointerException("BrowserModel: Parameter webView cannot be null");
    }
}
