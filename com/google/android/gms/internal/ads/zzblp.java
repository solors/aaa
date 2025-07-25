package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzblp extends zzaya implements zzblr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }
}
