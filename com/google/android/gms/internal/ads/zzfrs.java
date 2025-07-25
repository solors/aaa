package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfrs extends zzfsd {
    @Nullable
    private final String zza;
    @Nullable
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfrs(String str, String str2, zzfrr zzfrrVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsd) {
            zzfsd zzfsdVar = (zzfsd) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfsdVar.zzb()) : zzfsdVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfsdVar.zza()) : zzfsdVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zza;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    @Nullable
    public final String zzb() {
        return this.zza;
    }
}
