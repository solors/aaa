package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcdt implements zzfy {
    private final zzfy zza;
    private final long zzb;
    private final zzfy zzc;
    private long zzd;
    private Uri zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdt(zzfy zzfyVar, int i, zzfy zzfyVar2) {
        this.zza = zzfyVar;
        this.zzb = i;
        this.zzc = zzfyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zza;
            this.zzd = j3;
            i3 = zza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
            int i4 = i3 + zza2;
            this.zzd += zza2;
            return i4;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws IOException {
        zzgd zzgdVar2;
        long j;
        long j2;
        this.zze = zzgdVar.zza;
        long j3 = zzgdVar.zze;
        long j4 = this.zzb;
        zzgd zzgdVar3 = null;
        if (j3 >= j4) {
            zzgdVar2 = null;
        } else {
            long j5 = zzgdVar.zzf;
            long j6 = j4 - j3;
            if (j5 != -1) {
                j6 = Math.min(j5, j6);
            }
            zzgdVar2 = new zzgd(zzgdVar.zza, j3, j6, null);
        }
        long j7 = zzgdVar.zzf;
        if (j7 == -1 || zzgdVar.zze + j7 > this.zzb) {
            long max = Math.max(this.zzb, zzgdVar.zze);
            long j8 = zzgdVar.zzf;
            if (j8 != -1) {
                j = Math.min(j8, (zzgdVar.zze + j8) - this.zzb);
            } else {
                j = -1;
            }
            zzgdVar3 = new zzgd(zzgdVar.zza, max, j, null);
        }
        long j9 = 0;
        if (zzgdVar2 != null) {
            j2 = this.zza.zzb(zzgdVar2);
        } else {
            j2 = 0;
        }
        if (zzgdVar3 != null) {
            j9 = this.zzc.zzb(zzgdVar3);
        }
        this.zzd = zzgdVar.zze;
        if (j2 == -1 || j9 == -1) {
            return -1L;
        }
        return j2 + j9;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final Map zze() {
        return zzfxq.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgyVar) {
    }
}
