package com.fyber.inneractive.sdk.measurement;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.IAlog;
import p978t3.WebViewRenderException;

/* renamed from: com.fyber.inneractive.sdk.measurement.f */
/* loaded from: classes4.dex */
public final class C14587f extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C14588g f27627a;

    public C14587f(C14588g c14588g) {
        this.f27627a = c14588g;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.m76525e("%s Resources to load: %s", "OMVideo", str);
        IAlog.m76526d("%s %s", "RESOURCES", str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        C14588g c14588g = this.f27627a;
        if (c14588g.f27628a != null) {
            IAlog.m76529a("%s destroy", "OMVideo");
            try {
                c14588g.f27628a.finish();
            } catch (Throwable th) {
                c14588g.m77784a(th);
            }
        }
        c14588g.f27629b = null;
        c14588g.f27628a = null;
        c14588g.f27630c = null;
        if (webView != null) {
            AbstractC15471s.m76465a(webView);
            webView.destroy();
        }
        return true;
    }
}
