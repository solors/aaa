package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfmd implements Runnable {
    final /* synthetic */ zzfme zza;
    private final WebView zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmd(zzfme zzfmeVar) {
        WebView webView;
        this.zza = zzfmeVar;
        webView = zzfmeVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
