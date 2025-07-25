package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbuw extends zzaya implements zzbuy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zze(zzbvk zzbvkVar, zzbvc zzbvcVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbvkVar);
        zzayc.zzf(zza, zzbvcVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzf(zzbvk zzbvkVar, zzbvc zzbvcVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbvkVar);
        zzayc.zzf(zza, zzbvcVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzg(zzbvk zzbvkVar, zzbvc zzbvcVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbvkVar);
        zzayc.zzf(zza, zzbvcVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzh(String str, zzbvc zzbvcVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayc.zzf(zza, zzbvcVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzi(zzbuu zzbuuVar, zzbvd zzbvdVar) throws RemoteException {
        throw null;
    }
}
