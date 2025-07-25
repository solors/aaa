package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgdg extends zzgcp {
    final /* synthetic */ zzgdi zza;
    private final zzgbn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdg(zzgdi zzgdiVar, zzgbn zzgbnVar) {
        this.zza = zzgdiVar;
        this.zzb = zzgbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgbn zzgbnVar = this.zzb;
        ListenableFuture zza = zzgbnVar.zza();
        zzfun.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgbnVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final boolean zzg() {
        return this.zza.isDone();
    }
}
