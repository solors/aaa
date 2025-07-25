package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbbn {
    final /* synthetic */ zzbbp zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbbn(zzbbp zzbbpVar, byte[] bArr, zzbbo zzbboVar) {
        this.zza = zzbbpVar;
        this.zzb = bArr;
    }

    public static /* synthetic */ void zzb(zzbbn zzbbnVar) {
        zzbbnVar.zzd();
    }

    public final synchronized void zzd() {
        try {
            zzbbp zzbbpVar = this.zza;
            if (zzbbpVar.zzb) {
                zzbbpVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Clearcut log failed", e);
        }
    }

    public final zzbbn zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbm
            @Override // java.lang.Runnable
            public final void run() {
                zzbbn.zzb(zzbbn.this);
            }
        });
    }
}
