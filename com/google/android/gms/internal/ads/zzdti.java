package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdti extends com.google.android.gms.ads.internal.client.zzbk {
    final /* synthetic */ zzdtc zza;
    final /* synthetic */ zzdtj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdti(zzdtj zzdtjVar, zzdtc zzdtcVar) {
        this.zza = zzdtcVar;
        this.zzb = zzdtjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws RemoteException {
        long j;
        zzdtj zzdtjVar = this.zzb;
        zzdtc zzdtcVar = this.zza;
        j = zzdtjVar.zza;
        zzdtcVar.zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws RemoteException {
        long j;
        zzdtj zzdtjVar = this.zzb;
        zzdtc zzdtcVar = this.zza;
        j = zzdtjVar.zza;
        zzdtcVar.zzc(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i) throws RemoteException {
        long j;
        zzdtj zzdtjVar = this.zzb;
        zzdtc zzdtcVar = this.zza;
        j = zzdtjVar.zza;
        zzdtcVar.zzd(j, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j;
        zzdtj zzdtjVar = this.zzb;
        zzdtc zzdtcVar = this.zza;
        j = zzdtjVar.zza;
        zzdtcVar.zzd(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws RemoteException {
        long j;
        zzdtj zzdtjVar = this.zzb;
        zzdtc zzdtcVar = this.zza;
        j = zzdtjVar.zza;
        zzdtcVar.zze(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws RemoteException {
        long j;
        zzdtj zzdtjVar = this.zzb;
        zzdtc zzdtcVar = this.zza;
        j = zzdtjVar.zza;
        zzdtcVar.zzg(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
    }
}
