package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgch extends zzgcj {
    public static zzgcf zza(Iterable iterable) {
        return new zzgcf(false, zzfxn.zzk(iterable), null);
    }

    public static zzgcf zzb(Iterable iterable) {
        return new zzgcf(true, zzfxn.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgcf zzc(ListenableFuture... listenableFutureArr) {
        return new zzgcf(true, zzfxn.zzm(listenableFutureArr), null);
    }

    public static ListenableFuture zzd(Iterable iterable) {
        return new zzgbp(zzfxn.zzk(iterable), true);
    }

    public static ListenableFuture zze(ListenableFuture listenableFuture, Class cls, zzfuc zzfucVar, Executor executor) {
        zzgav zzgavVar = new zzgav(listenableFuture, cls, zzfucVar);
        listenableFuture.addListener(zzgavVar, zzgcz.zzd(executor, zzgavVar));
        return zzgavVar;
    }

    public static ListenableFuture zzf(ListenableFuture listenableFuture, Class cls, zzgbo zzgboVar, Executor executor) {
        zzgau zzgauVar = new zzgau(listenableFuture, cls, zzgboVar);
        listenableFuture.addListener(zzgauVar, zzgcz.zzd(executor, zzgauVar));
        return zzgauVar;
    }

    public static ListenableFuture zzg(Throwable th) {
        th.getClass();
        return new zzgck(th);
    }

    public static ListenableFuture zzh(Object obj) {
        if (obj == null) {
            return zzgcl.zza;
        }
        return new zzgcl(obj);
    }

    public static ListenableFuture zzi() {
        return zzgcl.zza;
    }

    public static ListenableFuture zzj(Callable callable, Executor executor) {
        zzgdi zzgdiVar = new zzgdi(callable);
        executor.execute(zzgdiVar);
        return zzgdiVar;
    }

    public static ListenableFuture zzk(zzgbn zzgbnVar, Executor executor) {
        zzgdi zzgdiVar = new zzgdi(zzgbnVar);
        executor.execute(zzgdiVar);
        return zzgdiVar;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzgbp(zzfxn.zzm(listenableFutureArr), false);
    }

    public static ListenableFuture zzm(ListenableFuture listenableFuture, zzfuc zzfucVar, Executor executor) {
        zzgbd zzgbdVar = new zzgbd(listenableFuture, zzfucVar);
        listenableFuture.addListener(zzgbdVar, zzgcz.zzd(executor, zzgbdVar));
        return zzgbdVar;
    }

    public static ListenableFuture zzn(ListenableFuture listenableFuture, zzgbo zzgboVar, Executor executor) {
        int i = zzgbe.zzc;
        executor.getClass();
        zzgbc zzgbcVar = new zzgbc(listenableFuture, zzgboVar);
        listenableFuture.addListener(zzgbcVar, zzgcz.zzd(executor, zzgbcVar));
        return zzgbcVar;
    }

    public static ListenableFuture zzo(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        return zzgdf.zzf(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgdk.zza(future);
        }
        throw new IllegalStateException(zzfve.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgdk.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzgbw((Error) e.getCause());
            }
            throw new zzgdj(e.getCause());
        }
    }

    public static void zzr(ListenableFuture listenableFuture, zzgcd zzgcdVar, Executor executor) {
        zzgcdVar.getClass();
        listenableFuture.addListener(new zzgce(listenableFuture, zzgcdVar), executor);
    }
}
