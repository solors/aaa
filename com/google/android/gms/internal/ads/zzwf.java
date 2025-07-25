package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzwf implements zzvy {
    private final zzvy zza;
    private final long zzb;

    public zzwf(zzvy zzvyVar, long j) {
        this.zza = zzvyVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zza(zzke zzkeVar, zzhh zzhhVar, int i) {
        int zza = this.zza.zza(zzkeVar, zzhhVar, i);
        if (zza == -4) {
            zzhhVar.zze += this.zzb;
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzvy zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final boolean zze() {
        return this.zza.zze();
    }
}
