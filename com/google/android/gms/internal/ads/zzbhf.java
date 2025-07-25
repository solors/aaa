package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbhf extends zzaya implements zzbhh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zze(com.google.android.gms.ads.internal.client.zzby zzbyVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbyVar);
        zzayc.zzf(zza, iObjectWrapper);
        zzda(1, zza);
    }
}
