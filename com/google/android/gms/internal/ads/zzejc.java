package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzejc implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzder zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejc(zzejd zzejdVar, zzder zzderVar) {
        this.zza = zzderVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }
}
