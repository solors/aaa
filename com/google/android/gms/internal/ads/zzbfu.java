package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbfu extends zzaya implements zzbfw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final double zzb() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzc() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzd() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final Uri zze() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        Uri uri = (Uri) zzayc.zza(zzcZ, Uri.CREATOR);
        zzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }
}
