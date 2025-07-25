package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbpd extends zzayb implements zzbpe {
    public zzbpd() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbpe zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzbpe) {
            return (zzbpe) queryLocalInterface;
        }
        return new zzbpc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    String readString = parcel.readString();
                    zzayc.zzc(parcel);
                    boolean zzd = zzd(readString);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzd ? 1 : 0);
                } else {
                    String readString2 = parcel.readString();
                    zzayc.zzc(parcel);
                    zzbrd zzc = zzc(readString2);
                    parcel2.writeNoException();
                    zzayc.zzf(parcel2, zzc);
                }
            } else {
                String readString3 = parcel.readString();
                zzayc.zzc(parcel);
                boolean zze = zze(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zze ? 1 : 0);
            }
        } else {
            String readString4 = parcel.readString();
            zzayc.zzc(parcel);
            zzbph zzb = zzb(readString4);
            parcel2.writeNoException();
            zzayc.zzf(parcel2, zzb);
        }
        return true;
    }
}
