package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgif extends zzget {
    private final zzgik zza;
    private final zzgvp zzb;
    private final zzgvo zzc;
    private final Integer zzd;

    private zzgif(zzgik zzgikVar, zzgvp zzgvpVar, zzgvo zzgvoVar, Integer num) {
        this.zza = zzgikVar;
        this.zzb = zzgvpVar;
        this.zzc = zzgvoVar;
        this.zzd = num;
    }

    public static zzgif zza(zzgik zzgikVar, zzgvp zzgvpVar, Integer num) throws GeneralSecurityException {
        zzgvo zzb;
        zzgij zzc = zzgikVar.zzc();
        zzgij zzgijVar = zzgij.zzb;
        if (zzc != zzgijVar && num == null) {
            String obj = zzgikVar.zzc().toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgikVar.zzc() == zzgijVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            if (zzgvpVar.zza() == 32) {
                if (zzgikVar.zzc() == zzgijVar) {
                    zzb = zzgml.zza;
                } else if (zzgikVar.zzc() == zzgij.zza) {
                    zzb = zzgml.zzb(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(zzgikVar.zzc().toString()));
                }
                return new zzgif(zzgikVar, zzgvpVar, zzb, num);
            }
            int zza = zzgvpVar.zza();
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zza);
        }
    }

    public final zzgik zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzc;
    }

    public final zzgvp zzd() {
        return this.zzb;
    }

    public final Integer zze() {
        return this.zzd;
    }
}
