package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzajb {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzab zzg;
    public final int zzh;
    @Nullable
    public final long[] zzi;
    @Nullable
    public final long[] zzj;
    public final int zzk;
    @Nullable
    private final zzajc[] zzl;

    public zzajb(int i, int i2, long j, long j2, long j3, long j4, zzab zzabVar, int i3, @Nullable zzajc[] zzajcVarArr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = zzabVar;
        this.zzh = i3;
        this.zzl = zzajcVarArr;
        this.zzk = i4;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzajb zza(zzab zzabVar) {
        return new zzajb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzabVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }

    @Nullable
    public final zzajc zzb(int i) {
        return this.zzl[i];
    }
}
