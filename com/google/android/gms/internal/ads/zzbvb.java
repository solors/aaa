package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbvb extends zzayb implements zzbvc {
    public zzbvb() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzayc.zzc(parcel);
                zzg((ParcelFileDescriptor) zzayc.zza(parcel, ParcelFileDescriptor.CREATOR), (zzbvk) zzayc.zza(parcel, zzbvk.CREATOR));
            } else {
                zzayc.zzc(parcel);
                zze((com.google.android.gms.ads.internal.util.zzbb) zzayc.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR));
            }
        } else {
            zzayc.zzc(parcel);
            zzf((ParcelFileDescriptor) zzayc.zza(parcel, ParcelFileDescriptor.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
