package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.activities.k */
/* loaded from: classes4.dex */
public final class View$OnClickListenerC14188k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f26891a;

    public View$OnClickListenerC14188k(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f26891a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f26891a.f26870e;
        if (webView != null) {
            webView.reload();
            int i = IAlog.f30554a;
            IAlog.m76526d("%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.f26891a.f26870e.getUrl());
        }
    }
}
