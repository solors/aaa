package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaep implements zzabx {
    private final zzacy zza;
    private final int zzb;
    private final zzact zzc = new zzact();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaep(zzacy zzacyVar, int i, zzaeq zzaeqVar) {
        this.zza = zzacyVar;
        this.zzb = i;
    }

    private final long zzc(zzaco zzacoVar) throws IOException {
        while (zzacoVar.zze() < zzacoVar.zzd() - 6) {
            zzacy zzacyVar = this.zza;
            int i = this.zzb;
            zzact zzactVar = this.zzc;
            long zze = zzacoVar.zze();
            byte[] bArr = new byte[2];
            zzacoVar.zzh(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzacoVar.zzj();
                zzacoVar.zzg((int) (zze - zzacoVar.zzf()));
            } else {
                zzdy zzdyVar = new zzdy(16);
                System.arraycopy(bArr, 0, zzdyVar.zzN(), 0, 2);
                zzdyVar.zzK(zzacr.zza(zzacoVar, zzdyVar.zzN(), 2, 14));
                zzacoVar.zzj();
                zzacoVar.zzg((int) (zze - zzacoVar.zzf()));
                if (zzacu.zzc(zzdyVar, zzacyVar, i, zzactVar)) {
                    break;
                }
            }
            zzacoVar.zzg(1);
        }
        if (zzacoVar.zze() >= zzacoVar.zzd() - 6) {
            zzacoVar.zzg((int) (zzacoVar.zzd() - zzacoVar.zze()));
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final zzabw zza(zzaco zzacoVar, long j) throws IOException {
        long zzf = zzacoVar.zzf();
        long zzc = zzc(zzacoVar);
        long zze = zzacoVar.zze();
        zzacoVar.zzg(Math.max(6, this.zza.zzc));
        int i = (zzc > j ? 1 : (zzc == j ? 0 : -1));
        long zzc2 = zzc(zzacoVar);
        long zze2 = zzacoVar.zze();
        if (i <= 0 && zzc2 > j) {
            return zzabw.zze(zze);
        }
        if (zzc2 <= j) {
            return zzabw.zzf(zzc2, zze2);
        }
        return zzabw.zzd(zzc, zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final /* synthetic */ void zzb() {
    }
}
