package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p978t3.WebViewRenderException;

/* loaded from: classes8.dex */
public class ie0 extends WebViewClient {
    @NotNull

    /* renamed from: a */
    private final je0 f80437a;
    @NotNull

    /* renamed from: b */
    private final be2 f80438b;

    public /* synthetic */ ie0(je0 je0Var) {
        this(je0Var, so1.m29571b());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(view, url);
        this.f80437a.mo30550a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@NotNull WebView view, int i, @NotNull String description, @NotNull String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        this.f80437a.mo30549a(i);
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"WebViewClientOnReceivedSslError"})
    public final void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        be2 be2Var = this.f80438b;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (be2Var.mo35239a(context, error)) {
            handler.proceed();
            return;
        }
        this.f80437a.mo30549a(-11);
        super.onReceivedSslError(view, handler, error);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@Nullable WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        je0 je0Var = this.f80437a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        je0Var.mo30793a(context, url);
        return true;
    }

    public ie0(@NotNull je0 webViewClientListener, @NotNull be2 webViewSslErrorHandler) {
        Intrinsics.checkNotNullParameter(webViewClientListener, "webViewClientListener");
        Intrinsics.checkNotNullParameter(webViewSslErrorHandler, "webViewSslErrorHandler");
        this.f80437a = webViewClientListener;
        this.f80438b = webViewSslErrorHandler;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @NotNull WebResourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f80437a.mo30549a(error.getErrorCode());
    }
}
