package com.five_corp.p372ad.internal.view;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.five_corp.p372ad.internal.logger.C13836a;
import p978t3.WebViewRenderException;

/* renamed from: com.five_corp.ad.internal.view.k */
/* loaded from: classes4.dex */
public final class C14141k extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC14143m f26800a;

    /* renamed from: b */
    public final /* synthetic */ C13836a f26801b;

    public C14141k(InterfaceC14143m interfaceC14143m, C13836a c13836a) {
        this.f26800a = interfaceC14143m;
        this.f26801b = c13836a;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return AbstractC14144n.m78057a(webResourceRequest.getUrl(), this.f26800a, this.f26801b);
    }
}
