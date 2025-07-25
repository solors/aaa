package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbhi extends zzaya implements zzbhk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void zze(zzbht zzbhtVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbhtVar);
        zzda(1, zza);
    }
}
