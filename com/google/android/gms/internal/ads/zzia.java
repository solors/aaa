package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzia implements zzkk {
    private final zzls zza;
    private final zzhz zzb;
    @Nullable
    private zzlj zzc;
    @Nullable
    private zzkk zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzia(zzhz zzhzVar, zzcx zzcxVar) {
        this.zzb = zzhzVar;
        this.zza = new zzls(zzcxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        if (this.zze) {
            return this.zza.zza();
        }
        zzkk zzkkVar = this.zzd;
        zzkkVar.getClass();
        return zzkkVar.zza();
    }

    public final long zzb(boolean z) {
        zzlj zzljVar = this.zzc;
        if (zzljVar != null && !zzljVar.zzW() && ((!z || this.zzc.zzcT() == 2) && (this.zzc.zzX() || (!z && !this.zzc.zzQ())))) {
            zzkk zzkkVar = this.zzd;
            zzkkVar.getClass();
            long zza = zzkkVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzbe zzc = zzkkVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        } else {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        }
        return zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final zzbe zzc() {
        zzkk zzkkVar = this.zzd;
        if (zzkkVar != null) {
            return zzkkVar.zzc();
        }
        return this.zza.zzc();
    }

    public final void zzd(zzlj zzljVar) {
        if (zzljVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzlj zzljVar) throws zzib {
        zzkk zzkkVar;
        zzkk zzl = zzljVar.zzl();
        if (zzl != null && zzl != (zzkkVar = this.zzd)) {
            if (zzkkVar == null) {
                this.zzd = zzl;
                this.zzc = zzljVar;
                zzl.zzg(this.zza.zzc());
                return;
            }
            throw zzib.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzbe zzbeVar) {
        zzkk zzkkVar = this.zzd;
        if (zzkkVar != null) {
            zzkkVar.zzg(zzbeVar);
            zzbeVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbeVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzkk zzkkVar = this.zzd;
        zzkkVar.getClass();
        return zzkkVar.zzj();
    }
}
