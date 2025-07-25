package com.taurusx.tax.p606j.p614c0;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.utils.webview.TaxBrowserActivity;

/* renamed from: com.taurusx.tax.j.c0.a */
/* loaded from: classes7.dex */
public class C28513a extends WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ TaxBrowserActivity f73955a;

    public C28513a(TaxBrowserActivity taxBrowserActivity) {
        this.f73955a = taxBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        this.f73955a.setTitle(C28162a.f73047a.m23824a(new byte[]{65, 27, 108, 16, 100, 26, 106, 90, 35, 90}, new byte[]{13, 116}));
        this.f73955a.setProgress(i * 100);
        if (i == 100) {
            this.f73955a.setTitle(webView.getUrl());
        }
    }
}
