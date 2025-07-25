package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzghm extends zzget {
    private final zzghr zza;
    private final zzgvo zzb;
    private final Integer zzc;

    private zzghm(zzghr zzghrVar, zzgvo zzgvoVar, Integer num) {
        this.zza = zzghrVar;
        this.zzb = zzgvoVar;
        this.zzc = num;
    }

    public static zzghm zza(zzghr zzghrVar, Integer num) throws GeneralSecurityException {
        zzgvo zzb;
        if (zzghrVar.zzc() == zzghp.zzb) {
            if (num == null) {
                zzb = zzgml.zza;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzghrVar.zzc() == zzghp.zza) {
            if (num != null) {
                zzb = zzgml.zzb(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzghrVar.zzc())));
        }
        return new zzghm(zzghrVar, zzb, num);
    }

    public final zzghr zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
