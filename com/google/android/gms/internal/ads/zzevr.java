package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzevr implements zzetr {
    final zzgcs zza;
    final List zzb;

    public zzevr(zzbbu zzbbuVar, zzgcs zzgcsVar, List list) {
        this.zza = zzgcsVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevs(zzevr.this.zzb);
            }
        });
    }
}
