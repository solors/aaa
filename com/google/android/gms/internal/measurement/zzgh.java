package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzgh extends zzhg {
    private final Context zza;
    private final Supplier<Optional<zzgt>> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgh(Context context, Supplier<Optional<zzgt>> supplier) {
        if (context != null) {
            this.zza = context;
            this.zzb = supplier;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        Supplier<Optional<zzgt>> supplier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhg) {
            zzhg zzhgVar = (zzhg) obj;
            if (this.zza.equals(zzhgVar.zza()) && ((supplier = this.zzb) != null ? supplier.equals(zzhgVar.zzb()) : zzhgVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.zza.hashCode() ^ 1000003) * 1000003;
        Supplier<Optional<zzgt>> supplier = this.zzb;
        if (supplier == null) {
            hashCode = 0;
        } else {
            hashCode = supplier.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return "FlagsContext{context=" + valueOf + ", hermeticFileOverrides=" + valueOf2 + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhg
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhg
    public final Supplier<Optional<zzgt>> zzb() {
        return this.zzb;
    }
}
