package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfcy {
    @VisibleForTesting
    public zzfcy() {
        try {
            zzges.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] bArr;
        try {
            zzgeg zzb = zzgeg.zzb(zzgea.zza(zzgmg.zzb().zza("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgdq.zzb(zzb, zzgdp.zzb(byteArrayOutputStream));
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.generateKey");
            bArr = new byte[0];
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdrq zzdrqVar) {
        zzgeg zzc;
        if (str != null && (zzc = zzc(str)) != null) {
            try {
                byte[] zza = ((zzgdn) zzc.zzd(zzgnl.zzd(), zzgdn.class)).zza(bArr, bArr2);
                zzdrqVar.zzb().put(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, "1");
                return new String(zza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.decrypt");
                zzdrqVar.zzb().put("dsf", e.toString());
            }
        }
        return null;
    }

    private static final zzgeg zzc(String str) {
        try {
            try {
                return zzgdq.zza(zzgdo.zzb(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
