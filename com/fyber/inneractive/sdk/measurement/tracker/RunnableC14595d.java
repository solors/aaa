package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.measurement.tracker.d */
/* loaded from: classes4.dex */
public final class RunnableC14595d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC14597f f27645a;

    public RunnableC14595d(AbstractC14597f abstractC14597f) {
        this.f27645a = abstractC14597f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m76529a("clearing webview", new Object[0]);
        WebView webView = this.f27645a.f27651f;
        if (webView != null) {
            webView.destroy();
            this.f27645a.f27651f = null;
        }
    }
}
