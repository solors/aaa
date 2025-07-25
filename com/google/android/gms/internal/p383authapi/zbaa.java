package com.google.android.gms.internal.p383authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zbaa */
/* loaded from: classes5.dex */
public final class zbaa extends zba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbz zbzVar, AuthorizationRequest authorizationRequest) throws RemoteException {
        Parcel zba = zba();
        zbc.zbd(zba, zbzVar);
        zbc.zbc(zba, authorizationRequest);
        zbb(1, zba);
    }
}
