package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbva extends zzaya implements zzbvc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbbVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, parcelFileDescriptor);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvk zzbvkVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, parcelFileDescriptor);
        zzayc.zzd(zza, zzbvkVar);
        zzda(3, zza);
    }
}
