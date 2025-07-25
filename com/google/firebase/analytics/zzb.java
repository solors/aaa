package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzcy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
/* loaded from: classes4.dex */
public final class zzb extends ThreadPoolExecutor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(FirebaseAnalytics firebaseAnalytics, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(zzcy.zza().zza(runnable));
    }
}
