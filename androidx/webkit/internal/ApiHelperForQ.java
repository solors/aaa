package androidx.webkit.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

@RequiresApi(29)
/* loaded from: classes2.dex */
public class ApiHelperForQ {
    private ApiHelperForQ() {
    }

    @DoNotInline
    @Deprecated
    public static int getForceDark(@NonNull WebSettings webSettings) {
        int forceDark;
        forceDark = webSettings.getForceDark();
        return forceDark;
    }

    @Nullable
    @DoNotInline
    public static WebViewRenderProcess getWebViewRenderProcess(@NonNull WebView webView) {
        WebViewRenderProcess webViewRenderProcess;
        webViewRenderProcess = webView.getWebViewRenderProcess();
        return webViewRenderProcess;
    }

    @Nullable
    @DoNotInline
    public static WebViewRenderProcessClient getWebViewRenderProcessClient(@NonNull WebView webView) {
        WebViewRenderProcessClient webViewRenderProcessClient;
        webViewRenderProcessClient = webView.getWebViewRenderProcessClient();
        return webViewRenderProcessClient;
    }

    @DoNotInline
    @Deprecated
    public static void setForceDark(@NonNull WebSettings webSettings, int i) {
        webSettings.setForceDark(i);
    }

    @DoNotInline
    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @NonNull Executor executor, @Nullable androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        webView.setWebViewRenderProcessClient(executor, webViewRenderProcessClient != null ? new WebViewRenderProcessClientFrameworkAdapter(webViewRenderProcessClient) : null);
    }

    @DoNotInline
    public static boolean terminate(@NonNull WebViewRenderProcess webViewRenderProcess) {
        boolean terminate;
        terminate = webViewRenderProcess.terminate();
        return terminate;
    }

    @DoNotInline
    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @Nullable androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        webView.setWebViewRenderProcessClient(webViewRenderProcessClient != null ? new WebViewRenderProcessClientFrameworkAdapter(webViewRenderProcessClient) : null);
    }
}
