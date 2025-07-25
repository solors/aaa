package com.inmobi.media;

import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.A8 */
/* loaded from: classes6.dex */
public final class RunnableC18854A8 implements Runnable {

    /* renamed from: a */
    public final WeakReference f47097a;

    public RunnableC18854A8(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f47097a = new WeakReference(webView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebSettings webSettings;
        WebView webView = (WebView) this.f47097a.get();
        if (webView != null) {
            webSettings = webView.getSettings();
        } else {
            webSettings = null;
        }
        if (webSettings != null) {
            webSettings.setBlockNetworkLoads(true);
        }
    }
}
