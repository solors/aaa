package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C21114v8;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgdf extends zzgbx {
    private ListenableFuture zza;
    private ScheduledFuture zzb;

    private zzgdf(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ListenableFuture zzf(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgdf zzgdfVar = new zzgdf(listenableFuture);
        zzgdc zzgdcVar = new zzgdc(zzgdfVar);
        zzgdfVar.zzb = scheduledExecutorService.schedule(zzgdcVar, j, timeUnit);
        listenableFuture.addListener(zzgdcVar, zzgbv.INSTANCE);
        return zzgdfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        ListenableFuture listenableFuture = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture != null) {
            String str = "inputFuture=[" + listenableFuture.toString() + C21114v8.C21123i.f54139e;
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return str + ", remaining delay=[" + delay + " ms]";
                }
                return str;
            }
            return str;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
