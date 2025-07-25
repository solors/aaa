package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzels implements zzetr {
    private final Clock zza;
    private final zzfcj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzels(Clock clock, zzfcj zzfcjVar) {
        this.zza = clock;
        this.zzb = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return zzgch.zzh(new zzelt(this.zzb, this.zza.currentTimeMillis()));
    }
}
