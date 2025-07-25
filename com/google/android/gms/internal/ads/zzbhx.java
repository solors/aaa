package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbhx extends zzbgz {
    final /* synthetic */ zzbia zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbhx(zzbia zzbiaVar, zzbhz zzbhzVar) {
        this.zza = zzbiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgqVar, String str) {
        com.google.android.gms.ads.formats.zzf zzfVar;
        com.google.android.gms.ads.formats.zzf zzfVar2;
        zzbgr zzf;
        zzbia zzbiaVar = this.zza;
        zzfVar = zzbiaVar.zzb;
        if (zzfVar != null) {
            zzfVar2 = zzbiaVar.zzb;
            zzf = zzbiaVar.zzf(zzbgqVar);
            zzfVar2.zzb(zzf, str);
        }
    }
}
