package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbyq extends zzayb implements zzbyr {
    public zzbyq() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzayc.zzc(parcel);
                zzc(parcel.readString(), parcel.readString(), (Bundle) zzayc.zza(parcel, Bundle.CREATOR));
            } else {
                String readString = parcel.readString();
                zzayc.zzc(parcel);
                zzb(readString);
            }
        } else {
            parcel.readString();
            parcel.readString();
            zzayc.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
