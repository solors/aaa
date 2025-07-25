package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcwg extends zzdbj implements zzcvx {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcwg(zzcwf zzcwfVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        super.zzo(zzcwfVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzcvy
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((zzcvx) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzb() {
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzcvz
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((zzcvx) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzc(final zzdgb zzdgbVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzcwb
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((zzcvx) obj).zzc(zzdgb.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        synchronized (this) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdgb("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkB)).intValue();
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwa
            @Override // java.lang.Runnable
            public final void run() {
                zzcwg.this.zzd();
            }
        }, intValue, TimeUnit.MILLISECONDS);
    }
}
