package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public abstract class zzdq extends zzayb implements zzdr {
    public zzdq() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof zzdr) {
            return (zzdr) queryLocalInterface;
        }
        return new zzdp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i3 = zzayc.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        } else {
            zzayc.zzc(parcel);
            zze((zzu) zzayc.zza(parcel, zzu.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
