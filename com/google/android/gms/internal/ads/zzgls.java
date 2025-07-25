package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgls {
    private final zzgdz zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgls(zzgdz zzgdzVar, int i, String str, String str2, zzglt zzgltVar) {
        this.zza = zzgdzVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgls)) {
            return false;
        }
        zzgls zzglsVar = (zzgls) obj;
        if (this.zza != zzglsVar.zza || this.zzb != zzglsVar.zzb || !this.zzc.equals(zzglsVar.zzc) || !this.zzd.equals(zzglsVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
