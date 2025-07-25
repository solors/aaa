package com.ironsource;

import android.annotation.TargetApi;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.InterfaceC20048hg;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import p978t3.WebViewRenderException;

/* renamed from: com.ironsource.nf */
/* loaded from: classes6.dex */
public class C20521nf extends WebViewClient {

    /* renamed from: b */
    private static final String f52201b = "nf";

    /* renamed from: a */
    private final InterfaceC20048hg.InterfaceC20049a f52202a;

    public C20521nf(InterfaceC20048hg.InterfaceC20049a interfaceC20049a) {
        this.f52202a = interfaceC20049a;
    }

    /* renamed from: a */
    private String m56167a(String str, String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        try {
            this.f52202a.mo55985a(m56167a("onReceivedError", String.valueOf(i)));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f52202a.mo55985a(m56167a("onReceivedHttpError", String.valueOf(webResourceResponse.getStatusCode())));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        boolean didCrash2;
        String str;
        WebViewRenderException.m3275a(this);
        try {
            String str2 = f52201b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Chromium process crashed - detail.didCrash():");
            didCrash = renderProcessGoneDetail.didCrash();
            sb2.append(didCrash);
            Logger.m54972e(str2, sb2.toString());
            didCrash2 = renderProcessGoneDetail.didCrash();
            if (didCrash2) {
                str = "Render process was observed to crash";
            } else {
                str = "Render process was killed by the system";
            }
            this.f52202a.mo55984b(str);
            return true;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return true;
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f52202a.mo55985a(m56167a("onReceivedErrorM", String.valueOf(webResourceError.getErrorCode())));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }
}
