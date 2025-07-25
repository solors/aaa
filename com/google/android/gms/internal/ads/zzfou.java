package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfou extends zzaya {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfou(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfos zze(zzfoq zzfoqVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzfoqVar);
        Parcel zzcZ = zzcZ(1, zza);
        zzfos zzfosVar = (zzfos) zzayc.zza(zzcZ, zzfos.CREATOR);
        zzcZ.recycle();
        return zzfosVar;
    }

    public final zzfpb zzf(zzfoz zzfozVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzfozVar);
        Parcel zzcZ = zzcZ(3, zza);
        zzfpb zzfpbVar = (zzfpb) zzayc.zza(zzcZ, zzfpb.CREATOR);
        zzcZ.recycle();
        return zzfpbVar;
    }

    public final void zzg(zzfon zzfonVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzfonVar);
        zzda(2, zza);
    }
}
