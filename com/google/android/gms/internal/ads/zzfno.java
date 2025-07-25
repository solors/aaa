package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfno extends zzfnk {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfno(String str, boolean z, boolean z2, boolean z3, long j, boolean z4, long j2, zzfnn zzfnnVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j;
        this.zze = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfnk) {
            zzfnk zzfnkVar = (zzfnk) obj;
            if (this.zza.equals(zzfnkVar.zzd()) && this.zzb == zzfnkVar.zzh() && this.zzc == zzfnkVar.zzg()) {
                zzfnkVar.zzf();
                if (this.zzd == zzfnkVar.zzb()) {
                    zzfnkVar.zze();
                    if (this.zze == zzfnkVar.zza()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.zza.hashCode() ^ 1000003;
        int i2 = 1231;
        if (true != this.zzb) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true != this.zzc) {
            i2 = 1237;
        }
        return ((((((((i3 ^ i2) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.zzd + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.zze + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzh() {
        return this.zzb;
    }
}
