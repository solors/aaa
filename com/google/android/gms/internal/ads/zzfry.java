package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfry extends zzfta {
    private final int zza;
    @Nullable
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfry(int i, String str, zzfrx zzfrxVar) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfta) {
            zzfta zzftaVar = (zzfta) obj;
            if (this.zza == zzftaVar.zza() && ((str = this.zzb) != null ? str.equals(zzftaVar.zzb()) : zzftaVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zzb;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfta
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfta
    @Nullable
    public final String zzb() {
        return this.zzb;
    }
}
