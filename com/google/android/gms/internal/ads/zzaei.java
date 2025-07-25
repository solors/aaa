package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaei {
    protected final zzadt zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private long[] zzl;
    private int[] zzm;

    public zzaei(int i, int i2, long j, int i3, zzadt zzadtVar) {
        int i4;
        int i5;
        i2 = i2 != 1 ? 2 : i2;
        this.zzd = j;
        this.zze = i3;
        this.zza = zzadtVar;
        if (i2 == 2) {
            i4 = 1667497984;
        } else {
            i4 = 1651965952;
        }
        this.zzb = zzh(i, i4);
        if (i2 == 2) {
            i5 = zzh(i, 1650720768);
        } else {
            i5 = -1;
        }
        this.zzc = i5;
        this.zzk = -1L;
        this.zzl = new long[512];
        this.zzm = new int[512];
    }

    private static int zzh(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final long zzi(int i) {
        return (this.zzd * i) / this.zze;
    }

    private final zzadn zzj(int i) {
        return new zzadn(this.zzm[i] * zzi(1), this.zzl[i]);
    }

    public final zzadk zza(long j) {
        if (this.zzj != 0) {
            int zzi = (int) (j / zzi(1));
            int zzc = zzei.zzc(this.zzm, zzi, true, true);
            if (this.zzm[zzc] == zzi) {
                zzadn zzj = zzj(zzc);
                return new zzadk(zzj, zzj);
            }
            zzadn zzj2 = zzj(zzc);
            int i = zzc + 1;
            if (i < this.zzl.length) {
                return new zzadk(zzj2, zzj(i));
            }
            return new zzadk(zzj2, zzj2);
        }
        zzadn zzadnVar = new zzadn(0L, this.zzk);
        return new zzadk(zzadnVar, zzadnVar);
    }

    public final void zzb(long j, boolean z) {
        if (this.zzk == -1) {
            this.zzk = j;
        }
        if (z) {
            if (this.zzj == this.zzm.length) {
                long[] jArr = this.zzl;
                this.zzl = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzm;
                this.zzm = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzl;
            int i = this.zzj;
            jArr2[i] = j;
            this.zzm[i] = this.zzi;
            this.zzj = i + 1;
        }
        this.zzi++;
    }

    public final void zzc() {
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
        this.zzm = Arrays.copyOf(this.zzm, this.zzj);
    }

    public final void zzd(int i) {
        this.zzf = i;
        this.zzg = i;
    }

    public final void zze(long j) {
        if (this.zzj == 0) {
            this.zzh = 0;
            return;
        }
        this.zzh = this.zzm[zzei.zzd(this.zzl, j, true, true)];
    }

    public final boolean zzf(int i) {
        if (this.zzb != i && this.zzc != i) {
            return false;
        }
        return true;
    }

    public final boolean zzg(zzaco zzacoVar) throws IOException {
        boolean z;
        int i;
        int i2 = this.zzg;
        int zzf = i2 - this.zza.zzf(zzacoVar, i2, false);
        this.zzg = zzf;
        if (zzf == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.zzf > 0) {
                zzadt zzadtVar = this.zza;
                long zzi = zzi(this.zzh);
                if (Arrays.binarySearch(this.zzm, this.zzh) >= 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                zzadtVar.zzt(zzi, i, this.zzf, 0, null);
            }
            this.zzh++;
        }
        return z;
    }
}
