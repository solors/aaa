package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzazf implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzazj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazf(zzazj zzazjVar, View view) {
        this.zza = view;
        this.zzb = zzazjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
