package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbab extends zzaya implements zzbad {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final com.google.android.gms.ads.internal.client.zzby zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final com.google.android.gms.ads.internal.client.zzdy zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzdy zzb = com.google.android.gms.ads.internal.client.zzdx.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzg(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayc.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzh(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzdrVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzi(IObjectWrapper iObjectWrapper, zzbak zzbakVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbakVar);
        zzda(4, zza);
    }
}
