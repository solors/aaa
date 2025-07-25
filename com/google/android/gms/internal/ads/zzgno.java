package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgno {
    private final Class zza;
    private final zzgvo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgno(Class cls, zzgvo zzgvoVar, zzgnq zzgnqVar) {
        this.zza = cls;
        this.zzb = zzgvoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgno)) {
            return false;
        }
        zzgno zzgnoVar = (zzgno) obj;
        if (!zzgnoVar.zza.equals(this.zza) || !zzgnoVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzgvo zzgvoVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(zzgvoVar);
        return simpleName + ", object identifier: " + valueOf;
    }
}
