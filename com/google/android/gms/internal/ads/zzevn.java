package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzevn implements zzetr {
    public zzevn(zzbza zzbzaVar, zzgcs zzgcsVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        final ListenableFuture zzh = zzgch.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfJ)).booleanValue()) {
            zzh = zzgch.zzh(null);
        }
        final ListenableFuture zzh2 = zzgch.zzh(null);
        return zzgch.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevo((String) zzh.get(), (String) zzh2.get());
            }
        }, zzbzw.zza);
    }
}
