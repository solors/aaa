package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public abstract class zzdg extends zzayb implements zzdh {
    public zzdg() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzdh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzdh) {
            return (zzdh) queryLocalInterface;
        }
        return new zzdf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        }
        return true;
    }
}
