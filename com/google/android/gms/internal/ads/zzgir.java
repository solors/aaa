package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgir extends zzgeu {
    private final zzgiq zza;

    private zzgir(zzgiq zzgiqVar) {
        this.zza = zzgiqVar;
    }

    public static zzgir zzc(zzgiq zzgiqVar) {
        return new zzgir(zzgiqVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgir) || ((zzgir) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgir.class, this.zza);
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "XChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        if (this.zza != zzgiq.zzc) {
            return true;
        }
        return false;
    }

    public final zzgiq zzb() {
        return this.zza;
    }
}
