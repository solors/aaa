package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbpe;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public interface zzcz extends IInterface {
    float zze() throws RemoteException;

    String zzf() throws RemoteException;

    List zzg() throws RemoteException;

    void zzh(@Nullable String str) throws RemoteException;

    void zzi() throws RemoteException;

    void zzj(boolean z) throws RemoteException;

    void zzk() throws RemoteException;

    void zzl(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzm(zzdl zzdlVar) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzo(zzbpe zzbpeVar) throws RemoteException;

    void zzp(boolean z) throws RemoteException;

    void zzq(float f) throws RemoteException;

    void zzr(String str) throws RemoteException;

    void zzs(zzblu zzbluVar) throws RemoteException;

    void zzt(String str) throws RemoteException;

    void zzu(zzfv zzfvVar) throws RemoteException;

    boolean zzv() throws RemoteException;
}
