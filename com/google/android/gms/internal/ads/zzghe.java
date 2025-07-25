package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzghe extends zzget {
    private final zzghg zza;
    private final zzgvo zzb;
    private final Integer zzc;

    private zzghe(zzghg zzghgVar, zzgvo zzgvoVar, Integer num) {
        this.zza = zzghgVar;
        this.zzb = zzgvoVar;
        this.zzc = num;
    }

    public static zzghe zza(zzghg zzghgVar, Integer num) throws GeneralSecurityException {
        zzgvo zzb;
        if (zzghgVar.zzb() == zzghf.zza) {
            if (num != null) {
                zzb = zzgvo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (zzghgVar.zzb() == zzghf.zzb) {
            if (num == null) {
                zzb = zzgvo.zzb(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(zzghgVar.zzb().toString()));
        }
        return new zzghe(zzghgVar, zzb, num);
    }

    public final zzghg zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
