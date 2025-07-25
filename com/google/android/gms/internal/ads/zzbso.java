package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbso extends zzbgz {
    final /* synthetic */ zzbsr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbso(zzbsr zzbsrVar, zzbsq zzbsqVar) {
        this.zza = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgqVar, String str) {
        zzbsr zzbsrVar = this.zza;
        if (zzbsr.zzc(zzbsrVar) == null) {
            return;
        }
        zzbsr.zzc(zzbsrVar).onCustomClick(zzbsr.zze(zzbsrVar, zzbgqVar), str);
    }
}
