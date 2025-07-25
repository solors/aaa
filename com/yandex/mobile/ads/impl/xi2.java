package com.yandex.mobile.ads.impl;

import android.webkit.WebView;

/* loaded from: classes8.dex */
final class xi2 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ WebView f87708b;

    /* renamed from: c */
    final /* synthetic */ String f87709c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xi2(WebView webView, String str) {
        this.f87708b = webView;
        this.f87709c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f87708b.loadUrl(this.f87709c);
    }
}
