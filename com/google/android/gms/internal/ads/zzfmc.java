package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p978t3.WebViewRenderException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfmc extends WebViewClient {
    final /* synthetic */ zzfme zza;

    public zzfmc(zzfme zzfmeVar) {
        this.zza = zzfmeVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        String obj = renderProcessGoneDetail.toString();
        String valueOf = String.valueOf(webView);
        Log.w("NativeBridge", "WebView renderer gone: " + obj + "for WebView: " + valueOf);
        if (this.zza.zza() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            this.zza.zzn(null);
        }
        webView.destroy();
        return true;
    }
}
