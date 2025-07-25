package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgez {
    private zzgfk zza = null;
    private zzgvp zzb = null;
    private zzgvp zzc = null;
    private Integer zzd = null;

    private zzgez() {
    }

    public final zzgez zza(zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final zzgez zzb(zzgvp zzgvpVar) {
        this.zzc = zzgvpVar;
        return this;
    }

    public final zzgez zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgez zzd(zzgfk zzgfkVar) {
        this.zza = zzgfkVar;
        return this;
    }

    public final zzgfb zze() throws GeneralSecurityException {
        zzgvo zzb;
        zzgfk zzgfkVar = this.zza;
        if (zzgfkVar != null) {
            zzgvp zzgvpVar = this.zzb;
            if (zzgvpVar != null && this.zzc != null) {
                if (zzgfkVar.zzb() == zzgvpVar.zza()) {
                    if (zzgfkVar.zzc() == this.zzc.zza()) {
                        if (this.zza.zza() && this.zzd == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (!this.zza.zza() && this.zzd != null) {
                            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        if (this.zza.zzh() == zzgfi.zzc) {
                            zzb = zzgml.zza;
                        } else if (this.zza.zzh() == zzgfi.zzb) {
                            zzb = zzgml.zza(this.zzd.intValue());
                        } else if (this.zza.zzh() == zzgfi.zza) {
                            zzb = zzgml.zzb(this.zzd.intValue());
                        } else {
                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
                        }
                        return new zzgfb(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
                    }
                    throw new GeneralSecurityException("HMAC key size mismatch");
                }
                throw new GeneralSecurityException("AES key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without key material");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgez(zzgfa zzgfaVar) {
    }
}
