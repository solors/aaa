package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbhl extends zzaya implements zzbhn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final boolean zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(2, zza);
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
