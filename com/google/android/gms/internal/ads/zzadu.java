package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzadu {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzadt zzadtVar, @Nullable zzads zzadsVar) {
        if (this.zzc > 0) {
            zzadtVar.zzt(this.zzd, this.zze, this.zzf, this.zzg, zzadsVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzadt zzadtVar, long j, int i, int i2, int i3, @Nullable zzads zzadsVar) {
        boolean z;
        if (this.zzg <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzg(z, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zza(zzadtVar, zzadsVar);
            }
        }
    }

    public final void zzd(zzaco zzacoVar) throws IOException {
        if (!this.zzb) {
            zzacoVar.zzh(this.zza, 0, 10);
            zzacoVar.zzj();
            byte[] bArr = this.zza;
            int i = zzabn.zza;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.zzb = true;
            }
        }
    }
}
