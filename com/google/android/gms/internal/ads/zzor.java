package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzor {
    public static final zzor zza = new zzop().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzor(zzop zzopVar, zzoq zzoqVar) {
        boolean z;
        boolean z2;
        boolean z3;
        z = zzopVar.zza;
        this.zzb = z;
        z2 = zzopVar.zzb;
        this.zzc = z2;
        z3 = zzopVar.zzc;
        this.zzd = z3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzor.class == obj.getClass()) {
            zzor zzorVar = (zzor) obj;
            if (this.zzb == zzorVar.zzb && this.zzc == zzorVar.zzc && this.zzd == zzorVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
