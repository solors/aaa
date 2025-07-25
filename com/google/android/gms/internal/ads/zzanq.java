package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzanq {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzef zza = new zzef(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzdy zzb = new zzdy();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanq(int i) {
    }

    private final int zze(zzaco zzacoVar) {
        byte[] bArr = zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzacoVar.zzj();
        return 0;
    }

    public final int zza(zzaco zzacoVar, zzadj zzadjVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzacoVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzacoVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j2 = zzd - min;
            if (zzacoVar.zzf() != j2) {
                zzadjVar.zza = j2;
            } else {
                this.zzb.zzI(min);
                zzacoVar.zzj();
                zzacoVar.zzh(this.zzb.zzN(), 0, min);
                zzdy zzdyVar = this.zzb;
                int zzd2 = zzdyVar.zzd();
                int zze = zzdyVar.zze();
                int i2 = zze - 188;
                while (true) {
                    if (i2 < zzd2) {
                        break;
                    }
                    byte[] zzN = zzdyVar.zzN();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 >= zzd2 && i5 < zze && zzN[i5] == 71) {
                            i4++;
                            if (i4 == 5) {
                                long zzb = zzanz.zzb(zzdyVar, i2, i);
                                if (zzb != -9223372036854775807L) {
                                    j = zzb;
                                    break;
                                }
                            }
                        } else {
                            i4 = 0;
                        }
                        i3++;
                    }
                    i2--;
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzacoVar);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(112800L, zzacoVar.zzd());
            if (zzacoVar.zzf() != 0) {
                zzadjVar.zza = 0L;
            } else {
                this.zzb.zzI(min2);
                zzacoVar.zzj();
                zzacoVar.zzh(this.zzb.zzN(), 0, min2);
                zzdy zzdyVar2 = this.zzb;
                int zzd3 = zzdyVar2.zzd();
                int zze2 = zzdyVar2.zze();
                while (true) {
                    if (zzd3 >= zze2) {
                        break;
                    }
                    if (zzdyVar2.zzN()[zzd3] == 71) {
                        long zzb2 = zzanz.zzb(zzdyVar2, zzd3, i);
                        if (zzb2 != -9223372036854775807L) {
                            j = zzb2;
                            break;
                        }
                    }
                    zzd3++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
        } else {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzacoVar);
                return 0;
            }
            zzef zzefVar = this.zza;
            this.zzh = zzefVar.zzc(this.zzg) - zzefVar.zzb(j3);
            zze(zzacoVar);
            return 0;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzef zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
