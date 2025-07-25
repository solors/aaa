package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgos {
    private Integer zza = null;
    private Integer zzb = null;
    private zzgot zzc = null;
    private zzgou zzd = zzgou.zzd;

    private zzgos() {
    }

    public final zzgos zza(zzgot zzgotVar) {
        this.zzc = zzgotVar;
        return this;
    }

    public final zzgos zzb(int i) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgos zzc(int i) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzgos zzd(zzgou zzgouVar) {
        this.zzd = zzgouVar;
        return this;
    }

    public final zzgow zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    if (this.zzd != null) {
                        if (num.intValue() >= 16) {
                            int intValue = this.zzb.intValue();
                            zzgot zzgotVar = this.zzc;
                            if (intValue >= 10) {
                                if (zzgotVar == zzgot.zza) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                    }
                                } else if (zzgotVar == zzgot.zzb) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                    }
                                } else if (zzgotVar == zzgot.zzc) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                    }
                                } else if (zzgotVar == zzgot.zzd) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                    }
                                } else if (zzgotVar == zzgot.zze) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                }
                                return new zzgow(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgos(zzgov zzgovVar) {
    }
}
