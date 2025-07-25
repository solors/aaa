package com.amazon.aps.ads.util.adview;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import p978t3.WebViewRenderException;

/* compiled from: ApsAdWebViewSupportClientBase.kt */
@Metadata
/* loaded from: classes2.dex */
public abstract class ApsAdWebViewSupportClientBase extends WebViewClient {
    private boolean isCrashed;

    public final boolean isCrashed() {
        return this.isCrashed;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setCrashed(boolean z) {
        this.isCrashed = z;
    }
}
