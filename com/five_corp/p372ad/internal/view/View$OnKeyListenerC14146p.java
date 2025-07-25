package com.five_corp.p372ad.internal.view;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;

/* renamed from: com.five_corp.ad.internal.view.p */
/* loaded from: classes4.dex */
public final class View$OnKeyListenerC14146p implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ WebView f26806a;

    public View$OnKeyListenerC14146p(WebView webView) {
        this.f26806a = webView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 4 && this.f26806a.canGoBack()) {
            this.f26806a.goBack();
            return true;
        }
        return false;
    }
}
