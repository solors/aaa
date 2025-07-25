package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfrl extends zzaya implements zzfrn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrl(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final void zze(Bundle bundle, zzfrp zzfrpVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, bundle);
        zzayc.zzf(zza, zzfrpVar);
        zzdb(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final void zzf(String str, Bundle bundle, zzfrp zzfrpVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayc.zzd(zza, bundle);
        zzayc.zzf(zza, zzfrpVar);
        zzdb(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final void zzg(Bundle bundle, zzfrp zzfrpVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, bundle);
        zzayc.zzf(zza, zzfrpVar);
        zzdb(3, zza);
    }
}
