package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcta implements zzdbg, zzcxh {
    private final Clock zza;
    private final zzctc zzb;
    private final zzfcj zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcta(Clock clock, zzctc zzctcVar, zzfcj zzfcjVar, String str) {
        this.zza = clock;
        this.zzb = zzctcVar;
        this.zzc = zzfcjVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        Clock clock = this.zza;
        this.zzb.zzd(this.zzc.zzf, this.zzd, clock.elapsedRealtime());
    }
}
