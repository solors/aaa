package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcuo implements zzcvt, zzdcx, zzdan, zzcwj, zzayk {
    private final zzcwl zza;
    private final zzfbo zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    @Nullable
    private final String zzh;
    private final zzgdb zze = zzgdb.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcuo(zzcwl zzcwlVar, zzfbo zzfboVar, ScheduledExecutorService scheduledExecutorService, Executor executor, @Nullable String str) {
        this.zza = zzcwlVar;
        this.zzb = zzfboVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        if (this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        zzfbo zzfboVar = this.zzb;
        if (zzfboVar.zze != 3) {
            int i = zzfboVar.zzY;
            if (i == 0 || i == 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlp)).booleanValue() && zzm()) {
                    return;
                }
                this.zza.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlp)).booleanValue() && zzm() && zzayjVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    public final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final synchronized void zzj() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzc(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzk() {
        if (this.zzb.zze != 3) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbE)).booleanValue()) {
                zzfbo zzfboVar = this.zzb;
                if (zzfboVar.zzY == 2) {
                    if (zzfboVar.zzq == 0) {
                        this.zza.zza();
                        return;
                    }
                    zzgch.zzr(this.zze, new zzcun(this), this.zzd);
                    this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcum
                        {
                            zzcuo.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcuo.this.zzh();
                        }
                    }, this.zzb.zzq, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final synchronized void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(zzbvw zzbvwVar, String str, String str2) {
    }
}
