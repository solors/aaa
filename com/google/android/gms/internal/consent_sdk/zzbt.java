package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p978t3.WebViewRenderException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes5.dex */
public final class zzbt extends WebViewClient {
    final /* synthetic */ zzbu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbt(zzbu zzbuVar, zzbs zzbsVar) {
        this.zza = zzbuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zzca zzcaVar;
        if (zzbu.zzf(this.zza, str)) {
            zzcaVar = this.zza.zzb;
            zzcaVar.zze(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z;
        z = this.zza.zzc;
        if (!z) {
            Log.d("UserMessagingPlatform", "Wall html loaded.");
            this.zza.zzc = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        zzca zzcaVar;
        zzcaVar = this.zza.zzb;
        zzcaVar.zzf(i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        return true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        zzca zzcaVar;
        String uri = webResourceRequest.getUrl().toString();
        if (zzbu.zzf(this.zza, uri)) {
            zzcaVar = this.zza.zzb;
            zzcaVar.zze(uri);
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzca zzcaVar;
        if (zzbu.zzf(this.zza, str)) {
            zzcaVar = this.zza.zzb;
            zzcaVar.zze(str);
            return true;
        }
        return false;
    }
}
