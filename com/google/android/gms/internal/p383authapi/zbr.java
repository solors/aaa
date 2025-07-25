package com.google.android.gms.internal.p383authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zbr */
/* loaded from: classes5.dex */
public abstract class zbr extends zbb implements zbs {
    public zbr() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.google.android.gms.internal.p383authapi.zbb
    protected final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                String readString = parcel.readString();
                zbc.zbb(parcel);
                zbd((Status) zbc.zba(parcel, Status.CREATOR), readString);
            } else {
                zbc.zbb(parcel);
                zbc((Status) zbc.zba(parcel, Status.CREATOR));
            }
        } else {
            zbc.zbb(parcel);
            zbb((Status) zbc.zba(parcel, Status.CREATOR), (Credential) zbc.zba(parcel, Credential.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
