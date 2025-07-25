package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzecx implements zzecw {
    @VisibleForTesting
    public final zzecw zza;
    private final zzfuc zzb;

    public zzecx(zzecw zzecwVar, zzfuc zzfucVar) {
        this.zza = zzecwVar;
        this.zzb = zzfucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final ListenableFuture zza(zzfca zzfcaVar, zzfbo zzfboVar) {
        return zzgch.zzm(this.zza.zza(zzfcaVar, zzfboVar), this.zzb, zzbzw.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfcaVar, zzfbo zzfboVar) {
        return this.zza.zzb(zzfcaVar, zzfboVar);
    }
}
