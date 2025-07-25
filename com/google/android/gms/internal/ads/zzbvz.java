package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public interface zzbvz extends IInterface {
    Bundle zzb() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdy zzc() throws RemoteException;

    String zzd() throws RemoteException;

    void zze() throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzg(zzbwd zzbwdVar) throws RemoteException;

    void zzh() throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzj() throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzl(com.google.android.gms.ads.internal.client.zzcc zzccVar) throws RemoteException;

    void zzm(String str) throws RemoteException;

    void zzn(boolean z) throws RemoteException;

    void zzo(zzbwc zzbwcVar) throws RemoteException;

    void zzp(String str) throws RemoteException;

    void zzq() throws RemoteException;

    void zzr(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzs() throws RemoteException;

    boolean zzt() throws RemoteException;

    void zzu(zzbvx zzbvxVar) throws RemoteException;
}
