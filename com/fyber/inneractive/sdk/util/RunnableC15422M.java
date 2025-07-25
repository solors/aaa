package com.fyber.inneractive.sdk.util;

import android.webkit.WebView;

/* renamed from: com.fyber.inneractive.sdk.util.M */
/* loaded from: classes4.dex */
public final class RunnableC15422M implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WebView f30562a;

    public RunnableC15422M(WebView webView) {
        this.f30562a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30562a.getSettings().setDisplayZoomControls(false);
    }
}
