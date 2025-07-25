package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgcu implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzgax zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgcu(Executor executor, zzgax zzgaxVar) {
        this.zza = executor;
        this.zzb = zzgaxVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }
}
