package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbrf extends zzayb implements zzbrg {
    public zzbrf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzayc.zzc(parcel);
                zzg((com.google.android.gms.ads.internal.client.zze) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
            } else {
                String readString = parcel.readString();
                zzayc.zzc(parcel);
                zzf(readString);
            }
        } else {
            String readString2 = parcel.readString();
            zzayc.zzc(parcel);
            zze(readString2);
        }
        parcel2.writeNoException();
        return true;
    }
}
