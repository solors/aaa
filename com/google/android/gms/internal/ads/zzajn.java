package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzajn {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzdy zzg = new zzdy(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzaco zzacoVar, boolean z) throws IOException {
        zza();
        this.zzg.zzI(27);
        if (zzacr.zzc(zzacoVar, this.zzg.zzN(), 0, 27, z) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z) {
                    return false;
                }
                throw zzbc.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int zzm = this.zzg.zzm();
            this.zzc = zzm;
            this.zzd = zzm + 27;
            this.zzg.zzI(zzm);
            if (zzacr.zzc(zzacoVar, this.zzg.zzN(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzm();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzaco zzacoVar, long j) throws IOException {
        boolean z;
        int i;
        if (zzacoVar.zzf() == zzacoVar.zze()) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        this.zzg.zzI(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || zzacoVar.zzf() + 4 < j) && zzacr.zzc(zzacoVar, this.zzg.zzN(), 0, 4, true)) {
                this.zzg.zzL(0);
                if (this.zzg.zzu() == 1332176723) {
                    zzacoVar.zzj();
                    return true;
                }
                zzacoVar.zzk(1);
            }
        }
        do {
            if (i != 0 && zzacoVar.zzf() >= j) {
                break;
            }
        } while (zzacoVar.zzc(1) != -1);
        return false;
    }
}
