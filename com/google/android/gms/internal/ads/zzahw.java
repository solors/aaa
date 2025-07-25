package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzahw {
    public final zzadf zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    @Nullable
    public final long[] zzf;

    private zzahw(zzadf zzadfVar, long j, long j2, @Nullable long[] jArr, int i, int i2) {
        this.zza = new zzadf(zzadfVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i2;
    }

    public static zzahw zzb(zzadf zzadfVar, zzdy zzdyVar) {
        int i;
        long j;
        long[] jArr;
        int i2;
        int i3;
        int zzg = zzdyVar.zzg();
        if ((zzg & 1) != 0) {
            i = zzdyVar.zzp();
        } else {
            i = -1;
        }
        if ((zzg & 2) != 0) {
            j = zzdyVar.zzu();
        } else {
            j = -1;
        }
        long j2 = j;
        if ((zzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i4 = 0; i4 < 100; i4++) {
                jArr2[i4] = zzdyVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzg & 8) != 0) {
            zzdyVar.zzM(4);
        }
        if (zzdyVar.zzb() >= 24) {
            zzdyVar.zzM(21);
            int zzo = zzdyVar.zzo();
            i3 = zzo & 4095;
            i2 = zzo >> 12;
        } else {
            i2 = -1;
            i3 = -1;
        }
        return new zzahw(zzadfVar, i, j2, jArr, i2, i3);
    }

    public final long zza() {
        long j = this.zzb;
        if (j != -1 && j != 0) {
            zzadf zzadfVar = this.zza;
            return zzei.zzt((j * zzadfVar.zzg) - 1, zzadfVar.zzd);
        }
        return -9223372036854775807L;
    }
}
