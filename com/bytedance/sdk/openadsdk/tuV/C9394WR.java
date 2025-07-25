package com.bytedance.sdk.openadsdk.tuV;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: com.bytedance.sdk.openadsdk.tuV.WR */
/* loaded from: classes3.dex */
public class C9394WR {
    /* renamed from: IL */
    private static void m82807IL(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            C9423iR.m82732bg("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    /* renamed from: bg */
    private static void m82806bg(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            C9423iR.m82732bg("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    /* renamed from: bg */
    public static void m82805bg(WebView webView) {
        if (webView == null) {
            return;
        }
        m82807IL(webView);
        WebSettings settings = webView.getSettings();
        m82806bg(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th) {
            C9423iR.m82732bg("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th2) {
            C9423iR.m82732bg("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        int i = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z = i >= 28;
        try {
        } catch (Throwable th3) {
            C9423iR.m82732bg("WebViewSettings", "setLayerType error", th3);
        }
        if (!z) {
            webView.setLayerType(0, null);
        } else {
            if (z) {
                webView.setLayerType(2, null);
            }
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}
