package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzade implements zzadm {
    private final zzdp zza;
    private final zzdp zzb;
    private long zzc;

    public zzade(long[] jArr, long[] jArr2, long j) {
        boolean z;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        if (length2 > 0 && jArr2[0] > 0) {
            int i = length2 + 1;
            zzdp zzdpVar = new zzdp(i);
            this.zza = zzdpVar;
            zzdp zzdpVar2 = new zzdp(i);
            this.zzb = zzdpVar2;
            zzdpVar.zzc(0L);
            zzdpVar2.zzc(0L);
        } else {
            this.zza = new zzdp(length2);
            this.zzb = new zzdp(length2);
        }
        this.zza.zzd(jArr);
        this.zzb.zzd(jArr2);
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        zzdp zzdpVar = this.zzb;
        if (zzdpVar.zza() == 0) {
            zzadn zzadnVar = zzadn.zza;
            return new zzadk(zzadnVar, zzadnVar);
        }
        int zzb = zzei.zzb(zzdpVar, j, true, true);
        zzadn zzadnVar2 = new zzadn(this.zzb.zzb(zzb), this.zza.zzb(zzb));
        if (zzadnVar2.zzb != j) {
            zzdp zzdpVar2 = this.zzb;
            if (zzb != zzdpVar2.zza() - 1) {
                int i = zzb + 1;
                return new zzadk(zzadnVar2, new zzadn(zzdpVar2.zzb(i), this.zza.zzb(i)));
            }
        }
        return new zzadk(zzadnVar2, zzadnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        if (this.zzb.zza() > 0) {
            return true;
        }
        return false;
    }
}
