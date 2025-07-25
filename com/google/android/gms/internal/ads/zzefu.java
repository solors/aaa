package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzefu extends zzbqw {
    final /* synthetic */ zzefw zza;
    private final zzecz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzefu(zzefw zzefwVar, zzecz zzeczVar, zzefv zzefvVar) {
        this.zza = zzefwVar;
        this.zzb = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zze(String str) throws RemoteException {
        ((zzees) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzees) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzg(zzbpt zzbptVar) throws RemoteException {
        zzefw.zzc(this.zza, zzbptVar);
        ((zzees) this.zzb.zzc).zzo();
    }
}
