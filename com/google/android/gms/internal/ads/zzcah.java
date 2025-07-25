package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcah implements zzgcd {
    final /* synthetic */ zzcaf zza;
    final /* synthetic */ zzcad zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcah(zzcai zzcaiVar, zzcaf zzcafVar, zzcad zzcadVar) {
        this.zza = zzcafVar;
        this.zzb = zzcadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(@Nullable Object obj) {
        this.zza.zza(obj);
    }
}
