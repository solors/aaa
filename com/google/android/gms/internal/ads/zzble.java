package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzble extends zzayb implements zzblf {
    public zzble() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzayc.zzc(parcel);
            zzb((ParcelFileDescriptor) zzayc.zza(parcel, ParcelFileDescriptor.CREATOR));
            return true;
        }
        return false;
    }
}
