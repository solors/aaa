package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
final class zzce extends zzcj {
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final zzcc zze;
    private final zzcb zzf;
    private final zzcl zzg;

    public final boolean equals(Object obj) {
        zzcc zzccVar;
        zzcb zzcbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcj) {
            zzcj zzcjVar = (zzcj) obj;
            if (this.zzb.equals(zzcjVar.zzd()) && this.zzc == zzcjVar.zze() && this.zzd == zzcjVar.zzf() && ((zzccVar = this.zze) != null ? zzccVar.equals(zzcjVar.zza()) : zzcjVar.zza() == null) && ((zzcbVar = this.zzf) != null ? zzcbVar.equals(zzcjVar.zzb()) : zzcjVar.zzb() == null) && this.zzg.equals(zzcjVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = (this.zzb.hashCode() ^ 1000003) * 1000003;
        int i2 = 1231;
        if (this.zzc) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (hashCode2 ^ i) * 1000003;
        if (!this.zzd) {
            i2 = 1237;
        }
        int i4 = (i3 ^ i2) * 1000003;
        zzcc zzccVar = this.zze;
        int i5 = 0;
        if (zzccVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzccVar.hashCode();
        }
        int i6 = (i4 ^ hashCode) * 1000003;
        zzcb zzcbVar = this.zzf;
        if (zzcbVar != null) {
            i5 = zzcbVar.hashCode();
        }
        return ((i6 ^ i5) * 1000003) ^ this.zzg.hashCode();
    }

    public final String toString() {
        String str = this.zzb;
        boolean z = this.zzc;
        boolean z2 = this.zzd;
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(this.zzf);
        String valueOf3 = String.valueOf(this.zzg);
        return "FileComplianceOptions{fileOwner=" + str + ", hasDifferentDmaOwner=" + z + ", skipChecks=" + z2 + ", dataForwardingNotAllowedResolver=" + valueOf + ", multipleProductIdGroupsResolver=" + valueOf2 + ", filePurpose=" + valueOf3 + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final zzcc zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final zzcb zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final zzcl zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final String zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final boolean zzf() {
        return this.zzd;
    }

    private zzce(String str, boolean z, boolean z2, zzcc zzccVar, zzcb zzcbVar, zzcl zzclVar) {
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        this.zze = null;
        this.zzf = null;
        this.zzg = zzclVar;
    }
}
