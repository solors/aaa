package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzega {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcrc zzc;
    private final zzegq zzd;
    private final zzfiv zze;
    private final zzgdb zzf = zzgdb.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzegb zzh;
    private zzfca zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzega(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcrc zzcrcVar, zzegq zzegqVar, zzfiv zzfivVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcrcVar;
        this.zzd = zzegqVar;
        this.zze = zzfivVar;
    }

    private final synchronized ListenableFuture zzd(zzfbo zzfboVar) {
        for (String str : zzfboVar.zza) {
            zzecw zza = this.zzc.zza(zzfboVar.zzb, str);
            if (zza != null && zza.zzb(this.zzi, zzfboVar)) {
                ListenableFuture zza2 = zza.zza(this.zzi, zzfboVar);
                int i = zzfboVar.zzR;
                return zzgch.zzo(zza2, i, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgch.zzg(new zzdvy(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(@Nullable zzfbo zzfboVar) {
        ListenableFuture zzd = zzd(zzfboVar);
        this.zzd.zzf(this.zzi, zzfboVar, zzd, this.zze);
        zzgch.zzr(zzd, new zzefz(this, zzfboVar), this.zza);
    }

    public final synchronized ListenableFuture zzb(zzfca zzfcaVar) {
        if (!this.zzg.getAndSet(true)) {
            if (zzfcaVar.zzb.zza.isEmpty()) {
                this.zzf.zzd(new zzegu(3, zzegx.zzc(zzfcaVar)));
            } else {
                this.zzi = zzfcaVar;
                this.zzh = new zzegb(zzfcaVar, this.zzd, this.zzf);
                this.zzd.zzk(zzfcaVar.zzb.zza);
                zzfbo zza = this.zzh.zza();
                while (zza != null) {
                    zze(zza);
                    zza = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }
}
