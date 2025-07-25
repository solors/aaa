package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeqr implements zzetr {
    private final zzgcs zza;

    public zzeqr(zzgcs zzgcsVar) {
        this.zza = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeqs(com.google.android.gms.ads.internal.zzv.zzt().zzb(), com.google.android.gms.ads.internal.zzv.zzt().zzm());
            }
        });
    }
}
