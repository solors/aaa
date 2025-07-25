package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzahz {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzdy zzf;
    private final zzdy zzg;
    private int zzh;
    private int zzi;

    public zzahz(zzdy zzdyVar, zzdy zzdyVar2, boolean z) throws zzbc {
        this.zzg = zzdyVar;
        this.zzf = zzdyVar2;
        this.zze = z;
        zzdyVar2.zzL(12);
        this.zza = zzdyVar2.zzp();
        zzdyVar.zzL(12);
        this.zzi = zzdyVar.zzp();
        zzacr.zzb(zzdyVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long zzu;
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        if (this.zze) {
            zzu = this.zzf.zzw();
        } else {
            zzu = this.zzf.zzu();
        }
        this.zzd = zzu;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzM(4);
            int i2 = -1;
            int i3 = this.zzi - 1;
            this.zzi = i3;
            if (i3 > 0) {
                i2 = (-1) + this.zzg.zzp();
            }
            this.zzh = i2;
        }
        return true;
    }
}
