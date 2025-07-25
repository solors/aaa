package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbxx {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzbxx(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyi zzbyiVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaD)).booleanValue()) {
            return;
        }
        if (j - this.zza.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaE)).booleanValue()) {
            this.zza.zzH(-1);
            this.zza.zzI(j);
            return;
        }
        this.zza.zzH(i);
        this.zza.zzI(j);
    }
}
