package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgnv {
    private zzgof zza = null;
    private zzgvp zzb = null;
    private Integer zzc = null;

    private zzgnv() {
    }

    public final zzgnv zza(zzgvp zzgvpVar) throws GeneralSecurityException {
        this.zzb = zzgvpVar;
        return this;
    }

    public final zzgnv zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgnv zzc(zzgof zzgofVar) {
        this.zza = zzgofVar;
        return this;
    }

    public final zzgnx zzd() throws GeneralSecurityException {
        zzgvp zzgvpVar;
        zzgvo zza;
        zzgof zzgofVar = this.zza;
        if (zzgofVar != null && (zzgvpVar = this.zzb) != null) {
            if (zzgofVar.zzc() == zzgvpVar.zza()) {
                if (zzgofVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzf() == zzgod.zzd) {
                    zza = zzgml.zza;
                } else if (this.zza.zzf() != zzgod.zzc && this.zza.zzf() != zzgod.zzb) {
                    if (this.zza.zzf() == zzgod.zza) {
                        zza = zzgml.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                    }
                } else {
                    zza = zzgml.zza(this.zzc.intValue());
                }
                return new zzgnx(this.zza, this.zzb, zza, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgnv(zzgnw zzgnwVar) {
    }
}
