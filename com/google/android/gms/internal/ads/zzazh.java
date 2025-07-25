package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzazh implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzayz zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzazj zze;

    public zzazh(zzazj zzazjVar, final zzayz zzayzVar, final WebView webView, final boolean z) {
        this.zzb = zzayzVar;
        this.zzc = webView;
        this.zzd = z;
        this.zze = zzazjVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzazg
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzazh.this.zze.zzc(zzayzVar, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
