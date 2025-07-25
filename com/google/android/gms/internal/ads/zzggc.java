package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzggc {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzggd zzd = zzggd.zzc;

    private zzggc() {
    }

    public final zzggc zza(int i) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzggc zzb(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzggc zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzggc zzd(zzggd zzggdVar) {
        this.zzd = zzggdVar;
        return this;
    }

    public final zzggf zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzd != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        int intValue = num.intValue();
                        this.zzb.intValue();
                        this.zzc.intValue();
                        return new zzggf(intValue, 12, 16, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggc(zzgge zzggeVar) {
    }
}
