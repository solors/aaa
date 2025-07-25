package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgun implements zzgdn {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgun(byte[] bArr, zzgvo zzgvoVar) throws GeneralSecurityException {
        if (zzgks.zza(2)) {
            this.zza = zzgjd.zzc(bArr);
            this.zzb = zzgvoVar.zzc();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static zzgdn zzb(zzgfx zzgfxVar) throws GeneralSecurityException {
        return new zzgun(zzgfxVar.zzd().zzd(zzgdw.zza()), zzgfxVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            byte[] bArr3 = this.zzb;
            int length = bArr.length;
            if (length >= bArr3.length + 28) {
                if (zzgnu.zzc(bArr3, bArr)) {
                    AlgorithmParameterSpec zza = zzgjd.zza(bArr, this.zzb.length, 12);
                    SecretKey secretKey = this.zza;
                    Cipher zzb = zzgjd.zzb();
                    zzb.init(2, secretKey, zza);
                    if (bArr2 != null && bArr2.length != 0) {
                        zzb.updateAAD(bArr2);
                    }
                    int length2 = this.zzb.length;
                    return zzb.doFinal(bArr, length2 + 12, (length - length2) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
