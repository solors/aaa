package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzdp extends zzaya implements zzdr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final void zze(zzu zzuVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzuVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final boolean zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
