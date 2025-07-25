package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
final class zzcd extends zzcm {
    private String zza;
    private zzcl zzb;
    private byte zzc;

    public final zzcm zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zzb(boolean z) {
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zza(zzcl zzclVar) {
        if (zzclVar != null) {
            this.zzb = zzclVar;
            return this;
        }
        throw new NullPointerException("Null filePurpose");
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zza(boolean z) {
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcj zza() {
        if (this.zzc == 3 && this.zza != null && this.zzb != null) {
            return new zzce(this.zza, this.zzb);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" fileOwner");
        }
        if ((this.zzc & 1) == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" skipChecks");
        }
        if (this.zzb == null) {
            sb2.append(" filePurpose");
        }
        String valueOf = String.valueOf(sb2);
        throw new IllegalStateException("Missing required properties:" + valueOf);
    }
}
