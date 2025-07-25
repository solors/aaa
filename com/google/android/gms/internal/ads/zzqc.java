package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzqc {
    private final zzch[] zza;
    private final zzqu zzb;
    private final zzck zzc;

    public zzqc(zzch... zzchVarArr) {
        zzqu zzquVar = new zzqu();
        zzck zzckVar = new zzck();
        this.zza = r2;
        System.arraycopy(zzchVarArr, 0, r2, 0, 0);
        this.zzb = zzquVar;
        this.zzc = zzckVar;
        zzch[] zzchVarArr2 = {zzquVar, zzckVar};
    }

    public final long zza(long j) {
        if (this.zzc.zzg()) {
            return this.zzc.zzi(j);
        }
        return j;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbe zzc(zzbe zzbeVar) {
        this.zzc.zzk(zzbeVar.zzb);
        this.zzc.zzj(zzbeVar.zzc);
        return zzbeVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzch[] zze() {
        return this.zza;
    }
}
