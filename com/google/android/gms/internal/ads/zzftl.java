package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzftl implements ServiceConnection {
    final /* synthetic */ zzftn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzftl(zzftn zzftnVar, zzftm zzftmVar) {
        this.zza = zzftnVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzftn.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzftn.zzh(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzftj
            @Override // java.lang.Runnable
            public final void run() {
                zzfrn zzb = zzfrm.zzb(iBinder);
                zzftl zzftlVar = zzftl.this;
                zzftn.zzg(zzftlVar.zza, zzb);
                zzftn.zzd(zzftlVar.zza).zzc("linkToDeath", new Object[0]);
                try {
                    IInterface zzb2 = zzftn.zzb(zzftlVar.zza);
                    zzb2.getClass();
                    zzb2.asBinder().linkToDeath(zzftn.zza(zzftlVar.zza), 0);
                } catch (RemoteException e) {
                    zzftn.zzd(zzftlVar.zza).zzb(e, "linkToDeath failed", new Object[0]);
                }
                zzftn.zzf(zzftlVar.zza, false);
                synchronized (zzftn.zze(zzftlVar.zza)) {
                    for (Runnable runnable : zzftn.zze(zzftlVar.zza)) {
                        runnable.run();
                    }
                    zzftn.zze(zzftlVar.zza).clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzftn.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzftn.zzh(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzftk
            @Override // java.lang.Runnable
            public final void run() {
                zzftl zzftlVar = zzftl.this;
                zzftn.zzd(zzftlVar.zza).zzc("unlinkToDeath", new Object[0]);
                IInterface zzb = zzftn.zzb(zzftlVar.zza);
                zzb.getClass();
                zzb.asBinder().unlinkToDeath(zzftn.zza(zzftlVar.zza), 0);
                zzftn.zzg(zzftlVar.zza, null);
                zzftn.zzf(zzftlVar.zza, false);
            }
        });
    }
}
