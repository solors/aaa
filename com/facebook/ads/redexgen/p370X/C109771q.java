package com.facebook.ads.redexgen.p370X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.1q */
/* loaded from: assets/audience_network.dex */
public class C109771q extends WebViewClient {
    public boolean A00 = false;
    public final C109621b A01;
    public final InterfaceC109761p A02;
    public final boolean A03;

    public C109771q(C109621b c109621b, InterfaceC109761p interfaceC109761p, boolean z) {
        this.A01 = c109621b;
        this.A02 = interfaceC109761p;
        this.A03 = z;
    }

    private void A00() {
        if (this.A03) {
            this.A02.AD2(AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        if (this.A02 != null) {
            this.A02.AD3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        new Handler().postDelayed(new C13157bz(this), this.A01.A09());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        A03();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC12296Ny.A02(AbstractC113568E.A2g);
        A00();
        return true;
    }
}
