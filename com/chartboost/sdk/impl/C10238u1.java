package com.chartboost.sdk.impl;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.u1 */
/* loaded from: classes3.dex */
public final class C10238u1 extends C10182s3 {

    /* renamed from: c */
    public final InterfaceC9978j6 f23221c;

    /* renamed from: d */
    public final C10356x9 f23222d;

    /* renamed from: e */
    public boolean f23223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10238u1(InterfaceC9978j6 impressionInterface, C10356x9 gestureDetector, InterfaceC10212t3 callback, InterfaceC10045m4 eventTracker) {
        super(callback, eventTracker);
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(gestureDetector, "gestureDetector");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f23221c = impressionInterface;
        this.f23222d = gestureDetector;
    }

    /* renamed from: a */
    public final C10356x9 m80460a() {
        return this.f23222d;
    }

    /* renamed from: b */
    public final boolean m80459b(String str) {
        if (!this.f23223e) {
            C9763c7.m81919b("Attempt to open " + str + " detected before WebView loading finished.", null, 2, null);
            this.f23221c.mo81289d(new C10043m2(str, Boolean.FALSE));
            return true;
        } else if (this.f23222d.m80067a()) {
            this.f23221c.mo81291c(new C10043m2(str, Boolean.FALSE));
            this.f23222d.m80065b();
            return true;
        } else {
            return false;
        }
    }

    @Override // com.chartboost.sdk.impl.C10182s3, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f23223e = true;
    }

    @Override // com.chartboost.sdk.impl.C10182s3, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return m80459b(uri);
    }

    @Override // com.chartboost.sdk.impl.C10182s3, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return m80459b(url);
    }
}
