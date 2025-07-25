package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.fyber.inneractive.sdk.activities.j */
/* loaded from: classes4.dex */
public final class View$OnClickListenerC14187j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f26890a;

    public View$OnClickListenerC14187j(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f26890a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f26890a.f26870e;
        if (webView != null && webView.canGoForward()) {
            this.f26890a.f26870e.goForward();
        }
    }
}
