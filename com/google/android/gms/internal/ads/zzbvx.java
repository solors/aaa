package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbvx extends zzaya {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvw zzbvwVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbvwVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzda(2, zza);
    }
}
