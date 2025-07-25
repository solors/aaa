package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzenw implements zzetr {
    private final zzfcj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenw(zzfcj zzfcjVar) {
        this.zza = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 58;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return zzgch.zzh(new zzenx(this.zza.zzp));
    }
}
