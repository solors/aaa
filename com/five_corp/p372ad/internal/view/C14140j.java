package com.five_corp.p372ad.internal.view;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.five_corp.p372ad.internal.logger.C13836a;
import p978t3.WebViewRenderException;

/* renamed from: com.five_corp.ad.internal.view.j */
/* loaded from: classes4.dex */
public final class C14140j extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC14143m f26798a;

    /* renamed from: b */
    public final /* synthetic */ C13836a f26799b;

    public C14140j(InterfaceC14143m interfaceC14143m, C13836a c13836a) {
        this.f26798a = interfaceC14143m;
        this.f26799b = c13836a;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return AbstractC14144n.m78057a(Uri.parse(str), this.f26798a, this.f26799b);
    }
}
