package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzggw extends zzgeu {
    private final zzggv zza;

    private zzggw(zzggv zzggvVar) {
        this.zza = zzggvVar;
    }

    public static zzggw zzc(zzggv zzggvVar) {
        return new zzggw(zzggvVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggw) || ((zzggw) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzggw.class, this.zza);
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "ChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        if (this.zza != zzggv.zzc) {
            return true;
        }
        return false;
    }

    public final zzggv zzb() {
        return this.zza;
    }
}
