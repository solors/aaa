package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbyv extends zzaya implements zzbyx {
    public zzbyv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final zzbyu zze(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException {
        zzbyu zzbysVar;
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbpeVar);
        zza.writeInt(244410000);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbysVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof zzbyu) {
                zzbysVar = (zzbyu) queryLocalInterface;
            } else {
                zzbysVar = new zzbys(readStrongBinder);
            }
        }
        zzcZ.recycle();
        return zzbysVar;
    }
}
