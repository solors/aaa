package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzgbt extends zzgcp {
    private final Executor zza;
    final /* synthetic */ zzgbu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbt(zzgbu zzgbuVar, Executor executor) {
        this.zzb = zzgbuVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgcp
    final void zzd(Throwable th) {
        this.zzb.zza = null;
        if (th instanceof ExecutionException) {
            this.zzb.zzd(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzd(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final boolean zzg() {
        return this.zzb.isDone();
    }
}
