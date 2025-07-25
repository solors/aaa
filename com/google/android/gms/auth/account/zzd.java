package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes4.dex */
public abstract class zzd extends com.google.android.gms.internal.auth.zzb implements zze {
    public static zze zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        if (queryLocalInterface instanceof zze) {
            return (zze) queryLocalInterface;
        }
        return new zzc(iBinder);
    }
}
