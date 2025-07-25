package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.chartboost.sdk.impl.p2 */
/* loaded from: classes3.dex */
public class C10110p2 extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10110p2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final void m80861a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
    }

    @Override // android.webkit.WebView
    @SuppressLint({"SetJavaScriptEnabled"})
    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        m80861a();
    }
}
