package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbsp extends zzbhc {
    final /* synthetic */ zzbsr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbsp(zzbsr zzbsrVar, zzbsq zzbsqVar) {
        this.zza = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zze(zzbgq zzbgqVar) {
        zzbsr zzbsrVar = this.zza;
        zzbsr.zzd(zzbsrVar).onCustomFormatAdLoaded(zzbsr.zze(zzbsrVar, zzbgqVar));
    }
}
