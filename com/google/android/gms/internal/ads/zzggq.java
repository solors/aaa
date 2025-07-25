package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzggq extends zzgeu {
    private final int zza;
    private final zzggo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggq(int i, zzggo zzggoVar, zzggp zzggpVar) {
        this.zza = i;
        this.zzb = zzggoVar;
    }

    public static zzggn zzc() {
        return new zzggn(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggq)) {
            return false;
        }
        zzggq zzggqVar = (zzggq) obj;
        if (zzggqVar.zza != this.zza || zzggqVar.zzb != this.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzggq.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        return "AesGcmSiv Parameters (variant: " + valueOf + ", " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        if (this.zzb != zzggo.zzc) {
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzggo zzd() {
        return this.zzb;
    }
}
