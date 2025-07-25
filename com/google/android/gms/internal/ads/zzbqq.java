package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbqq extends zzayb implements zzbqr {
    public zzbqq() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    zzbpn zzb = zzbpm.zzb(parcel.readStrongBinder());
                    zzayc.zzc(parcel);
                    zzh(zzb);
                } else {
                    zzayc.zzc(parcel);
                    zzf((com.google.android.gms.ads.internal.client.zze) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                }
            } else {
                String readString = parcel.readString();
                zzayc.zzc(parcel);
                zze(readString);
            }
        } else {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayc.zzc(parcel);
            zzg(asInterface);
        }
        parcel2.writeNoException();
        return true;
    }
}
