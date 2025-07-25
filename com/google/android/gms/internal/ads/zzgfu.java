package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgfu extends zzgeu {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgfs zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgfu(int i, int i2, int i3, zzgfs zzgfsVar, zzgft zzgftVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzgfsVar;
    }

    public static zzgfr zzd() {
        return new zzgfr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfu)) {
            return false;
        }
        zzgfu zzgfuVar = (zzgfu) obj;
        if (zzgfuVar.zza != this.zza || zzgfuVar.zzb != this.zzb || zzgfuVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgfu.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AesEax Parameters (variant: " + valueOf + ", " + this.zzb + "-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        if (this.zzd != zzgfs.zzc) {
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

    public final zzgfs zze() {
        return this.zzd;
    }
}
