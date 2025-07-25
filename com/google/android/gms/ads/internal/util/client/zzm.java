package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
final class zzm extends zzw {
    private final int zza;
    private final int zzb;
    private final boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(int i, int i2, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.zza == zzwVar.zzb() && this.zzb == zzwVar.zza() && this.zzc == zzwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.zzc) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003);
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.zza + ", clickPrerequisite=" + this.zzb + ", notificationFlowEnabled=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.zzc;
    }
}
