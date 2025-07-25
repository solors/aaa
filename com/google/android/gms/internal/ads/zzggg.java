package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzggg {
    private zzggq zza = null;
    private zzgvp zzb = null;
    private Integer zzc = null;

    private zzggg() {
    }

    public final zzggg zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzggg zzb(zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final zzggg zzc(zzggq zzggqVar) {
        this.zza = zzggqVar;
        return this;
    }

    public final zzggi zzd() throws GeneralSecurityException {
        zzgvp zzgvpVar;
        zzgvo zzb;
        zzggq zzggqVar = this.zza;
        if (zzggqVar != null && (zzgvpVar = this.zzb) != null) {
            if (zzggqVar.zzb() == zzgvpVar.zza()) {
                if (zzggqVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzd() == zzggo.zzc) {
                    zzb = zzgml.zza;
                } else if (this.zza.zzd() == zzggo.zzb) {
                    zzb = zzgml.zza(this.zzc.intValue());
                } else if (this.zza.zzd() == zzggo.zza) {
                    zzb = zzgml.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                }
                return new zzggi(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggg(zzggh zzgghVar) {
    }
}
