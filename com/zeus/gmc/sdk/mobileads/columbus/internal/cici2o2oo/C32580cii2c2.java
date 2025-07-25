package com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.ByteArrayInputStream;
import java.util.Locale;
import p978t3.WebViewRenderException;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.cii2c2 */
/* loaded from: classes8.dex */
public class C32580cii2c2 extends WebViewClient {
    private static final String c2oc2i = "javascript:" + C32575c2oc2o.coo2iico;
    private static final String coi222o222 = "mraid.js";
    private static final String coo2iico = "MraidWebViewClient";

    @VisibleForTesting
    boolean coo2iico(@NonNull String str) {
        return "mraid.js".equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment());
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(@NonNull WebView webView, @NonNull String str) {
        if (coo2iico(str)) {
            MLog.m25892d(coo2iico, "mraid js matched!");
            return coo2iico();
        }
        return super.shouldInterceptRequest(webView, str);
    }

    private WebResourceResponse coo2iico() {
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(c2oc2i.getBytes()));
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (coo2iico(webResourceRequest.getUrl().toString())) {
            MLog.m25892d(coo2iico, "panda +++mraid js matched!");
            return coo2iico();
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
