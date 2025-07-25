package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzahv implements zzahu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahv(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
    }

    @Nullable
    public static zzahv zzb(long j, long j2, zzadf zzadfVar, zzdy zzdyVar) {
        int i;
        int zzm;
        zzdyVar.zzM(10);
        int zzg = zzdyVar.zzg();
        if (zzg > 0) {
            int i2 = zzadfVar.zzd;
            if (i2 >= 32000) {
                i = 1152;
            } else {
                i = 576;
            }
            long zzu = zzei.zzu(zzg, i * 1000000, i2, RoundingMode.DOWN);
            int zzq = zzdyVar.zzq();
            int zzq2 = zzdyVar.zzq();
            int zzq3 = zzdyVar.zzq();
            zzdyVar.zzM(2);
            long j3 = j2 + zzadfVar.zzc;
            long[] jArr = new long[zzq];
            long[] jArr2 = new long[zzq];
            int i3 = 0;
            long j4 = j2;
            while (i3 < zzq) {
                long j5 = zzu;
                jArr[i3] = (i3 * zzu) / zzq;
                jArr2[i3] = Math.max(j4, j3);
                if (zzq3 != 1) {
                    if (zzq3 != 2) {
                        if (zzq3 != 3) {
                            if (zzq3 != 4) {
                                return null;
                            }
                            zzm = zzdyVar.zzp();
                        } else {
                            zzm = zzdyVar.zzo();
                        }
                    } else {
                        zzm = zzdyVar.zzq();
                    }
                } else {
                    zzm = zzdyVar.zzm();
                }
                j4 += zzm * zzq2;
                i3++;
                zzu = j5;
            }
            long j6 = zzu;
            if (j != -1 && j != j4) {
                zzdo.zzf("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
            }
            return new zzahv(jArr, jArr2, j6, j4, zzadfVar.zzf);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zze(long j) {
        return this.zza[zzei.zzd(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        long[] jArr = this.zza;
        int zzd = zzei.zzd(jArr, j, true, true);
        zzadn zzadnVar = new zzadn(jArr[zzd], this.zzb[zzd]);
        if (zzadnVar.zzb < j) {
            long[] jArr2 = this.zza;
            if (zzd != jArr2.length - 1) {
                int i = zzd + 1;
                return new zzadk(zzadnVar, new zzadn(jArr2[i], this.zzb[i]));
            }
        }
        return new zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
