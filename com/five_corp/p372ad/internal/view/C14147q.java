package com.five_corp.p372ad.internal.view;

import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.five_corp.p372ad.internal.view.C14147q;
import p978t3.WebViewRenderException;

/* renamed from: com.five_corp.ad.internal.view.q */
/* loaded from: classes4.dex */
public final class C14147q extends WebViewClient {
    /* renamed from: a */
    public static /* synthetic */ void m78055a(WebView webView) {
        AbstractC14130I.m78064a(webView);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        String str = DialogFragmentC14148r.f26807a;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: f2.b
            @Override // java.lang.Runnable
            public final void run() {
                C14147q.m78055a(webView);
            }
        });
        return true;
    }
}
