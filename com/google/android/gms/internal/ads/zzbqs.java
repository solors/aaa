package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbqs extends zzaya implements zzbqu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzeVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzg() throws RemoteException {
        zzda(2, zza());
    }
}
