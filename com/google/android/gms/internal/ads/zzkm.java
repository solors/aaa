package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzkm {
    public final zzug zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkm(zzug zzugVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6 = true;
        if (z4 && !z2) {
            z5 = false;
        } else {
            z5 = true;
        }
        zzcw.zzd(z5);
        if (z3 && !z2) {
            z6 = false;
        }
        zzcw.zzd(z6);
        this.zza = zzugVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkm.class == obj.getClass()) {
            zzkm zzkmVar = (zzkm) obj;
            if (this.zzb == zzkmVar.zzb && this.zzc == zzkmVar.zzc && this.zzd == zzkmVar.zzd && this.zze == zzkmVar.zze && this.zzg == zzkmVar.zzg && this.zzh == zzkmVar.zzh && this.zzi == zzkmVar.zzi && Objects.equals(this.zza, zzkmVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j = this.zze;
        long j2 = this.zzd;
        return (((((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j2)) * 31) + ((int) j)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzkm zza(long j) {
        if (j == this.zzc) {
            return this;
        }
        return new zzkm(this.zza, this.zzb, j, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzkm zzb(long j) {
        if (j == this.zzb) {
            return this;
        }
        return new zzkm(this.zza, j, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
