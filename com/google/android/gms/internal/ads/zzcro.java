package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcro {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcro(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzcro zzcroVar, List list, final zzgcd zzgcdVar) {
        if (list != null && !list.isEmpty()) {
            ListenableFuture zzh = zzgch.zzh(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                zzh = zzgch.zzn(zzgch.zzf(zzh, Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcrk
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final ListenableFuture zza(Object obj) {
                        zzgcd.this.zza((Throwable) obj);
                        return zzgch.zzh(null);
                    }
                }, zzcroVar.zza), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcrl
                    {
                        zzcro.this = zzcroVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final ListenableFuture zza(Object obj) {
                        return zzcro.this.zza(zzgcdVar, listenableFuture, (zzcqz) obj);
                    }
                }, zzcroVar.zza);
            }
            zzgch.zzr(zzh, new zzcrn(zzcroVar, zzgcdVar), zzcroVar.zza);
            return;
        }
        zzcroVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrj
            @Override // java.lang.Runnable
            public final void run() {
                zzgcdVar.zza(new zzdvy(3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zza(zzgcd zzgcdVar, ListenableFuture listenableFuture, zzcqz zzcqzVar) throws Exception {
        if (zzcqzVar != null) {
            zzgcdVar.zzb(zzcqzVar);
        }
        return zzgch.zzo(listenableFuture, ((Long) zzbey.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgcd zzgcdVar) {
        zzgch.zzr(this.zzc, new zzcrm(this, zzgcdVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
