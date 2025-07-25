package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbys extends zzaya implements zzbyu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, iObjectWrapper2);
        zza.writeString(str);
        zzayc.zzf(zza, iObjectWrapper3);
        Parcel zzcZ = zzcZ(11, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzf(IObjectWrapper iObjectWrapper, zzbyy zzbyyVar, zzbyr zzbyrVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzd(zza, zzbyyVar);
        zzayc.zzf(zza, zzbyrVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzg(zzbuc zzbucVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbucVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbttVar);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbttVar);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbttVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbttVar);
        zzda(5, zza);
    }
}
