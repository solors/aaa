package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p978t3.WebViewRenderException;

/* renamed from: com.fyber.inneractive.sdk.measurement.tracker.c */
/* loaded from: classes4.dex */
public final class C14594c extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ AbstractC14597f f27644a;

    public C14594c(AbstractC14597f abstractC14597f) {
        this.f27644a = abstractC14597f;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        this.f27644a.m77776a(true);
        return true;
    }
}
