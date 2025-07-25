package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzahr implements zzahu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzahr(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzei.zzs(jArr2[jArr2.length - 1]) : j;
    }

    public static zzahr zzb(long j, zzagm zzagmVar, long j2) {
        int length = zzagmVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzagmVar.zzb + zzagmVar.zzd[i3];
            j3 += zzagmVar.zzc + zzagmVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzahr(jArr, jArr2, j2);
    }

    private static Pair zzf(long j, long[] jArr, long[] jArr2) {
        double d;
        int zzd = zzei.zzd(jArr, j, true, true);
        long j2 = jArr[zzd];
        long j3 = jArr2[zzd];
        int i = zzd + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zze(long j) {
        return zzei.zzs(((Long) zzf(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        Pair zzf = zzf(zzei.zzv(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzadn zzadnVar = new zzadn(zzei.zzs(((Long) zzf.first).longValue()), ((Long) zzf.second).longValue());
        return new zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
