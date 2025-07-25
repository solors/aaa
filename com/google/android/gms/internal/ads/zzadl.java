package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzadl implements zzadm {
    private final long zza;
    private final zzadk zzb;

    public zzadl(long j, long j2) {
        zzadn zzadnVar;
        this.zza = j;
        if (j2 == 0) {
            zzadnVar = zzadn.zza;
        } else {
            zzadnVar = new zzadn(0L, j2);
        }
        this.zzb = new zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return false;
    }
}
