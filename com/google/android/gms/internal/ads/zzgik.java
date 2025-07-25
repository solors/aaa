package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgik extends zzgeu {
    private final zzgij zza;
    private final int zzb;

    private zzgik(zzgij zzgijVar, int i) {
        this.zza = zzgijVar;
        this.zzb = i;
    }

    public static zzgik zzd(zzgij zzgijVar, int i) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new zzgik(zzgijVar, i);
        }
        throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgik)) {
            return false;
        }
        zzgik zzgikVar = (zzgik) obj;
        if (zzgikVar.zza != this.zza || zzgikVar.zzb != this.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgik.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "X-AES-GCM Parameters (variant: " + obj + "salt_size_bytes: " + this.zzb + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        if (this.zza != zzgij.zzb) {
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzgij zzc() {
        return this.zza;
    }
}
