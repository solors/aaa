package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgow extends zzgoz {
    private final int zza;
    private final int zzb;
    private final zzgou zzc;
    private final zzgot zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgow(int i, int i2, zzgou zzgouVar, zzgot zzgotVar, zzgov zzgovVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgouVar;
        this.zzd = zzgotVar;
    }

    public static zzgos zze() {
        return new zzgos(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgow)) {
            return false;
        }
        zzgow zzgowVar = (zzgow) obj;
        if (zzgowVar.zza != this.zza || zzgowVar.zzd() != zzd() || zzgowVar.zzc != this.zzc || zzgowVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgow.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzgot zzgotVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzgotVar);
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        if (this.zzc != zzgou.zzd) {
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgou zzgouVar = this.zzc;
        if (zzgouVar == zzgou.zzd) {
            return this.zzb;
        }
        if (zzgouVar == zzgou.zza || zzgouVar == zzgou.zzb || zzgouVar == zzgou.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgot zzf() {
        return this.zzd;
    }

    public final zzgou zzg() {
        return this.zzc;
    }
}
