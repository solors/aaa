package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbsy extends zzaya implements zzbta {
    public zzbsy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final zzbsx zze(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException {
        zzbsx zzbsvVar;
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbpeVar);
        zza.writeInt(244410000);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof zzbsx) {
                zzbsvVar = (zzbsx) queryLocalInterface;
            } else {
                zzbsvVar = new zzbsv(readStrongBinder);
            }
        }
        zzcZ.recycle();
        return zzbsvVar;
    }
}
