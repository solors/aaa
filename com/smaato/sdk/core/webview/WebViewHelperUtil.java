package com.smaato.sdk.core.webview;

import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.util.Objects;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* loaded from: classes7.dex */
public final class WebViewHelperUtil {

    /* renamed from: com.smaato.sdk.core.webview.WebViewHelperUtil$a */
    /* loaded from: classes7.dex */
    class C27327a extends WebViewClientCallbackAdapter {

        /* renamed from: a */
        final /* synthetic */ WebView f72021a;

        C27327a(WebView webView) {
            this.f72021a = webView;
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onPageFinishedLoading(@NonNull String str) {
            if (AndroidWebViewClient.BLANK_PAGE.equals(str)) {
                Log.d(LogDomain.CORE.name(), "going to release web-view");
                WebViewHelperUtil.destroyWebViewSafely(this.f72021a);
            }
        }
    }

    private WebViewHelperUtil() {
    }

    @VisibleForTesting
    static void destroyWebViewSafely(@NonNull WebView webView) {
        Objects.requireNonNull(webView, "Parameter webView cannot be null for WebViewHelperUtil::destroyWebViewSafely");
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.removeAllViews();
        webView.destroy();
    }

    @NonNull
    public static String getCenterContentCss() {
        return "display: flex;align-items: center;justify-content: center;";
    }

    public static void resetAndDestroyWebViewSafely(@NonNull WebView webView) {
        Objects.requireNonNull(webView);
        webView.stopLoading();
        BaseWebViewClient baseWebViewClient = new BaseWebViewClient();
        baseWebViewClient.setWebViewClientCallback(new C27327a(webView));
        webView.setWebViewClient(baseWebViewClient);
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }
}
