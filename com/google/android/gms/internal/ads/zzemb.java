package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzemb implements zzetr {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemb(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        ListenableFuture zzn = zzgch.zzn(this.zza, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final ListenableFuture zza(Object obj) {
                return zzgch.zzh(new zzemc((String) obj));
            }
        }, this.zzb);
        zzbcc zzbccVar = zzbcl.zzmp;
        if (((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).intValue() > 0) {
            zzn = zzgch.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgch.zzf(zzn, Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final ListenableFuture zza(Object obj) {
                if (((Throwable) obj) instanceof TimeoutException) {
                    return zzgch.zzh(new zzemc(Integer.toString(17)));
                }
                return zzgch.zzh(new zzemc(null));
            }
        }, this.zzb);
    }
}
