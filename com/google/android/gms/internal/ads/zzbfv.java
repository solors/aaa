package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbfv extends zzayb implements zzbfw {
    public zzbfv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbfw zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof zzbfw) {
            return (zzbfw) queryLocalInterface;
        }
        return new zzbfu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        int zzc = zzc();
                        parcel2.writeNoException();
                        parcel2.writeInt(zzc);
                    } else {
                        int zzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeInt(zzd);
                    }
                } else {
                    double zzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeDouble(zzb);
                }
            } else {
                Uri zze = zze();
                parcel2.writeNoException();
                zzayc.zze(parcel2, zze);
            }
        } else {
            IObjectWrapper zzf = zzf();
            parcel2.writeNoException();
            zzayc.zzf(parcel2, zzf);
        }
        return true;
    }
}
