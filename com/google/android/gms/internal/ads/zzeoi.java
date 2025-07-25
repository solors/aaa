package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeoi {
    public final ListenableFuture zza;
    private final long zzb;
    private final Clock zzc;

    public zzeoi(ListenableFuture listenableFuture, long j, Clock clock) {
        this.zza = listenableFuture;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        if (this.zzb < this.zzc.elapsedRealtime()) {
            return true;
        }
        return false;
    }
}
