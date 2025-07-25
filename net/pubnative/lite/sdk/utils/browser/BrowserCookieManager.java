package net.pubnative.lite.sdk.utils.browser;

import android.webkit.CookieManager;
import android.webkit.WebView;

/* loaded from: classes10.dex */
public class BrowserCookieManager {
    private final CookieManager cookieManager;

    public BrowserCookieManager(CookieManager cookieManager) {
        if (cookieManager != null) {
            this.cookieManager = cookieManager;
            return;
        }
        throw new NullPointerException("CookieManager can not be null");
    }

    public void setupCookiePolicy(WebView webView) {
        if (webView != null) {
            this.cookieManager.setAcceptThirdPartyCookies(webView, true);
            return;
        }
        throw new NullPointerException("WebView can not be null");
    }
}
