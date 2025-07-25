package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzqb {
    public final zzab zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzce zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;
    public final boolean zzl = false;

    public zzqb(zzab zzabVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, zzce zzceVar, boolean z, boolean z2, boolean z3) {
        this.zza = zzabVar;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzceVar;
    }

    public final zzpg zza() {
        boolean z;
        if (this.zzc == 1) {
            z = true;
        } else {
            z = false;
        }
        return new zzpg(this.zzg, this.zze, this.zzf, false, z, this.zzh);
    }
}
