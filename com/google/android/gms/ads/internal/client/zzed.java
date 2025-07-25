package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public abstract class zzed extends zzayb implements zzee {
    public zzed() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        boolean zzg = zzayc.zzg(parcel);
                        zzayc.zzc(parcel);
                        zzf(zzg);
                    } else {
                        zze();
                    }
                } else {
                    zzg();
                }
            } else {
                zzh();
            }
        } else {
            zzi();
        }
        parcel2.writeNoException();
        return true;
    }
}
