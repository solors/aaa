package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbfy extends zzaya implements zzbga {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzc() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdt(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayc.zzf(zza, iObjectWrapper);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdv(zzbft zzbftVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbftVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdx(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zza.writeInt(i);
        zzda(5, zza);
    }
}
