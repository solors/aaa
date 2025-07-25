package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzabw {
    public static final zzabw zza = new zzabw(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzabw(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzabw zzd(long j, long j2) {
        return new zzabw(-1, j, j2);
    }

    public static zzabw zze(long j) {
        return new zzabw(0, -9223372036854775807L, j);
    }

    public static zzabw zzf(long j, long j2) {
        return new zzabw(-2, j, j2);
    }
}
