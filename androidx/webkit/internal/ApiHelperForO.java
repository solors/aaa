package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes2.dex */
public class ApiHelperForO {
    private ApiHelperForO() {
    }

    @NonNull
    @DoNotInline
    public static PackageInfo getCurrentWebViewPackage() {
        PackageInfo currentWebViewPackage;
        currentWebViewPackage = WebView.getCurrentWebViewPackage();
        return currentWebViewPackage;
    }

    @DoNotInline
    public static boolean getSafeBrowsingEnabled(@NonNull WebSettings webSettings) {
        boolean safeBrowsingEnabled;
        safeBrowsingEnabled = webSettings.getSafeBrowsingEnabled();
        return safeBrowsingEnabled;
    }

    @Nullable
    @DoNotInline
    public static WebChromeClient getWebChromeClient(@NonNull WebView webView) {
        WebChromeClient webChromeClient;
        webChromeClient = webView.getWebChromeClient();
        return webChromeClient;
    }

    @Nullable
    @DoNotInline
    public static WebViewClient getWebViewClient(@NonNull WebView webView) {
        WebViewClient webViewClient;
        webViewClient = webView.getWebViewClient();
        return webViewClient;
    }

    @DoNotInline
    public static void setSafeBrowsingEnabled(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }
}
