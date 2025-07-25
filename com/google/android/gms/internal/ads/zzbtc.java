package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbtc extends zzaya implements zzbte {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzH() throws RemoteException {
        Parcel zzcZ = zzcZ(11, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzh(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zzayc.zzd(zza, intent);
        zzda(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzi() throws RemoteException {
        zzda(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzl(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, bundle);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzm() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzo() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzp(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzq() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzr() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzs(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, bundle);
        Parcel zzcZ = zzcZ(6, zza);
        if (zzcZ.readInt() != 0) {
            bundle.readFromParcel(zzcZ);
        }
        zzcZ.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzt() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzu() throws RemoteException {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzv() throws RemoteException {
        zzda(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzx() throws RemoteException {
        zzda(9, zza());
    }
}
