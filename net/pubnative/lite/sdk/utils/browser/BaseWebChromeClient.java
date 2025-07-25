package net.pubnative.lite.sdk.utils.browser;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes10.dex */
public class BaseWebChromeClient extends WebChromeClient {
    private WebChromeClientCallback webChromeClientCallback;

    /* loaded from: classes10.dex */
    public interface WebChromeClientCallback {
        void onProgressChanged(int i);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        WebChromeClientCallback webChromeClientCallback = this.webChromeClientCallback;
        if (webChromeClientCallback != null) {
            webChromeClientCallback.onProgressChanged(i);
        }
    }

    public void setWebChromeClientCallback(WebChromeClientCallback webChromeClientCallback) {
        this.webChromeClientCallback = webChromeClientCallback;
    }
}
