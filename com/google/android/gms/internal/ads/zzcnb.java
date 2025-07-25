package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcnb implements zzbjp {
    final /* synthetic */ zzcnc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnb(zzcnc zzcncVar) {
        this.zza = zzcncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcnc.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcna
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnh zzcnhVar;
                    zzcnhVar = zzcnb.this.zza.zzd;
                    zzcnhVar.zzj();
                }
            });
        }
    }
}
