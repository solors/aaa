package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbts extends zzayb implements zzbtt {
    public zzbts() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzbtt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        if (queryLocalInterface instanceof zzbtt) {
            return (zzbtt) queryLocalInterface;
        }
        return new zzbtr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzayc.zzc(parcel);
            zze(readString);
        } else {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            zzayc.zzc(parcel);
            zzf(createTypedArrayList);
        }
        parcel2.writeNoException();
        return true;
    }
}
