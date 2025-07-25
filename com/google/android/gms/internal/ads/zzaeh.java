package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaeh implements zzaeb {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzaeh(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
    }

    public static zzaeh zzb(zzdy zzdyVar) {
        int zzi = zzdyVar.zzi();
        zzdyVar.zzM(12);
        int zzi2 = zzdyVar.zzi();
        int zzi3 = zzdyVar.zzi();
        int zzi4 = zzdyVar.zzi();
        zzdyVar.zzM(4);
        int zzi5 = zzdyVar.zzi();
        int zzi6 = zzdyVar.zzi();
        zzdyVar.zzM(8);
        return new zzaeh(zzi, zzi2, zzi3, zzi4, zzi5, zzi6);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zza() {
        return 1752331379;
    }
}
