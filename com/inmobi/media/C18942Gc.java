package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;
import p978t3.WebViewRenderException;

/* renamed from: com.inmobi.media.Gc */
/* loaded from: classes6.dex */
public final class C18942Gc extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        Intrinsics.checkNotNullParameter(view, "view");
        return AbstractC18956Hc.m61043a(view, renderProcessGoneDetail, "safe_web_view");
    }
}
