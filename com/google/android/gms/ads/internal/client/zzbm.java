package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzbm extends zzaya implements zzbo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzeVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() throws RemoteException {
        zzda(1, zza());
    }
}
