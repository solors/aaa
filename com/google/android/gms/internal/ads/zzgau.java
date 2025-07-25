package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgau extends zzgaw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgau(ListenableFuture listenableFuture, Class cls, zzgbo zzgboVar) {
        super(listenableFuture, cls, zzgboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgbo zzgboVar = (zzgbo) obj;
        ListenableFuture zza = zzgboVar.zza(th);
        zzfun.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgboVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}
