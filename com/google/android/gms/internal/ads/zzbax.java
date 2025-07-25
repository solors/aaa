package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbax extends zzaya {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbav zzbavVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbavVar);
        Parcel zzcZ = zzcZ(3, zza);
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    public final zzbas zzf(zzbav zzbavVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbavVar);
        Parcel zzcZ = zzcZ(1, zza);
        zzbas zzbasVar = (zzbas) zzayc.zza(zzcZ, zzbas.CREATOR);
        zzcZ.recycle();
        return zzbasVar;
    }

    public final zzbas zzg(zzbav zzbavVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbavVar);
        Parcel zzcZ = zzcZ(2, zza);
        zzbas zzbasVar = (zzbas) zzayc.zza(zzcZ, zzbas.CREATOR);
        zzcZ.recycle();
        return zzbasVar;
    }
}
