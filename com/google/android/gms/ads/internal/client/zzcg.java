package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbwp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzcg extends zzaya implements zzci {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzbad zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(5, zza);
        zzbad zzb = zzbac.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzby zzf(String str) throws RemoteException {
        zzby zzbwVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(7, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzby) {
                zzbwVar = (zzby) queryLocalInterface;
            } else {
                zzbwVar = new zzbw(readStrongBinder);
            }
        }
        zzcZ.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzbwp zzg(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(3, zza);
        zzbwp zzq = zzbwo.zzq(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(zzbpe zzbpeVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbpeVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(List list, zzcf zzcfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayc.zzf(zza, zzcfVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(6, zza);
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
