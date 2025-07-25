package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzblg extends zzaya {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbla zzblaVar, zzblf zzblfVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzblaVar);
        zzayc.zzf(zza, zzblfVar);
        zzdb(2, zza);
    }
}
