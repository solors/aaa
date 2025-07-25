package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes4.dex */
public interface zzb extends IInterface {
    void zzb(@Nullable Account account) throws RemoteException;

    void zzc(boolean z) throws RemoteException;
}
