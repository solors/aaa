package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzano implements zzabx {
    private final zzef zza;
    private final zzdy zzb = new zzdy();
    private final int zzc;

    public zzano(int i, zzef zzefVar, int i2) {
        this.zzc = i;
        this.zza = zzefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final zzabw zza(zzaco zzacoVar, long j) throws IOException {
        int zza;
        int zza2;
        long zzf = zzacoVar.zzf();
        int min = (int) Math.min(112800L, zzacoVar.zzd() - zzf);
        this.zzb.zzI(min);
        zzacoVar.zzh(this.zzb.zzN(), 0, min);
        zzdy zzdyVar = this.zzb;
        int zze = zzdyVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzdyVar.zzb() >= 188 && (zza2 = (zza = zzanz.zza(zzdyVar.zzN(), zzdyVar.zzd(), zze)) + 188) <= zze) {
            long zzb = zzanz.zzb(zzdyVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j) {
                    if (j3 == -9223372036854775807L) {
                        return zzabw.zzd(zzb2, zzf);
                    }
                } else {
                    j4 = zza;
                    if (100000 + zzb2 <= j) {
                        j3 = zzb2;
                    }
                }
                return zzabw.zze(zzf + j4);
            }
            zzdyVar.zzL(zza2);
            j2 = zza2;
        }
        if (j3 != -9223372036854775807L) {
            return zzabw.zzf(j3, zzf + j2);
        }
        return zzabw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzb() {
        byte[] bArr = zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
