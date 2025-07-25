package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfpt extends zzfqa {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfpt(String str, boolean z, int i, zzfpp zzfppVar, zzfpq zzfpqVar, int i2, zzfps zzfpsVar) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqa) {
            zzfqa zzfqaVar = (zzfqa) obj;
            if (this.zzb.equals(zzfqaVar.zzc())) {
                zzfqaVar.zzd();
                int i = this.zzc;
                int zze = zzfqaVar.zze();
                if (i != 0) {
                    if (i == zze) {
                        zzfqaVar.zza();
                        zzfqaVar.zzb();
                        int i2 = this.zzd;
                        int zzf = zzfqaVar.zzf();
                        if (i2 != 0) {
                            if (zzf == 1) {
                                return true;
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        int i = this.zzc;
        if (i != 0) {
            int i2 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i;
            if (this.zzd != 0) {
                return (i2 * 583896283) ^ 1;
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i = this.zzc;
        String str2 = "null";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "NO_CHECKS";
                    }
                } else {
                    str = "SKIP_SECURITY_CHECK";
                }
            } else {
                str = "SKIP_COMPLIANCE_CHECK";
            }
        } else {
            str = "ALL_CHECKS";
        }
        if (this.zzd == 1) {
            str2 = "READ_AND_WRITE";
        }
        String str3 = this.zzb;
        return "FileComplianceOptions{fileOwner=" + str3 + ", hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str2 + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final zzfpp zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final zzfpq zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final int zzf() {
        return this.zzd;
    }
}
