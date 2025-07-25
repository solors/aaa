package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes5.dex */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zzc.zzc(parcel);
            zzc((Status) zzc.zza(parcel, Status.CREATOR));
        } else {
            int i3 = zzc.zza;
            int readInt = parcel.readInt();
            zzc.zzc(parcel);
            if (readInt != 0) {
                z = true;
            }
            zzb(z);
        }
        parcel2.writeNoException();
        return true;
    }
}
