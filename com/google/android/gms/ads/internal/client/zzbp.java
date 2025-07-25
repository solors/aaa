package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzbp extends zzaya implements zzbr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(zzm zzmVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzmVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(zzm zzmVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzmVar);
        zza.writeInt(i);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
