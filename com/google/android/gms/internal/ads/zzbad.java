package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public interface zzbad extends IInterface {
    com.google.android.gms.ads.internal.client.zzby zze() throws RemoteException;

    @Nullable
    com.google.android.gms.ads.internal.client.zzdy zzf() throws RemoteException;

    void zzg(boolean z) throws RemoteException;

    void zzh(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper, zzbak zzbakVar) throws RemoteException;
}
