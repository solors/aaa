package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzdtl extends zzbwv {
    final /* synthetic */ zzdtn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtl(zzdtn zzdtnVar) {
        this.zza = zzdtnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(int i) throws RemoteException {
        zzdtc zzdtcVar;
        long j;
        zzdtn zzdtnVar = this.zza;
        zzdtcVar = zzdtnVar.zzb;
        j = zzdtnVar.zza;
        zzdtcVar.zzm(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdtc zzdtcVar;
        long j;
        zzdtn zzdtnVar = this.zza;
        zzdtcVar = zzdtnVar.zzb;
        j = zzdtnVar.zza;
        zzdtcVar.zzm(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() throws RemoteException {
        zzdtc zzdtcVar;
        long j;
        zzdtn zzdtnVar = this.zza;
        zzdtcVar = zzdtnVar.zzb;
        j = zzdtnVar.zza;
        zzdtcVar.zzp(j);
    }
}
