package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbff extends zzaya {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbff(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbuo zzbuoVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbuoVar);
        zzda(1, zza);
    }
}
