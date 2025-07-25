package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzghg extends zzgeu {
    private final String zza;
    private final zzghf zzb;

    private zzghg(String str, zzghf zzghfVar) {
        this.zza = str;
        this.zzb = zzghfVar;
    }

    public static zzghg zzc(String str, zzghf zzghfVar) {
        return new zzghg(str, zzghfVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghg)) {
            return false;
        }
        zzghg zzghgVar = (zzghg) obj;
        if (!zzghgVar.zza.equals(this.zza) || !zzghgVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzghg.class, this.zza, this.zzb);
    }

    public final String toString() {
        String obj = this.zzb.toString();
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + obj + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        if (this.zzb != zzghf.zzb) {
            return true;
        }
        return false;
    }

    public final zzghf zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}
