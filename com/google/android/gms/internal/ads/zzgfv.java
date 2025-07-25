package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgfv {
    private zzggf zza = null;
    private zzgvp zzb = null;
    private Integer zzc = null;

    private zzgfv() {
    }

    public final zzgfv zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfv zzb(zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final zzgfv zzc(zzggf zzggfVar) {
        this.zza = zzggfVar;
        return this;
    }

    public final zzgfx zzd() throws GeneralSecurityException {
        zzgvp zzgvpVar;
        zzgvo zzb;
        zzggf zzggfVar = this.zza;
        if (zzggfVar != null && (zzgvpVar = this.zzb) != null) {
            if (zzggfVar.zzb() == zzgvpVar.zza()) {
                if (zzggfVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzd() == zzggd.zzc) {
                    zzb = zzgml.zza;
                } else if (this.zza.zzd() == zzggd.zzb) {
                    zzb = zzgml.zza(this.zzc.intValue());
                } else if (this.zza.zzd() == zzggd.zza) {
                    zzb = zzgml.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                }
                return new zzgfx(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgfv(zzgfw zzgfwVar) {
    }
}
