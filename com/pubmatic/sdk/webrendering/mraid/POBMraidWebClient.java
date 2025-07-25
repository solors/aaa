package com.pubmatic.sdk.webrendering.mraid;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.webrendering.p566ui.POBHTMLViewClient;
import com.vungle.ads.internal.Constants;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* loaded from: classes7.dex */
public class POBMraidWebClient extends POBHTMLViewClient {
    /* JADX INFO: Access modifiers changed from: package-private */
    public POBMraidWebClient(@NonNull POBHTMLViewClient.OnRenderProcessGoneListener onRenderProcessGoneListener) {
        super(onRenderProcessGoneListener);
    }

    @Nullable
    /* renamed from: a */
    private WebResourceResponse m39878a(Context context) {
        String mraidJs = POBInstanceProvider.getCacheManager(context).getMraidJs();
        if (mraidJs != null) {
            return new WebResourceResponse("text/javascript", StandardCharsets.UTF_8.name(), new ByteArrayInputStream(("javascript:" + mraidJs).getBytes()));
        }
        return null;
    }

    /* renamed from: b */
    private boolean m39877b(String str) {
        return Constants.AD_MRAID_JS_FILE_NAME.equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (m39877b(str)) {
            POBLog.debug("POBMraidWebClient", "Injecting MRAID in webView via url", new Object[0]);
            WebResourceResponse m39878a = m39878a(webView.getContext());
            return m39878a != null ? m39878a : super.shouldInterceptRequest(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (m39877b(webResourceRequest.getUrl().toString())) {
            POBLog.debug("POBMraidWebClient", "Injecting MRAID in webView via request", new Object[0]);
            WebResourceResponse m39878a = m39878a(webView.getContext());
            return m39878a != null ? m39878a : super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
