package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzffx {
    public static final zzfgd zza(Callable callable, Object obj, zzfgf zzfgfVar) {
        zzgcs zzgcsVar;
        zzgcsVar = zzfgfVar.zzb;
        return zzb(callable, zzgcsVar, obj, zzfgfVar);
    }

    public static final zzfgd zzb(Callable callable, zzgcs zzgcsVar, Object obj, zzfgf zzfgfVar) {
        ListenableFuture listenableFuture;
        listenableFuture = zzfgf.zza;
        return new zzfgd(zzfgfVar, obj, listenableFuture, Collections.emptyList(), zzgcsVar.zzb(callable));
    }

    public static final zzfgd zzc(ListenableFuture listenableFuture, Object obj, zzfgf zzfgfVar) {
        ListenableFuture listenableFuture2;
        listenableFuture2 = zzfgf.zza;
        return new zzfgd(zzfgfVar, obj, listenableFuture2, Collections.emptyList(), listenableFuture);
    }

    public static final zzfgd zzd(final zzffs zzffsVar, zzgcs zzgcsVar, Object obj, zzfgf zzfgfVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzffw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzffsVar.zza();
                return null;
            }
        }, zzgcsVar, obj, zzfgfVar);
    }
}
