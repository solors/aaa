package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public interface zzbga extends IInterface {
    IObjectWrapper zzb(String str) throws RemoteException;

    void zzc() throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdt(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdu(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdv(@Nullable zzbft zzbftVar) throws RemoteException;

    void zzdw(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdx(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException;
}
