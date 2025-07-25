package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzerr implements zzetr {
    private final zzfbn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzerr(zzfbn zzfbnVar) {
        this.zza = zzfbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return zzgch.zzh(new zzers(this.zza));
    }
}
