package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzanh {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzef zza = new zzef(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzdy zzb = new zzdy();

    public static long zzc(zzdy zzdyVar) {
        int zzd = zzdyVar.zzd();
        if (zzdyVar.zzb() >= 9) {
            byte[] bArr = new byte[9];
            zzdyVar.zzH(bArr, 0, 9);
            zzdyVar.zzL(zzd);
            byte b = bArr[0];
            if ((b & 196) == 68) {
                byte b2 = bArr[2];
                if ((b2 & 4) == 4) {
                    byte b3 = bArr[4];
                    if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = b;
                        long j2 = b2;
                        long j3 = (j2 & 3) << 13;
                        return j3 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (((248 & j2) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                    }
                    return -9223372036854775807L;
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzaco zzacoVar) {
        byte[] bArr = zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzacoVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzacoVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j2 = zzd - min;
            if (zzacoVar.zzf() != j2) {
                zzadjVar.zza = j2;
                return 1;
            }
            this.zzb.zzI(min);
            zzacoVar.zzj();
            zzacoVar.zzh(this.zzb.zzN(), 0, min);
            zzdy zzdyVar = this.zzb;
            int zzd2 = zzdyVar.zzd();
            int zze = zzdyVar.zze() - 4;
            while (true) {
                if (zze < zzd2) {
                    break;
                }
                if (zzg(zzdyVar.zzN(), zze) == 442) {
                    zzdyVar.zzL(zze + 4);
                    long zzc = zzc(zzdyVar);
                    if (zzc != -9223372036854775807L) {
                        j = zzc;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j;
            this.zze = true;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzacoVar);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(20000L, zzacoVar.zzd());
            if (zzacoVar.zzf() != 0) {
                zzadjVar.zza = 0L;
                return 1;
            }
            this.zzb.zzI(min2);
            zzacoVar.zzj();
            zzacoVar.zzh(this.zzb.zzN(), 0, min2);
            zzdy zzdyVar2 = this.zzb;
            int zzd3 = zzdyVar2.zzd();
            int zze2 = zzdyVar2.zze();
            while (true) {
                if (zzd3 >= zze2 - 3) {
                    break;
                }
                if (zzg(zzdyVar2.zzN(), zzd3) == 442) {
                    zzdyVar2.zzL(zzd3 + 4);
                    long zzc2 = zzc(zzdyVar2);
                    if (zzc2 != -9223372036854775807L) {
                        j = zzc2;
                        break;
                    }
                }
                zzd3++;
            }
            this.zzf = j;
            this.zzd = true;
        } else {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzacoVar);
                return 0;
            }
            zzef zzefVar = this.zza;
            this.zzh = zzefVar.zzc(this.zzg) - zzefVar.zzb(j3);
            zzf(zzacoVar);
            return 0;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzef zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
