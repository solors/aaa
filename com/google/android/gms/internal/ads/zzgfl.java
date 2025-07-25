package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgfl {
    private zzgfu zza = null;
    private zzgvp zzb = null;
    private Integer zzc = null;

    private zzgfl() {
    }

    public final zzgfl zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfl zzb(zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final zzgfl zzc(zzgfu zzgfuVar) {
        this.zza = zzgfuVar;
        return this;
    }

    public final zzgfn zzd() throws GeneralSecurityException {
        zzgvp zzgvpVar;
        zzgvo zzb;
        zzgfu zzgfuVar = this.zza;
        if (zzgfuVar != null && (zzgvpVar = this.zzb) != null) {
            if (zzgfuVar.zzc() == zzgvpVar.zza()) {
                if (zzgfuVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zze() == zzgfs.zzc) {
                    zzb = zzgml.zza;
                } else if (this.zza.zze() == zzgfs.zzb) {
                    zzb = zzgml.zza(this.zzc.intValue());
                } else if (this.zza.zze() == zzgfs.zza) {
                    zzb = zzgml.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
                }
                return new zzgfn(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgfl(zzgfm zzgfmVar) {
    }
}
