package com.google.android.gms.internal.p383authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zbz */
/* loaded from: classes5.dex */
public interface zbz extends IInterface {
    void zbb(Status status, AuthorizationResult authorizationResult) throws RemoteException;
}
