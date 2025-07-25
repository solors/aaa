package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzacw implements zzadm {
    private final zzacy zza;
    private final long zzb;

    public zzacw(zzacy zzacyVar, long j) {
        this.zza = zzacyVar;
        this.zzb = j;
    }

    private final zzadn zzb(long j, long j2) {
        return new zzadn((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        long j2;
        zzcw.zzb(this.zza.zzk);
        zzacy zzacyVar = this.zza;
        zzacx zzacxVar = zzacyVar.zzk;
        long[] jArr = zzacxVar.zza;
        long[] jArr2 = zzacxVar.zzb;
        int zzd = zzei.zzd(jArr, zzacyVar.zzb(j), true, false);
        long j3 = 0;
        if (zzd == -1) {
            j2 = 0;
        } else {
            j2 = jArr[zzd];
        }
        if (zzd != -1) {
            j3 = jArr2[zzd];
        }
        zzadn zzb = zzb(j2, j3);
        if (zzb.zzb != j && zzd != jArr.length - 1) {
            int i = zzd + 1;
            return new zzadk(zzb, zzb(jArr[i], jArr2[i]));
        }
        return new zzadk(zzb, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
