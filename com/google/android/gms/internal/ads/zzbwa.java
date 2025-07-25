package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbwa extends zzaya implements zzbwc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zze(zzbvw zzbvwVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbvwVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzf() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzh() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzi() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzj() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzk() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzl() throws RemoteException {
        zzda(3, zza());
    }
}
