package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbvv extends zzayb implements zzbvw {
    public zzbvv() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(zzb);
        } else {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        }
        return true;
    }
}
