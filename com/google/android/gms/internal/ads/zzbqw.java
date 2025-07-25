package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbqw extends zzayb implements zzbqx {
    public zzbqw() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzayc.zzc(parcel);
                zzf((com.google.android.gms.ads.internal.client.zze) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
            } else {
                String readString = parcel.readString();
                zzayc.zzc(parcel);
                zze(readString);
            }
        } else {
            zzbpt zzb = zzbps.zzb(parcel.readStrongBinder());
            zzayc.zzc(parcel);
            zzg(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
