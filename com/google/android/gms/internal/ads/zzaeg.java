package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaeg implements zzaeb {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaeg(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzaeg zzb(zzdy zzdyVar) {
        int zzi = zzdyVar.zzi();
        zzdyVar.zzM(8);
        int zzi2 = zzdyVar.zzi();
        int zzi3 = zzdyVar.zzi();
        zzdyVar.zzM(4);
        int zzi4 = zzdyVar.zzi();
        zzdyVar.zzM(12);
        return new zzaeg(zzi, zzi2, zzi3, zzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zza() {
        return 1751742049;
    }
}
