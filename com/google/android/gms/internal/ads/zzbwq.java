package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbwq extends zzaya implements zzbws {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zze() throws RemoteException {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzf() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzg() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzeVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzj() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzk(zzbwm zzbwmVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbwmVar);
        zzda(3, zza);
    }
}
