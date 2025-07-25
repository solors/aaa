package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.fyber.inneractive.sdk.activities.e */
/* loaded from: classes4.dex */
public final class C14182e extends WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f26885a;

    public C14182e(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f26885a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.f26885a.setTitle("Page is Loading...");
        this.f26885a.setProgress(i * 100);
        if (i == 100) {
            this.f26885a.setTitle(webView.getUrl());
        }
    }
}
