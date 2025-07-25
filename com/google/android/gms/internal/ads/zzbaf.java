package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbaf extends zzayb implements zzbag {
    public zzbaf() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbag zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        if (queryLocalInterface instanceof zzbag) {
            return (zzbag) queryLocalInterface;
        }
        return new zzbae(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbad zzbabVar;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzayc.zzc(parcel);
                zzc((com.google.android.gms.ads.internal.client.zze) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
            } else {
                parcel.readInt();
                zzayc.zzc(parcel);
            }
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbabVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                if (queryLocalInterface instanceof zzbad) {
                    zzbabVar = (zzbad) queryLocalInterface;
                } else {
                    zzbabVar = new zzbab(readStrongBinder);
                }
            }
            zzayc.zzc(parcel);
            zzd(zzbabVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
