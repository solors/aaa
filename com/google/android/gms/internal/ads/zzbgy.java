package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbgy extends zzaya implements zzbha {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgqVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbgqVar);
        zza.writeString(str);
        zzda(1, zza);
    }
}
