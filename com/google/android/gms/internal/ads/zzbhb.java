package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbhb extends zzaya implements zzbhd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zze(zzbgq zzbgqVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbgqVar);
        zzda(1, zza);
    }
}
