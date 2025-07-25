package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgcy extends zzgcv implements zzgct {
    final ScheduledExecutorService zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgcy(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgdi zze = zzgdi.zze(runnable, null);
        return new zzgcw(zze, scheduledExecutorService.schedule(zze, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgcx zzgcxVar = new zzgcx(runnable);
        return new zzgcw(zzgcxVar, this.zza.scheduleAtFixedRate(zzgcxVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgcx zzgcxVar = new zzgcx(runnable);
        return new zzgcw(zzgcxVar, this.zza.scheduleWithFixedDelay(zzgcxVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzc */
    public final zzgcr schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzgdi zzgdiVar = new zzgdi(callable);
        return new zzgcw(zzgdiVar, this.zza.schedule(zzgdiVar, j, timeUnit));
    }
}
