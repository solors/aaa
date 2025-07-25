package com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import p978t3.WebViewRenderException;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.cii2c2 */
/* loaded from: classes8.dex */
class C32435cii2c2 extends WebViewClient {
    private static final String c2oc2o = "HtmlWebViewClient";
    private final Context c2oc2i;
    private boolean cioccoiococ;
    private final C32438coi222o222 coi222o222;
    private final InterfaceC32436ciii2coi2 coo2iico;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C32435cii2c2(InterfaceC32436ciii2coi2 interfaceC32436ciii2coi2, C32438coi222o222 c32438coi222o222) {
        this.coo2iico = interfaceC32436ciii2coi2;
        this.coi222o222 = c32438coi222o222;
        this.c2oc2i = c32438coi222o222.getContext();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        MLog.m25892d(c2oc2o, "Interstitial onPageStarted:" + str);
        if ("".equals(str)) {
            this.cioccoiococ = false;
            this.coo2iico.onBackToInterstitial();
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.coo2iico.coo2iico(str);
        return true;
    }
}
