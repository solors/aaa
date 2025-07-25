package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgbc extends zzgbe {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbc(ListenableFuture listenableFuture, zzgbo zzgboVar) {
        super(listenableFuture, zzgboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbe
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgbo zzgboVar = (zzgbo) obj;
        ListenableFuture zza = zzgboVar.zza(obj2);
        zzfun.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgboVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbe
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}
