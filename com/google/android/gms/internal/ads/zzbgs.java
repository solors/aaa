package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbgs extends zzaya implements zzbgu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgu
    public final void zze(zzbgl zzbglVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbglVar);
        zzda(1, zza);
    }
}
