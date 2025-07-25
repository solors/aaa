package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.vungle.ads.internal.Constants;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class sz0 extends ie0 {
    @Nullable

    /* renamed from: c */
    private String f85451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(@NotNull je0 webViewClientListener) {
        super(webViewClientListener);
        Intrinsics.checkNotNullParameter(webViewClientListener, "webViewClientListener");
    }

    /* renamed from: a */
    public final void m29342a(@Nullable String str) {
        this.f85451c = str;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Uri url;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String str = this.f85451c;
        if (str != null && str.length() > 0 && (url = request.getUrl()) != null && Intrinsics.m17075f(Constants.AD_MRAID_JS_FILE_NAME, url.getLastPathSegment())) {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
        }
        return super.shouldInterceptRequest(view, request);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return super.shouldInterceptRequest(view, url);
    }
}
