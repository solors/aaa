package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeso implements zzetr {
    private final String zza;
    private final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeso(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return zzgch.zzh(new zzesp(this.zza, this.zzb));
    }
}
