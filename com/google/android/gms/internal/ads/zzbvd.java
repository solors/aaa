package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbvd extends zzaya {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbbVar);
        zzda(2, zza);
    }

    public final void zzf(String str, zzbuu zzbuuVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayc.zzd(zza, zzbuuVar);
        zzda(1, zza);
    }
}
