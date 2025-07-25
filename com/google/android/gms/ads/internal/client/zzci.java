package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbwp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public interface zzci extends IInterface {
    @Nullable
    zzbad zze(String str) throws RemoteException;

    @Nullable
    zzby zzf(String str) throws RemoteException;

    @Nullable
    zzbwp zzg(String str) throws RemoteException;

    void zzh(zzbpe zzbpeVar) throws RemoteException;

    void zzi(List list, zzcf zzcfVar) throws RemoteException;

    boolean zzj(String str) throws RemoteException;

    boolean zzk(String str) throws RemoteException;

    boolean zzl(String str) throws RemoteException;
}
