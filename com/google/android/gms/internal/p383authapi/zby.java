package com.google.android.gms.internal.p383authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zby */
/* loaded from: classes5.dex */
public abstract class zby extends zbb implements zbz {
    public zby() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p383authapi.zbb
    protected final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zbc.zbb(parcel);
            zbb((Status) zbc.zba(parcel, Status.CREATOR), (AuthorizationResult) zbc.zba(parcel, AuthorizationResult.CREATOR));
            return true;
        }
        return false;
    }
}
