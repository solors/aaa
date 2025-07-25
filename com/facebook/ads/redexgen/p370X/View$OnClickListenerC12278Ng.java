package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.redexgen.X.Ng */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12278Ng implements View.OnClickListener {
    public final /* synthetic */ C12281Nj A00;

    public View$OnClickListenerC12278Ng(C12281Nj c12281Nj) {
        this.A00 = c12281Nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A0A;
            if (!webView.canGoForward()) {
                return;
            }
            webView2 = this.A00.A0A;
            webView2.goForward();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
