package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbwx extends zzaya {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbwm zzbwmVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbwmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzda(2, zza);
    }
}
