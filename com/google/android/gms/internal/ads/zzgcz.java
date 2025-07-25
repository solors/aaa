package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgcz {
    public static zzgcs zza(ExecutorService executorService) {
        zzgcs zzgcvVar;
        if (executorService instanceof zzgcs) {
            return (zzgcs) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzgcvVar = new zzgcy((ScheduledExecutorService) executorService);
        } else {
            zzgcvVar = new zzgcv(executorService);
        }
        return zzgcvVar;
    }

    public static zzgct zzb(ScheduledExecutorService scheduledExecutorService) {
        return new zzgcy(scheduledExecutorService);
    }

    public static Executor zzc() {
        return zzgbv.INSTANCE;
    }

    public static Executor zzd(Executor executor, zzgax zzgaxVar) {
        executor.getClass();
        if (executor == zzgbv.INSTANCE) {
            return executor;
        }
        return new zzgcu(executor, zzgaxVar);
    }
}
