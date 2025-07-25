package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcrh implements zzegr {
    public final List zza;

    public zzcrh(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzegr
    public final void zzr() {
        for (ListenableFuture listenableFuture : this.zza) {
            zzgch.zzr(listenableFuture, new zzcrg(this), zzgcz.zzc());
        }
    }

    public zzcrh(zzcqz zzcqzVar) {
        this.zza = Collections.singletonList(zzgch.zzh(zzcqzVar));
    }
}
