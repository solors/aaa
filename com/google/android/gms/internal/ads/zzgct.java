package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public interface zzgct extends ScheduledExecutorService, zzgcs {
    zzgcr zzc(Callable callable, long j, TimeUnit timeUnit);
}
