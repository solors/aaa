package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbks extends zzaya implements zzbku {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbks(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbku
    public final zzbkr zze(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i, zzbko zzbkoVar) throws RemoteException {
        zzbkr zzbkpVar;
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbpeVar);
        zza.writeInt(244410000);
        zzayc.zzf(zza, zzbkoVar);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            if (queryLocalInterface instanceof zzbkr) {
                zzbkpVar = (zzbkr) queryLocalInterface;
            } else {
                zzbkpVar = new zzbkp(readStrongBinder);
            }
        }
        zzcZ.recycle();
        return zzbkpVar;
    }
}
