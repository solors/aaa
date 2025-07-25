package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgok {
    private zzgow zza = null;
    private zzgvp zzb = null;
    private Integer zzc = null;

    private zzgok() {
    }

    public final zzgok zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgok zzb(zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final zzgok zzc(zzgow zzgowVar) {
        this.zza = zzgowVar;
        return this;
    }

    public final zzgom zzd() throws GeneralSecurityException {
        zzgvp zzgvpVar;
        zzgvo zza;
        zzgow zzgowVar = this.zza;
        if (zzgowVar != null && (zzgvpVar = this.zzb) != null) {
            if (zzgowVar.zzc() == zzgvpVar.zza()) {
                if (zzgowVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzg() == zzgou.zzd) {
                    zza = zzgml.zza;
                } else if (this.zza.zzg() != zzgou.zzc && this.zza.zzg() != zzgou.zzb) {
                    if (this.zza.zzg() == zzgou.zza) {
                        zza = zzgml.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
                    }
                } else {
                    zza = zzgml.zza(this.zzc.intValue());
                }
                return new zzgom(this.zza, this.zzb, zza, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgok(zzgol zzgolVar) {
    }
}
