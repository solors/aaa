package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzec extends zzaya implements zzee {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayc.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() throws RemoteException {
        zzda(1, zza());
    }
}
