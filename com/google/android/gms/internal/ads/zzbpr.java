package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbpr extends zzaya implements zzbpt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzA() throws RemoteException {
        Parcel zzcZ = zzcZ(18, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzB() throws RemoteException {
        Parcel zzcZ = zzcZ(17, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final double zze() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(23, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(25, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(24, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final Bundle zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(16, zza());
        Bundle bundle = (Bundle) zzayc.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.ads.internal.client.zzeb zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzeb zzb = com.google.android.gms.ads.internal.client.zzea.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final zzbfp zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        zzbfp zzj = zzbfo.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final zzbfw zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        zzbfw zzg = zzbfv.zzg(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(14, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final IObjectWrapper zzo() throws RemoteException {
        Parcel zzcZ = zzcZ(15, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzp() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzr() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzs() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzt() throws RemoteException {
        Parcel zzcZ = zzcZ(10, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzu() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final List zzv() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzb = zzayc.zzb(zzcZ);
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzx() throws RemoteException {
        zzda(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, iObjectWrapper2);
        zzayc.zzf(zza, iObjectWrapper3);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(22, zza);
    }
}
