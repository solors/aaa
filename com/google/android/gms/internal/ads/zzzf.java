package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzzf implements zzzg {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzf(Executor executor, zzdb zzdbVar) {
        this.zza = executor;
        this.zzb = zzdbVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
