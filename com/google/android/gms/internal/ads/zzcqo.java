package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcqo implements zzcxh, zzayk {
    private final zzfbo zza;
    private final zzcwl zzb;
    private final zzcxq zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcqo(zzfbo zzfboVar, zzcwl zzcwlVar, zzcxq zzcxqVar) {
        this.zza = zzfboVar;
        this.zzb = zzcwlVar;
        this.zzc = zzcxqVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayjVar) {
        if (this.zza.zze == 1 && zzayjVar.zzj) {
            zza();
        }
        if (zzayjVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzs() {
        if (this.zza.zze != 1) {
            zza();
        }
    }
}
