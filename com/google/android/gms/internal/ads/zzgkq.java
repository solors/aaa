package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgkq extends ThreadLocal {
    protected static final Cipher zza() {
        boolean zzd;
        try {
            Cipher cipher = (Cipher) zzguw.zza.zza("AES/GCM-SIV/NoPadding");
            zzd = zzgkr.zzd(cipher);
            if (!zzd) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
