package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzazb implements Runnable {
    final /* synthetic */ zzazc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazb(zzazc zzazcVar) {
        this.zza = zzazcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzazd> list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzazc zzazcVar = this.zza;
            z = zzazcVar.zzd;
            if (z) {
                z2 = zzazcVar.zze;
                if (z2) {
                    zzazcVar.zzd = false;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("App went background");
                    list = this.zza.zzf;
                    for (zzazd zzazdVar : list) {
                        try {
                            zzazdVar.zza(false);
                        } catch (Exception e) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.zze("App is still foreground");
        }
    }
}
