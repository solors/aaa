package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaec implements zzadm {
    final /* synthetic */ zzaef zza;
    private final long zzb;

    public zzaec(zzaef zzaefVar, long j) {
        this.zza = zzaefVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        zzaei[] zzaeiVarArr;
        zzaei[] zzaeiVarArr2;
        zzaei[] zzaeiVarArr3;
        zzaeiVarArr = this.zza.zzi;
        zzadk zza = zzaeiVarArr[0].zza(j);
        int i = 1;
        while (true) {
            zzaef zzaefVar = this.zza;
            zzaeiVarArr2 = zzaefVar.zzi;
            if (i < zzaeiVarArr2.length) {
                zzaeiVarArr3 = zzaefVar.zzi;
                zzadk zza2 = zzaeiVarArr3[i].zza(j);
                if (zza2.zza.zzc < zza.zza.zzc) {
                    zza = zza2;
                }
                i++;
            } else {
                return zza;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
