package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public interface zzbwp extends IInterface {
    Bundle zzb() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdy zzc() throws RemoteException;

    zzbwm zzd() throws RemoteException;

    String zze() throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbww zzbwwVar) throws RemoteException;

    void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbww zzbwwVar) throws RemoteException;

    void zzh(boolean z) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdo zzdoVar) throws RemoteException;

    void zzj(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException;

    void zzk(zzbws zzbwsVar) throws RemoteException;

    void zzl(zzbxd zzbxdVar) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    boolean zzo() throws RemoteException;

    void zzp(zzbwx zzbwxVar) throws RemoteException;
}
