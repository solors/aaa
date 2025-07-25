package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.fyber.inneractive.sdk.activities.i */
/* loaded from: classes4.dex */
public final class View$OnClickListenerC14186i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f26889a;

    public View$OnClickListenerC14186i(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f26889a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f26889a.f26870e;
        if (webView != null && webView.canGoBack()) {
            this.f26889a.f26870e.goBack();
        }
    }
}
