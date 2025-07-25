package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzaby {
    protected final zzabs zza;
    protected final zzabx zzb;
    @Nullable
    protected zzabu zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaby(zzabv zzabvVar, zzabx zzabxVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzabxVar;
        this.zzd = i;
        this.zza = new zzabs(zzabvVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzaco zzacoVar, long j, zzadj zzadjVar) {
        if (j == zzacoVar.zzf()) {
            return 0;
        }
        zzadjVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzaco zzacoVar, long j) throws IOException {
        long zzf = j - zzacoVar.zzf();
        if (zzf >= 0 && zzf <= 262144) {
            zzacoVar.zzk((int) zzf);
            return true;
        }
        return false;
    }

    public final int zza(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            zzabu zzabuVar = this.zzc;
            zzcw.zzb(zzabuVar);
            j = zzabuVar.zzf;
            j2 = zzabuVar.zzg;
            j3 = zzabuVar.zzh;
            if (j2 - j <= this.zzd) {
                zzc(false, j);
                return zzf(zzacoVar, j, zzadjVar);
            } else if (!zzg(zzacoVar, j3)) {
                return zzf(zzacoVar, j3, zzadjVar);
            } else {
                zzacoVar.zzj();
                zzabx zzabxVar = this.zzb;
                j4 = zzabuVar.zzb;
                zzabw zza = zzabxVar.zza(zzacoVar, j4);
                i = zza.zzb;
                if (i != -3) {
                    if (i == -2) {
                        j10 = zza.zzc;
                        j11 = zza.zzd;
                        zzabu.zzh(zzabuVar, j10, j11);
                    } else if (i != -1) {
                        j5 = zza.zzd;
                        zzg(zzacoVar, j5);
                        j6 = zza.zzd;
                        zzc(true, j6);
                        j7 = zza.zzd;
                        return zzf(zzacoVar, j7, zzadjVar);
                    } else {
                        j8 = zza.zzc;
                        j9 = zza.zzd;
                        zzabu.zzg(zzabuVar, j8, j9);
                    }
                } else {
                    zzc(false, j3);
                    return zzf(zzacoVar, j3, zzadjVar);
                }
            }
        }
    }

    public final zzadm zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzabu zzabuVar = this.zzc;
        if (zzabuVar != null) {
            j6 = zzabuVar.zza;
            if (j6 == j) {
                return;
            }
        }
        zzabs zzabsVar = this.zza;
        long zzf = zzabsVar.zzf(j);
        j2 = zzabsVar.zzc;
        j3 = zzabsVar.zzd;
        j4 = zzabsVar.zze;
        j5 = zzabsVar.zzf;
        this.zzc = new zzabu(j, zzf, 0L, j2, j3, j4, j5);
    }

    public final boolean zze() {
        if (this.zzc != null) {
            return true;
        }
        return false;
    }
}
